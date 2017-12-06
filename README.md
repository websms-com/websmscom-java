

       W E B S M S . C O M   J A V A   S D K


What is it?
-----------

  A lightweight java-client-library for using our business platform services.
  Reduces the complexity of network-communication between client and business-
  platform-server, to help business-customer save time and money for focusing on
  their strength.

Requirements
------------

  The following requirements exist for running BP-SDK:

   *  Java Compiler: 
   
      A fully compliant Java 1.6  (or later) Development Kit is required 
      for the BP-SDK to be compiled and executed.  
   
   *  slf4j-API: 
      
      The version which should be used is 1.6.x. Slf4j serves as simple logging facade
      for various logging frameworks. More information how to use slf4j can be found at
      http://www.slf4j.org/. It should be noted that without an additional library, that
      include a slf4j-binding for e.g. log4j, logging won't work. The api can be found 
      at lib/. 
      
   *  gson
   	
      The version that should be used is 2.2.x. Google gson serves as simple Object-to-JSON-
      Serializer. More information on gson can be found at http://code.google.com/p/google-gson/.
      The library can be found at lib/. 
       
   *  businessapi-client
      
      Is used for the synchronisation between server and client-sdk. The library can be found at 
      lib/.
       

Installation Instructions
-------------------------

  Include the mentioned dependencies of the requirement into the classpath (don't forget to also include
  the BusinessSMSClient-x.x.x.jar found at dist/). There are multiple ways for calling the SDK. Some are 
  explained at the tutorial-section (docs/howto/).

  
Running Examples
--------------
  
  The SDK is not a standalone java-application it needs at least a main-method for working. Examples
  for running the BP-SDK can be found at [/docs/howto/](docs/howto).

  * [AsynchronousCallExample.java](/docs/howto/AsynchronousCallExample.java) ([Readme](/docs/howto/AsynchronousCallExample.readme.md))
  * [SynchronousCallExample.java](/docs/howto/SynchronousCallExample.java) ([Readme](/docs/howto/SynchronousCallExample.readme.md))
  
The Latest Version
------------------

   * Version 1.0.2: Fix problem with credentials when using constructor with readTimeout.
   * Version 1.0.1: Fix problem with non-UTF8 environments.
   * Version 1.0.0: Basic text- and binary-sms-sending.

Documentation
-------------
  The documentation available as of the date of this release is  also included, in HTML format,
  in the docs/apidocs/ directory, and it may be browsed starting from the file called index.html.

Contributor
-----------
  Sebastian Wilhelm
  
Contact
-------
  For any further questions into detail the contact-email is developer@websms.com.
