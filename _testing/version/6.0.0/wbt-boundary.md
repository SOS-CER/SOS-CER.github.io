---
title: Software Testing
description: "White Box Testing: Test Boundary Values"
navigation: on
pagegroup: testing-v6-0-0
--- 

# White Box Testing: Test Boundary Values
{% include iconHeader.html type="unitTest" %}

Once representative values of a method are tested, boundary values
between the equivalence classes (if there are boundary values) should be
tested. For `Paycheck.calculateRegularPay()`, there are two boundaries: 1)
at 0 hours and 2) at 40 hours. We’ll focus on the boundary at 40. There
are three tests to consider: 39 hours, 40 hours, and 41 hours. These
correspond to the standard boundary value tests of at the boundary, one
less than the boundary, and one more than the boundary. The boundary
value tests are shown in Figure 8. Similar tests should be done for the
lower boundaries.

```java
    /**
     * Test the Paycheck.calculateRegularPay() method.
     */
    @Test
    public void testCalculateRegularPay() {
        // Testing boundary
        // Less than 40 hours
        // Regular Level 1 39 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 39)", 74100,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 39));

        // Regular Level 1 40 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 40)", 76000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 40));

        // Over 40 hours
        // Regular Level 1 41 hours
        assertEquals("Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 41)", 76000,
                        Paycheck.calculateRegularPay(Paycheck.LEVEL_1_PAY_RATE, 41));
    }
```

*Figure 8: Boundary value tests for Paycheck.calculateRegularPay() in PaycheckTest.*