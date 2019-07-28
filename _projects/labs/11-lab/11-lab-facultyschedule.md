---
title: CSC216 Lab 11 - Recursive Linked Lists
tags: [software engineering, software lifecycle, CS2, CSC216, Lab11]
description: CSC216 Lab 11 - Implement and Test `FacultySchedule`
navigation: on
pagegroup: 11-lab
---

# CSC216 Lab 11 Implement and Test `FacultySchedule`
{% include iconHeader.html type="implementation,unitTest" %}
`FacultySchedule` represents the  list of `Course`s that a `Faculty` has been assigned to teach by the `Registrar`.  A colleague has implemented the `FacultySchedule` and `FacultyScheduleTest` classes and shared them with you.  You will integrate them into your system and ensure that they work correctly with no regressions and no changes to the code.


## Create `FacultySchedule`
Create `FacultySchedule` in the `edu.ncsu.csc216.pack_scheduler.user.schedule` package of the `src/` source folder.  Copy in the [code for `FacultySchedule` provided by your colleague](files/FacultySchedule.java).


## Create `FacultyScheduleTest`
Create `FacultyScheduleTest` in the `edu.ncsu.csc216.pack_scheduler.user.schedule` package of the `test/` source folder.  Copy in the [code for `FacultyScheduleTest` provided by your colleague](files/FacultyScheduleTest.java).

There are several files that are used to help you with testing.  While you likely already have them, they are provided below if needed.

  * [starter_course_records.txt](files/starter_course_records.txt)
  * [course_records.txt](files/course_records.txt)
  

## Testing `FacultySchedule`
`FacultyScheduleTest` won't compile yet.  There are a couple of methods in `Faculty` that are needed for the test.  That's the next step!


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