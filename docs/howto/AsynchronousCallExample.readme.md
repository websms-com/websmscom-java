			A s y n c h r o n o u s C a l l E x a m p l e

  What is it doing?
  -----------------
The test is an extension to the SynchronousCallExample with the difference that the request will be made in another thread. So
that the main-thread can continue working, while the created thread does the requesting and waiting for the response.

  How to get it working:
  ----------------------
Sometimes there is a concurrent approach needed. E.g. You need your programm
 to do calculations during the sendSmsRequest and not waiting for any answer.

 One way to solve this, is using multi-threading. Calling the SmsClient in
 another thread and do calculations in another is part of the example.

 Following steps have to be made to get it working:

  * Unzip the BusinessSMSClient-x.x.x.jar.

  * change into unzipped directory (where README file can be found)

  * Basically two commands are needed for compiling and execution of the AsynchronousCallExample

    1. The following command compiles the java-file into a class-file:
	   > `javac -cp "docs/howto;dist/BusinessSMSClient-1.0.2-jar-with-dependencies.jar" docs/howto/AsynchronousCallExample.java`
    2. Executes the class-file:
	   > `java -cp "docs/howto;dist/BusinessSMSClient-1.0.2-jar-with-dependencies.jar" AsynchronousCallExample`
