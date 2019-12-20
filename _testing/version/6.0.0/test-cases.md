---
title: Software Testing
description: "Test Cases"
navigation: on
pagegroup: testing-v6-0-0
--- 

# Test Cases
{% include iconHeader.html type="systemTest,unitTest" %}

A test case contains (explicitly or implicitly) the following
information:

1.  A unique identifier;
2.  A set of test inputs;
3.  The expected results from executing the test inputs; and
4.  The actual results of running the test case.

---

**Unique Identifier:** A unique identifier names a test case and the
name should be descriptive of what the test verifies or what
requirement(s) the test validates.

**Test Inputs:** A test case should have a set of one or more inputs.
The inputs drive the test case and may be parameters to a method, user
inputs to a user interface (UI), or files that an application uses. The
key is that these inputs should be *specific* and *repeatable*. Both
characteristics are required so that anyone can execute a test case and
receive the expected results (assuming that the program has no faults).
If specific inputs are not recorded, then more time may be spent trying
to rediscover broken functionality, rather than fixing functionality.

**Expected Results:** The expected results describe the output from
a correct execution of the program on a set of given inputs. By knowing
what is correct, we can quickly identify when a program is not working.
The expected results may be returned from a method or associated methods
of a class, be a message or output to a UI, or information written to a
file. All expected results should be specific values for clarity in
determining if a test passes or fails. The expected results are
determined by examining the requirements of the program.

**Actual Results:** The actual results record what happens when the test
case is run. Any difference in expected and actual results represents a
failing test case.