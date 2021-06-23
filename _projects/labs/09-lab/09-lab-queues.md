---
title: CSC 217 Lab 09 - Queues and Queues
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab09]
description: CSC 217 Lab 09 - Implement and Test `Queue`s
navigation: on
pagegroup: 09-lab
---

# CSC 217 Lab 09 Implement and Test `Queue`s
{% include iconHeader.html type="implementation,unitTest" %}
The data structure that will eventually be used to implement the waitlist functionality is currently unknown.  So you'll explore several different specialized data structures before selecting the best one for waitlist. Now you'll work with `Queue`s. 

You will create a `Queue` interface and implement `ArrayQueue` and `LinkedQueue`.  Each concrete class will implement the interface and delegate to either `ArrayList` or `LinkedAbstractList`.


## Create `Queue` Interface
Create a `Queue` interface in the `edu.ncsu.csc216.pack_scheduler.util` package.  `Queue` has a generic type and 5 methods which are described below:

  * `void enqueue(E element)`
     * Adds the element to the back of the Queue
     * If there is no room (capacity has been reached), an `IllegalArgumentException` is thrown
  * `E dequeue()`
     * Removes and returns the element at the front of the Queue
     * If the Queue is empty, an `NoSuchElementException` is thrown
  * `boolean isEmpty()`: Returns true if the Queue is empty
  * `int size()`: Returns the number of elements in the Queue
  * `void setCapacity(int capacity)`
     * Sets the Queue's capacity
     * If the actual parameter is negative or if it is less than the number of elements in the Queue, an 1IllegalArgumentException is thrown
  
Javadoc `Queue`'s methods.


## Create `ArrayQueue` and `LinkedQueue`
Create `ArrayQueue` and `LinkedQueue` in `edu.ncsu.csc216.pack_scheduler.util` package.  Both should implement `Queue`.  Leave the method stubbed out until you have written your unit tests.


## Test!
Create `ArrayQueueTest` and `LinkedQueueTest` in `edu.ncsu.csc216.pack_scheduler.util` package of the `test/` source folder.

Start by writing tests for `ArrayQueueTest`.  When you're done, you can copy them into `LinkedQueueTest` and update the tested object.

Consider the following cases:

  * Inserting a single element into the Queue
  * Inserting multiple elements into the Queue
  * Removing a single element from the Queue
  * Removing multiple elements from the Queue
  * Removing the last element from the Queue
  * Interleaved inserts and removes
  * Attempting to remove an element from an empty Queue
  * Setting the capacity to size
  * Attempting to set the capacity to less than size
  

## Implement `ArrayQueue`
`ArrayQueue` should have a field of type `ArrayList`.  `ArrayQueue` will construct an `ArrayList` and delegate to the `ArrayList`.  

Note that since the current implementation of `ArrayList` does not have a capacity, the capacity functionality will be part of `ArrayQueue`.  DO NOT add capacity to `ArrayList`!


## Implement `LinkedQueue`
`LinkedQueue` should have a field of type `LinkedAbstractList`.  `LinkedQueue` will construct a `LinkedAbstractList` and delegate to the `LinkedAbstractList`.

Since `LinkedAbstractList` does have a capacity, `LinkedQueue` can delegate to `LinkedAbstractList` for the `setCapacity()` implementation.


## Run the Tests
Run your tests and make sure they all pass!  Ensure there are no regressions to existing functionality.


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