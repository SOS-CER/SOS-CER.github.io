---
title: CSC216 Lab 01 - Installation and Project Creation
tags: [software engineering, software lifecycle, CS2, CSC216, Lab01]
description: CSC216 Lab 01 - Implement `StudentRecordIO`
navigation: on
pagegroup: 01-lab
---

# CSC216 Lab 01: Implement `StudentRecordIO`
{% include iconHeader.html type="implementation" %}
`StudentRecordIO` provides `static` methods that support reading in student records from a file and writing student records to a file.  A student record is defined in [[UC1]](01-lab-requirements#uc1).  The read functionality supports [[UC2, S2]](01-lab-requirements#uc2-s2) and the write functionality supports [[UC2, S3]](01-lab-requirements#uc2-s3).

The two required public methods for `StudentRecordIO` are already provided as skeletons.  If you provide any additional methods, like the `private` one (`private Student processStudent(String line)`) suggested in the [design](01-lab-design), they should be `private`.

Since the methods of `StudentRecordIO` are `static`, `StudentRecordIO` doesn't require a defined constructor.  There is a constructor listed in the design, but that is the default constructor that all classes have.  You do NOT need to define a constructor for `StudentRecordIO`.  There is no state to initialize.


## `readStudentRecords(String)` Implementation
`readStudentRecords(String fileName)` will read in `Student` records from the file represented by the given `fileName`.  The records are returned in an `ArrayList<Student>` in a very similar manner to [`CourseRecordIO.readCourseRecords()` from GP1](../../gp1/gp1-libraries#java-collections-framework).  The method will throw a `FileNotFoundException` if the file does not exist on the file system. 


{% capture callout_content %}
Student passwords are stored in a hashed string.  The hashed string consists of characters with an underlying integer value between 0 and 255.  The [values between 0 and 127](http://www.asciitable.com/) are a determined set of characters from the standard alphabet and other control characters.  The values between 128 and 255 are interpreted by different programs using different extended interpretations.  The above link has some examples.

Because we are working with character strings, using a `File` parameter to the `Scanner` object is not sufficient.  The hashes are really bytes of data not a string you would read.  So instead of using a `File` parameter, you should [instead use a `FileInputStream`](https://docs.oracle.com/javase/8/docs/api/java/io/FileInputStream.html).  `FileInputStream` lets you read the input file as a series of bytes rather than a series of characters.  After the `Scanner` is created using the `FileInputStream`, you can work with the `Scanner` like you are used to.
{% endcapture %}
{% include callout.html content=callout_content icon="plTool" type="conceptualKnowledge" title="Conceptual Knowledge: Reading Hashed Strings" %}


## `writeStudentRecords(String)` Implementation
`writeStudentRecords(String fileName, ArrayList<Student> studentDirectory)` will write the `Student`s in `studentDirectory` to the file represented by the `fileName` one `Student` record at a time.  The records are written in a very similar manner to [`CourseRecordIO.writeCourseRecords()` from GP1](../../gp1/gp1-libraries#file-output).  The method will throw an `IOException` if unable to write to the file.


## Javadoc your Code
Make sure that you Javadoc the `StudentRecordIO` class and methods. 

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
At this point your project will build on Jenkins, maybe even with a green ball!  If you have test failures, use the feedback from Jenkins to help you resolve the issues. Make sure that all `TS_StudentRecordIOTest` methods are passing before moving on to `StudentDirectory`.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/#build-summary-page) and use the results to [estimate your grade](../../jenkins/#grade-estimation-example):

  * [Test Results](../../jenkins/#test-results)
  * [FindBugs Report](../../jenkins/#findbugs-report)
  * [CheckStyle Report](../../jenkins/#checkstyle-report)
  * [PMD Report](../../jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}