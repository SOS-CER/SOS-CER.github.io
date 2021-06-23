---
title: CSC 217 Lab 11 - Recursive Linked Lists
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab11]
description: CSC 217 Lab 11 - Update and Test `Course` and `CourseRecordIO`
navigation: on
pagegroup: 11-lab
---

# CSC 217 Lab 11 Update and Test `Course` and `CourseRecordIO`
{% include iconHeader.html type="implementation,unitTest" %}
Now that you are adding a `FacultySchedule` to the system, you need to update `Course` and `CourseRecordIO` to connect to a `Faculty` teaching a `Course`.  Right now, `CourseRecordIO` reads in an instructor id.  You want to update `CourseRecordIO` to do the following:

  * Find if there's a `Faculty` with the given id.
     * If so, the `Course` will be added to the `FacultySchedule`.
     * If not, the `Course` will have a null `instructorId`, which means a `Registrar` can assign a `Faculty` to the `Course` at a later time.


## Update `Course.setInstructorId()`
Currently, `Course` does not allow for the `instructorId` to be `null`.  However, since the `Registrar` should be able to assign `Faculty` to a `Course`, the `instructorId` should be `null` if no `Faculty` is assigned.  Update `Course.setInstructorId()` to allow for a `null` `instructorId`.  

Run your tests and update/remove tests that are no longer needed.
     

## Update `CourseRecordIO.readCourse()`
Update `CourseRecordIO.readCourse()` to initially set the `Course` `instructorId` to `null` when a `Course` is first created.

Then the method should check if there is a `Faculty` with the given `instructorId`.  If so, the `Course` should be added to the `Faculty`'s `FacultySchedule`.  `FacultySchedule.addCourseToSchedule()` will update the `Course` object if the `Faculty` is added.  

Run your tests and update/remove tests that are no longer needed.


## Testing the New Functionality
Your `FacutlyScheduleTest` tests should pass when you have completed the updates to `Course` and `CourseRecordIO`.


## Javadoc your Code
Javadoc the `CourseRecordIO` class and its methods. 

Run [CheckStyle](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-static-analysis#checkstyle) to ensure that your Javadoc has all elements.


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}


## Check Jenkins
Check your project on Jenkins to ensure that you are making progress.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}