---
title: CSC 217 Lab 08 - LinkedAbstractList
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab08]
description: CSC 217 Lab 08 - Testing
navigation: on
pagegroup: 08-lab
---
# CSC 217 Lab 08 Testing
{% include iconHeader.html type="unitTest,systemTest" %}
As with any software development project, you must test your code to know if it meets the [requirements](08-lab-requirements) and [design](08-lab-design).  You should have unit tested your new code as you added course validation functionality.  Now you will ensure sufficient coverage and system test `PackScheduler`.


## `PackScheduler` Coverage
Ensure that all non-UI classes have at least 80% statement coverage.  Add any needed tests to cover at least 80% of the statements.

The introduction of the new course name validation functionality shouldn't lead to the regression of any existing tests unless you specifically tested a string that earlier may have been invalid but is now valid.  If so, update the test to reflect the new requirements. 


## `PackSchedulerGUI`
The teaching staff has provided four classes that comprise the GUI for `PackScheduler`.  Create classes `PackSchedulerGUI`, `CourseCatalogPanel`,  `StudentDirectoryPanel`, and `StudentRegistrationPanel` in the `edu.ncsu.csc216.pack_scheduler.ui` package and copy in the provided code.  Note that there are updates to `PackScheduleGUI` and `StudentRegistrationPanel`, so you should use the provided code.

  * [`PackSchedulerGUI` Code](files/PackSchedulerGUI.java)
  * [`CourseCatalogPanel` Code](files/CourseCatalogPanel.java)
  * [`StudentDirectoryPanel` Code](files/StudentDirectoryPanel.java)
  * [`StudentRegistrationPanel` Code](files/StudentRegistrationPanel.java)
  

## System Testing and Debugging
[Download a copy of the black box tests for `PackScheduler` Lab 08](https://docs.google.com/a/ncsu.edu/document/d/1R20kNgCttV88U8MvpYrc9CvdGR78Bew3pIWS49YAtMA/edit?usp=sharing).  There are some updates to the tests to take into account the new enrollment cap, but there are no additional provided black box tests for the new functionality.  You'll want to ensure that you system test your system to ensure that the new enrollment and drop functionality work correctly!  Save the black box test plan file in the `project_docs` folder.

Do the following:

  * Run the tests on the `PackScheduler` project.  If the test fails, debug your system until it passes.
  * Report the actual results of execution after debugging your system.
  * Create tests for the new functionality related to scheduling.  You can modify tests from the Guided Projects.
  
The following files are needed for testing.  Note that the course files are updated!

  * [student_records.txt](files/student_records.txt)
  * [course_records.txt](files/course_records.txt)
  * [expected_course_catalog.txt](files/expected_course_catalog.txt)
  * [expected_course_records.txt](files/expected_course_records.txt)
  * [starter_course_records.txt](files/starter_course_records.txt)
  * [expected_t19_student_directory.txt](files/expected_t19_student_directory.txt)
  * [expected_t39_course_catalog.txt](files/expected_t39_course_catalog.txt)


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  
  
Check Jenkins and make sure that you have a green ball and are passing your tests AND the teaching staff tests (both unit and system)!


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}