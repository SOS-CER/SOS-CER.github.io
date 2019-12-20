---
title: Software Testing
description: "White Box Testing: Testing Exceptions"
navigation: on
pagegroup: testing-v6-0-0
--- 

# White Box Testing: Testing Exceptions
{% include iconHeader.html type="unitTest" %}

Some paths through code will contain conditions that result in the
throwing of an exception. Tests should be written to test that the
exceptions are thrown.

For testing exceptions, we will examine testing a factorial method
(Figure 12) that is contained within a Factorial class.

```java
    /**
     * Calculates the factorial of n
     *
     * @param n number to calculate factorial of
     * @return n factorial (n!)
     * @throws IllegalArgumentException if n < 0
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative n");
        }
        int product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
```

*Figure 12: factorial method that contains throwing an exception*

To get the actual result, we will use a try/catch structure to examine
whether the correct exception is thrown with the correct message. Code for the white-box test is
given in Figure 13.

```java
    /**
     * Test the Factorial.factorial() method.
     */
    @Test
    public void testFactorial() {
        try {
            Factorial.factorial(-4);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("negative n", e.getMessage());
        }
    }
```

*Figure 13: Code testing exception*