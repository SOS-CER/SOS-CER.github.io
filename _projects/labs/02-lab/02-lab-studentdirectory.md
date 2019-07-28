---
title: CSC216 Lab 02 - Software Engineering Best Practices
tags: [software engineering, software lifecycle, CS2, CSC216, Lab02]
description: CSC216 Lab 02 - Unit Testing `StudentDirectory`
navigation: on
pagegroup: 02-lab
---
# CSC216 Lab 02: Unit Testing `StudentDirectory`
{% include iconHeader.html type="unitTest" %}
You have been provided `StudentDirectory` for Lab 02.  Additionally, you were provided **some** unit tests for `StudentDirectory`, but not enough to meet the 80% statement coverage threshold for `StudentDirectory`. You will write additional unit tests to fully cover `StudentDirectory`.  

`StudentDirectory` represents a list of `Student` records in our system.  The method descriptions below describe what each method should do.  You will write unit/integration tests to ensure that the methods do these things correctly.  If you find any bugs in `StudentDirectory` (it is possible, but hopefully unlikely), please let the teaching staff know.  That way we can share with the rest of the class so everyone moves forward with bug free code!  

There are no descriptions of what you should test here.  By this point you should have enough practice with testing to start thinking of your own tests for each of these methods!


## `StudentDirectory` State
`StudentDirectory` has an `ArrayList` of `Students` that represent the student directory for the university.  

There is also a constant value for the hash algorithm used to hash the passwords when adding a new `Student`.  We're using [**SHA-256**](https://en.wikipedia.org/wiki/SHA-2).  By providing the hash algorithm as a constant, you reduce the chance of throwing a `NoSuchAlgorithmException` due to a mistype.


## `StudentDirectory` Constructor
The `StudentDirectory` constructor initializes the `studentDirectory` field by calling the `newStudentDirectory()` method. 


## `newStudentDirectory()`
This method supports the functionality for a new student directory described in [[UC2, S1]](01-lab-requirements#uc2-s1).  `studentDirectory` is updated to refer to a new `ArrayList` of `Student`s.


## `loadStudentsFromFile()`
This method supports the functionality for loading a list of student records from a file as described in [[UC2, S2]](01-lab-requirements#uc2-s2). If the call to `StudentRecordIO.readStudentRecords()` throws a `FileNotFoundException`, a new `IllegalArgumentException` is thrown.  The provided message may be used in a dialog as describe in [[UC2, E1]](01-lab-requirements#uc2-e1).

{% capture callout_content %}
You will need to use similar strategies for handling hashed passwords that you used when testing `StudentRecordIO`.
{% endcapture %}
{% include callout.html content=callout_content icon="plTool" type="reminder" title="Reminder: Hashed Passwords when Testing" %}


## `addStudent()`
This method supports the functionality for adding a `Student` to the list of students as described in [[UC2, S4]](01-lab-requirements#uc2-s4).  The method also covers Alternative Flows [[UC2, E4-E9 and E11]](01-lab-requirements#uc2-e4).  The first grouping of error messages come from `IllegalArgumentException`s thrown during construction of `Student` or when checking the `password` and `repeatPassword` parameters.  The error message related to "Cannot hash password" should hopefully never happen, but an exception with a error message is provided in case it ever does.

By returning `false`, the method will trigger [[UC2, E3]](01-lab-requirements#uc2-e3) in the GUI.


## `removeStudent()`
This method supports the functionality for removing a `Student` from the list of students as described in [[UC2, S5]](01-lab-requirements#uc2-s5).


## `getStudentDirectory()`
This method returns a 2D array, where each row is a `Student` and the columns are for the `firstName`, `lastName`, and `id`.  The 2D array is required so that the information can be displayed in the table used in the GUI.


## `saveStudentDirectory()`
This method saves the `studentDirectory` to the given file.  If `StudentRecordIO.writeStudentRecords()` throws an `IOException`, a new `IllegalArgumentException` is thrown.  The provided message may be used in a dialog as described in [[UC2, E2]](01-lab-requirements#uc2-e2).  Use the same strategy to cause an `IOException` that you used when testing `StudentRecordIO.writeStudentRecords()` for full coverage.

{% capture callout_content %}
You will need to use similar strategies for handling hashed passwords that you used when testing `StudentRecordIO`.
{% endcapture %}
{% include callout.html content=callout_content icon="plTool" type="reminder" title="Reminder: Hashed Passwords when Testing" %}


## Run Your Tests
Run your tests instrumented for coverage.  Make sure that your tests execute at least 80% of the statements in `StudentDirectory`.  Remember there is extra credit for more coverage!
    

## Javadoc your Code
Make sure that you Javadoc the `StudentDirectoryTest` class and methods. 

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
At this point, your project should build on Jenkins, hopefully with a green ball!  If not, work through Jenkins's feedback to fix any errors with the integration of your code with the provided code.  All tests should be passing before you walk through the GUI.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/#build-summary-page) and use the results to [estimate your grade](../../jenkins/#grade-estimation-example):

  * [Test Results](../../jenkins/#test-results)
  * [Coverage Report](../../jenkins/#coverage-report)
  * [FindBugs Report](../../jenkins/#findbugs-report)
  * [CheckStyle Report](../../jenkins/#checkstyle-report)
  * [PMD Report](../../jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}