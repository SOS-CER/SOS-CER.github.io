---
title: CSC 217 Lab 09 - Stacks and Queues
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab09]
description: CSC 217 Lab 09 - Stacks and Queues
navigation: on
pagegroup: 09-lab
---
# CSC 217 Lab 09 - Stacks and Queues
Now that `Students` can enroll in `Courses` and both the `CourseRoll` and `Schedules` show the enrollment and drop updates, you can add waitlist functionality.  Waitlists provide the ability for students to show interest in classes that are at capacity.  If a student drops the class, the first waitlisted student is enrolled.
  

{% capture callout_content %}
  * Create a `Stack` using delegation
  * Create a `Queue` using delegation
  * Evaluate runtime efficiency of linear data structures
  * Determine the best data structure to use to meet requirements
  * Integrate a `Stack` or `Queue` into a larger system
{% endcapture %}
{% include callout.html content=callout_content icon="" type="learningOutcomes" title="Learning Outcomes" %}


{% if site.data.labs.lab09open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="09-lab" %}
{% endif %}

## Lab Checks
There are several checks that will occur during your build to ensure that you're following software engineering best practices:

  * Library checks: You'll be working with the `SortedList` class that is part of the CSC216Collections library.  Additionally, you're creating a custom `ArrayList` and `LinkedAbstractList` implementation.  You must remove all of your references to `java.util.ArrayList` and `java.util.LinkedList` from your project - including the Javadoc.  If you receive a red ball and a message in the console output about using `java.util.ArrayList` or `java.util.LinkedList`, search your project for the string and regenerate your Javadoc!
  * Coverage checks: You must have 80% coverage for *each* non-GUI and non-test class in `PackScheduler`.  A tool will check that you have passed the 80% threshold before running any of the teaching tests.


## Lab Deadlines & Jenkins Servers
{% include iconHeader.html type="overview" %}
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.

{% include lab_deadlines.md mon=site.data.labs.lab09.mon09 tues=site.data.labs.lab09.tues09 wed=site.data.labs.lab09.wed09 %}

{% include rubric.md project="lab09"  %} 