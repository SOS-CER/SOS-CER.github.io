---
title: CSC 217 Lab 10 - Iterators
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab10]
description: CSC 217 Lab 10 - Iterators
navigation: on
pagegroup: 10-lab
---
# CSC 217 Lab 10 - Iterators
The student registration functionality is complete.  `Student`s can register for classes and be added to a waitlist.  Now, you need to implement the `Faculty` side of the system.  The `Faculty` portion of the system will mimic the `Student` functionality with a few differences.
  

{% capture callout_content %}
  * Create `LinkedList` using an `Iterator`
  * Integrate a `LinkedList` into a larger system
{% endcapture %}
{% include callout.html content=callout_content icon="" type="learningOutcomes" title="Learning Outcomes" %}


{% if site.data.labs.lab10open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="10-lab" %}
{% endif %}

## Lab Checks
There are several checks that will occur during your build to ensure that you're following software engineering best practices:

  * Library checks: You'll be working with the `SortedList` class that is part of the CSC 217Collections library.  Additionally, you're creating a custom `ArrayList` and `LinkedAbstractList` implementation.  You must remove all of your references to `java.util.ArrayList` and `java.util.LinkedList` from your project - including the Javadoc.  If you receive a red ball and a message in the console output about using `java.util.ArrayList` or `java.util.LinkedList`, search your project for the string and regenerate your Javadoc!
  * Coverage checks: You must have 80% coverage for *each* non-GUI and non-test class in `PackScheduler`.  A tool will check that you have passed the 80% threshold before running any of the teaching tests.


## Lab Deadlines & Jenkins Servers
{% include iconHeader.html type="overview" %}
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.

{% include lab_deadlines.md mon=site.data.labs.lab10.mon10 tues=site.data.labs.lab10.tues10 wed=site.data.labs.lab10.wed10 %}

{% include rubric.md project="lab10"  %} 
