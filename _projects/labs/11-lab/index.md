---
title: CSC 217 Lab 11 - Recursive Linked Lists
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab11]
description: CSC 217 Lab 11 - Recursive Linked Lists
navigation: on
pagegroup: 11-lab
---
# CSC 217 Lab 11 - Recursive Linked Lists
In Lab 10, you implemented the `Faculty` side of the system, with requirements described in [UC8](11-lab/11-lab-requirements.md#uc8) and [UC9](11-lab/11-lab-requirements.md#uc9). For this lab, you will add the functionality to enable the `Registrar` to assign `Faculty` to the `Course`s they are going to teach.  You'll create a recursive linked list that will be used in a `FacultySchedule`.
  

{% capture callout_content %}
  * Create `LinkedListRecursive` and implement as a recursive linked list
  * Integrate a `LinkedListRecursive` into a larger system
{% endcapture %}
{% include callout.html content=callout_content icon="" type="learningOutcomes" title="Learning Outcomes" %}

{% if site.data.labs.lab11open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="11-lab" %}
{% endif %}


## Lab Checks
There are several checks that will occur during your build to ensure that you're following software engineering best practices:

  * Library checks: You'll be working with the `SortedList` class that is part of the CSC 217Collections library.  Additionally, you will implement a custom `ArrayList` and `LinkedAbstractList`.  You must remove all of your references to `java.util.ArrayList` and `java.util.LinkedList` from your project - including the Javadoc.  If you receive a red ball and a message in the console output about using `java.util.ArrayList` or `java.util.LinkedList`, search your project for the string and regenerate your Javadoc!
  * Coverage checks: You must have 80% coverage for *each* non-GUI and non-test class in `PackScheduler`.  A tool will check that you have passed the 80% threshold before running any of the teaching tests.


## Lab Deadlines & Jenkins Servers
{% include iconHeader.html type="overview" %}
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.

{% include lab_deadlines.md mon=site.data.labs.lab11.mon11 tues=site.data.labs.lab11.tues11 wed=site.data.labs.lab11.wed11 %}

{% include rubric.md project="lab11"  %} 