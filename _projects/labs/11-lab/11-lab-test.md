---
title: CSC216 Lab 11 - Recursive Linked Lists
tags: [software engineering, software lifecycle, CS2, CSC216, Lab11]
description: CSC216 Lab 11 - Testing
navigation: on
pagegroup: 11-lab
---

# CSC216 Lab 11 Testing
{% include iconHeader.html type="unitTest,systemTest" %}
As with any software development project, you must test your code to know if it meets the [requirements](11-lab-requirements) and [design](11-lab-design).  You should have unit tested your new code as you added functionality functionality.  Now you will ensure sufficient coverage and system test `PackScheduler`.


## `PackScheduler` Coverage
Ensure that all non-UI classes have at least 80% statement coverage.  Add any needed tests to cover at least 80% of the statements.

The introduction of the new faculty functionality shouldn't lead to the regression of any existing tests.  If so, update the test to reflect the new requirements. 


## `PackSchedulerGUI`
The teaching staff has provided six classes that comprise the GUI for `PackScheduler`.  Create classes `PackSchedulerGUI`, `InstructorAssignmentPanel`, `CourseCatalogPanel`,  `StudentDirectoryPanel`, `FacultyDirectoryPanel`, and `StudentRegistrationPanel` in the `edu.ncsu.csc216.pack_scheduler.ui` package and copy in the provided code.  The `InstructorAssignmentPanel` class is new and `PackSchedulerGUI` has updates.


  * [`PackSchedulerGUI` Code](files/PackSchedulerGUI.java)
  * [`InstructorAssignmentPanel.java` Code](files/InstructorAssignmentPanel.java)
  * [`CourseCatalogPanel` Code](files/CourseCatalogPanel.java)
  * [`StudentDirectoryPanel` Code](files/StudentDirectoryPanel.java)
  * [`FacultyDirectoryPanel` Code](files/FacultyDirectoryPanel.java)
  * [`StudentRegistrationPanel` Code](files/StudentRegistrationPanel.java)
  

## System Testing and Debugging
System test the new FacultySchedule functionality to ensure it works correctly.  

The following files are needed for testing.  Note that there is a new file `faculty_records_extended.txt` that has faculty records for the instructor ids used in `course_records.txt`!

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
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu).

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  
  
Check Jenkins and make sure that you have a green ball and are passing your tests AND the teaching staff tests (both unit and system)!


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../../git-tutorial/git-staging)
  * [Committing Files](../../git-tutorial/git-commit)
  * [Pushing Files](../../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}


## Check Jenkins
At this point your project will build on Jenkins, maybe even with a green ball!  If you have test failures, use the feedback from Jenkins to help you resolve the issues. 


{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/#build-summary-page) and use the results to [estimate your grade](../../jenkins/#grade-estimation-example):

  * [Test Results](../../jenkins/#test-results)
  * [FindBugs Report](../../jenkins/#findbugs-report)
  * [CheckStyle Report](../../jenkins/#checkstyle-report)
  * [PMD Report](../../jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}