---
title: CSC216 Lab 12 - Graphical User Interfaces
tags: [software engineering, software lifecycle, CS2, CSC216, Lab12]
description: CSC216 Lab 12 - GUI Bug Fix
navigation: on
pagegroup: 12-lab
---
# CSC216 Lab GUI Bug Fix
{% include iconHeader.html type="implementation, systemTest" %}
There's a set of six minor bugs in the GUI in the `StudentDirectoryPanel`, `FacultyDirectoryPanel`, and `CourseCatalogPanel`.  If you click a **Load** or **Save** button on those panels, a `JFileChooser` is displayed.  An exception is thrown if the user clicks the **Cancel** button in the `JFileChooser`.  Instead of throwing an exception to the console, catch and handle the exception.
 
## Write Black Box Tests
Write six black box tests - one for each **Load** and **Save** action in the three files in question.  The **Cancel** button should take the user back to the main GUI without throwing an exception or changing any internal state.  Add these tests to your Lab 12 Black Box Test Plan.

 
## Fix the Bugs!
Fix the bugs in the code.


## Test that the Bugs are Fixed
Run your tests and ensure that the bugs are fixed.  **Record the actual results of execution.**

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
If you have test failures, use the feedback from Jenkins to help you resolve the issues. 

{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/jenkins-overview#build-summary-page) and use the results to [estimate your grade](../../jenkins/jenkins-overview#grade-estimation-example):

  * [Test Results](../../jenkins/jenkins-overview#test-results)
  * [FindBugs Report](../../jenkins/jenkins-overview#findbugs-report)
  * [CheckStyle Report](../../jenkins/jenkins-overview#checkstyle-report)
  * [PMD Report](../../jenkins/jenkins-overview#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}