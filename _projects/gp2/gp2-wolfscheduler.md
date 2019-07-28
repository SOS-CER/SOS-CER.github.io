---
title: Guided Project 2 WolfScheduler - Activity and Event
tags: [software engineering, software lifecycle, CS2, CSC216, GP2]
description: Independent Task - Update `WolfScheduler`
navigation: on
pagegroup: gp2
---

# Independent Task: Update `WolfScheduler`
There are several updates required for `WolfScheduler` to work with the `Activity` hierarchy.  

{% capture callout_content %}
  * Refactor `WolfScheduler` to use `Activity` polymorphically.
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}


## Update `WolfSchedulerTest`
[Download the updated `WolfSchedulerTest`](files/WolfSchedulerTest.java).  You can use the tests to help you drive your development.  The details of the changes are outlined in the following steps.


## Update `schedule` Field
The first change is to update the generic type of the `schedule` `ArrayList`.  A `schedule` can now contain `Events`.  Update the generic type to `Activity` so you can store both `Course`s and `Event`s in the `schedule`.  Update the field reference and the construction of `schedule` in `WolfScheduler.WolfScheduler()`. 

There will be additional compilation issues that you will resolve in the next steps.


## Update `addCourse()`
Since `schedule`'s type is now `Activity` rather than `Course`, the reference returned from a call to `.get()` cannot be assigned to a `Course` reference without a cast.  *Casting should be avoided when it makes the class less cohesive.* In this case, that means `WolfScheduler` should focus on adding `Activity` objects rather than casting to figure out if an object is a duplicate or not.  To avoid casting in `WolfScheduler`, we'll create a new abstract method in `Activity` that will be implemented in `Course` to check for duplicate `Course`s and in `Event` to check for duplicate `Event`s.  

The check that is done at this portion of the code is to see if the `Course` to be added is a duplicate of a `Course` already in the schedule -- see [[UC2, E2]](../wolf-scheduler/ws-requirements#gp2-uc2-e2).  [[UC2, E5]](../wolf-scheduler/ws-requirements#gp2-uc2-e5) describes a similar situation for `Event`.  The idea of duplicate `Course`s and `Event`s is different from the definition of equality in the `equals()` methods. Keeping a full comparison is beneficial for testing and may be useful in other situations.  So now *add* a new abstract method to `Activity` that both `Course` and `Event` can implement. The method will check if some other `Course` or `Event` is a duplicate.

  * Add the abstract method `public abstract boolean isDuplicate(Activity activity);` to `Activity`.
  * Implement the methods in `Course` and `Event`.  
  * You will need to check if the parameter is an instance of `Course` and **cast** to check `Course`'s fields.  But this is similar to how the `equals()` method works and fits the `Course` abstraction of identifying a duplicate of itself.  You should also cast `Event` so that you can ensure the object is an `Event`.  An `Event` and `Course` can have the same title!
  * Update `WolfScheduler.addCourse()` to use the new `isDuplicate()` method.
  

## Update `removeCourse()`
`removeCourse()` requires a larger refactoring.  The remove functionality is the same for both `Course`s and `Event`s.  However, the current `removeCourse()` method has parameter specific to `Course`.  By updating the method signature, you can update the method to handle any object in the `Activity` hierarchy.

  * Select the `removeCourse` method name.  Right click and select **Refactor > Change Method Signature**.
  * In the resulting dialog, remove the two existing parameters and add a new parameter of type int called `idx`.  The default value (used for replacement of the parameters in the refactoring) should be -1.  Make sure the "Keep original method as delegate to change method" is unchecked.
  

{% include image.html file="images/ChangeMethod.PNG" caption="Figure: Change Method Signature" %}
    
  * Click **OK**.  The dialog will warn of compilation errors due to the change. 
  * Rename `removeCourse()` to `removeActivity()`.
  * Fix the compilation errors so that the `removeActivity()` method compiles and passes its unit tests.  The parameter `idx` is the index of the `Activity` you want to remove from the `schedule`.  
  
  

## Update `resetSchedule()`
Fix the `resetSchedule()` method so that the method compiles and passes its test case.


## Update `getCourseCatalog()`, `getScheduledCourses()` and `getFullScheduledCourses()`
Update `getCourseCatalog()` to include a forth column that provides the meeting string information.

You created abstract methods in `Activity` that support returning an array for `Course`s and `Event`s.  Refactor `getScheduledCourses()` and `getFullScheduledCourses()` to use the new methods.

Additionally, rename the methods to `getScheduledActivities()` and `getFullScheduledActivities()`.


## Implement `addEvent()`
The functionality for adding a `Course` is separate from adding an `Event`.  Implement the `addEvent()` method that is called in the `WolfSchedulerTest` class.


## Run Tests
Run your tests!  If any are still failing, use the debugger to help you find the problem.


## Push to GitHub
Use the feedback from Jenkins to make changes to your code.  Any time you make a change, push to GitHub and check the Jenkins results.

  * Ensure tests are passing, Javadoc is generated, and all static analysis notifications are removed.
  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  Try writing your own commit message for this push!

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %} 
