---
title: Software Testing
description: "Black Box Testing: Test Equivalence Classes"
navigation: on
pagegroup: testing-v6-0-0
--- 

# Black Box Testing: Test Equivalence Classes
{% include iconHeader.html type="systemTest" %}

There is only a limited amount of time to test and an infinite number of
possible test cases. *We want to focus on test cases that will uncover
new errors, not test cases that are essentially equivalent to other test
cases.* We can divide the input or output space into ranges or
categories of data. We generate test cases by picking one representative
value from each of the possible input ranges/categories or by picking
input values that would get to a representative output value. If all of
the values in an equivalence class are handled in a similar way, testing
one representative value in each equivalence class increases confidence
that the program would work with other inputs from the equivalence
class. At a minimum, there are two equivalence classes for input: (1)
valid or allowed input and (2) invalid or not allowed input.

The following guidelines are helpful for defining equivalence classes[^Pre]:

-   If the input condition is a range, you’ll create one valid and two invalid (above and below the valid range) equivalence classes.
-   If input conditions are specific values, then the values are each a valid (for that value) equivalence class and all other values are in an invalid equivalence class.
-   If input conditions are members of a set, then the members of the set are in the valid equivalence class and all other possibilities are in the invalid equivalence class.
-   If an input condition is a boolean, there is one valid and one invalid equivalence class.

Representative values for an equivalence class are the specific
valid/invalid values or a middle value in a range. If valid or invalid
input is a range of numbers, choose a value that is in the middle of the
range, rather than a value at range boundary. The boundary values are
considered next.

There are three main groups of input and output in the Paycheck program:
skill levels, insurances, and hours worked. For employees of skill level 3, there is also the equivalence class for retirement. For skill levels,
there equivalence classes for skill level 1, skill level 2, skill level 3, and invalid skill level. For each type of insurance, there are two
equivalence classes: having insurance and not having insurance. For hours worked, there are three equivalence class: regular hours, overtime
hours, and invalid hours (negative).

## Skill Level

Our test of the requirements may also satisfy equivalence classes. The test shown on previous page satisfies the equivalence class for a skill level 1. We can add other tests for skill levels as shown below. Note
that to make a complete test execution, we are also providing input for
all user input.

| Test ID                                                                           | Description                                                                                                                                                                                                                         | Expected Results                                                                                                                                                                         | Actual Results |
|-----------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------|
| Mid-range regular hours, <br>Two insurances, <br>Level 1                          | Preconditions: Paycheck program started<br>Employee Name: Carol Cole<br>Employee Level: 1<br>Hours Worked: 10<br>Medical Insurance (Y/N): Y<br>Dental Insurance (Y/N): N<br>Vision Insurance (Y/N): Y                               | Name                     Hours   PayRate   Regular        OT     Gross    Deduc.       Net<br>Carol Cole               10.00     19.00    190.00      0.00    190.00     29.75    160.25 |                |
| Mid-range regular hours, <br>Two insurances, <br>Level 2                          | Preconditions: Paycheck program started<br>Employee Name: Carol Cole<br>Employee Level: 2<br>Hours Worked: 10<br>Medical Insurance (Y/N): Y<br>Dental Insurance (Y/N): N<br>Vision Insurance (Y/N): Y                               | Name                     Hours   PayRate   Regular        OT     Gross    Deduc.       Net<br>Carol Cole               10.00     22.50    225.00      0.00    225.00     29.75    195.25 |                |
| Mid-range regular hours, <br>Two insurances, <br>Level 3, <br>Boundary retirement | Preconditions: Paycheck program started<br>Employee Name: Carol Cole<br>Employee Level: 3<br>Hours Worked: 10<br>Medical Insurance (Y/N): Y<br>Dental Insurance (Y/N): N<br>Vision Insurance (Y/N): Y<br>Retirement Percentage (0-6): 1 | Name                     Hours   PayRate   Regular        OT     Gross    Deduc.       Net<br>Carol Cole               10.00     25.75    257.50      0.00    257.50     32.32    225.18 |                |               |

## Insurance
In the above test cases, we consider yes and no for each of the
insurance types. The following two tests also test yes and no for each
insurance.

  | Test ID                                                  | Description                                                                                                                                                                                              | Expected Results                                                                                                                                                                         | Actual Results |
|----------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------|
| Mid-range regular hours, <br>Two insurances, <br>Level 1 | Preconditions: Paycheck program started<br>Employee Name: Danny D David<br>Employee Level: 1<br>Hours Worked: 20<br>Medical Insurance (Y/N): Y<br>Dental Insurance (Y/N): Y<br>Vision Insurance (Y/N): N | Name                     Hours   PayRate   Regular        OT     Gross    Deduc.       Net<br>Danny D David            20.00     19.00    380.00      0.00    380.00     39.80    340.20 |                |
| Boundary regular hours, <br>One insurance, <br>Level 1   | Preconditions: Paycheck program started<br>Employee Name: Ellen Edwards<br>Employee Level: 1<br>Hours Worked: 39<br>Medical Insurance (Y/N): N<br>Dental Insurance (Y/N): N<br>Vision Insurance (Y/N): Y | Name                     Hours   PayRate   Regular        OT     Gross    Deduc.       Net<br>Ellen Edwards            39.00     19.00    741.00      0.00    741.00      5.25    735.75 |                |

## Hours Worked
Considering the possible equivalence classes for hours worked other
tests of the requirements. For the Paycheck program, we would want at
least one middle test that would result in each class. Tests for these
equivalence classes are shown below.

| Test ID                                                  | Description                                                                                                                                                                                                | Expected Results                                                                                                                                                                         | Actual Results |
|----------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------|
| Mid-range regular hours, <br>Two insurances, <br>Level 1 | Preconditions: Paycheck program started<br>Employee Name: Danny D David<br>Employee Level: 1<br>Hours Worked: 20<br>Medical Insurance (Y/N): Y<br>Dental Insurance (Y/N): Y<br>Vision Insurance (Y/N): N   | Name                     Hours   PayRate   Regular        OT     Gross    Deduc.       Net<br>Danny D David            20.00     19.00    380.00      0.00    380.00     39.80    340.20 |                |
| Mid-range overtime hours, <br>No insurance, <br>Level 1  | Preconditions: Paycheck program started<br>Employee Name: Hilda Henderson<br>Employee Level: 1<br>Hours Worked: 50<br>Medical Insurance (Y/N): N<br>Dental Insurance (Y/N): N<br>Vision Insurance (Y/N): N | Name                     Hours   PayRate   Regular        OT     Gross    Deduc.       Net<br>Hilda Henderson          50.00     19.00    760.00    285.00   1045.00      0.00   1045.00 |                |

## References

[^Pre]: Pressman, R. S. (2005). *Software Engineering: A Practitioner’s Approach* (6th ed.). McGraw-Hill.