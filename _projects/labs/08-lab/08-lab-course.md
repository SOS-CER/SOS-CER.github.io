---
title: CSC216 Lab 08 - LinkedAbstractList
tags: [software engineering, software lifecycle, CS2, CSC216, Lab08]
description: CSC216 Lab 08 - Integrate into `Course` and Related Classes
navigation: on
pagegroup: 08-lab
---
# CSC216 Lab 08 Integrate into `Course` and Related Classes
{% include iconHeader.html type="implementation,unitTest" %}
Now that the `CourseRoll` is complete, the `Course` class should use it keep track of a `Course`'s roll.  This will require the use of a new parameter when constructing `Course`: `enrollmentCap`.  Additionally, the `enrollmentCap` should be stored with a course record.  That means an update to `CourseRecordIO`, `CourseCatalog`, and the associated test files to add the enrollment capacity value.  


## Integrate `CourseRoll` into `Course`
Follow the [provided design](08-lab-design) to integrate `CourseRoll` into the `Course` class.  You'll add the parameter, `roll` and the method `getCourseRoll()`.

You should construct the `CourseRoll` in the `Course` constructor(s).  This will require a new parameter, `enrollmentCap`, which should follow the `instructorId` parameter.  For the moment, this will break `CourseRecordIO`, `CourseCatalog`, and various tests.  Work through the changes carefully as outlined below.

Additionally, there are two other method updates:
  
  * Update `Course.toString()` to include the `enrollmentCap` from `roll` after the `instructorId` in the comma separate value string.
  * Update `Course.getShortDisplayArray()` to include a 5th element (index 4) containing the open seats in the `Course`'s `CourseRoll`.

Once `Course` compiles, update your test cases to include a value for the `enrollmentCap` parameter.  Run your `Course` tests in isolation.  Once they compile, and in the case of the `toString()` test, updated, they should pass with no regressions.


## Update `CourseRecordIO` and `CourseRecordIOTest`
Now that there is an enrollment cap, you should update your test files for `CourseRecordIO`. Download new copies of the `CourseRecordIOTest` files:

  * [course_records.txt](files/course_records.txt)
  * [expected_course_records.txt](files/expected_course_records.txt)
  * [starter_course_records.txt](files/starter_course_records.txt)
  
Update the `CourseRecordIO.readCourse()` method to handle the `enrollmentCap` in a line of input.

Once `CourseRecordIO` and `CourseRecordIOTest` compile, run `CourseRecordIOTest` in isolation.  The tests should pass with no regressions.


## Update `CourseCatalog` and `CourseCatalogTest`
`CourseCatalog` and `CourseCatalogTest` also require updates.  Add an `enrollmentCap` parameter after the `instructorId` parameter and update the call to the `Course` constructor in `CourseCatalog`.

`CourseCatalogTest` should change all calls to the `Course` constructor to add an enrollment cap.  Update your tests accordingly.  You may need to change your expected results file:

  * [expected_course_catalog.txt](files/expected_course_catalog.txt)
  

## Fix Other Compiler Errors
Change the CourseCatalogPanel GUI file to remove any additional compiler errors related to the `Course` and `enrollmentCap` functionality.   

  * [`CourseCatalogPanel` Code](files/CourseCatalogPanel.java)
  
Update any additional tests that need the enrollment capacity.  

Make sure that all code is compiling and all tests are passing before moving on.
  

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