---
title: CSC 217 Lab 06 - Finite State Machines
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab06]
description: CSC 217 Lab 06 - Finite State Machines
navigation: on
pagegroup: 06-lab
---
# CSC 217 Lab 06 - Finite State Machines
The head Registrar using the PackScheduler system has reported that the error checking on course name, while robust, doesn't match the pattern used by the registrar's office.  The naming conventions for a course can be modeled using an FSM.  You'll create the FSM, test a while switch implementation, and implement a state pattern version as a new validator for `Courses` in `PackScheduler`.


{% capture callout_content %}
  * Design a finite state machine from requirements.
  * Fully test a finite state machine on all transitions for every state.
  * Implement a finite state machine using the state pattern.
  * Integrate a finite state machine into a larger system using additive change.
{% endcapture %}
{% include callout.html content=callout_content icon="" type="learningOutcomes" title="Learning Outcomes" %}


{% if site.data.labs.lab06open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="06-lab" %}
{% endif %}

## Lab Checks
There are several checks that will occur during your build to ensure that you're following software engineering best practices:

  * Library checks: You'll be working with the `SortedList` class that is part of the CSC217Collections library.  You must remove all of your references to `ArrayList` from your project - including the Javadoc.  If you receive a red ball and a message in the console output about using `ArrayList` search your project for the string and regenerate your Javadoc!
  * Coverage checks: You must have 80% coverage for *each* non-GUI and non-test class in `PackScheduler`.  A tool will check that you have passed the 80% threshold before running any of the teaching tests.


## Lab Deadlines & Jenkins Servers
{% include iconHeader.html type="overview" %}
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.

{% include lab_deadlines.md mon=site.data.labs.lab06.mon06 tues=site.data.labs.lab06.tues06 wed=site.data.labs.lab06.wed06 %}

{% include rubric.md project="lab06"  %} 
