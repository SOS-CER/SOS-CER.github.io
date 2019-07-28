---
title: CSC216 Lab 08 - LinkedAbstractList
tags: [software engineering, software lifecycle, CS2, CSC216, Lab08]
description: CSC216 Lab 08 - Implement and Test `CourseRoll`
navigation: on
pagegroup: 08-lab
---
# CSC216 Lab 08 Implement and Test `CourseRoll`
{% include iconHeader.html type="implementation,unitTest" %}
The [updated design](08-lab-design) contains a new package, `edu.ncsu.csc216.pack_scheduler.course.roll` and a new class `CourseRoll`.  


## Create `edu.ncsu.csc216.pack_scheduler.course.roll` Package
Create the `edu.ncsu.csc216.pack_scheduler.course.roll` package in the `src/` folder of `PackScheduler`.


## Create `CourseRoll` Class
Create `CourseRoll` in the `src/` folder of the `edu.ncsu.csc216.pack_scheduler.course.roll` package.  


## Create `CourseRollTest` Class
Create `CourseRollTest` in the `test/` folder of the `edu.ncsu.csc216.pack_scheduler.course.roll` package.  You will need to create the `edu.ncsu.csc216.pack_scheduler.course.roll` package in the `test/` source folder.

When testing, you may find it useful to work with the `CourseCatalog` and `StudentDirectory` objects for quickly loading and finding `Course`s and `Student`s.


## Implement `CourseRoll` State
`CourseRoll` has the following state:

  * `roll`: a custom `LinkedAbstractList` of `Student`s
  * `enrollmentCap`: the roll's enrollment capacity
  * `MIN_ENROLLMENT`: the smallest class size is 10
  * `MAX_ENROLLMENT`: the largest class size is 250
  

## Test and Implement `CourseRoll.CourseRoll()` and `CourseRoll.setEnrollmentCap()`
Write a test for `CourseRoll`'s constructor.  You should implement `CourseRoll.getOpenSeats()` and `CourseRoll.getEnrollmentCap()` to help with testing the constructor.  The `getOpenSeats()` method returns the difference between the `enrollmentCap` and the size of the `roll`.

The constructor of `CourseRoll` should create an empty `LinkedAbstractList` of `Student`s.  The `enrollmentCap` should be set using `setEnrollmentCap()`. `setEnrollmentCap()` should throw an `IllegalArgumentException` if the `enrollmentCap` is less than `MIN_ENROLLMENT` or greater than `MAX_ENROLLMENT`.  Additionally, the `enrollmentCap` can change if `roll` has been constructed and the new `enrollmentCap` is not less than the number of currently enrolled students.  Add tests for `setEnrollmentCap()`.


## Test and Implement `CourseRoll.enroll(Student s)`
Write tests for `CourseRoll.enroll(Student s)`.  

`CourseRoll.enroll(Student s)` should add the `Student` to the end of the `roll`.  An `IllegalArgumentException` is thrown if:

  * The `Student` is null
  * There is no more room in the class
  * The `Student` is already enrolled
  * If adding the student to the `LinkedAbstractList` generates an exception. In that case, the exception should be propagated to an `IllegalArgumentException`.


## Test and Implement `CourseRoll.drop(Student s)`
Write tests for `CourseRoll.drop(Student s)`.  

`CourseRoll.drop(Student s)` should remove the `Student` from the `roll`.  An `IllegalArgumentException` is thrown if:

  * The `Student` is null
  * If removing the student from the `LinkedAbstractList` generates an exception. In that case, the exception should be propagated to an `IllegalArgumentException`.


## Test and Implement `CourseRoll.canEnroll(Student s)`
Write tests for `CourseRoll.canEnroll(Student s)`.  

`CourseRoll.canEnroll(Student s)` returns true if the `Student` can be added to the `CourseRoll` and false if:

  * There is no more room in the class
  * The `Student` is already enrolled
  
You may find it useful to use `canEnroll()` in `CourseRoll.enroll()` for the checks.


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