---
title: CSC 217 Lab 12 - Graphical User Interfaces
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab12]
description: CSC 217 Lab 12 - Graphical User Interfaces
navigation: on
pagegroup: 12-lab
---
# CSC 217 Lab 12 - Graphical User Interfaces
In Lab 11, you implemented the `FacultySchedule` functionality described in Use Cases 23-25. For this lab, you will add the front end where a `Faculty` can view their `FacultySchedule` and `CourseRoll` as described in [UC26](12-lab-requirements#uc26).  

Additionally, there are some bug fixes and [one piece of unfinished GUI functionality](12-lab-requirements#uc17) to complete!

{% capture callout_content %}
  * Implement a Graphic User Interface
  * Use the observer pattern to implement GUI events
{% endcapture %}
{% include callout.html content=callout_content icon="" type="learningOutcomes" title="Learning Outcomes" %}

{% if site.data.labs.lab12open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="12-lab" %}
{% endif %}

## Lab Checks
There are several checks that will occur during your build to ensure that you're following software engineering best practices:

  * Library checks: You'll be working with the `SortedList` class that is part of the CSC 217Collections library.  Additionally, you will implement a custom `ArrayList` and `LinkedAbstractList`.  You must remove all of your references to `java.util.ArrayList` and `java.util.LinkedList` from your project - including the Javadoc.  If you receive a red ball and a message in the console output about using `java.util.ArrayList` or `java.util.LinkedList`, search your project for the string and regenerate your Javadoc!
  * Coverage checks: You must have 80% coverage for *each* non-GUI and non-test class in `PackScheduler`.  A tool will check that you have passed the 80% threshold before running any of the teaching tests.


