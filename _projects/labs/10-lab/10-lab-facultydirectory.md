---
title: CSC 217 Lab 10 - Iterators
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab10]
description: CSC 217 Lab 10 - Implement and Test `FacultyDirectory`
navigation: on
pagegroup: 10-lab
---

# CSC 217 Lab 10 Implement and Test `FacultyDirectory`
{% include iconHeader.html type="implementation,unitTest" %}
`FacultyDirectory` represents a list of `Faculty` in your system.  Use `StudentDirectory` and `StudentDirectoryTest` as models for implementing `FacultyDirectory`.


## Create `FacultyDirectoryTest`
Create `FacultyDirectoryTest` in the `edu.ncsu.csc216.pack_scheduler.directory` package of the `test/` source folder.  Start by creating tests for the `FacultyDirectory` class as defined in the design.   Since `FacultyDirectory` is so similar to `StudentDirectory`,   use `StudentDirectoryTest` as a model for your `FacultyDirectoryTest` class.

We have provided several files that can help you with testing the faculty functionality:

  * [faculty_records.txt](files/faculty_records.txt)
  * [expected_faculty_records.txt](files/expected_faculty_records.txt)
  * [invalid_faculty_records.txt](files/invalid_faculty_records.txt)
  * [expected_full_faculty_records.txt](files/expected_full_faculty_records.txt)


## `FacultyDirectory` State
`FacultyDirectory` has an `LinkedList` of `Faculty` that represent the faculty directory for the university.  

There is also a constant value for the hash algorithm used to hash the passwords when adding a new `Faculty`.  You're using [**SHA-256**](https://en.wikipedia.org/wiki/SHA-2).  By providing the hash algorithm as a constant, you reduce the chance of throwing a `NoSuchAlgorithmException` due to a mistype.


## `FacultyDirectory` Constructor
The `FacultyDirectory` constructor initializes the `facultyDirectory` field by calling the `newFacultyDirectory()` method. 


## `newFacultyDirectory()`
This method supports the functionality for a new faculty directory described in [[CU18]](10-lab-requirements#uc18).  `facultyDirectory` is updated to refer to a new `LinkedList` of `Faculty`.


## `loadFacultyFromFile()`
This method supports the functionality for loading a list of faculty records from a file as described in [[UC19]](10-lab-requirements#uc19). If the call to `FacultyRecordIO.readFacultyRecords()` throws a `FileNotFoundException`, a new `IllegalArgumentException` is thrown.  The provided message may be used in a dialog as described in [[UC19 - Invalid File]](10-lab-requirements#uc19-invalid-file) alternative flow.


## `addFaculty()`
This method supports the functionality for adding a `Faculty` to the list of faculty as described in [[UC21]](10-lab-requirements#uc21). The method also covers most of the Alternative Flows in [[UC21]](10-lab-requirements#uc21).  The first grouping of error messages comes from `IllegalArgumentException`s thrown during construction of `Faculty` or when checking the `password` and `repeatPassword` parameters.  The error message related to "Cannot hash password" should hopefully never happen, but an exception with a error message is provided in case it ever does.

By returning `false`, the method will trigger [[UC21 - Non-uniqu id]](10-lab-requirements#uc21-non-unique-id) in the GUI.


## `removeFaculty()`
This method supports the functionality for removing a `Faculty` from the list of faculty as described in [[UC22]](10-lab-requirements#uc22).


## `getFacultyDirectory()`
This method returns a 2D array, where each row is a `Faculty` and the columns are for the `firstName`, `lastName`, and `id`.  The 2D array is required so that the information may be displayed in the table used in the GUI.


## `saveFacultyDirectory()`
This method saves the `facultyDirectory` to the given file.  If `FacultyRecordIO.writeFacultyRecords()` throws an `IOException`, a new `IllegalArgumentException` is thrown. The provided message may be used in a dialog as describe in [[UC20]](10-lab-requirements#uc20).


## Javadoc your Code
Javadoc `FacultyDirectory`.

Run [CheckStyle](../../gp1/gp1-static-analysis#checkstyle) to ensure that your Javadoc has all elements.


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
Ensure that your Jenkins job is reflecting the results that you expect for the level of completion of your lab assignment.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}