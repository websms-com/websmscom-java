				S y n c h r o n o u s C a l l E x a m p l e

  What is it doing?
  -----------------
  It shows how to use the Client by calling the textSendSMS-method, which basically sends a text-sms-request to the websms-api.
  This is happening under testing-conditions, so the api will respond like a real request was made, but no sms will be send.

  How to get it working:
  ----------------------
  * Unzip the BusinessSMSClient-x.x.x.jar.

  * change into unzipped directory (where README file can be found)

  * Basically two commands are needed for compiling and execution of the SynchronousCallExample

    1. The following command compiles the java-file into a class-file:
	   > `javac -cp "docs/howto;dist/BusinessSMSClient-1.0.2-jar-with-dependencies.jar" docs/howto/SynchronousCallExample.java`


    2. Executes the class-file:
       > `java -cp "docs/howto;dist/BusinessSMSClient-1.0.2-jar-with-dependencies.jar" SynchronousCallExample`
