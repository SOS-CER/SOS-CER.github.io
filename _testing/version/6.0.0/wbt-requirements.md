---
title: Software Testing
description: "White Box Testing: Test Requirements"
navigation: on
pagegroup: testing-v6-0-0
--- 

# White Box Testing: Test Requirements
{% include iconHeader.html type="unitTest" %}

We start by testing the requirements of the method, which means we are
testing the main functionality of the method. For
`Paycheck.calculateRegularPay()`, the main functionality is that the
method will return the employee’s regular pay for the given pay rate and
hours worked. The code for `Paycheck.calculateRegularPay()` is in Figure 5.

```java
    /**
     * Returns the employee's regular pay for the hours worked up to the first
     * REGULAR_PAY_MAX_HOURS hours worked.
     * 
     * @param payRate employee's pay rate
     * @param hoursWorked number of hours worked by the employee
     * @return employee's regular pay
     */
    public static int calculateRegularPay(int payRate, double hoursWorked) {
        if (hoursWorked > REGULAR_PAY_MAX_HOURS) {
            return payRate * REGULAR_PAY_MAX_HOURS;
        }
        return (int) (payRate * hoursWorked);
    }
```

*Figure 5: Implementation of the calculateRegularPay method in the Paycheck program.*


A simple test is shown in Figure 6, below. Note that each piece of test
information is listed so that the information will be printed by the
`testResult()` method. The description is a String version of the method
call that generates the actual result for the test. Since the
`Paycheck.calculateRegularPay()` method returns a int, the result is
concatenated to the empty String to generate a String output for the
actual results.

```java
    /**
     * Test the Paycheck.calculateRegularPay() method.
     */
    @Test
    public void testCalculateRegularPay() {
        // Less than 40 hours
        // Regular Level 1 36 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 36)", 68400,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 36));
    }
```

*Figure 6: Requirement test for Paycheck.calculateRegularPay() in PaycheckTest.*

