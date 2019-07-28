---
title: Guided Project 1 WolfScheduler - Course and Schedule
tags: [software engineering, software lifecycle, CS2, CSC216, GP1]
description: Independent Task - Finish `CourseRecordIO`
navigation: on
pagegroup: gp1
---
 
# Independent Task: Finish `CourseRecordIO`
Now that we have the skeleton of `CourseRecordIO`, we'll implement it to pass the tests in `CourseRecordIOTest`.  As part of that, we'll discuss how to test file I/O.

{% capture callout_content %}
  * Implement `CourseRecordIO.readCourse()`
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}
 
## Implement `CourseRecordIO.readCourse()`
To finish the `CourseRecordIO` class and pass all of the `CourseRecordIOTest`s, you need to implement `CourseRecordIO.readCourse()`.  The method receives a `String` which is a line from the input file.  You must break the line up into tokens by using the comma character (e.g., ',') as a delimiter.  A *delimiter* is a string that is used to separate or break apart a larger string.  The default delimiter for `Scanner` is white space.  You can change the delimiter using the `Scanner.useDelmiter()` method.

If there is an error when processing the line or when constructing the `Course`, throw an `IllegalArgumentException` to the `CourseRecordIO.readCourseRecords()` method.  That means you may need to catch one type of exception like `NoSuchElementException` and throw a new `IllegalArgumentException`.

Make sure that all your tests are passing before continuing with the Guided Project!

You may run into a `java.lang.AssertionError: Unable to reset files` when executing the `CourseRecordIOTest.setUp()` method.  This method is resetting `course_records.txt` with the starting values needed for the tests.  Other tests in the system may overwrite `course_records.txt`, so the `starter_course_records.txt` file is used to rest the original file.  There are several possibilities that you should investigate if you run into this error:

  * Close all of the files that may be open in Eclipse or in your file system. If the file is being processed by another application, the JVM may not be able to open it.  
  * Close the `Scanner` in all possible paths in `CourseRecordIO`.  If you do not release the `Scanner` on the file, the file may still be considered in use for a time, even if the test stopped execution.  
  * Make sure that all files use the `*.txt` extension.
  * Restart Eclipse.  This will release any file handles that are attached to open files.
  
If you receive a CheckStyle notification about a resource leak on your `Scanner`, make sure that you separate any program statement `Scanner s = new Scanner(nextLine).useDelimiter(",");` into two program statements.  Using the two methods chained together leads to CheckStyle misunderstanding the flow of the methods.

 
## Push to GitHub
We've finished `CourseRecordIO`.   Before moving on to the next portion of the Guided Project, complete the following tasks:

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  Try writing your own commit message for this push!
    
{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}