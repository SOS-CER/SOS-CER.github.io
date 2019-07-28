---
title: Guided Project 3 WolfScheduler - Conflict
description: Guided Task - Test Driven Development
tags: [software engineering, software lifecycle, CS2, CSC216, GP3]
navigation: on
pagegroup: gp3
---

# Guided Task: Test Driven Development 
In this section, you will start creating tests for the implementation of the `Conflict` interface in `Activity`.

{% capture callout_content %}
  * Create a test class
  * Implement a test for an exception
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}

{% capture callout_content %}
Test Driven Development (TDD) is the process of using the requirements and object design to write the unit tests for a class first, and then use the tests to drive the implementation of the methods in the class.  The process is typically iterative.  Start with the simplest test first and implement the functionality to pass. Then add additional tests that consider other paths, edge cases, and error cases.  After adding each test, implement the functionality to pass it (if needed).

TDD is a highly effective process for developing code that is well tested.  By testing right away and letting the tests drive development, you will implement more high quality code more quickly and not run out of time for testing!
{% endcapture %}
{% include callout.html content=callout_content type="bestPractices" icon="ttTool" title="Best Practice: Test Driven Development (TDD)" %}

## Set up `Activity` for Testing
Since `Activity` contains the fields related to the `meetingDays`, `startTime`, and `endTime`, you can implement the `Conflict.checkConflict()` functionality in the `Activity` class.  If the child classes need custom conflict implementation later, they can override the method.

