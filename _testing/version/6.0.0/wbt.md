---
title: Software Testing
description: "White Box Testing"
navigation: on
pagegroup: testing-v6-0-0
--- 

# White Box Testing
{% include iconHeader.html type="unitTest" %}

With white-box testing, the code under test is known, and we can use
what we know about the code and the paths through the code to guide our
tests. Additionally, our test cases and knowledge about the code can
help guide us to the code locations likely to contain errors. White box
testing techniques allow the tester to[^Pre]: 1) exercise independent
paths within the source code; 2) exercise logical decisions as both true
and false; and 3) exercise loops at their boundaries. Later classes in
the CSC curriculum at NCSU will provide instruction on using white-box
testing to test internal data structures.

Typically, when performing white box testing, you want to focus on
testing individual methods. This type of testing is called *unit
testing.* Unit testing means that we are testing a specific unit of
code, in our case, individual methods. When we start testing methods
together, for example when one method calls another method, we are
running *integration tests*. Integration testing means that we are
testing how units of code work together. A combination of unit and
integration testing can increase the confidence that small portions of
our code work together. If the small portions work together, then it is
*more likely* the full system will work correctly.

The test strategies discussed for black box testing (e.g., test
requirements, test equivalence classes, and test boundaries) still apply
for white box testing. The focus of the test is shifted from the entire
program to a method or small unit of our code. With white box testing,
we can consider another testing strategy: *basis set testing*. Since we
know the code under test, we can write test cases to exercise all paths
in the code. We will write white box tests using each of these
strategies.

First, we will discuss how to structure our white box tests so that we
may automate their execution. `JUnit` is a software testing framework for the Java programming language that reduces the complexity of implementing white-box test cases for your code. 

## References

[^Pre]: Pressman, R. S. (2005). *Software Engineering: A Practitioner’s Approach* (6th ed.). McGraw-Hill.