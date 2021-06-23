---
title: CSC 217 Lab 10 - Iterators
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab10]
description: CSC 217 Lab 10 - Implement and Test `FacultyRecordIO`
navigation: on
pagegroup: 10-lab
---

# CSC 217 Lab 10 Implement and Test `FacultyRecordIO`
{% include iconHeader.html type="implementation,unitTest" %}
Like `StudentRecordIO`, `FacultyRecordIO` provides `static` methods that support reading in faculty records from a file and writing faculty records to a file.  A faculty record is defined in the [[Faculty Records data format]](10-lab-requirements#faculty-records).  The read functionality supports [[UC19]](10-lab-requirements#uc19) and the write functionality supports [[UC20]](10-lab-requirements#uc20).

The two required public methods for `FacultyRecordIO` are similar to `StudentRecordIO`.  The only difference is that the methods return a `LinkedList` (the specialized class you just created) rather than `ArrayList`.

Since the methods of `FacultyRecordIO` are `static`, `FacultyRecordIO` doesn't require a defined constructor.  There is a constructor listed in the design, but that is the default constructor that all classes without explicitly defined constructors have.  Do NOT define a constructor for `FacultyRecordIO`.  There is no state to initialize.


## Create `FacultyRecordIOTest`
Create `FacultyRecordIOTest` in the `edu.ncsu.csc216.pack_scheduler.io` package of the `test/` source folder.  Start by creating tests for the `FacultyRecordIO` class as described in the design.   Since `FacultyRecordIO` is so similar to `StudentRecordIO`,   use `StudentRecordIOTest` as a model for your `FacultyRecordIOTest` class.

We have provided several files that can help you with testing the faculty functionality:

  * [faculty_records.txt](files/faculty_records.txt)
  * [expected_faculty_records.txt](files/expected_faculty_records.txt)
  * [invalid_faculty_records.txt](files/invalid_faculty_records.txt)
  * [expected_full_faculty_records.txt](files/expected_full_faculty_records.txt)


## `readFacultyRecords(String)` Implementation
`readFacultyRecords(String fileName)` will read in `Faculty` records from the file represented by the given `fileName`.  The records are returned in an `LinkedList<Faculty>` in a manner very similar to [`StudentRecordIO.readStudentRecords()` from Lab 01](../01-lab/01-lab-studentrecordio).  The method will throw a `FileNotFoundException` if the file does not exist on the file system. 

{% capture callout_content %}
Faculty passwords are stored in a hashed string.  The hashed string consists of characters with an underlying integer value between 0 and 255.  The [values between 0 and 127](http://www.asciitable.com/) are a determined set of characters from the standard alphabet and other control characters.  The values between 128 and 255 are interpreted by different programs using different extended interpretations.  The above link has some examples.

Because you are working with character strings, using a `File` parameter to the `Scanner` object is not sufficient.  The hashes are really bytes of data and not a string you would read.  So instead of using a `File` parameter, you should [instead use a `FileInputStream`](https://docs.oracle.com/javase/8/docs/api/java/io/FileInputStream.html).  `FileInputStream` lets you read the input file as a series of bytes rather than a series of characters.  After the `Scanner` is created using the `FileInputStream`, you can work with the `Scanner` the same way you are used to.
{% endcapture %}
{% include callout.html content=callout_content icon="plTool" type="conceptualKnowledge" title="Conceptual Knowledge: Reading Hashed Strings" %}


## `writeFacultyRecords(String, LinkedList<Faculty)` Implementation
`writeFacultyRecords(String fileName, LinkedList<Faculty> facultyDirectory)` will write the `Faculty` in `facultyDirectory` to the file represented by the `fileName` one `Faculty` record at a time.  The records are written in a very similar manner to [`StudentRecordIO.writeStudentRecords()` from Lab 01](../01-lab/01-lab-studentrecordio).  The method will throw an `IOException` if unable to write to the file.


## Javadoc your Code
Javadoc the `FacultyRecordIO` class and its methods. 

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