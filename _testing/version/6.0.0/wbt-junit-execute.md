---
title: Software Testing
description: "White Box Testing: Compile and Execute the Test Cases"
navigation: on
pagegroup: testing-v6-0-0
--- 

# Compile and Execute the Test Cases

## Compile the Project Code

To compile our project, we have to do a series of steps. We have to compile the source code, the test code, and also tell Java where to find the JUnit library files that we downloaded into our `lib` directory.

First, change directory into the top-level of your project (the `Paycheck` directory).
  
### Compile Source Code
Assuming you are currently in your top-level project directory (`Paycheck`), then compile your source code using the following command:
  
```
javac -d bin src/Paycheck.java
```

{% include callout.html type="learningOutcomes" content="The `-d` argument tells Java the destination directory that it should save the compiled `.class` files into. Here, we tell Java to save the `.class` files into the `bin` directory. "%}  


### Compile Test Code
Assuming you are currently in your top-level project directory (`Paycheck`), then compile your test code using the following command:
  
```
javac -d bin -cp bin:lib/* test/PaycheckTest.java
```
{% capture diffOS %}
   * The `-cp` argument tells Java that the next token is the directory that follows contains our compiled `.class` files and library files.
   * `bin` indicates that the `bin` directory contains our compiled `.class` files. We save our `.class` files into the `bin` directory to keep them separated from our `.java` files.
   * In addition, we specify the path to our libary files (in the `lib/` directory). Here, we can use the wildcard symbol (`*`) so that we do not have to type out the full names of each of the `.jar` files.
   * **WINDOWS**: Notice that the different classpaths are separated by a `;` (semicolon) instead of a colon and enclose the combination in quotes. For example: `javac -d bin -cp "bin;lib/*" test/PaycheckTest.java`
   * **LINUX/MAC**: Notice that the different classpaths are separated by a `:` (colon) instead of a semicolon.
{% endcapture %}
{% include callout.html type="learningOutcomes" title="" content=diffOS %}
 

## Execute the Test Cases

Now that we have compiled all the source and test code, we can execute our test cases.

Your directory structure should be:

```
Paycheck
    -> src 
        -> Paycheck.java
    -> test
        -> PaycheckTest.java
    -> lib 
        -> junit-4.12.jar
        -> hamcrest-core-1.3.jar
    -> bin
        -> Paycheck.class
        -> PaycheckTest.class
    -> doc
    -> project_docs
        -> Black Box Test Plan
```   

When we execute Java programs, we are actually *executing* the `.class` files.

To execute the `PaycheckTest` test cases, make sure you are in your top-level project directory (`Paycheck`) and use the following command:

```
 java -cp bin:lib/* org.junit.runner.JUnitCore PaycheckTest
```

{% include callout.html type="learningOutcomes" content="We can use a wildcard `*` symbol to tell Java to include *all* `.jar` library files contained in the `lib/` directory. This helps us save time since we no longer have to type-out the entire path and `.jar` file names each time!"%} 

## Interpreting the Results
You should receive terminal output similar to the following:

```
JUnit version 4.12
..E....
Time: 0.01
There was 1 failure:
1) testGetPayRate(PaycheckTest)
junit.framework.AssertionFailedError: Paycheck.getPayRate(Paycheck.LEVEL_1) expected:<1900> but was:<2250>
	at junit.framework.Assert.fail(Assert.java:57)
	at junit.framework.Assert.failNotEquals(Assert.java:329)
	at junit.framework.Assert.assertEquals(Assert.java:78)
	at junit.framework.Assert.assertEquals(Assert.java:234)
	at junit.framework.TestCase.assertEquals(TestCase.java:401)
	at PaycheckTest.testGetPayRate(PaycheckTest.java:18)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at junit.framework.TestCase.runTest(TestCase.java:176)
	at junit.framework.TestCase.runBare(TestCase.java:141)
	at junit.framework.TestResult$1.protect(TestResult.java:122)
	at junit.framework.TestResult.runProtected(TestResult.java:142)
	at junit.framework.TestResult.run(TestResult.java:125)
	at junit.framework.TestCase.run(TestCase.java:129)
	at junit.framework.TestSuite.runTest(TestSuite.java:252)
	at junit.framework.TestSuite.run(TestSuite.java:247)
	at org.junit.internal.runners.JUnit38ClassRunner.run(JUnit38ClassRunner.java:86)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
	at org.junit.runner.JUnitCore.runMain(JUnitCore.java:77)
	at org.junit.runner.JUnitCore.main(JUnitCore.java:36)

FAILURES!!!
Tests run: 6,  Failures: 1
```

The output lists each of the test cases that ran, along with a summary of the test results. The *long* stacktrace indicates the sequence of method calls that let to the test case failure.

If **NO** tests failed, then your output would look similar to the following:

```
JUnit version 4.12
.....
Time: 0.008

OK (5 tests)
```

