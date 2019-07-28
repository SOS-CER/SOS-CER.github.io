---
title: CSC216 Lab 09 - Stacks and Queues
tags: [software engineering, software lifecycle, CS2, CSC216, Lab09]
description: CSC216 Lab 09 - Bug Fix!
navigation: on
pagegroup: 09-lab
---

# CSC216 Lab 09 Bug Fix!
{% include iconHeader.html type="unitTest,systemTest" %}
The design for [Lab 08](../08-lab) was missing a key piece for end-to-end enrollment capacity functionality in `CourseRoll` - the ability to change the `capacity` in `LinkedAbstractList`.  The constructor sets the `capacity`, but after that there is no functionality to change the `capacity`. One client work around would be to create a new `LinkedAbstractList` with the new capacity and copy all of the elements from the old list to the new list, but that's not very efficient.  Instead, you should provide clients of `LinkedAbstractList` the ability to update the capacity.


## Add `setCapacity()` Method
Add a new method `setCapacity(int capacity)` to `LinkedAbstractList`.  The method has a void return type.  

If the parameter `capacity` is less than zero or less than the current size of the `LinkedAbstractList`, an `IllegalArgumentException` should be thrown.  Otherwise, the capacity is set.


## Update `CourseRoll.setEnrollmentCap()`
Update `CourseRoll.setEnrollmentCap()` to use the new `LinkedAbstractList.setCapacity()`.


## Test!
Run your existing tests and see if there are any failures.  You may need to update the tests for the corrected functionality.

Create additional tests for `LinkedAbstractList` and `CourseRoll` to test the new functionality.  Make sure you have a green bar before proceeding!


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  
  
Check your job on Jenkins.

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../../git-tutorial/git-staging)
  * [Committing Files](../../git-tutorial/git-commit)
  * [Pushing Files](../../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}