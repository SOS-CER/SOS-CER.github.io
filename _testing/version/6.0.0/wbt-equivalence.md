---
title: Software Testing
description: "White Box Testing: Test Equivalence Classes"
navigation: on
pagegroup: testing-v6-0-0
--- 

# White Box Testing: Test Equivalence Classes
{% include iconHeader.html type="unitTest" %}

The strategy of testing representative values from equivalence classes
still applies to white box testing. We break up the possible inputs for
each parameter into equivalence classes and test representative values
for each parameter. There are two parameters for
`Paycheck.calculateRegularPay()`: the pay rate and the hours worked. For
the hours worked, the equivalence classes are hours less than 0, hours
between 0 and 40, and hours greater than 40. Since we are focusing on
representative values, we can choose values that are away from 40. Good
representative values would be 36 and 46, shown in Figure 7.

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

        // Over 40 hours
        // Regular Level 1 46 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 46)", 76000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 46));
    }
```

*Figure 7: Equivalence class tests for Paycheck.calculateRegularPay() in PaycheckTest.*