---
title: CSC216 Lab 11 - Recursive Linked Lists
tags: [software engineering, software lifecycle, CS2, CSC216, Lab11]
description: CSC216 Lab 11 - Update and Test `Faculty`
navigation: on
pagegroup: 11-lab
---

# CSC216 Lab 11 Update and Test `Faculty`
{% include iconHeader.html type="implementation,unitTest" %}
The `Faculty` class represents an individual faculty record - including the `FacultySchedule`.


## Add `FacultySchedule` State
Add a field of type `FacultySchedule` to `Faculty`.  

The `Faculty()` constructor should construct `FacultySchedule` and pass in the `Faculty` `id`.


## Add `Faculty.getSchedule()` Method
Add `Faculty.getSchedule()`, which returns the `FacultySchedule`.


## Add `Faculty.isOverloaded()` Method
Add `Faculty.isOverloaded()`, which returns true if the number of scheduled courses is greater than the `Faculty`'s `maxCourses`.


## Testing the New Functionality
Your `FacultyScheduleTest` tests will fail.  That's because you first have to update how `Course` and `CourseRecordIO` behave so that you can connect `Course`s and `Faculty` through `FacultySchedule`.


## Javadoc your Code
Javadoc the `Faculty` class, state, and methods.  For the overridden methods `equals()`, `hashCode()`, and `toString()`, remove the green comments and Javadoc them to describe how the methods work in `Faculty`.  Do NOT delete the `@Override` annotation.

Run [CheckStyle](../../gp1/gp1-static-analysis#checkstyle) to ensure that your Javadoc has all elements.


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../../git-tutorial/git-staging)
  * [Committing Files](../../git-tutorial/git-commit)
  * [Pushing Files](../../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}


## Check Jenkins
Check your project on Jenkins to ensure that you are making progress.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/#build-summary-page) and use the results to [estimate your grade](../../jenkins/#grade-estimation-example):

  * [Test Results](../../jenkins/#test-results)
  * [FindBugs Report](../../jenkins/#findbugs-report)
  * [CheckStyle Report](../../jenkins/#checkstyle-report)
  * [PMD Report](../../jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}