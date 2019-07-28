---
title: CSC216 Lab 09 - Stacks and Queues
tags: [software engineering, software lifecycle, CS2, CSC216, Lab09]
description: CSC216 Lab 09 - Implement and Test `Stack`s
navigation: on
pagegroup: 09-lab
---

# CSC216 Lab 09 Implement and Test `Stack`s
{% include iconHeader.html type="implementation, unitTest" %}
The data structure that will eventually be used to implement the waitlist functionality is currently unknown.  So you'll explore several different specialized data structures before selecting the best one for waitlist.  You'll start with `Stack`s. 

You will create a `Stack` interface and implement `ArrayStack` and `LinkedStack`.  Each concrete class will implement the interface and delegate to either `ArrayList` or `LinkedAbstractList`.


## Create `Stack` Interface
Create a `Stack` interface in the `edu.ncsu.csc216.pack_scheduler.util` package.  `Stack` has a generic type and 5 methods which are described below:

  * `void push(E element)`
     * Adds the element to the top of the stack
     * If there is no room (capacity has been reached), an `IllegalArgumentException` is thrown
  * `E pop()`
     * Removes and returns the element at the top of the stack
     * If the stack is empty, an `EmptyStackException()` is thrown
  * `boolean isEmpty()`: Returns true if the stack is empty
  * `int size()`: Returns the number of elements in the stack
  * `void setCapacity(int capacity)`
     * Sets the stack's capacity
     * If the actual parameter is negative or if it is less than the number of elements in the stack, an IllegalArgumentException is thrown
  
Javadoc `Stack`'s methods.


## Create `ArrayStack` and `LinkedStack`
Create `ArrayStack` and `LinkedStack` in `edu.ncsu.csc216.pack_scheduler.util` package.  Both should implement `Stack`.  Leave the method stubbed out until you have written your unit tests.


## Test!
Create `ArrayStackTest` and `LinkedStackTest` in `edu.ncsu.csc216.pack_scheduler.util` package of the `test/` source folder.

Start by writing tests for `ArrayStackTest`.  When you're done, you can copy them into `LinkedStackTest` and update the tested object.

Consider the following cases:

  * Inserting a single element into the stack
  * Inserting multiple elements into the stack
  * Removing a single element from the stack
  * Removing multiple elements from the stack
  * Removing the last element from the stack
  * Interleaved inserts and removes
  * Attempting to remove an element from an empty stack
  * Setting the capacity to size
  * Attempting to set the capacity to less than size
  

## Implement `ArrayStack`
`ArrayStack` should have a field of type `ArrayList`.  `ArrayStack` will construct an `ArrayList` and delegate to the `ArrayList`.  

Note that since the current implementation of `ArrayList` does not have a capacity, the capacity functionality will be part of `ArrayStack`.  DO NOT add capacity to `ArrayList`!


## Implement `LinkedStack`
`LinkedStack` should have a field of type `LinkedAbstractList`.  `LinkedStack` will construct a `LinkedAbstractList` and delegate to the `LinkedAbstractList`.

Since `LinkedAbstractList` does have a capacity, `LinkedStack` can delegate to `LinkedAbstractList` for the `setCapacity()` implementation.


## Run the Tests
Run your tests and make sure they all pass!  Ensure there are no regressions to existing functionality.


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