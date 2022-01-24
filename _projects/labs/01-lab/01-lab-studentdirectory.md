---
title: CSC216 Lab 01 - Installation and Project Creation
tags: [software engineering, software lifecycle, CS2, CSC216, Lab01]
description: CSC216 Lab 01 - `StudentDirectory` Overview
navigation: on
pagegroup: 01-lab
task: 6
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
This method supports the functionality for a new student directory described in [[Use Case 2: Create Student Directory]](01-lab-requirements#uc2).  `studentDirectory` is updated to refer to a new `ArrayList` of `Student`s.


## `loadStudentsFromFile()`
This method supports the functionality for loading a list of student records from a file as described in [[Use Case 3: Load Student Directory]](01-lab-requirements#uc3). If the call to `StudentRecordIO.readStudentRecords()` throws a `FileNotFoundException` a new `IllegalArgumentException` is thrown.  The provided message may be used in a dialog as described in [[Invalid File]](01-lab-requirements#uc3-invalid-file).

## `saveStudentDirectory()`
This method saves the `studentDirectory` to the given file described in [[Use Case 4: Save Student Directory]](01-lab-requirements#uc4).  If `StudentRecordIO.writeStudentRecords()` throws an `IOException` a new `IllegalArgumentException` is thrown.  The provided message may be used in a dialog as described in [[Error Saving]](01-lab-requirements#uc5-error-saving).


## `addStudent()`
This method supports the functionality for adding a `Student` to the list of students as described in [[Use Case 5: Add Student to Student Directory]](01-lab-requirements#uc5).  The method also covers Alternative Flows for Use Case 5.  

The first few lines in the method ensure that there are values for the `password` and `repeatPassword` parameters.  If there are values, then these values are hashed.  Passwords should never be stored in plain text!  That's a security vulnerability (if anyone got ahold of your student file with plain text passwords, they could register you in really boring classes at really bad times!)  We use the private helper method `hashString()` to hash the provided passwords. We use a hashing algorithm, in this case SHA-256, to transform the plain text to a hashed output.  We then encode the output using a 64-bit encoder so that the binary data of the hashed password is represented in an ASCII format.  This is important to minimize issues with the build process.  Do NOT change the `hashString()` method!

After hashing the passwords, checks are done to ensure that the student can be successfully added to the `StudentDirectory`.

By returning `false` the method will trigger [[Non-unique ID]](01-lab-requirements#uc5-non-unique-id) in the GUI.


## `removeStudent()`
This method supports the functionality for removing a `Student` from the list of students as described in [[Use Case 6: Remove Student from Student Directory]](01-lab-requirements#uc6).


## `getStudentDirectory()`
This method returns a 2D array, where each row is a `Student` and the columns are for the `firstName`, `lastName`, and `id`.  The 2D array is required so that the information may be displayed in the table used in the GUI.





## Javadoc your Code
`StudentDirectory` is already fully Javadoced, but if you would like to clarify the documentation to help your understanding of the code, do so.

Run [CheckStyle](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-static-analysis#checkstyle) to ensure that your Javadoc has all elements.

{% capture reminder-content %} 
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %} {% include mention.html content=reminder-content type="reminder" title="Reference: Staging and Pushing to GitHub"%}
## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  


{% capture callout_content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include mention.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}
## Check Jenkins
At this point your project should build on Jenkins, hopefully with a green ball!  If not, work through Jenkins's feedback to fix any errors with the integration of your code with the provided code.  All tests should be passing before you walk through the GUI.




