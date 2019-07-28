---
title: Guided Project 3 WolfScheduler - Conflict
description: Guided Project 3 Overview
tags: [software engineering, software lifecycle, CS2, CSC216, GP3]
navigation: on
pagegroup: gp3
---

# Guided Project 3 Introduction
**Target Audience:** this guided project is geared toward the beginning Java programmer who has some experience with using Eclipse, inheritance, and running test cases.

An important practice for ensuring that software works correctly is to test it and run other verification and validation tools to minimize programmer mistakes.  Since no one practice can identify all faults, developers work with a suite of practices and tools to help find problems in their code. 

One practice that developers frequently use is *test driven development* (TDD).  In TDD, a developer starts by writing tests, then uses those test to drive forward development of the implementation.  By writing system and unit tests before writing the implementation, a developer can better understand the context of the problem and the area of the solution.     

Guided Project 3 builds on [Guided Project 1](../gp1/) and [Guided Project 2](../gp2/) through another iteration of the the phases of the [software lifecycle](../se-overview/), with an emphasis on using TDD to implement the new features.  You will continue to work with [software practices and tools that support those practices](../se-overview/#software-development-practices-and-tools) in Guided Project 3.


{% capture callout_content %}
  * Use test driven development to solve a software problem.
  * Revise and write system level tests.
  * Write unit level tests.
  * Use coverage metrics to identify and cover unexecuted paths.
  * Use software engineering best practices like test-driven development, code coverage, static analysis, version control, continuous integration, and documentation with supporting tooling to implement and test object-oriented systems.
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}
 

## WolfScheduler System
You will implement and test the remainder of the [WolfScheduler](../wolf-scheduler/) system, with an emphasis on conflict identification and resolution.  The WolfScheduler system enables a student to determine which course schedule may be best for them in an upcoming semester.  

You will develop the WolfScheduler project over the course of the three guided projects.  The [WolfScheduler requirements](../wolf-scheduler/ws-requirements#guided-project-3-requirements) describe the fully implemented system. Guided Project 3 will focus on the following requirements (with an assumption of no regression in functionality on the already implemented requirements):
  
  * [Use Case 2](../wolf-scheduler/ws-requirements#gp3-uc2): Scheduling conflict with a focus on the following sub and alternative flows
     * Sub Flow 2 and Alternative Flow 3
     * Sub Flow 4 and Alternative Flow 6
  
As part of earlier Guided Projects, you were provided with a suite of unit and system tests.  You will now be adding new tests for the conflict functionality.  You should not need to make any changes to the content of the provided tests due to the new functionality (since courses and activities added to a schedule have no conflicts in the provided tests).


## Guided Project Time Expectations
As you can see from the [WolfScheduler](../wolf-scheduler/) project, you will be creating a project that is likely as large as or larger than any project you have completed in your earlier coursework.  While some elements are provided and there are detailed instructions, the Guided Project still takes time to complete.  We expect that Guided Project 3 will take anywhere from **8-15 hours** to complete.


## Guided Project Feedback and Evaluation
We are using the Jenkins Continuous Integration system to automatically evaluate your work and provide feedback on your submission.  Go to the [Guided Project and Project Jenkins Server by using http://go.ncsu.edu/jenkins-csc216](http://go.ncsu.edu/jenkins-csc216).

All assignments have a rubric that you can use to estimate your grade.  Use the Jenkins feedback and your black box test results to [estimate your grade for Guided Project 3](../wolf-scheduler/ws-rubric#guided-project-3-rubric).


## Guided Project Tasks
{% include tableOfContents.html pagegroup="gp3" %}
 