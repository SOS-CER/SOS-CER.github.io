---
title: CSC216 Lab 10 - Iterators
tags: [software engineering, software lifecycle, CS2, CSC216, Lab10]
description: CSC216 Lab 10 - Implement and Test `Faculty`
navigation: on
pagegroup: 10-lab
---

# CSC216 Lab 10 Implement and Test `Faculty`
{% include iconHeader.html type="implementation,unitTest" %}
The `Faculty` class represents an individual faculty record.  The `Faculty` class is a "plain old java object" (POJO) consisting mostly of getters and setters.  `Faculty` extends `User` and its implementation is similiar to the implementation of `Student`.  The main difference is that `Faculty` objects have a number of courses they can teach in a given semester (between 1 and 3 inclusive) rather keeping track of credits as `Student`s do.


## Create `FacultyTest`
Create `FacultyTest` in the `edu.ncsu.csc216.pack_scheduler.user` package of the `test/` source folder.  Start by creating tests for the `Faculty` class as defined in the design.   Since `Faculty` is so similar to `Student`, use `StudentTest` as a model for your `FacultyTest` class.


## Implement `Faculty`
Implement `Faculty` to pass your tests.  Since `Faculty` is so similar to `Student`, use `Student` as a model for implementing `Faculty`.


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
Ensure that your Jenkins job is reflecting the results that you expect for the level of completion of your lab assignment.

{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/#build-summary-page) and use the results to [estimate your grade](../../jenkins/#grade-estimation-example):

  * [Test Results](../../jenkins/#test-results)
  * [FindBugs Report](../../jenkins/#findbugs-report)
  * [CheckStyle Report](../../jenkins/#checkstyle-report)
  * [PMD Report](../../jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}