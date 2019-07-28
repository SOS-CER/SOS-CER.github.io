---
title: Guided Project 1 WolfScheduler - Course and Schedule
tags: [software engineering, software lifecycle, CS2, CSC216, GP1]
description: Guided Task - Run Black Box Tests
navigation: on
pagegroup: gp1
---
 
# Guided Task: Run Black Box Tests
{% include iconHeader.html type="systemTest" %}
Now that you're completed the model classes with passing unit tests and added the GUI (view/controller) to the `WolfScheduler` program, you can run your [system level black box tests.](../se-overview/test#system-test)  These tests ensure that the entire system is working end to end.

 
## Running `WolfScheduler`
The `main()` method for `WolfScheduler` is in the GUI class.  To run `WolfScheduler`, right click on `WolfSchedulerGUI` and select **Run As > Java Application**.  The program will start and a `FileChooser` dialog box titled "Load Course Catalog" will open.  Select `test-files/course-records.txt` and click **Select**.

{% capture callout_content %}
If you need additional help with running `WolfScheduler` in Eclipse, see [Guided Task: Your First Eclipse Project - Running a Java Program](gp1-eclipse-intro#running-a-java-program).
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Running Programs in Eclipse" %}

{% include image.html file="images/LoadCourseCatalogDialog.PNG" caption="Figure: Load Course Catalog" %} 

The main GUI will load.  There are four sections:

  * Course Catalog: The catalog contains 8 classes in the same order as the file. (Note: the file has 9 lines, one line is invalid.)  The name, section, and title for each are displayed.
  * Actions: The actions section has a set of buttons and the Schedule Title text field.  
  * My Schedule: Lists the courses that have been added to the schedule.
  * Course Details: Displays the details of any course selected in the Course Catalog table.
  
{% include image.html file="images/WolfSchedulerGUI.PNG" caption="Figure: WolfSchedulerGUI"  %} 

 
## Running Black Box Tests
The teaching staff have created 12 black box tests for your to run.  Each test should be independent, but some may have preconditions that rely on earlier tests.  For example, the test to add a course to the schedule relies on the test to load a valid course catalog.  To save a little time, the tests are ordered so that you can go through them all without closing the GUI and starting over for each test.  However, if you run into issues, you should close the GUI and start over on the next test (which is what the teaching staff will do during grading).

The [Black Box Test Plan is stored on Google Drive](https://drive.google.com/open?id=1j2JDgzZXgbv8t18s-iN70QjYeyq12EO0ZGS_k8ta9fo).  As part of running your tests, you must report the actual results of execution.  Download the document as a Word document by select **File > Download > Microsoft Word** in Google Drive.  Create a new folder in your `WolfScheduler` project called `project_docs` by right clicking on `WolfScheduler` and selecting **New > Folder**.   Save your black box test plan as a Word document (`*.doc` or `*.docx`) in the `project_docs` folder.  As you run each test, report the results of execution in the black box test plan in the actual results column.  DO NOT record, "Passed" or "Failed".  Instead, describe the results, similar to the provided Expected Results.

Make sure all your black box tests pass!  However, if you run out of time, report the actual results of execution - EVEN IF THEY ARE FAILING! You'll earn some points on the system test portion of the [grading rubric](../wolf-scheduler/ws-rubric) for reporting actual, failing results.

 
## Push to GitHub
Before moving on to the next portion of the Guided Project, complete the following tasks:

  * Ensure all classes and methods are fully commented, your tests are passing, and you've filled out your black box test plan.
  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  Try writing your own commit message for this push!

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}