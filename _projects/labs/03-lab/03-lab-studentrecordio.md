---
title: CSC 217 Lab 03 - Collections
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab03]
description: CSC 217 Lab 03 - Use `SortedList` in `StudentRecordIO`
navigation: on
pagegroup: 03-lab
---
# CSC 217 Lab 03: Use `SortedList` in `StudentRecordIO`
{% include iconHeader.html type="implementation, unitTest" %}
Now that there is a library for maintaining a list in sorted order, the `SortedList` class should be used instead of `ArrayList`.  Update your `StudentRecordIO` to use `SortedList`.


## Refactor `readStudentRecords()` to use `SortedList`
Refactor the method header for `readStudentRecords()` by selecting the method name, right clicking, and selecting **Refactor > Change Method Signature.**  Change the return type from `ArrayList<Student>` to `SortedList<Student>`.  Click **OK**.

There will be an error about a type mismatch on the return type, but that can be fixed after the refactoring.  Additionally, several other classes will no longer compile after the change.  You'll fix the compilation errors through the rest of this section.  You may need to import `SortedList`.

Once the refactoring is complete, change the local variable `students` to the `SortedList<Student>` type rather than the `ArrayList<Student>` type.  `StudentRecordIO` should compile.


## Refactor `StudentRecordIOTest`
Refactor the compilation errors in `StudentRecordIOTest` by changing any reference to `ArrayList` to a `SortedList` in the tests for `readStudentRecords()`.


## Refactor `writeStudentRecords()` to use `SortedList`
Refactor the method header for `writeStudentRecords()` by selecting the method name, right clicking, and selecting **Refactor > Change Method Signature.**  Select the `ArrayList<Student>` parameter from the list and click **Edit.**  Change the type from `ArrayList<Student>` to `SortedList<Student>`.  Click **OK** and **OK** again.

Once the refactoring is complete, fix any compilation errors in `writeStudentRecords()`.


## Refactor `StudentRecordIOTest`
Refactor the compilation errors in `StudentRecordIOTest` by changing any reference to `ArrayList` to a `SortedList` in the tests for `writeStudentRecords()`.


## Update your Tests
Run your tests.  There is likely at least one failure because of the new sorted order functionality.  Update your tests for the new use case.

Run your tests instrumented for coverage.  Make sure that your tests execute at least 80% of the statements in `StudentRecordIO`.  

If the `testWriteStudentRecordsNoPermissions()` fails locally, it won't record the coverage.  Push to GitHub and run on Jenkins to verify coverage of throwing that exception. 
    

## Javadoc your Code
Make sure that you update the Javadoc for `StudentRecordIO` and `StudentRecordIOTest`. 

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
Make sure that you have a job and it's pulling from GitHub.

Your project will have a red ball.  That is because you will have compiler errors in `StudentDirectory` and you have not yet completed some of the refactorings that the teaching staff tests will expect.  Therefore, the teaching staff tests are unable to compile against your code.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [Coverage Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#coverage-report)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}
