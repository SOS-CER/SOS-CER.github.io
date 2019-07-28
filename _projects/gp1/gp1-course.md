---
title: Guided Project 1 WolfScheduler - Course and Schedule
tags: [software engineering, software lifecycle, CS2, CSC216, GP1]
description: Independent Task - Finish `Course`
navigation: on
pagegroup: gp1
---
 
# Independent Task: Finish `Course`
Using the `WolfScheduler` [requirements](../wolf-scheduler/ws-requirements) along with the [provided JUnit tests](files/CourseTest.java), you will finish implementing the `Course` class to pass the tests!

There are seven setter methods (you'll see why it is seven shortly) and one getter method that need to be fully implemented to pass all of the provided JUnit tests.  The implementation details below (from the WolfScheduler [requirements](../wolf-scheduler/ws-requirements)) will help you pass the test cases.  Note that when they receive an invalid value, you want to throw an `IllegalArgumentException`.  That way the client can catch and handle the error.

You'll walk through an example of implementing `setName()` before leaving the other methods for independent implementation.  The other methods will review prerequisite concepts.

{% capture callout_content %}
  * Write setter methods for `Course` to pass the unit tests and meet the requirements.
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}
  
{% capture callout_content %}
Test driven development is a software development practice where you write your test cases for a class using the requirements BEFORE you write the code for the class.  The failing tests then drive the development of your class!  You keep fixing your code until your tests pass.

The teaching staff has provided a set of unit tests that you must now pass!

In practice, you may not always write your test cases first. Iterating between code and test (and not putting off testing) is critical for writing high quality code!
{% endcapture %}
{% include callout.html content=callout_content icon="unitTest,ttTool" type="bestPractices" title="Best Practice: Test Driven Development" %}

