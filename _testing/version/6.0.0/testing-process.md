---
title: Software Testing
description: "Testing Process"
navigation: on
pagegroup: testing-v6-0-0
--- 

# Testing Process
{% include iconHeader.html type="systemTest,unitTest" %}

Program requirements document what the customer wants a program to do.
The requirements define the expected results of a test case. If a test
case fails, meaning the actual results of the program do ***not*** match
the expected results, then we have not met our requirements. A test
failure implies a debugging session to find the underlying fault is
necessary. Figure 1 shows the flow for generating and running test cases
on a program.



{% include image.html file="assets/test-generation-execution-flow.png" caption="Figure 1: Test generation and execution flow." height="2.75in" %}
  

Developers start by writing their program and test cases. These tasks
may be done simultaneously or asynchronously depending on personal
preference; however, both the source code and the test cases are
required before any tests can be run on a program.

A test case is run by executing the program with the test inputs
specified by a test case. If the actual output does not match the
expected output, the test fails. The failure helps guide developers to
the underlying fault to fix the mistake.

*Passing tests increase confidence that a program meets the program
requirements. If there is more time before a deadline, additional tests
will increase confidence further. While software testing is useful for
finding underlying faults, **no amount of testing can unequivocally
demonstrate the absence of faults in your code**. Additional testing
will provide some confidence that your program will perform as expected
**most** of the time, at least for the cases you tested.*

Ultimately, your product must be delivered. Plan your time to allow for
sufficient testing of the requirements to ensure delivery of a high
quality product.