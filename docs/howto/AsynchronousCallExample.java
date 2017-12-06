import at.sms.business.sdk.client.impl.DefaultSmsClient;
import at.sms.business.sdk.domain.TextMessage;
import at.sms.business.sdk.exception.ApiException;
import at.sms.business.sdk.exception.AuthorizationFailedException;
import at.sms.business.sdk.exception.HttpConnectionException;
import at.sms.business.sdk.exception.ParameterValidationException;

class SendingSmsThread extends Thread {

	public boolean finished = false;

	public SendingSmsThread(String str) {
		super(str);
	}

	public void run() {
		AsynchronousCallExample example = new AsynchronousCallExample();
		example.test();
		finished = true;
	}
}

public class AsynchronousCallExample {

	public void test() {

		
		try {
		
		
		// The server-url, the username and password of the websms-account has to be 
		// provided to constructor to get it working. If you don't own websms-account 
		// the registration-url is http://websms.com/anmeldung
		DefaultSmsClient smsClient = new DefaultSmsClient("your websms-username", "your password",
				"https://api.websms.com/");

		// Insert the recipients-number ( international number format ) you want
		// to text to.
		long[] recipients = new long[] { /* e.g, 43123456789L */ };

		// The content of the message.
		String messageContent = "Hello World!";
		
		// A Text-Message-Object with the only mandatory parameters has to be created.
		TextMessage textMessage = new TextMessage(recipients,messageContent);
		
		// Max sms per message shows that just one sms will be send. This is a
		// security parameter, that will specifies an upper limit for to be send sms. 
		// The tutorial on the website (http://websms.com/entwickler) will give 
		// further explanation about this topic.
		int maxSmsPerMessage = 1;

		// If test = true, it's just a test. No real sms will be send.
		boolean test = false;

		// The actual call of the SmsClient. Returns a statuscode if
		// successful, throws an exception
		// if something went wrong.
		int statuscode = smsClient.send(textMessage, maxSmsPerMessage, test);
		
		if (statuscode == 2000) {
			System.out.println("Message successfully transferred");
		}

		} catch (ApiException e) {
			// This exception delivers a status-code in the message.
			e.printStackTrace();
		} catch (ParameterValidationException e) {
			// A parameter was invalid. No request was made.
			e.printStackTrace();
		} catch (AuthorizationFailedException e) {
			System.err
					.println("The username and password has to be changed to your websms-account-credentials in the source-code.");

		} catch (HttpConnectionException e) {
			// No server was found. Adjust the url provided as
			// constructor-argument for the SmsClient.
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		SendingSmsThread thread = new SendingSmsThread("AsyncCallTo");
		// The thread will be started. The request to the websms-api will be
		// made.
		thread.start();

		// The main-thread checks in a loop if the created thread is finished.
		while (!thread.finished) {
			System.out.println("Main-Thread:  AsyncCallTo-Thread not finished");

			// while the SendingSmsThread is not finished the main-thread will
			// be put to sleep for 10 milliseconds, so that
			// the other thread can do his work.
			Thread.currentThread().sleep(10);
		}
		System.out.println("Main-Thread:  AsyncCallTo-Thread finished");

	}
}
