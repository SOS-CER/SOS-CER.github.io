---
title: Software Testing
description: "White Box Testing: Write Test Cases"
navigation: on
pagegroup: testing-v6-0-0
--- 

# Writing White Box Test Cases
{% include iconHeader.html type="unitTest" %}

For white box test cases, we can automate our test cases by creating a
test class. By convention, `JUnit` test classes should be named `<nameOfSourceClass>Test.java`. Therefore, the test class for a
program called `Paycheck` would be `PaycheckTest`. All test classes will go in the `test` directory.


If our program under
test contains methods, we can call methods in the program under
test similarly to how we call methods of the Math class:

`<ProgramUnderTest>.<methodName>(<parameters>);`


When creating a test program, the test cases can be broken out into
methods. You can have one or more test method for each method under
test. A good naming convention is to call your test method
`test<MethodName><DescriptionOfTest>`.

  Inside of each test method, we need to use **one or more JUnit *assert* statements**.

## JUnit Annotations
The test class includes different types of methods that have the following annotations:
   
   * `@Before` is used to identify a method that executes before *each* of your individual test methods. This is useful for constructing new objects and ensures that each test executes with the same initial starting conditions.
   * `@Test` is used to identify each test method in your test class.

## PaycheckTest Example

```{java}
import org.junit.*;
import junit.framework.TestCase;

/**
 * Test class for the Paycheck program.
 * 
 * @author Sarah Heckman
 * @author Jessica Young Schmidt
 */
public class PaycheckTest extends TestCase {

    /**
     * Test the Paycheck.getPayRate() method.
     */
    @Test
    public void testGetPayRate() {

    }

    /**
     * Test the Paycheck.calculateRegularPay() method.
     */
    @Test
    public void testCalculateRegularPay() {

    }

    /**
     * Test the Paycheck.calculateOvertimePay() method.
     */
    @Test
    public void testCalculateOvertimePay() {

    }

    /**
     * Test the Paycheck.calculateGrossPay() method.
     */
    @Test
    public void testCalculateGrossPay() {

    }

    /**
     * Test the Paycheck.calculateTotalDeductions() method.
     */
    @Test
    public void testCalculateRetirement() {

    }

    /**
     * Test the Paycheck.calculateNetPay() method.
     */
    @Test
    public void testCalculateNetPay() {

    }

}
```
*Figure 4: Skeleton of the Paycheck program.*

{% include callout.html type="learningOutcomes" content="The `extends` keyword suggests an 'is-a' relationship. For example, `PaycheckTest` is-a `TestCase`. You will learn more about `extends` and the 'is-a' relationship in CSC216."%}  
   
   

The directory structure should now be:

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
    -> doc
    -> project_docs
        -> Black Box Test Plan
```   

## Assert Statements
The [JUnit library](http://junit.sourceforge.net/javadoc/org/junit/Assert.html) includes many different types of assert statements. The common ones you may use are outlined in the table below.[^message]


| Statement | Description |
|-----------|-------------|
| `assertTrue(value)` | asserts that the `value` passed as a parameter is `boolean true`. If it is not `true`, the test case will fail. | 
| `assertTrue(message, value)` | asserts that the `value` passed as a parameter is `boolean true`. If it is not `true`, the test case will fail with the given message. | 
| `assertFalse(value)` | asserts that the `value` passed as a parameter is `boolean false`. If it is not `false`, the test case will fail. | 
| `assertFalse(message, value)` | asserts that the `value` passed as a parameter is `boolean false`. If it is not `false`, the test case will fail with the given message. | 
| `assertEquals(expectedValue, actualValue)` | asserts that `expectedValue` equals the `actualValue`. If the two values are not equal, the test case will fail. | 
| `assertEquals(message, expectedValue, actualValue)` | asserts that `expectedValue` equals the `actualValue`. If the two values are not equal, the test case will fail with the given. |
| `assertEquals(expectedValue, actualValue, delta)` | asserts that `expectedValue` and  `actualValue` are equal to within a positive `delta`. Otherwise, the test case will fail. | 
| `assertEquals(message, expectedValue, actualValue, delta)` | asserts that `expectedValue` and  `actualValue` are equal to within a positive `delta`. Otherwise, the test case will fail. |

## Footnotes
[^message]: For this course, you are expected to use the assert methods that include message. Your message will include your test description.
