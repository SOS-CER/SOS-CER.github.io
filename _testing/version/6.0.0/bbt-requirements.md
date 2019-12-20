---
title: Software Testing
description: "Black Box Testing: Test Requirements"
navigation: on
pagegroup: testing-v6-0-0
--- 

# Black Box Testing: Test Requirements
{% include iconHeader.html type="systemTest" %}

When testing a program, you should ensure that all of the customer
requirements are tested *at least once*. Our Paycheck program has the
requirement that if the net pay is negative, meaning the deductions
exceeds the gross pay, then an error is printed. The following test case would test that requirement. The bold text in the description
shows the values the tester would enter into the Paycheck program at the
given prompts.

| Test ID                                         | Description                                                                                                                                                                      | Expected Results | Actual Results |
|-------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------|----------------|
| Boundary regular hours, <br>All insurances, <br>Level 1 | Preconditions: Paycheck program started<br>Employee Name: **Alice Anderson**<br>Employee Level: **1**<br>Hours Worked: **0**<br>Medical Insurance (Y/N): **Y**<br>Dental Insurance (Y/N): **Y**<br>Vision Insurance (Y/N): **Y** | Error Message  |                |