You can use your tests to drive the creation of new methods in your code as in [using Quick Fixes for Error-Driven Development](../gp1/gp1-quick-fix#best-practice-quick-fix-for-error-driven-development).  However, this may not be appropriate in all cases - Quick Fix will help you create the `checkConflict()` method, but will not know that the method is needed as part of implementing the `Conflict` interface.  Instead, you'll set up the appropriate structure and generate a test class from the structure.

Follow these steps to set up `Activity` for testing the `Conflict` functionality:

  * Open `Activity` in the editor.
  * Update the `Activity` class header to include `implements Conflict`.  When complete, the header should look like `public abstract class Activity implements Conflict {`.
  * Because `Activity` is an abstract class, there are no compiler errors about `Activity` needing an implementation of `Conflict`'s method.  Instead, `Course` and `Event` won't compile.  However, you want `Activity` to contain the `checkConflict()` implementation.  You can use Eclipse's source generation tool to implement the method in `Activity` by right clicking in the editor and selecting **Source > Override/Implement Methods**.  Check the option for `Conflict.checkConflict(Activity)` and click **OK**.
  
Now that `Activity` implements the `Conflict.checkConflict()` method, the compiler errors in `Course` and `Event` are resolved and you can create the JUnit class to test the `Activity.checkConflict()` implementation.  Create a new JUnit test for `Activity` named `ActivityTest` in the `edu.ncsu.csc216.wolf_scheduler.course` package of the `test/` folder in `WolfScheduler`.  Since you've been provided test classes that test the other methods, you should only generate a test method for the `checkConflict()` method.  After generating the test, you can remove the `fail()` statement since you are about to implement the test.

{% capture callout_content %}
If you need help creating a JUnit test class from a class under test, see [Guided Task: Implement and Test `ConflictException` - Creating a Test Class](gp3-conflictexception#creating-a-test-class).
{% endcapture %}
{% include callout.html content=callout_content type="reminder" icon="ttTool" title="Reminder: Creating a JUnit Test Class from a Class Under Test" %}


## `checkConflict()` Overview
The `checkConflict()` method is an instance method of `Activity`. That means it compares the current instance (i.e., `this`) with the parameter `possibleConflictingActivity` to see if there is any conflict in their days and times.  If there is a conflict, the checked `ConflictException` is thrown.  If there is no conflict, nothing happens and the statement in the client code following the call to `checkConflict()` is executed.

Two `Activity` objects are in conflict if there is at least one day with an overlapping time.  A time is overlapping if the minute is the same.  For example, an `Activity` on Monday from 1:30PM-2:45PM would conflict with an `Activity` on Monday from 2:45PM-3:30PM because of the overlap on the 2:45 minute.  You'll encode this test shortly.


## No Conflict Test
Since you are testing a method that may throw a checked exception, the test code must be surrounded with a `try/catch` block.  For a no conflict test, the expected result is that the exception is NOT thrown, so the initial test structure is:

```java
try {
    //Call to checkConflict
} catch (ConflictException e) {
    fail(); //If an exception is thrown when there is no conflict the test fails.
}
```
    
The rest of the test is creating the two `Activity` objects to check for conflict, and then to check the conflict.  Since `Activity` is `abstract`, you cannot directly construct `Activity`. Instead, you must construct a `Course` or `Event` object for the comparison.

```java
Activity a1 = new Course("CSC216", "Programming Concepts - Java", "001", 4, "sesmith5", "MW", 1330, 1445);
Activity a2 = new Course("CSC216", "Programming Concepts - Java", "001", 4, "sesmith5", "TH", 1330, 1445);
```
    
Next, the `checkConflict()` method is called on one of the objects.  The other is passed as a parameter.  Since the call could cause an exception, the call is placed in the `try` block.

Finally, there should be some type of assert in the body of the `try` block.  It's not enough that no exception was thrown.  Instead, you need to check that the call to the `checkConflict()` method did NOT lead to a change of any of the state of the `Activity` object related to the `meetingDays`, `startTime`, and `endTime` for either object.  You can check all three at once by calling the `getMeetingString()` method.  

The final test looks like the following:

```java
@Test
public void testCheckConflict() {
    Activity a1 = new Course("CSC216", "Programming Concepts - Java", "001", 4, "sesmith5", "MW", 1330, 1445);
    Activity a2 = new Course("CSC216", "Programming Concepts - Java", "001", 4, "sesmith5", "TH", 1330, 1445);
    try {
        a1.checkConflict(a2);
        assertEquals("Incorrect meeting string for this Activity.", "MW 1:30PM-2:45PM", a1.getMeetingString());
        assertEquals("Incorrect meeting string for possibleConflictingActivity.", "TH 1:30PM-2:45PM", a2.getMeetingString());
    } catch (ConflictException e) {
        fail("A ConflictException was thrown when two Activities at the same time on completely distinct days were compared.");
    }
}
```

Run the test.  Since you have not yet implemented `checkConflict()`, the test should pass.  However, this is an important test to ensure that as you implement the rest of `checkConflict()` that you do not start finding a conflict where there should be no conflict!


## Testing an Exception - Conflict Test
The next test type to consider is a test when there is a conflict.  In this case, the expected results are that the `ConflictException` is thrown.  Continuing execution without an exception is a failing test.  The initial test structure is:

```java
try {
    //Call to checkConflict
    fail(); //If the test reaches this point it fails since the exception was NOT thrown
} catch (ConflictException e) {
    //Check that no state was changed
}
```
    
The local variables `a1` and `a2` can be updated with new information that would cause a conflict or new `Activity` variables can be created.  A final version of the method for the conflict example discussed in the overview of the conflict functionality is below:

```java
//Update a1 with the same meeting days and a start time that overlaps the end time of a2
a1.setMeetingDays("TH");
a1.setActivityTime(1445, 1530);
try {
    a1.checkConflict(a2);
    fail(); //ConflictException should have been thrown, but was not.
} catch (ConflictException e) {
    //Check that the internal state didn't change during method call.
    assertEquals("TH 2:45PM-3:30PM", a1.getMeetingString());
    assertEquals("TH 1:30PM-2:45PM", a2.getMeetingString());
}
```

Run the test.  It fails!  But that is exactly what you want.  It means you have a test that you can use to start driving the implementation of the `checkConflict()` functionality in `Activity`.


## Testing Behaviors to Avoid
There are behaviors that you want to avoid when testing.  PMD will flag some of these behaviors with notifications (and a PMD notification leads to a loss of a point).  

**Test Method with No `assert*()`**
Every test method should have at least one `assert*()` method call.  The goal of a test method is to assert or check something about the code under test to verify the code is working correctly.  It's very tempting to leave out an `assert*()` method call because your test method will pass (and you may also achieve coverage). But that means you can have no confidence in your code!  Always write a test method to assert something about the code under test!  

**Meaningless `assert*()` Statements**
A meaningless `assert*()` statement is something like `assertTrue(true);`, `assertFalse(false);`, or `assertNull(null);`.  There is  ALWAYS something to check about the code under test.  At a minimum you can check that the state has not changed or that the type is correct.  Avoid meaningless assert statements.  They are just lazy!  If you need help identifying what you should check, contact the teaching staff.


## Push to GitHub
Use the feedback from Jenkins to make changes to your code.  Any time you make a change, push to GitHub and check the Jenkins results.

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content type="reminder" icon="vcTool" title="Reminder: Staging and Pushing to GitHub" %}