---
title: Guided Project 1 WolfScheduler - Course and Schedule
tags: [software engineering, software lifecycle, CS2, CSC216, GP1]
description: Guided Task - Testing with Files
navigation: on
pagegroup: gp1
---

# Guided Task: Testing with Files
{% include iconHeader.html type="unitTest" %}
Now that you have the skeleton of `CourseRecordIO`, you'll implement it to pass the tests in `CourseRecordIOTest`.  As part of that, you'll discover how to test file I/O.

{% capture callout_content %}
  * Set up WolfScheduler for testing file I/O
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}
  
{% capture callout_content %}
### Testing File Input 
When testing file input functionality, you need files that test the valid input and files that test invalid input.  The files may be broken down so that one distinct record is in each file or so that several valid/invalid records are in the same file.  Distinct records are a little easier to debug since you can narrow down to a specific failing file, but finding a failing line in a larger file isn't that much more difficult.

If you know what the file input is, you can check that the input generated the correct objects with the correct state for each object.  That information can be part of your test case.

### Testing File Output 
When testing file output, you will be generating a file.  You could read the generated file back in and compare with a `String` of expected results.  Another option is to create a file that contains the expected results and compare that the two files are the same.  `CourseRecordIOTest` does the latter and reads in both files and compares them line by line.

### Changing Expected Files
If there is a possibility that a test or incorrect code under test may manipulate a file that is used for input in another test, you should make sure that you "reset" the test file before using in another test.  To do that, you can maintain a file that contains the starting information and copy it into your test file before each test.  `CourseRecordIO.setUp()` is an example of copying a starter file to an input file.

{% endcapture %}
{% include callout.html content=callout_content icon="ttTool" type="bestPractices" title="Best Practice: Testing File I/O" %}

 
## Setting up for File I/O Testing
You should keep your Eclipse projects organized.  Folders keep random files from cluttering the top level of the project.  When working with file I/O functionality, you need a place to store your test files. 

Create an Eclipse folder to store your test files by right clicking on the `WolfScheduler` project and selecting **New > Folder**.  Name the folder `test-files`.

{% include image.html file="images/TestFilesFolder.PNG" caption="Figure: Test Files Folder" %} 
 
## Creating Test Files
Right click on the link to download each of the provided files and copy the downloaded file into your Eclipse project `test-files` directory.  **DO NOT** copy the text from the file into an empty text file.  That will cause issues with encoding.

  * [course_records.txt](files/course_records.txt)
  * [invalid_course_records.txt](files/invalid_course_records.txt)
  * [starter_course_records.txt](files/starter_course_records.txt)
  * [expected_course_records.txt](files/expected_course_records.txt)
  * [expected_empty_export.txt](files/expected_empty_export.txt)
  * [expected_schedule_export.txt](files/expected_schedule_export.txt)
  
 
## Push to GitHub
You've added test files.  Before moving on to the next portion of the Guided Project, complete the following tasks:

  * Add new test files to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  For example, "Added test files".

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}