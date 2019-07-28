---
title: CSC216 Lab 04 - Design
tags: [software engineering, software lifecycle, CS2, CSC216, Lab04]
description: CSC216 Lab 04 - Integrating `WolfScheduler` into `PackScheduler`
navigation: on
pagegroup: 04-lab
---
# CSC216 Lab 04: Integrating `WolfScheduler` into `PackScheduler`
{% include iconHeader.html type="implementation" %}
To integrate `WolfScheduler` into `PackScheduler`, you will focus on three packages: 

  * `edu.ncsu.csc216.pack_scheduler.course`: integrate classes from `WolfScheduler`
  * `edu.ncsu.csc216.pack_scheduler.io`: integrate classes from `WolfScheduler`
  * `edu.ncsu.csc216.pack_scheduler.catalog`: create a new class using pieces from `WolfScheduler`

The existing `Student`, `StudentRecordIO`, `StudentDirectory`, and `StudentDirectoryPanel` classes will remain unchanged.


## Clone your GP3 project into your Workspace
Note: On-campus students, since you are working in pairs/threes, you will need to determine which of the projects you want to use as the `WolfScheduler` source.  Start with a discussion about which project should "move on".

Clone your GP3 `WolfScheduler` project into your lab workspace, if it isn't there already.  


## `edu.ncsu.csc216.pack_scheduler.course` Package
Complete the following steps to integrate the course classes from `WolfScheduler` into `PackScheduler`

Copy in the `src/` files:

  #. Create a new package `edu.ncsu.csc216.pack_scheduler.course` in the `src/` folder of `PackScheduler`
  #. Select the `Activity`, `Conflict`, `ConflictException`, and `Course` classes from your Guided Project 3 `WolfScheduler` and copy them into the new `edu.ncsu.csc216.pack_scheduler.course` package in the `src/` folder of `PackScheduler`.
  
Copy in the `test/` files:

  #. Create a new package `edu.ncsu.csc216.pack_scheduler.course` in the `test/` folder of `PackScheduler`
  #. Select the `ActivityTest`, `ConflictExceptionTest`, and `CourseTest` classes from your Guided Project 3 `WolfScheduler` and copy them into the new `edu.ncsu.csc216.pack_scheduler.course` package in the `test/` folder of `PackScheduler`.
  
Update your tests to remove any references to `Event` so that `PackScheduler` compiles.  This may mean that some tests will be deleted, and that's ok if they are no longer needed.  There will likely be several tests in `ConflictExceptionTest` that will need to be deleted due to conflict checks involving `Event`s.

Run your tests and ensure there is no regression in functionality.

Implement the `Comparable<Course>` interface in `Course`.  Write new tests in `CourseTest` to ensure that the `compareTo()` method works correctly by looking at the `Course` `name` and then `section` during the comparison.


## `edu.ncsu.csc216.pack_scheduler.io` Package
With `PackScheduler` there isn't a need for `Event`s (they could be added later, so `Activity` will remain as a super class), therefore, `CourseRecordIO` can take over the responsibility of both reading in course records and writing course records to a file.

You may either 1) copy in `CourseRecordIO` from your **Guided Project 1** submission or 2) copy in `CourseRecordIO` from your **Guided Project 3** submission and integrate/refactor the `ActivityRecordIO.writeActivityRecords()` method in `CourseRecordIO`.  Either way, `edu.ncsu.csc216.pack_scheduler.io` will contain `CourseRecordIO` and `StudentRecordIO` in the `src/` folder of `PackScheduler` when the integration is complete.

Follow a similar procedure to copy/integrate/refactor `CourseRecordIOTest` into the `edu.ncsu.csc216.pack_scheduler.io` package in the `test/` folder of `PackScheduler`.

You will need to update imports that have `*.wolf_scheduler.*` to use `*.pack_scheduler.*` instead.

Additionally, copy all of the `test-files/` from **Guided Project 3** into `PackScheduler` needed for your tests to pass.

Run your tests and ensure there is no regression in functionality.  There is no additional functionality in the `edu.ncsu.csc216.pack_scheduler.io` package.


## `edu.ncsu.csc216.pack_scheduler.catalog` Package
The `WolfScheduler` class in the `WolfScheduler` project cannot be directly used as is in the `PackScheduler` project.  The `WolfScheduler` class has two responsibilities: to hold the catalog and to schedule courses.  Only the catalog functionality is currently needed in the `PackScheduler` project.  You'll create the `CourseCatalog` class and use the `WolfScheduler` project `WolfScheduler` class and the `StudentDirectory` class to help you implement `CourseCatalog`.

Create a new package `edu.ncsu.csc216.pack_scheduler.catalog` in the `src/` and `test/` folders of `PackScheduler`.

Create the `CourseCatalog` class to match the provided design and implement the methods by pulling code from `WolfScheduler` or using `StudentDirectory` for reference.

Additionally, create `CourseCatalogTest` in the `test/` folder.  Reuse tests from `WolfSchedulerTest` or use `StudentDirectoryTest` for reference to write tests to drive your development.

For `CourseCatalog` you will use the `SortedList` collection rather than `ArrayList`.  

  * `-catalog: SortedList<Course>`: a `CourseCatalog` has a `SortedList` of `Course`s that make up the catalog
  * `+CourseCatalog()`: constructs an empty `catalog`
  * `+newCourseCatalog(): void`: constructs an empty `catalog`
  * `+loadCoursesFromFile(fileName:String): void`: loads course records into the `catalog`.  Any `FileNotFoundException`s are caught and an `IllegalArgumentException` is thrown to the client.
  * `+addCourseToCatalog(name:String, title:String, section:String, credits:int, instructorId:String, meetingDays:String, startTime:int, endTime:int): boolean`: adds a `Course` with the following fields to the `catalog` and returns true if the `Course` is added and false if the `Course` already exists in the catalog.  If there is an error constructing the `Course`, the `IllegalArgumentException` is allowed to propagate to the client.
  * `+removeCourseFromCatalog(name:String, section:String): boolean`: returns true if the `Course` is removed from the `catalog` and false if the `Course` is not in the `catalog`.
  * `+getCourseFromCatalog(name:String, section:String): Course`: returns the `Course` from the `catalog` with the given `name` and `section`.  Returns null if the `Course` isn't in the `catalog`.
  * `+getCourseCatalog(): String[][]`: returns the  `name`, `section`, `title`, and meeting information for `Course`s in the `catalog`.
  * `+saveCourseCatalog(fileName:String): void`: saves the `catalog` course records to the given file.  Any `IOException`s are caught and an `IllegalArgumentException` is thrown to the client.
  

## Run Unit Tests
Run all of your unit tests and ensure that they pass!


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  
  
Since we can't automate black box tests, you won't need to check Jenkins.  But you should make sure that your Black Box Test Plan was submitted!


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../../git-tutorial/git-staging)
  * [Committing Files](../../git-tutorial/git-commit)
  * [Pushing Files](../../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}
