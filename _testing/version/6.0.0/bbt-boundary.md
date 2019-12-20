---
title: Software Testing
description: "Black Box Testing: Test Boundary Values"
navigation: on
pagegroup: testing-v6-0-0
--- 

# Black Box Testing: Test Boundary Values
{% include iconHeader.html type="systemTest" %}

Programmers tend to make mistakes at the boundaries of equivalence
classes. Think of the mistakes you may have made when specifying the
start and end points of a for loop. Boundary value analysis guides the
creation of test cases at the boundaries or edges of a problem. When
testing a boundary, you want to test the boundary itself. You also want
to test the values immediately on either side of the boundary.

The input for hours worked for the Paycheck program has two boundaries
as illustrated in Figure 3. We want to test the boundary of 0 and the
values to either side. We also want to test the boundary of 40. Some
tests for the boundary are shown below.

{% include image.html file="assets/boundary.png" caption="Figure 3: Boundary values for hours worked"  %}

| Test ID                                                                           | Description                                                                                                                                                                                                                                     | Expected Results                                                                                                                                                                         | Actual Results |
|-----------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------|
| Boundary regular hours, <br>Two insurances, <br>Level 3, <br>Boundary retirement  | Preconditions: Paycheck program started<br>Employee Name: Bob Baker<br>Employee Level: 3<br>Hours Worked: 1<br>Medical Insurance (Y/N): N<br>Dental Insurance (Y/N): Y<br>Vision Insurance (Y/N): Y<br>Retirement Percentage (0-6): 1           | Name                     Hours   PayRate   Regular        OT     Gross    Deduc.       Net<br>Bob Baker                 1.00     25.75     25.75      0.00     25.75     20.80      4.95 |                |
| Boundary regular hours, <br>One insurance, <br>Level 3, <br>Boundary retirement   | Preconditions: Paycheck program started<br>Employee Name: Ellen Edwards<br>Employee Level: 3<br>Hours Worked: 39<br>Medical Insurance (Y/N): N<br>Dental Insurance (Y/N): N<br>Vision Insurance (Y/N): Y<br>Retirement Percentage (0-6): 5      | Name                     Hours   PayRate   Regular        OT     Gross    Deduc.       Net<br>Ellen Edwards            39.00     25.75   1004.25      0.00   1004.25     55.46    948.79 |                |
| Boundary regular hours, <br>One insurance, <br>Level 3, <br>Boundary retirement   | Preconditions: Paycheck program started<br>Employee Name: Frank Frankenstein<br>Employee Level: 3<br>Hours Worked: 40<br>Medical Insurance (Y/N): Y<br>Dental Insurance (Y/N): N<br>Vision Insurance (Y/N): N<br>Retirement Percentage (0-6): 6 | Name                     Hours   PayRate   Regular        OT     Gross    Deduc.       Net<br>Frank Frankenstein       40.00     25.75   1030.00      0.00   1030.00     86.30    943.70 |                |
| Boundary overtime hours, <br>One insurance, <br>Level 3, <br>Mid-range retirement | Preconditions: Paycheck program started<br>Employee Name: George George<br>Employee Level: 3<br>Hours Worked: 41<br>Medical Insurance (Y/N): N<br>Dental Insurance (Y/N): Y<br>Vision Insurance (Y/N): N<br>Retirement Percentage (0-6): 2      | Name                     Hours   PayRate   Regular        OT     Gross    Deduc.       Net<br>George George            41.00     25.75   1030.00     38.62   1068.62     36.67   1031.95 |                |