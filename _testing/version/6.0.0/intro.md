---
title: Software Testing
description: "Introduction"
navigation: on
pagegroup: testing-v6-0-0
--- 

# Introduction to Software Testing

Writing software is a process where developers take a vision of what an
application should do in the form of requirements, design a solution,
and then write code that implements the requirements. However, the code
that is written may not exactly match the requirements of the system,
resulting in lost revenue for a company (or for this class, lost points
on an assignment).

*Software testing* is a process for identifying software faults. A
software *fault*, or *logic error*, is defined as “an incorrect step,
process, or data definition in a program”[^ieee10]. By systematically
testing software, we can identify faults in our code and correct those
faults as early as possible. The goal of testing is to remove as many
faults as possible before releasing the application to our customer. The
International Organization for Standardization (ISO) defines software
testing as “the **dynamic** verification of the behavior of a program on
a finite set of test cases, **suitably selected** from the usually
infinite execution domains, against the **expected behavior**”[^SWE05].
The keywords here are:

- *Dynamic:* meaning we execute the code under test;
- *Suitably selected:* meaning we systematically and deliberately choose test inputs; and
- *Expected behavior:* meaning we know what we want the program to do, so that we will know when the program does not meet the requirements.

Software faults typically originate from a programmer *mistake*, which
is “a human action that produces an incorrect result”[^ieee10]. A mistake
in the requirements, design, or code, is a *fault*. Faults remains
*latent* in the software until running the software produces a
*failure*. A software failure is “an event in which a system or system
component does not perform a required function within specified limits”
[^ieee10]. Failures are when a program’s behavior deviates from the expected
program behavior. Testing identifies failures in a program’s behavior.
Investigation­­­­ of the failure (guided by the failing test case) will
lead to one or more underlying fault(s) in the software that must be
fixed. This investigation and fixing of faults is called *debugging*.

Testing consists of many executions of a program and each execution has
a different input with a different expected result. A distinct execution
with a given input and expected output is a *test case*.

## References

[^ieee10]: Systems and software engineering – Vocabulary. (2010). ISO/IEC/IEEE 24765:2010(E), 1–418. https://doi.org/10.1109/IEEESTD.2010.5733835


[^SWE05]: ISO/IEC TR 19759:2005. Software Engineering – Guide to the Software Engineering Body of Knowledge (SWEBOK).