## Constants
In the [Guided Project 1 design](https://pages.github.ncsu.edu/engr-csc216-staff/CSC216-SE-Materials/wolf-scheduler/ws-design.html) there are several constants listed for the `Course` class.  Constants are used to provide names, and therefore meaning, to values in our programs.  Add the constant values to `Course` and then use the constant values where appropriate.

 
## `setName()` Implementation
From the requirements for [UC1, S1](../wolf-scheduler/ws-requirements#uc1-s1), you need to implement `setName()` to meet the following the statements - A course record is invalid if one of more of the following are true:

  * the course name is null or an empty string
  * the course name is fewer than 4 characters or greater than 6 characters

The requirements tell you that `Course.setName()` should throw an exception if the parameter is null, an empty string (with a length of 0), or if the length is fewer than 4 characters or greater than 6 characters.  You can implement the `Course.setName()` method in the following way:

```java
/**
 * Sets the Course's name.  If the name is null, has a length less than 4 or 
 * greater than 6, an IllegalArgumentException is thrown.
 * @param name the name to set
 * @throws IllegalArgumentException if name is null or length is less than 4 or 
 * greater than 6
 */
private void setName(String name) {
    if (name == null) {
        throw new IllegalArgumentException();
    }
    if (name.length() < 4 || name.length() > 6) {
        throw new IllegalArgumentException();
    }
    this.name = name;
}
```   
    
Run your tests and make sure that `testCourseStringStringStringIntStringStringIntInt()` passes.
    

## `setTitle()` Implementation
From the requirements for [UC1, S1](../wolf-scheduler/ws-requirements#uc1-s1), you need to implement `setTitle()` to meet the following the statements - A course record is invalid if one of more of the following are true:

  * the course title is null or an empty string

Run your tests and make sure that `testSetTitle()` passes.

 
## `setSection()` Implementation
From the requirements for [UC1, S1](../wolf-scheduler/ws-requirements#uc1-s1), you need to implement `setSection ()` to meet the following the statements - A course record is invalid if one of more of the following are true:

  * the section number is NOT exactly three digits
  
Remember that you can use the [`Character`](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html) class methods to help you with determining if a character is a digit.  Also, ``section is a `String`.  That means that `section` cannot be `null`.

Run your tests and make sure that `testSetSection()` passes.

 
## `setCredits()` Implementation
From the requirements for [UC1, S1](../wolf-scheduler/ws-requirements#uc1-s1), you need to implement `setCredits()` to meet the following the statements - A course record is invalid if one of more of the following are true:

  * the credit hours are not a number
  * the credit hours are less than 1 or greater than 5
  
You actually don't need a specific test here to check if the credit hours are not a number.  The parameter type of int guarantees that the value will be a number.  But later on, you will need to handle this case.

Run your tests and make sure that `testSetCredits()` passes.

 
## `setInstructorId()` Implementation
From the requirements for [UC1, S1](../wolf-scheduler/ws-requirements#uc1-s1), you need to implement `setInstructorId()` to meet the following the statements - A course record is invalid if one of more of the following are true:

  * the instructor's id is null or an empty string

Run your tests and make sure that `setInstructorId()` passes.
 
## `setMeetingDays()` Implementation
From the requirements for [UC1, S1](../wolf-scheduler/ws-requirements#uc1-s1), you need to implement `setMeetingDays()` to meet the following the statements - A course record is invalid if one of more of the following are true:

  * meeting days consist of any characters other than 'M', 'T', 'W', 'H', 'F', or 'A' 
  * if 'A' is in the meeting days list, it must be the only character

Remember, `meetingDays` is a `String`.  That means that `meetingDays` cannot be `null`.  

Run your tests and make sure that `setMeetingDays()` passes.

 
## `setCourseTimes()` Implementation
From the requirements for [UC1, S1](../wolf-scheduler/ws-requirements#uc1-s1), you need to implement the `Course` class to meet the following statements - A course record is invalid if one of more of the following are true:

  * the start time is not between 0000 and 2359 an invalid military time
  * the end time is not between 0000 and 2359 or an invalid military time
  * the end time is less than the start time (i.e., no overnight classes)
  * a start time and/or end time is listed when meeting days is 'A'
  
Note that a valid military time only has minutes between 00 and 59.
  
There are several ways you could choose to implement these requirements.  The first would be to implement them within the automatically generated `setStartTime()` and `setEndTime()` methods.  Each method could include a check that the start time isn't later than the end time, but you may run into issues when we need to move both the start times and end times after they are initially set.  A better solution would be to remove the methods that set the individual fields and to create a new setter method that will set both fields at once!  Then you can check statements above in a single method.  Note that if the meeting days are listed as 'A', then `startTime` and `endTime` should be zero.

Do the following:

  * Remove `setStartTime()`
  * Remove `setEndTime()`
  * Create a method `public void setCourseTime(int startTime, int endTime)`
  * Update the Course constructor to use the new method
  * Uncomment the method in `CourseTest` called `testSetCourseTime()`
  
Run your tests and make sure that `setCourseTime()` passes.

 
## `getMeetingString()` Implementation
[UC2, S7](../wolf-scheduler/ws-requirements#uc2-s7) and [UC3, S1](../wolf-scheduler/ws-requirements#uc3-s1) both discuss providing meeting information as a string in standard time format rather than in military format.  The `getMeetingString()` method provides this functionality.  

To get started, do the following:

  * Create a method `public String getMeetingString()`
  * Uncomment the method in `CourseTest` called `testGetMeetingString()`
  
Implement the `getMeetingString()` method to pass the provided tests.

At this time, all tests should be passing with a green bar!

{% include image.html file="images/PassingCourseTests.PNG" caption="Figure: JUnit Results" %} 

{% capture callout_content %}
You may have noticed that there are two statements in [UC1, S1](../wolf-scheduler/ws-requirements#uc1-s1) that you have not yet fully written code for:

A course record is invalid if one or more of the following are true:

  * an item is missing
  * a course with the same same name and section
  
You do a basic check for null or empty string items that helps with the "an item is missing" statement, but there is more that will need to be done there when you handle processing the lines of `Course` information from an input file.  

The other item that a record is invalid  if "a course with the same same name and section" isn't something that you can implement at this point.  A `Course` only knows about itself; not about other `Course`s in the system.  You'll implement that statement when you start working with a collection of `Course`s.
{% endcapture %}
{% include callout.html content=callout_content icon="design" type="conceptualKnowledge" title="Conceptual Knowledge: Object Design" %}
  
 
## Push to GitHub
You've made a lot of changes to your `Course` class by implementing the required functionality to pass the provided test cases.  Before moving on to the next portion of the Guided Project, complete the following tasks:

  * Make sure that all fields, methods, and constructors are commented.
  * Commit and push the `Course` class to GitHub.  Remember to use a meaningful commit message describing how you have changed the code.  For example, "Completed Course functionality".
  
{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}