---
title: Guided Project 2 WolfScheduler - Activity and Event
tags: [software engineering, software lifecycle, CS2, CSC216, GP2]
description: Independent Task - Create `Event`
navigation: on
pagegroup: gp2
---

# Independent Task: Create `Event`
{% include iconHeader.html type="task" %}

Now you have created `Activity` without any regressions, you can create the `Event` class as a second child class of `Activity`.

{% capture callout_content %}
  * Create a new class that extends and existing class
  * Implement abstract methods
  * Run unit tests
{% endcapture %}
{% include callout.html content=callout_content icon="objective" type="learningOutcomes" title="Learning Outcomes" %}

{% capture reminder_content %}
[Guided Task: Your First Eclipse Project - Create a Class](../gp1/gp1-eclipse-intro#create-a-class).
{% endcapture %}
{% include mention.html content=reminder_content icon="ideTool" type="reminder" title="Reminder: Eclipse Java Class Creation" %}
## Implement `Event` Class
Create a new Java class called `Event` in the `edu.ncsu.csc216.wolf_scheduler.course` package of the `WolfScheduler` project.  Select the following options:

  * Browse for `Activity` as the Superclass
  * Check the option to creating stubs for "Inherited abstract methods".
  * Check the option to "Generate comments".


{% include image.html file="images/CreateEvent.PNG" caption="Figure: Create Event Class" %}


### Implement `Event` State
The `Event` class will not yet compile because we do not yet call `Activity`'s constructor.  Before creating a constructor for `Event`, we want to implement the fields.  This way we can integrated the fields when generating our constructor.

`Event` knows about two other items in addition to those provided by `Activity`: 
  * an integer called `weeklyRepeat` 
  * a String called `eventDetails`.  
  
The fields should be private.

Generate getters and setters for the fields.


### Implement `Event()` Constructor
Generate an `Event()` Constructor using `Event`'s fields. 

{% include image.html file="images/GenerateConstructor.PNG" caption="Figure: Generate Event Constructor" %}

The constructor should have six parameters (`title`, `meetingDays`, `startTime`, `endTime`, `weeklyRepeat`, and `eventDetails`).  This is because the `Event` constructor also needs the parameters to construct the parent `Activity`.  Update the lines that set the fields to call the corresponding setter methods as a common path of error checking.

```java
    public Event(String title, String meetingDays, int startTime, int endTime, int weeklyRepeat, String eventDetails) {
        super(title, meetingDays, startTime, endTime);
        setWeeklyRepeat(weeklyRepeat);
        setEventDetails(eventDetails);
    }
```


### Implement `Event.setWeeklyRepeat()`
The `setWeeklyRepeat()` method should throw an `IllegalArgumentException` if the `weeklyRepeat` parameter is less than 1 or greater than 4.  The `IllegalArgumentException` message should be "Invalid weekly repeat".

Create private constants to represent the minimum and maximum values for the weekly repeats.


### Implement `Event.setEventDetails()`
The `setEventDetails()` method should throw an `IllegalArgumentException` if the `eventDetails` parameter is null.  [Since `eventDetails` are optional](../wolf-scheduler/ws-requirements#gp2-uc2-s4), the field may contain an empty string. The `IllegalArgumentException` message should be "Invalid event details".


### Implement `Event.getShortDisplayArray()`
The `getShortDisplayArray()` should return a `String` array of length four.  The first two values should be empty strings since `Event` doesn't have a name or section.  The last two values should be the `title` and the meeting string.


### Implement `Event.getLongDisplayArray()`
The `getLongDisplayArray()` should return a `String` array of length seven.  The first two values should be empty strings since `Event` doesn't have a name or section.  The third value is the `title` followed by two values with empty strings.  The last two are the meeting string and `eventDetails`.


### Override `getMeetingString()` and `toString()`
Right click in the editor and select **Source > Override/Implement Methods**.  Check the boxes to `getMeetingString()` and `toString()` (which is under `Object`).

{% include image.html file="images/OverrideMethods.PNG" caption="Figure: Override Methods" %}

For`getMeetingString()`, append the following to `Activity`'s `getMeetingString()`: `" (every X weeks)"` where X is the value stored in `weeklyRepeat`.  Remember, you can call the parent class' methods by using `super.methodName()`.

Implement `toString()` to produce a comma separated string that meets the description in [[UC 10]](../wolf-scheduler/ws-requirements#uc10).


### Overriding Other Methods?
You don't need to override the `equals()` and `hashCode()`.  An `Event` should be considered the same if the title and the meeting information is the same; the number of weeks between meetings and the details aren't needed for equality.  Therefore, you don't need to override these methods.


### Test `Event`
[Use the provided `EventTest` class](files/EventTest.java) to unit test your `Event` implementation.  

Oh no!  The test `testSetMeetingDaysAndTime()` is failing! You will eventually correct the code causing that error in the Debugging section, which comes next. 

All of your other tests should pass now, however.  If they do not, you will need to debug those tests.  It may be helpful to hold on fixing them until after we discuss the debugger.


### Comment `Event` and Fix Static Analysis Notifications
Complete the following tasks:

  * Update all your Javadoc for `Event`. Overridden methods much also be commented to describe the specifics in the overridden implementation.
  * Resolve all static analysis notifications.

{% capture reminder-content %} 
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %} {% include mention.html content=reminder-content type="reminder" title="Reference: Staging and Pushing to GitHub"%} 
## Check Your Progress
{% include iconHeader.html type="glance" %}

Complete the following tasks before pushing your work to GitHub.

  - [ ] Make sure that all fields, methods, and constructors are commented.
  - [ ] Resolve all static analysis notifications.
  - [ ] Fix test failures.
  - [ ] Commit and push your code changes with a meaningful commit message.  Label your commit with "[Implementation]" for future you!