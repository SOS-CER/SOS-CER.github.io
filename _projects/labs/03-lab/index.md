---
title: CSC 217 Lab 03 - Collections
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab03]
description: CSC 217 Lab 03 - Collections
navigation: on
pagegroup: 03-lab
---
# CSC 217 Lab 03: Collections
One of the limitations of the current implementation of the `StudentDirectory` portion of the `PackScheduler` system is that the students are not stored in a sorted order in the directory.  With Lab 03, you will work with a custom list library that will store elements in sorted order as defined for each element type.  

You will test a provided library of a sorted list implementation and then integrate that list into your `PackScheduler` system to replace the unsorted `ArrayList` that is used in `StudentDirectory` and `StudentRecordIO`.  For sorted order to work, you will implement the `Comparable` interface for the `Student` class.  The changes to the `PackScheduler` library will be evaluated through your own test suite and a teaching staff test suite to demonstrate that your program meets the updated [`PackScheduler` requirements](03-lab/03-lab-requirements).


{% capture callout_content %}
  * Update unit tests for `Student`, `StudentRecordIO`, and `StudentDirectory`
  * Achieve at least 80% statement coverage when executing your tests against   `Student`, `StudentRecordIO`, and `StudentDirectory`
  * Test and use a third party library
  * Use code coverage tools to identify other paths to test
  * Use static analysis tools to identify potential problems
  * Run black box tests
  * Find and fix any bugs detected during testing
{% endcapture %}
{% include callout.html content=callout_content icon="objective" type="learningOutcomes" title="Learning Outcomes" %}

{% if site.data.labs.lab03open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="03-lab" %}
{% endif %}

## Lab Checks
There are several checks that will occur during your build to ensure that you're following software engineering best practices:

  * Library checks: For Lab 03, you'll be working with the `SortedList` class that is part of the CSC216Collections library.  All of your references to `ArrayList` MUST be removed from your project - including the Javadoc.  If you receive a red ball and a message in the console output about using `ArrayList` search your project for the string and regenerate your Javadoc!
  * Coverage checks: You must have 80% coverage for *each* non-GUI and non-test class in `PackScheduler`.  A tool will check that you have passed the 80% threshold before running any of the teaching tests.


## Lab Deadlines & Jenkins Servers
{% include iconHeader.html type="overview" %}
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.

{% include lab_deadlines.md mon=site.data.labs.lab03.mon03 tues=site.data.labs.lab03.tues03 wed=site.data.labs.lab03.wed03 %}

{% include rubric.md project="lab03"  %} 
