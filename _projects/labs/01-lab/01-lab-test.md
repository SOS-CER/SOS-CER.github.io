---
title: CSC216 Lab 01 - Installation and Project Creation
tags: [software engineering, software lifecycle, CS2, CSC216, Lab01]
description: CSC216 Lab 01 - Test
navigation: on
pagegroup: 01-lab
task: 8
---

# CSC216 Lab 01: Test
As with any software development project, you must test your code to know if it meets the [requirements](01-lab-requirements) and [design](01-lab-design).  However, with Lab 01, you are being provided with minimal unit tests and no system tests.  This is for two reasons:

  1. To introduce you to test feedback for hidden teaching staff tests in Jenkins
  2. To provide you the opportunity to write your own tests for this portion of the `PackScheduler` project in Lab 2
  

## Unit Testing
{% include iconHeader.html type="unitTest" %}
The teaching staff unit tests evaluate how well you meet the teaching staff design of the system.

We have provided the source code for a partial set of unit tests for the `StudentDirectory` class.  These will help you with some initial debugging, but do not cover all possible scenarios outlined by the requirements.

A full suite of unit tests are provided on the [Jenkins servers](../01-lab#lab-deadlines--jenkins-servers).  These tests are "hidden" in that the source code for the tests is NOT provided.  We hide the teaching staff tests so that you will focus on the scenario around the implementation rather than the specifics of the test case.  Each assert in the teaching staff tests has a hint that Jenkins will automatically provide to you when you fail the test case.  The teaching staff tries to write the asserts to provide you meaningful feedback on what might be wrong with your code or details about the test scenario, but we cannot anticipate all possible scenarios of failure.  When you receive a message that you do not understand, please ask the teaching staff for clarification on the test scenario so you can attempt to replicate the failure locally.


{% capture callout_content %}
You can see an [example of a hint on Jenkins and how to interpret it](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results) in the [Jenkins Overview](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/).
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins Test Failures" %}


## System Testing
{% include iconHeader.html type="systemTest" %}
The teaching staff system tests evaluate how well you meet the requirements of the system and how well your classes integrate with the provided GUI.

The teaching staff system tests for Lab 01 will not be provided for you.  Instead, you should start thinking about various test scenarios from the Lab 01 `PackSchdeuler` requirements.  That's where we pull our tests from!  You'll formalize these scenarios into your own tests with Lab 02.


## Static Analysis
Run all of your static analysis tools or use the feedback in Jenkins to remove the notifications.


{% capture callout_content %}
Run [FindBugs, PMD, and CheckStyle](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-static-analysis) on your code and remove all reported notifications.
{% endcapture %}
{% include callout.html content=callout_content icon="saTool" type="reminder" title="Reminder: Static Analysis Tools" %}