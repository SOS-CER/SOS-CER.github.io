---
title: CSC 217 Lab 09 - Stacks and Queues
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab09]
description: CSC 217 Lab 09 - Implement and Test Waitlist Functionality
navigation: on
pagegroup: 09-lab
---

# CSC 217 Lab 09 Implement and Test Waitlist Functionality
{% include iconHeader.html type="implementation,unitTest" %}
Now that you have two stack implementations and two queue implementations, you now need to identify which specialized data structure is needed to implement the waitlist functionality.  Review the [requirements](09-lab-requirements#uc6) to identify which implementation is best.


## `waitlist` Field
Start by adding the `waitlist` field to `CourseRoll`.  Construct the `waitlist` in the `CourseRoll()` constructor, to have a capacity of 10 (as per [[UC8]](09-lab-requirement#uc8) and [[UC10]](09-lab-requirement#uc8)).


## Update `CourseRoll(Course c, int enrollmentCap)`
To fully implement the waitlist functionality, you need to be able to update a `Student`'s `Schedule` if they are removed from the `waitlist` and enrolled in the course.  That means you need to know what `Course` the `CourseRoll` is associated with.  Update `CourseRoll`'s constructor to receive a `Course` parameter.  An `IllegalArgumentException` should be thrown if `Course` is null.

This change will break the constructor in `Course`.  Update the construction of the `CourseRoll` in `Course` to pass in the `Course` instance (i.e., `this`).

Your tests for `CourseRoll` will also need to be updated.  Create a `Course` and instead of working with a directly constructed `CourseRoll`, work with the `Course`'s `CourseRoll`. 

```java
Course c = new Course("CSC216", "Programming Concepts - Java", "001", 4, "sesmith5", 10, "A");
//CourseRoll roll = new CourseRoll(10); //Update as below
CourseRoll roll = c.getCourseRoll();
```
    

## Update `CourseRoll.enroll(Student s)`
If the `CourseRoll` has reached capacity, the `Student` should be added to the `waitlist`.  That is one reason why `roll.add(s)` (which is really a call to `LinkedAbstractList.add()`) might throw an `IllegalArgumentException`.  If the size of the `roll` is the same as `enrollmentCap` attempt to add the student to `waitlist`.

If the `waitlist` is full, then the `Student` cannot enroll and an `IllegalArgumentException` is thrown.


## Update `CourseRoll.drop(Student s)`
If the `Student` is in the main roll, remove the `Student` and add the first eligible `Student` in the waitlist to the main roll.  

If the `Student` is in the `waitlist`, remove the `Student` from the `waitlist` while maintaining the order of the `waitlist` and working with the specialized data structure methods.

## Update `CourseRoll.canEnroll(Student s)`
`CourseRoll.canEnroll()` should return `true` if the student can be added to the `waitlist`.  `CourseRoll.canEnroll()` should return `false` if the `Student` is already on the `waitlist`.  Both of these checks are in addition to the earlier checks of room in the `roll` and `Student` is not already on the `roll`.

You are welcome to add a `contains(E)` method to the class you used for your `waitlist` to simplify the update to `CourseRoll.canEnroll()`.  


## Implement `CourseRoll.getNumberOnWaitlist()`
`CourseRoll.getNumberOnWaitlist()` returns the number of `Student`s on the `waitlist`.


## Test!
Add tests for the waitlist functionality and fix any old tests that are no longer appropriate for the new functionality.  There should be no regressions in other parts of the system, but if there are due to the specifics of your impelementation, debug them as appropriate to meet the requirements.

Make sure all your tests pass!


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  
  
Check your job on Jenkins.

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}