---
title: CSC216 Lab 10 - Iterators
tags: [software engineering, software lifecycle, CS2, CSC216, Lab10]
description: CSC216 Lab 10 - Implement and Test `FacultyDirectory`
navigation: on
pagegroup: 10-lab
---

# CSC216 Lab 10 Implement and Test `FacultyDirectory`
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
This method supports the functionality for a new faculty directory described in [[UC8, S1]](10-lab-requirements#uc8-s1).  `facultyDirectory` is updated to refer to a new `LinkedList` of `Faculty`.


## `loadFacultyFromFile()`
This method supports the functionality for loading a list of faculty records from a file as described in [[UC8, S2]](10-lab-requirements#uc8-s2). If the call to `FacultyRecordIO.readFacultyRecords()` throws a `FileNotFoundException`, a new `IllegalArgumentException` is thrown.  The provided message may be used in a dialog as described in [[UC8, E1]](10-lab-requirements#uc8-e1).


## `addFaculty()`
This method supports the functionality for adding a `Faculty` to the list of faculty as described in [[UC8, S4]](10-lab-requirements#uc8-s4). The method also covers Alternative Flows [[UC8, E4-E9 and E11]](10-lab-requirements#uc8-e4).  The first grouping of error messages comes from `IllegalArgumentException`s thrown during construction of `Faculty` or when checking the `password` and `repeatPassword` parameters.  The error message related to "Cannot hash password" should hopefully never happen, but an exception with a error message is provided in case it ever does.

By returning `false`, the method will trigger [[UC8, E3]](10-lab-requirements#uc8-e3) in the GUI.


## `removeFaculty()`
This method supports the functionality for removing a `Faculty` from the list of faculty as described in [[UC8, S5]](10-lab-requirements#uc8-s5).


## `getFacultyDirectory()`
This method returns a 2D array, where each row is a `Faculty` and the columns are for the `firstName`, `lastName`, and `id`.  The 2D array is required so that the information may be displayed in the table used in the GUI.


## `saveFacultyDirectory()`
This method saves the `facultyDirectory` to the given file.  If `FacultyRecordIO.writeFacultyRecords()` throws an `IOException`, a new `IllegalArgumentException` is thrown. The provided message may be used in a dialog as describe in [[UC8, E2]](10-lab-requirements#uc8-e2).


## Javadoc your Code
Javadoc `FacultyDirectory`.

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
Ensure that your Jenkins job is reflecting the results that you expect for the level of completion of your lab assignment.

{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/#build-summary-page) and use the results to [estimate your grade](../../jenkins/#grade-estimation-example):

  * [Test Results](../../jenkins/#test-results)
  * [FindBugs Report](../../jenkins/#findbugs-report)
  * [CheckStyle Report](../../jenkins/#checkstyle-report)
  * [PMD Report](../../jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}