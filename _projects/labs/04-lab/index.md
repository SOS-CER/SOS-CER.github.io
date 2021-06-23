---
title: CSC 217 Lab 04 - Design
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab04]
description: CSC 217 Lab 04 - Design
navigation: on
pagegroup: 04-lab
---
# CSC 217 Lab 04: Design
The current `StudentDirectory` portion of `PackScheduler` implements the concept of a list of students, but is lacking functionality expected in a registration system - like courses and registering for courses!  However, you have part of that functionality in your `WolfSchedler` project.  For this lab, you will explore a design that integrates the two systems and then extend them to a successful implementation of the Lab 04 requirements.


{% capture callout_content %}
  * Compare and evaluate class diagram designs for a set of requirements.
  * Integrate two systems together into a cohesive whole.
  * Update a design to include a new requirement.
{% endcapture %}
{% include callout.html content=callout_content icon="" type="learningOutcomes" title="Learning Outcomes" %}


{% if site.data.labs.lab04open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="04-lab" %}
{% endif %}


## Lab Checks
There are several checks that will occur during your build to ensure that you're following software engineering best practices:

  * Library checks: You'll be working with the `SortedList` class that is part of the CSC216Collections library.  You must remove all of your references to `ArrayList` from your project - including the Javadoc.  If you receive a red ball and a message in the console output about using `ArrayList` search your project for the string and regenerate your Javadoc!
  * Coverage checks: You must have 80% coverage for *each* non-GUI and non-test class in `PackScheduler`.  A tool will check that you have passed the 80% threshold before running any of the teaching tests.


## Lab Deadlines & Jenkins Servers
{% include iconHeader.html type="overview" %}
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.

{% include lab_deadlines.md mon=site.data.labs.lab04.mon04 tues=site.data.labs.lab04.tues04 wed=site.data.labs.lab04.wed04 %}

{% include rubric.md project="lab04"  %} 
