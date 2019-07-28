---
title: Guided Project 1 WolfScheduler - Course and Schedule
tags: [software engineering, software lifecycle, CS2, CSC216, GP1]
description: Guided Project 1 Introduction
navigation: on
pagegroup: gp1
---

# Guided Project Introduction
**Target Audience:** this guided project is geared toward the beginning Java programmer who has some experience with Java programming from the command line.

Creating a good software system, one that people want to use, requires more than just writing code. Writing software is a process, called [software engineering](../se-overview/index). Software engineering is a sub-area of computer science where practitioners use processes and practices to develop high quality, performant, and usable software that meet a set of customer requirements.

The Guided Projects will walk you through the phases of the [software lifecycle](../se-overview/index): [requirements](../se-overview/requirements), [design](../se-overview/design), [implementation](../se-overview/implementation), [test](../se-overview/test), and [deployment](../se-overview/deployment).  Additionally, Guided Projects introduce you to the [software practices and tools that support those practices](../se-overview/index#software-development-practices-and-tools).  


{% capture callout_content %}
  * Implement and test a multi-class software system from a given set of requirements and design.
  * Use software engineering best practices like test-driven development, code coverage, static analysis, version control, continuous integration, and documentation with supporting tooling to implement and test object-oriented systems.
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}



{% capture callout_content %}
Integrated Development Environments (IDEs) facilitate software development by integrating multiple software development tools into a single application. In this module you will use the Eclipse IDE and tooling in Eclipse to develop and test software.
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="bestPractices" title="Best Practice: Integrated Development Environments (IDEs)" %}


## WolfScheduler System
You will implement and test PART of the [WolfScheduler](../wolf-scheduler/index) system.  The WolfScheduler system provides a way for a student to determine which course schedule may be best for them in an upcoming semester.  

You will develop the WolfScheduler project over the course of the three guided projects.  The [WolfScheduler requirements](../wolf-scheduler/ws-requirements) describe the fully implemented system. Guided Project 1 will focus on the following requirements:

  * [Use Case 1](../wolf-scheduler/ws-requirements#uc1): Loading Courses
  * [Use Case 2](../wolf-scheduler/ws-requirements#uc2): Scheduling - the focus is on the following sub flows and associated alternative flows
     * Sub Flow 1: Naming a schedule
     * Sub Flow 2: Adding a course
     * Sub Flow 3: Removing a course
     * Sub Flow 6: Reset schedule
     * Sub Flow 7: Course details
  * [Use Case 3](../wolf-scheduler/ws-requirements#uc3): Display Final Schedule - except for event information
  
You will complete functionality related to events and schedule conflicts in future Guided Projects.  There are expectations from the Guided Projects that you must follow.  Do NOT attempt to implement any functionality before a Guided Project tells you to do so!

As part of the Guided Project, you will be expected to run provided JUnit tests and acceptance tests to ensure that your implementation meets the requirements and design of the system.


## Guided Project Time Expectations
As you can see from the [WolfScheduler](../wolf-scheduler/) project, you will be creating a project that is likely as large as or larger than any project you have completed in your earlier coursework.  While some elements are provided and there are detailed instructions, the Guided Project still takes time to complete.  We expect that Guided Project 1 will take anywhere from **8-15 hours** to complete.


## Guided Project Feedback and Evaluation
We are using the Jenkins Continuous Integration system to automatically evaluate your work and provide feedback on your submission.  Go to the [Guided Project and Project Jenkins Server by using http://go.ncsu.edu/jenkins-csc216](http://go.ncsu.edu/jenkins-csc216).  **NOTE: The Jenkins servers for CSC216 are self signed and are maintained by the CSC216 teaching staff and CSC IT.  Please select the option to accept the signed certificate.  Usually, there's a link for Advanced that will display an option to trust the certificate.**

All assignments have a rubric that you can use to estimate your grade.  Use the Jenkins feedback and your black box test results to [estimate the grade for Guided Project 1](../wolf-scheduler/ws-rubric).


## Guided Project Tasks
You are expected to complete the following tasks to complete Guided Project 1:

{% include tableOfContents.html pagegroup="gp1"%}