---
title: Guided Project 3 WolfScheduler - Conflict
description: Independent Task - Coverage
tags: [software engineering, software lifecycle, CS2, CSC216, GP3]
navigation: on
pagegroup: gp3
---

# Independent Task: Coverage
Use EclEmma to evaluate coverage on `checkConflict()` method in `Activity`.

{% capture callout_content %}
  * Use coverage to determine if additional tests are needed to execute other, uncovered, paths
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}

{% capture callout_content %}
Coverage is a measure of the code executed when running a test case.  The principle behind coverage is that a line of code that has been executed is less likely to contain a bug than a non-executed line of code.  There are four levels of coverage:

  * Method coverage: every method called at least once.
  * Statement coverage: every statement executed at least once.
  * Branch coverage: every conditional statement evaluated on both its true and false paths.
  * Condition coverage: every predicate in a compound conditional evalue on both its true and false paths.
  
For CSC216, the teaching staff expects that you will achieve at least 80% statement coverage on *each* model class (which are any of the classes not in the `ui` package).  A coverage tool can identify paths that you have not yet executed with your tests.  Using the feedback you can write additional tests to exercise other portions of your code.

There are some limitations to code coverage.  Since you are using your existing code to drive your testing, your tests won't tell you if you're missing functionality.  That is one reason why you should use TDD to drive the implementation and a reason for why we have multiple types of testing - the missing functionality might be caught in system level tests.

Also, don't write poor tests just to make your coverage tool happy.  Take the time to write a meaningful test so that you may have increased confidence that your code works correctly.  PMD will provide notifications on poor test practices!
{% endcapture %}
{% include callout.html content=callout_content type="bestPractices" icon="ccTool" title="Best Practice: Coverage" %}

## Run Tests for Coverage
To run tests for coverage, right click on the `test/` source folder and select **Coverage As > JUnit Test**.

When evaluating coverage locally, focus only on the coverage of classes that are not in the `*.ui` package.  The coverage of the test classes themselves and any user interface classes are not considered when evaluating the coverage of your tests.  Jenkins is set up to exclude test classes and user interface classes, but your local EclEmma is not.  Don't panic if the numbers seem low.

One last thing to check is that EclEmma is reporting the right metrics.  Click the down arrow (View Menu) option in the **Coverage** view.  Select **Line Counters** for seeing statement/line coverage.  If you want to see condition coverage, use the **Branch Counters** option.

## Use Coverage to Drive Testing
The CSC216 Teaching Staff expect 80% statement coverage on *every* non-UI and non-test class.  While the unit tests provided by the teaching staff for the rest of the project are extensive, they may not achieve 80% coverage on your implementation.  Add additional tests to reach the 80% coverage threshold for all non-UI and non-test classes: `Activity`, `Course`, `Event`, `ConflictException`, `ActivityRecordIO`, `CourseRecordIO`, and `WolfScheduler`.

{% capture callout_content %}
There are several resources provided about code coverage:

  * [Dr. Heckman's Coverage and Static Analysis Lecture Notes](http://www.csc.ncsu.edu/courses/csc216-common/Heckman/lectures/03_Coverage_StaticAnalysis.pdf)
  * [Dr. Perry's Code and Testing Analysis](https://courses.ncsu.edu/csc216/lec/601/wrap/lectures/7_2_code_analysis.html)
  
{% endcapture %}
{% include callout.html content=callout_content type="reminder" icon="ccTool" title="Reminder: Resources on Coverage" %}

## Push to GitHub
Use the feedback from Jenkins to make changes to your code.  Any time you make a change, push to GitHub and check the Jenkins results.

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content type="reminder" icon="vcTool" title="Reminder: Staging and Pushing to GitHub" %}