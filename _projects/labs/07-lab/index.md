---
title: CSC 217 Lab 07 - ArrayLists
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab07]
description: CSC 217 Lab 07 - ArrayLists
navigation: on
pagegroup: 07-lab
---
# CSC 217 Lab 07 - ArrayLists
The next step in implementing `PackScheduler` is to add functionality for students to register for classes they want to take. You'll create a utility package that will have a custom implementation of a generic `ArrayList` that doesn't allow null elements or duplicates.  From there, you will create a `Schedule` and incorporate it into the `Student` class.
  

{% capture callout_content %}
  * Create a custom `ArrayList` implementation that extends `AbstractList`.
  * Integrate the custom `ArrayList` into a larger implementation.
{% endcapture %}
{% include callout.html content=callout_content icon="" type="learningOutcomes" title="Learning Outcomes" %}


{% if site.data.labs.lab07open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="07-lab" %}
{% endif %}

## Lab Checks
There are several checks that will occur during your build to ensure that you're following software engineering best practices:

  * Library checks: You'll be working with the `SortedList` class that is part of the CSC216Collections library.  Additionally, you're creating a custom `ArrayList` implementation.  You must remove all of your references to `java.util.ArrayList` from your project - including the Javadoc.  If you receive a red ball and a message in the console output about using `java.util.ArrayList` search your project for the string, remove the `doc/` folder, and regenerate your Javadoc!
  * Coverage checks: You must have 80% coverage for *each* non-GUI and non-test class in `PackScheduler`.  A tool will check that you have passed the 80% threshold before running any of the teaching tests.  A class with less than 95% method coverage will keep you at a yellow ball, but will let the teaching staff tests run.


## Lab Deadlines & Jenkins Servers
{% include iconHeader.html type="overview" %}
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.

{% include lab_deadlines.md mon=site.data.labs.lab07.mon07 tues=site.data.labs.lab07.tues07 wed=site.data.labs.lab07.wed07 %}

{% include rubric.md project="lab07"  %} 