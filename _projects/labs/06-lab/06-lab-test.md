---
title: CSC216 Lab 06 - Finite State Machines
tags: [software engineering, software lifecycle, CS2, CSC216, Lab06]
description: CSC216 Lab 06 - Testing
navigation: on
pagegroup: 06-lab
---

# CSC216 Lab 06 Testing
{% include iconHeader.html type="unitTest" %}
{% include iconHeader.html type="systemTest" %}
As with any software development project, you must test your code to know if it meets the [requirements](06-lab-requirements) and [design](06-lab-design).  You should have unit tested your new code as you added course validation functionality.  Now you will ensure sufficient coverage and system test `PackScheduler`.


## `PackScheduler` Coverage
Ensure that all non-UI classes have at least 80% statement coverage.  Add any needed tests to cover at least 80% of the statements.

The introduction of the new course name validation functionality shouldn't lead to the regression of any existing tests unless you specifically tested a string that earlier may have been invalid but is now valid.  If so, update the test to reflect the new requirements. 


## `PackSchedulerGUI`
The teaching staff has provided three classes that comprise the GUI for `PackScheduler`.  Create classes `PackSchedulerGUI`, `CourseCatalogPanel`, and `StudentDirectoryPanel` in the `edu.ncsu.csc216.pack_scheduler.ui` package and copy in the provided code.  Note that there are updates to `StudentDirectoryPanel`, so you should use the provided code.

  * [`PackSchedulerGUI` Code](files/PackSchedulerGUI.java)
  * [`CourseCatalogPanel` Code](files/CourseCatalogPanel.java)
  * [`StudentDirectoryPanel` Code](files/StudentDirectoryPanel.java)
  

## System Testing and Debugging
[Download a copy of the black box tests for `PackScheduler`](https://docs.google.com/a/ncsu.edu/document/d/1XdP6H0q956ohbiGgJgeTlBSL6dILRjP4gS0fiW3CURU/edit?usp=sharing).  Save the black box test plan file in the `project_docs` folder.

Do the following:

  * Run the tests on the `PackScheduler` project.  If the test fails, debug your system until it passes.
  * Report the actual results of execution after debugging your system.
  
The following files are needed for testing (some you already have):

  * [student_records.txt](files/student_records.txt)
  * [course_records.txt](files/course_records.txt)
  * [actual_t19_student_directory.txt](files/actual_t19_student_directory.txt)
  * [actual_t39_course_catalog.txt](files/actual_t39_course_catalog.txt)


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

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
