---
title: CSC216 Lab 09 - Stacks and Queues
tags: [software engineering, software lifecycle, CS2, CSC216, Lab09]
description: CSC216 Lab 09 - Testing
navigation: on
pagegroup: 09-lab
---

# CSC216 Lab 09 Testing
{% include iconHeader.html type="unitTest,systemTest" %}
As with any software development project, you must test your code to know if it meets the [requirements](09-lab-requirements) and [design](09-lab-design).  You should have unit tested your new code as you added course validation functionality.  Now you will ensure sufficient coverage and system test `PackScheduler`.


## `PackScheduler` Coverage
Ensure that all non-UI classes have at least 80% statement coverage.  Add any needed tests to cover at least 80% of the statements.

The introduction of the new course name validation functionality shouldn't lead to the regression of any existing tests unless you specifically tested a string that earlier may have been invalid but is now valid.  If so, update the test to reflect the new requirements. 


## `PackSchedulerGUI`
The teaching staff has provided four classes that comprise the GUI for `PackScheduler`.  Create classes `PackSchedulerGUI`, `CourseCatalogPanel`,  `StudentDirectoryPanel`, and `StudentRegistrationPanel` in the `edu.ncsu.csc216.pack_scheduler.ui` package and copy in the provided code.  There are no updates for this lab, but the files are provided if you need them.

  * [`PackSchedulerGUI` Code](files/PackSchedulerGUI.java)
  * [`CourseCatalogPanel` Code](files/CourseCatalogPanel.java)
  * [`StudentDirectoryPanel` Code](files/StudentDirectoryPanel.java)
  * [`StudentRegistrationPanel` Code](files/StudentRegistrationPanel.java)
  

## System Testing and Debugging
[Download a copy of the black box tests for `PackScheduler` from Labs 05 and 06](https://docs.google.com/a/ncsu.edu/document/d/1k32Wv7umWr8qeO6PGbQP8hCzOeWPpCyp4rnGT0Xkuy4/edit?usp=sharing).  Save the black box test plan file in the `project_docs` folder.

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
  * [t19_student_directory.txt](files/t19_student_directory.txt)
  * [t39_course_catalog.txt](files/t39_course_catalog.txt)


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