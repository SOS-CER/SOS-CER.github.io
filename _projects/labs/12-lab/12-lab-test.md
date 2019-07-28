---
title: CSC216 Lab 12 - Graphical User Interfaces
tags: [software engineering, software lifecycle, CS2, CSC216, Lab12]
description: CSC216 Lab 12 - Testing
navigation: on
pagegroup: 12-lab
---

# CSC216 Lab 12 Testing
{% include iconHeader.html type="unitTest,systemTest" %}
As with any software development project, you must test your code to know if it meets the [requirements](12-lab-requirements) and [design](12-lab-design).  You have run black box tests on your new functionality and bug fixes.  Now you will ensure no regressions in functionality and ensure that you're maintaining sufficient coverage `PackScheduler`.

 
## `PackScheduler` Coverage
Ensure that all non-UI classes have at least 80% statement coverage and that all unit tests are continuing to pass.  Add any needed tests to cover at least 80% of the statements.

The work that you are completing for the GUI shouldn't lead to any regression in functionality, but if there is a regression, you'll need to find and fix it.
  
 
## System Testing and Debugging
Run all of your prior black box tests on the `PackSchedule` project to ensure that the addition of the new GUI elements hasn't broken any other GUI functionality.

  * Run the tests on the `PackScheduler` project.  If the test fails, debug your system until it passes.
  * Report the actual results of execution after debugging your system.
  * Create tests for the new functionality related to faculty. 
  
The following files are needed for testing.  

  * [faculty_records_extended.txt](files/faculty_records_extended.txt)
  * [student_records.txt](files/student_records.txt)
  * [course_records.txt](files/course_records.txt)
  * [expected_course_catalog.txt](files/expected_course_catalog.txt)
  * [expected_course_records.txt](files/expected_course_records.txt)
  * [starter_course_records.txt](files/starter_course_records.txt)
  * [t19_student_directory.txt](files/t19_student_directory.txt)
  * [t39_course_catalog.txt](files/t39_course_catalog.txt)
  * [faculty_records.txt](files/faculty_records.txt)
  * [expected_faculty_records.txt](files/expected_faculty_records.txt)
  * [invalid_faculty_records.txt](files/invalid_faculty_records.txt)
  * [expected_full_faculty_records.txt](files/expected_full_faculty_records.txt)

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