---
title: CSC 217 Lab 08 - LinkedAbstractList
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab08]
description: CSC 217 Lab 08 - LinkedAbstractList
navigation: on
pagegroup: 08-lab
---
# CSC 217 Lab 08 - LinkedAbstractList
The next step in implementing `PackScheduler` is to add functionality for students to register for classes they want to take by adding students to a course roll. You'll create a utility class that will have a custom implementation of a generic `LinkedAbstractList` that doesn't allow null elements or duplicates. Additionally, the list will have an enrollment capacity. From there, you will create a `CourseRoll` and incorporate it into the `Course` class.  There will be some additional modifications to `Schedule`, `Student`, and `EnrollmentManager` to create the end-to-end implementation.
  

{% capture callout_content %}
  * Create a custom `LinkedAbstractList` implementation that extends `AbstractList`.
  * Integrate the custom `LinkedAbstractList` into a larger implementation.
{% endcapture %}
{% include callout.html content=callout_content icon="" type="learningOutcomes" title="Learning Outcomes" %}


{% if site.data.labs.lab08open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="08-lab" %}
{% endif %}

## Lab Checks
There are several checks that will occur during your build to ensure that you're following software engineering best practices:

  * Library checks: You'll be working with the `SortedList` class that is part of the CSC217Collections library.  Additionally, you're creating a custom `ArrayList` and `LinkedAbstractList` implementation.  You must remove all of your references to `java.util.ArrayList` and `java.util.LinkedList` from your project - including the Javadoc.  If you receive a red ball and a message in the console output about using `java.util.ArrayList` or `java.util.LinkedList`, search your project for the string and regenerate your Javadoc!
  * Coverage checks: You must have 80% coverage for *each* non-GUI and non-test class in `PackScheduler`.  A tool will check that you have passed the 80% threshold before running any of the teaching tests.


## Lab Deadlines & Jenkins Servers
{% include iconHeader.html type="overview" %}
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.

{% include lab_deadlines.md mon=site.data.labs.lab08.mon08 tues=site.data.labs.lab08.tues08 wed=site.data.labs.lab08.wed08 %}

{% include rubric.md project="lab08"  %} 