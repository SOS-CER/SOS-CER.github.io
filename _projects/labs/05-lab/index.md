---
title: CSC 217 Lab 05 - Inspection & Debugging
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab05]
description: CSC 217 Lab 05 - Inspection & Debugging 
navigation: on
pagegroup: 05-lab
---
# CSC 217 Lab 05 - Inspection & Debugging
In the last lab, you integrated the idea of `Course`s from WolfScheduler into PackScheduler.  Now that we have the idea of both `Student`s and `Course`s in PackScheduler, we need to add in a new type of user - a registrar!  A registrar is someone who can work with both the `StudentDirectory` and `CourseCatalog` to ensure that the correct students and courses are in the system for registration.  As part of this lab, you'll create a new inheritance hierarchy for `User`s.  Additionally, you'll receive some code from a colleague elsewhere in the organization.  The code provides functionality for a new `RegistrationManager` class that introduces some new concepts (i.e, the Singleton pattern, inner classes, and properties files).  However, the colleague isn't working on your project, so their code won't fully integrate into the `PackScheduler` system without some work.  You'll inspect the code to identify problems. Additionally, you'll write test cases to exercise that failing code and for use in debugging.


{% capture callout_content %}
  * Create a class hierarchy for users.
  * Inspect a code for potential problems against a set of requirements.
  * Write tests and debug code written by another person.
{% endcapture %}
{% include callout.html content=callout_content icon="" type="learningOutcomes" title="Learning Outcomes" %}


{% if site.data.labs.lab05open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="05-lab" %}
{% endif %}

## Lab Checks
There are several checks that will occur during your build to ensure that you're following software engineering best practices:

  * Library checks: You'll be working with the `SortedList` class that is part of the CSC217Collections library.  You must remove all of your references to `ArrayList` from your project - including the Javadoc.  If you receive a red ball and a message in the console output about using `ArrayList` search your project for the string and regenerate your Javadoc!
  * Coverage checks: You must have 80% coverage for *each* non-GUI and non-test class in `PackScheduler`.  A tool will check that you have passed the 80% threshold before running any of the teaching tests.



## Lab Deadlines & Jenkins Servers
{% include iconHeader.html type="overview" %}
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.

{% include lab_deadlines.md mon=site.data.labs.lab05.mon05 tues=site.data.labs.lab05.tues05 wed=site.data.labs.lab05.wed05 %}

{% include rubric.md project="lab05"  %} 
