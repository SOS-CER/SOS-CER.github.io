---
title: Guided Project 1 WolfScheduler - Course and Schedule
tags: [software engineering, software lifecycle, CS2, CSC216, GP1]
description: Independent Task - Implement `WolfScheduler`
navigation: on
pagegroup: gp1
---
 
# Independent Task: Implement `WolfScheduler`
The last model class that you need to implement is `WolfScheduler`.  `WolfScheduler` reads in and stores as a list all of the `Course` records stored in a file ([UC1](../wolf-scheduler/ws-requirements#uc1)).  Additionally, `WolfScheduler` creates a schedule for the current user (a student) and provides functionality for naming the schedule ([[UC2, S1](../wolf-scheduler/ws-requirements#uc2-s1)]), adding a `Course` to the schedule ([[UC2, S2](../wolf-scheduler/ws-requirements#uc2-s2)]), removing a `Course` from the schedule ([[UC2, S3](../wolf-scheduler/ws-requirements#uc2-s3)]), resetting the schedule ([[UC2, S6](../wolf-scheduler/ws-requirements#uc2-s6)]).  You will start the work needed to pass the appropriate error messages to the graphical user interface (GUI).  However, at this time you will NOT be implementing the conflict functionality.

Note that there are several steps that you will need to complete to fully implement `WolfScheduler`.  The tasks in this section are a review of prerequisite materials or of topics covered earlier in the Guided Project.  Where appropriate, we will provide links to earlier sections that will help as you complete the tasks in this portion of the Guided Project!

{% capture callout_content %}
  * Implement `WolfScheduler`
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}
 
## Create `edu.ncsu.csc216.wolf_scheduler.scheduler` Package
Create a new package called `edu.ncsu.csc216.wolf_scheduler.scheduler` in the `test` folder of the `WolfScheduler` project.

{% capture callout_content %}
If you need help creating the `edu.ncsu.csc216.wolf_scheduler.scheduler` package, see [Guided Task: Your First Eclipse Project - Create a Package](gp1-eclipse-intro#create-a-package).
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Eclipse Java Package Creation" %}

 
## Create `WolfSchedulerTest` Class
Create a new Java class called `WolfSchedulerTest` in the `edu.ncsu.csc216.wolf_scheduler.scheduler` package of the `test` source directory of the `WolfScheduler` project.

{% capture callout_content %}
If you need help creating the `WolfSchedulerTest` Java Class, see [Guided Task: Your First Eclipse Project - Create a Class](gp1-eclipse-intro#create-a-class).
{% endcapture %}
{% include callout.html content=callout_content icon="reminder" type="reminder" title="Reminder: Eclipse Java Class Creation" %}

[Copy the code from `WolfSchedulerTest.java](files/WolfSchedulerTest.java) into your Eclipse file.

 
## Create `WolfScheduler` Class
Using the Quick Fix tool, create a new Java class called `WolfScheduler` in the `edu.ncsu.csc216.wolf_scheduler.scheduler` package of the `src` source directory of the `WolfScheduler` project.

{% capture callout_content %}
If you need help creating the `WolfScheduler` Java Class using Quick Fix, see [Guided Task: Eclipse Quick Fix Tool - Quick Fix](gp1-quick-fix#quick-fix).
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Quick Fix for Class Creation" %}

 
## Create `WolfScheduler` Methods
Using the Quick Fix tool, create `WolfScheduler`'s public methods using Quick Fix in `WolfSchedulerTest`.  You can adjust the parameter names as you work on implementing each method in later steps.  You may also need to update the return type if the generated return type is `Object`. 

{% capture callout_content %}
If you need help creating `WolfScheduler` methods using Quick Fix, see [Guided Task: Eclipse Quick Fix Tool - Create `CourseRecordIO` Methods](gp1-quick-fix#create-courserecordio-methods).
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Quick Fix for Method Creation" %}

 
## Create `WolfScheduler` State
The `WolfScheduler` class has three pieces of state: 

  * a course catalog (an `ArrayList` of `Course`s)
  * a schedule (an `ArrayList` of `Course`s)
  * a schedule title (a `String`)

Create the three fields for `WolfScheduler`.

 
## Implement `WolfScheduler()`
The `WolfScheduler` constructor has a parameter, which is the filename for the course records.  The constructor should complete the following tasks:

  * construct the course catalog `ArrayList`
  * construct the schedule `ArrayList`
  * set the title to the default "My Schedule" as described in the [requirements](../wolf-scheduler/ws-requirements)
  * try to add the `Course` objects from the input file to the catalog.  An `IllegalArgumentException` should be thrown with the message of "Cannot find file." if there's an error.

{% capture callout_content %}
All `Exception` classes have a constructor with a `String` parameter for a message.  That message is passed with the `Exception` and may be retrieved through a call to `getMessage()`.  By providing error messages as part of an `Exception`, the error functionality is tied to the model.  Then any front end classes will use the same error message!
{% endcapture %}
{% include callout.html content=callout_content icon="plTool" type="bestPractices" title="Best Practice: Exception Messages" %}

 
## Implement `getCourseFromCatalog()`
`getCourseFromCatalog()` has two parameters: a course `name` and `section`.  Since a `Course` in the catalog is distinct by `name` and `section`, we can use those two items to find a `Course`.  If the `Course` with the given `name` and `section` does not exist in the catalog, return `null`.

{% capture callout_content %}
See [Guided Project 1: Working with the Java Libraries](gp1-libraries#java-collections-framework) for information on working with `ArrayList`.
{% endcapture %}
{% include callout.html content=callout_content icon="plTool" type="reminder" title="Reminder: Using `ArrayList`s" %}

 
## Implement `addCourse()`
`addCourse()` returns true if the given `Course` (represented by the `name` and `section`) can be added to the student's schedule and IS actually added to the student's schedule.  

A `Course` with the same `name` cannot be the same schedule, which means a student couldn't be enrolled in both Section 001 and 002 of CSC216 at the same time.  If a `Course` with the same name as already in the schedule, an `IllegalArgumentException` with the error message of "You are already enrolled in <course name>".

Also, if a `Course` is not in the catalog, it cannot be added to the schedule and the method returns false.

 
## Implement `removeCourse()`
`removeCourse()` returns true if the given `Course` (represented by the `name` and `section`) can be removed from the student's schedule.  The method returns false if the `Course` isn't in the schedule.

 
## Implement `resetSchedule()`
`resetSchedule()` creates a empty `ArrayList` and has the schedule field work with the new `ArrayList`.

 
## Implement `getCourseCatalog()`
`getCourseCatalog()` returns a 2D `String` array of the catalog.  There is a row for each `Course` and three columns for `name`, `section`, and `title`.  If there are no `Courses` in the catalog, an empty `String` array is returned.

 
## Implement `getScheduledCourses()`
`getScheduledCourses()` returns a 2D `String` array of the schedule.  There is a row for each `Course` and three columns for `name`, `section`, and `title`.  If there are no `Courses` in the schedule, an empty `String` array is returned.

 
## Implement `getFullScheduledCourses()`
`getFullScheduledCourses()` returns a 2D `String` array of the schedule with all information.  There is a row for each `Course` and six columns for `name`, `section`, `title`, `credits`, `instructorId`, and the `meetingDays` string.  If there are no `Courses` in the schedule, an empty `String` array is returned.

 
## Implement `getTitle()` and `setTitle()`
`getTitle()` returns the schedule title.   `setTitle()` throws an `IllegalArgumentException` if the title is `null` with an error message of "Title cannot be null."

 
## Implement `exportSchedule()`
`exportSchedule()` receives a `String` parameter that is the filename to save the students schedule.  You will use the `CourseRecordIO.writeCourseRecords()` to export the file.  If `CourseRecordIO.writeCourseRecords()` throws an `IOException`, catch it and throw a new `IllegalArgumentException` with the message of "The file cannot be saved.".
  
 
## Push to GitHub
Before moving on to the next portion of the Guided Project, complete the following tasks:

  * Ensure all classes and methods are fully commented.
  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  Try writing your own commit message for this push!

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}