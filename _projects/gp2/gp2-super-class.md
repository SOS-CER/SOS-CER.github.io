---
title: Guided Project 2 WolfScheduler - Activity and Event
tags: [software engineering, software lifecycle, CS2, CSC216, GP2]
description: Guided Task - Extract a Super Class
navigation: on
pagegroup: gp2
---

# Guided Task: Extract a Super Class
With the new hierarchy design, now you need to move toward implementation.  The common elements are already implemented in `Course`.  You can extract those elements into the parent class.  Attempting this extraction manually can be messy and can lead to breaking the code.  Luckily, Eclipse provides a refactoring tool that helps with extracting a super class, because developers frequently need to make these types of changes in their code.

{% capture callout_content %}
  * Use the Eclipse refactoring tool to create a super class
  * Use automated testing to ensure no regression of functionality
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}


## Extract the Super Class
To extract the `Activity` super class, do the following:

  * Open `Course` in the editor.
  * Right click in the `Course` class in the editor and select **Refactor > Extract Superclass**.
  * Give the superclass the name `Activity`.
  * Select the checkboxes next to the following members of `Course`
     * `UPPER_TIME`
     * `UPPER_HOUR`
     * `title`
     * `meetingDays`
     * `startTime`
     * `endTime`
     * `getTitle()`
     * `setTitle()`
     * `getMeetingDays()`
     * `setMeetingDays()`
     * `getStartTime()`
     * `getEndTime()`
     * `setCourseTime()`
     * `getMeetingString()`
     * Any private helper methods that you wrote to support the implementation of the above methods
     
    
{% include image.html file="images/ExtractSuperClass.PNG" caption="Figure: Extracting a Super Class" %}
    
  * Click **Next** and verify that you have all the items you need.
  
    
{% include image.html file="images/ExtractSuperClass2.PNG" caption="Figure: Extracting a Super Class" %}
  
  * Click **Next** again.  You'll see a list of the changes that will be performed as part of the refactoring.  This change will modify most of the classes in the project!  
  
{% include image.html file="images/ExtractSuperClass3.PNG" caption="Figure: Extracting a Super Class" %}
    
  * Click **Finish**.
  
Your project should continue to compile after the refactoring is complete.  If your code does not compile, you can use Ctrl+Z (Cmd+Z) to undo the refactoring and try again!


## Run Tests
Run all of your unit tests on the refactored code.  Ensure there are no regressions in functionality.


## Make `Activity` Abstract
Since `Activity` is a super class of `Course` and will soon be the super class of `Event`, there is no need for `Activity` to be a concrete class.  Instead, `Activity` should be abstract - that means you cannot directly construct `Activity` objects. 

Add the `abstract` keyword to the `Activity` class header.


## Make `Activity`'s Fields Private
When creating the super class, Eclipse set the fields of `Activity` to protected level access.  This means that any sub-class can access the fields directly.  However, it also means that another class in the same package can also access the fields directly. To protect your fields, make them `private`.

There will be several compilation errors in `Course` after you make the fields in `Activity` private: `hashCode()`, `equals()`, and `toString()`.  Do the following to resolve:  
 
  * Remove `hashCode()` and `equals()`.  Now that there is a super class, you should regenerate `hashCode()` and `equals()` to use the super class. 
  * Change direct references to `Activity` fields to use the associated getter methods.  
  * Run your tests.  The tests for `Course.hashCode()` and `Course.equals()` will fail.  You'll fix those shortly!


## Create `Activity`'s Constructor
`Activity` doesn't automatically have a constructor.  You want to continue to use the *one path of construction* paradigm.  That means you need a way to construct `Activity` and its fields.

  * Replace the default `Activity` constructor with one that requires all of the fields.  The parameters MUST be in the order of `title`, `meetingDays`, `startTime`, and `endTime`.  Additionally, update the body of the constructor to use the appropriate setter methods for the fields since all of the error checking is completed there.
  * After you add a parameterized constructor to `Activity`, `Course` no longer compiles.  Now, `Course` needs to call the parameterized `Activity` constructor.  Update `Course`'s non-compiling constructor to use `Activity`'s new constructor.  Remember, `Activity` is the parent of `Course`.  To interact with the parent class, you need to use the `super` reference.
  * Run your unit tests to make sure that everything is still passing (except for `Course.hashCode()` and `Course.equals()`).
  
## Rename `setCourseTime()`
Now that we have a parent class, `Activity`, it's no longer appropriate to have a method `setCourseTime()`.  We will use the refactoring tool **Rename** to rename the method.  To rename a method (or field, variable, or class), do the following:

  * Put your cursor in the middle of the identifier.
  * Right click and select **Refactor > Rename...*.
  * The editor will update with an edit box around the identifier.  Make your edits and press enter.
  
The rename will update all places where `setCourseTime()` is called to the updated `setActivityTime()` name.  The rename refactoring tool will handle global rename changes.   
  

## Generate `hashCode()` and `equals()`
Do the following to add back the `hashCode()` and `equals()` functionality:

  * Use Eclipse's source generation tools to generate `hashCode()` and `equals()` in `Activity`.
  * Then use Eclipse's source generation tools to generate `hashCode()` and `equals()` in `Course`.
  * Run your unit tests.  They should all be passing again!
  

## Add Abstract Functionality
Adding events will complicate the display of information in the GUI.  There will be some items that `Course` has that `Event` will not and vice versa.  Creating the array of Strings for display in the GUI should instead be delegated to classes in the `Activity` hierarchy.  You will add two abstract methods that will provide a short and a long version of the array of information to provide to the GUI.

  * Add the statement `public abstract String[] getShortDisplayArray();` to `Activity`.
  * Add the statement `public abstract String[] getLongDisplayArray();` to `Activity`.
  
After you add these statements, `Course` will no longer compile.  Select the compiler error on the `Course` class header and use the Quick Fix to add implementations of these two methods to `Course`.

Implement the methods in `Course` as follows:

  * `getShortDisplayArray()` returns an array of length 4 containing the `Course` `name`, `section`, `title`, and meeting days string.
  * `getLongDisplayArray()` returns an array of length 7 containing the `Course` `name`, `section`, `title`, `credits`, `instructorId`, meeting days string, empty string (for a field that `Event` will have that `Course` does not).


## Extended `Course` Unit Testing
Using the updated `WolfScheduler` [requirements](../wolf-scheduler/ws-requirements#guided-project-2-requirements) along with the [provided `ExtendedCourseTest` JUnit tests](files/ExtendedCourseTest.java), you will finish implementing the `Course` class to pass the tests!


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