---
title: Software Testing
description: "White Box Testing: Download JUnit Libraries"
navigation: on
pagegroup: testing-v6-0-0
--- 


# Download JUnit Libraries

JUnit is not provided in the default Java libraries (`String`, `Scanner`, etc. are provided with Java). Instead, we have to download the JUnit libraries.

<!---
   1. Browse to the [JUnit Github project](https://github.com/junit-team/junit4/wiki/Download-and-Install), and download `junit-4.12.jar` into your `lib` directory in your project.
   2. Also download `hamcrest-core-1.3.jar` into your `lib` directory in your project.
--->


   1. Download [`junit-4.12.jar` file](../../lib/junit-4.12.jar) into your `lib` directory in your project.
   2. Download [`hamcrest-core-1.3.jar` file](../../lib/hamcrest-core-1.3.jar) into your `lib` directory in your project.
   
Both `junit-4.12.jar` and `hamcrest-core-1.3.jar` are required to run test cases from the command line.
   
The directory structure should now be:

```
Paycheck
    -> src 
        -> Paycheck.java
    -> test
    -> lib 
        -> junit-4.12.jar
        -> hamcrest-core-1.3.jar
    -> bin
        -> Paycheck.class
    -> doc
    -> project_docs
        -> Black Box Test Plan
```   

