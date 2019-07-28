---
title: Guided Project 2 WolfScheduler - Activity and Event
tags: [software engineering, software lifecycle, CS2, CSC216, GP2]
description: Independent Task - Create `Event`
navigation: on
pagegroup: gp2
---

# Independent Task: Create `Event`
Now you have created `Activity` without any regressions, you can create the `Event` class.  

{% capture callout_content %}
  * Create a new class that extends and existing class
  * Implement abstract methods
  * Run unit tests
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}


## Create `Event` Class
Create a new Java class called `Event` in the `edu.ncsu.csc216.wolf_scheduler.course` package of the `WolfScheduler` project.  **Check the options for creating stubs "Inherited abstract methods".**


{% include image.html file="images/CreateEvent.PNG" caption="Figure: Create Event Class" %}

{% capture callout_content %}
If you need help creating the `Course` Java Class, see [Guided Task: Your First Eclipse Project - Create a Class](../gp1/gp1-eclipse-intro#create-a-class).
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Eclipse Java Class Creation" %}


## Implement `Event` State
`Event` knows about two other items in addition to those provided by `Activity`: `weeklyRepeat` and `eventDetails`.  The fields should be private.

Generate getters and setters for the fields.


## Implement `Event()` Constructor
Generate an `Event()` Constructor using `Event`'s fields. The constructor should have six parameters (`title`, `meetingDays`, `startTime`, `endTime`, `weeklyRepeat`, and `eventDetails`).

Update the lines that set the fields to instead call the corresponding setter methods as a common path of error checking.


## Implement `Event.setWeeklyRepeat()`
The `setWeeklyRepeat()` method should throw an exception `IllegalArgumentException` if the `weeklyRepeat` parameter is less than one or greater than 4.  The `IllegalArgumentException` message should be "Invalid weekly repeat".


## Implement `Event.setEventDetails()`
The `setEventDetails()` method should throw an `IllegalArgumentException` if the `eventDetails` parameter is null.  [Since `eventDetails` are optional](../wolf-scheduler/ws-requirements#gp2-uc2-s4), the field may contain an empty string. The `IllegalArgumentException` message should be "Invalid event details".


## Implement `Event.getShortDisplayArray()`
The `getShortDisplayArray()` should return a `String` array of length four.  The first two values should be empty strings since `Event` doesn't have a name or section.  The last two values should be the `title` and the meeting string.


## Implement `Event.getLongDisplayArray()`
The `getLongDisplayArray()` should return a `String` array of length seven.  The first two values should be empty strings since `Event` doesn't have a name or section.  The third value is the title followed by two values with empty strings.  The last two are the meeting string and `eventDetails`.


## Override `getMeetingString()` and `toString()`
Right click in the editor and select **Source > Override/Implement Methods**.  Check the boxes to `getMeetingString()` and `toString()` (which is under `Object`).

{% include image.html file="images/OverrideMethods.PNG" caption="Figure: Override Methods" %}

For`getMeetingString()`, append the following to `Activity`'s `getMeetingString()`: `" (every X weeks)"` where X is the value stored in `weeklyRepeat`.

Implement `toString()` to produce a comma separated string that meets the description in [[UC3, S2]](../wolf-scheduler/ws-requirements#gp2-uc3-s2).


## Overriding Other Methods?
You don't need to override the `equals()` and `hashCode()`.  An `Event` should be considered the same if the title and the meeting information is the same; the number of weeks between meetings and the details aren't needed for equality.  Therefore, you don't need to override these methods.


## Test `Event`
[Use the provided `EventTest` class](files/EventTest.java) to unit test your `Event` implementation.  

Oh no!  The test `testSetMeetingDays()` is failing! You will eventually correct the code causing that error in the Debugging section, which comes next. All of your other tests should pass now, however.


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