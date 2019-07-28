---
title: Guided Project 2 WolfScheduler - Activity and Event
tags: [software engineering, software lifecycle, CS2, CSC216, GP2]
description: Guided Project Introduction
navigation: on
pagegroup: gp2
---

# Guided Project Introduction
**Target Audience:** this guided project is geared toward the beginning Java programmer who has some experience with using Eclipse.

A paradigm of good design is to reduce redundancy.  You want to have code in one location (it's easier to maintain) and reuse that code as much as possible.  In [Guided Project 1](../gp1/), you explored the composition relationship.  You could encapsulate code in a single class (e.g., `Course`) providing an abstraction that could be used by other classes (e.g., `WolfScheduler`).  The container class `WolfScheduler` could then delegate to the contained class `Course`.  

Composition is one type of relationship in object-oriented programs.  The other relationship is *inheritance*.  Inheritance is when one class extends or specialized another class.  The common code goes in the parent and the extension goes in the child.  

Guided Project 2 builds on [Guided Project 1](../gp1/) through another iteration of the the phases of the [software lifecycle](../se-overview/).  You will continue to work with [software practices and tools that support those practices](../se-overview/#software-development-practices-and-tools) in Guided Project 2.

<!-- TODO: Add Debugger? -->

{% capture callout_content %}
  * Implement and test a multi-class software system from a given set of requirements and design.
  * Use software engineering best practices like test-driven development, code coverage, static analysis, version control, continuous integration, and documentation with supporting tooling to implement and test object-oriented systems.
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}
  

## WolfScheduler System
You will implement and test PART of the [WolfScheduler](../wolf-scheduler/) system.  The WolfScheduler system enables a student to determine which course schedule may be best for them in an upcoming semester.  

You will develop the WolfScheduler project over the course of the three guided projects.  The [WolfScheduler requirements](../wolf-scheduler/ws-requirements#guided-project-2-requirements) describe the fully implemented system. Guided Project 2 will focus on the following requirements (with an assumption of no regression in functionality on the already implemented requirements):
  
  * [Use Case 2](../wolf-scheduler/ws-requirements#gp2-uc2): Scheduling - the focus is on the following sub flows and associated alternative flows
     * Sub Flow 4: Adding an event
     * Sub Flow 5: Removing an event
     * Sub Flow 6: Reset schedule
  
  * [Use Case 3](../wolf-scheduler/ws-requirements#gp2-uc3): Display Final Schedule including event information
  
You will complete the functionality for handling schedule conflicts in Guided Project 3.  There are expectations from the Guided Projects that you must follow.  Do NOT attempt to implement any functionality before a Guided Project tells you to do so!

As part of the Guided Project, you are expected to run the provided JUnit tests and acceptance tests to ensure that your implementation meets the requirements and design of the system.


## Guided Project Time Expectations
As you can see from the [WolfScheduler](../wolf-scheduler/) project, you will be creating a project that is likely as large as or larger than any project you have completed in your earlier coursework.  While some elements are provided and there are detailed instructions, the Guided Project still takes time to complete.  We expect that Guided Project 2 will take anywhere from **8-15 hours** to complete.


## Guided Project Feedback and Evaluation
We are using the Jenkins Continuous Integration system to automatically evaluate your work and provide feedback on your submission.  Go to the [Guided Project and Project Jenkins Server by using http://go.ncsu.edu/jenkins-csc216](http://go.ncsu.edu/jenkins-csc216).

All assignments have a rubric that you can use to estimate your grade.  Use the Jenkins feedback and your black box test results to [estimate your grade for Guided Project 2](../wolf-scheduler/ws-rubric#guided-project-2-rubric).


## Guided Project Tasks
You are expected to complete the following tasks to complete Guided Project 2:
{% include tableOfContents.html pagegroup="gp2"%}
