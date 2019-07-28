---
title: CSC216 Lab 01 - Installation and Project Creation
tags: [software engineering, software lifecycle, CS2, CSC216, Lab01]
description: CSC216 Lab 01 - `StudentDirectory` Overview
navigation: on
pagegroup: 01-lab
---

# CSC216 Lab 01: `StudentDirectory` Overview
{% include iconHeader.html type="implementation" %}
You have been provided `StudentDirectory` for Lab 01.  However, when provided code, you should always inspect it to understand the functionality, learn new things about programming, and maybe find bugs (hopefully not, but bugs are possible!).

`StudentDirectory` represents a list of `Student` records in our system.


## `StudentDirectory` State
`StudentDirectory` has an `ArrayList` of `Students` that represent the student directory for the university.  

There is also a constant value for the hash algorithm used to hash the passwords when adding a new `Student`.  We're using [**SHA-256**](https://en.wikipedia.org/wiki/SHA-2).  By providing the hash algorithm as a constant, we reduce the chance of throwing a `NoSuchAlgorithmException` due to a mistype.


## `StudentDirectory` Constructor
The `StudentDirectory` constructor initializes the `studentDirectory` field by calling the `newStudentDirectory()` method. 


## `newStudentDirectory()`
This method supports the functionality for a new student directory described in [[UC2, S1]](01-lab-requirements#uc2-s1).  `studentDirectory` is updated to refer to a new `ArrayList` of `Student`s.


## `loadStudentsFromFile()`
This method supports the functionality for loading a list of student records from a file as described in [[UC2, S2]](01-lab-requirements#uc2-s2). If the call to `StudentRecordIO.readStudentRecords()` throws a `FileNotFoundException` a new `IllegalArgumentException` is thrown.  The provided message may be used in a dialog as describe in [[UC2, E1]](01-lab-requirements#uc2-e1).


## `addStudent()`
This method supports the functionality for adding a `Student` to the list of students as described in [[UC2, S4]](01-lab-requirements#uc2-s4).  The method also covers Alternative Flows [[UC2, E4-E9 and E11]](01-lab-requirements#uc2-e4).  The first grouping of error messages come from `IllegalArgumentException`s thrown during construction of `Student` or when checking the `password` and `repeatPassword` parameters.  The error message related to "Cannot hash password" should hopefully never happen, but an exception with a error message is provided in case it ever does.

By returning `false` the method will trigger [[UC2, E3]](01-lab-requirements#uc2-e3) in the GUI.


## `removeStudent()`
This method supports the functionality for removing a `Student` from the list of students as described in [[UC2, S5]](01-lab-requirements#uc2-s5).


## `getStudentDirectory()`
This method returns a 2D array, where each row is a `Student` and the columns are for the `firstName`, `lastName`, and `id`.  The 2D array is required so that the information may be displayed in the table used in the GUI.


## `saveStudentDirectory()`
This method saves the `studentDirectory` to the given file.  If `StudentRecordIO.writeStudentRecords()` throws an `IOException` a new `IllegalArgumentException` is thrown.  The provided message may be used in a dialog as describe in [[UC2, E2]](01-lab-requirements#uc2-e2).


## Javadoc your Code
`StudentDirectory` is already fully Javadoced, but if you would like to clarify the documentation to help your understanding of the code, do so.

Run [CheckStyle](../../gp1/gp1-static-analysis#checkstyle) to ensure that your Javadoc has all elements.


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
At this point your project should build on Jenkins, hopefully with a green ball!  If not, work through Jenkins's feedback to fix any errors with the integration of your code with the provided code.  All tests should be passing before you walk through the GUI.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/#build-summary-page) and use the results to [estimate your grade](../../jenkins/#grade-estimation-example):

  * [Test Results](../../jenkins/#test-results)
  * [FindBugs Report](../../jenkins/#findbugs-report)
  * [CheckStyle Report](../../jenkins/#checkstyle-report)
  * [PMD Report](../../jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}

