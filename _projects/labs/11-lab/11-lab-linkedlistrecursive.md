---
title: CSC 217 Lab 11 - Recursive Linked Lists
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab11]
description: CSC 217 Lab 11 - Implement and Test `LinkedListRecursive`
navigation: on
pagegroup: 11-lab
---

# CSC 217 Lab 11 Implement and Test `LinkedListRecursive`
{% include iconHeader.html type="implementation,unitTest" %}
The [design of the faculty schedule directory functionality](11-lab-design) calls for a custom implementation of a recursive linked list that doesn't allow for null elements or duplicate elements as defined by the `equals()` method.

You will use test driven development to implement the custom `LinkedListRecursive`.  Each section below describes the methods that you will be implementing.

Consider the following questions as you implement `LinkedListRecursive`:

  * What is the base case?
     * An empty list?
     * Examining the first node in the list?
     * Reaching a specific index?
     * When next is null?
  * What happens to the parameters during recursion?
     * Are the same parameters passed for each recursive call?
     * Do the parameters’ values vary on each recursive call?
     * Are any parameters passed?
  * What is the return value?
     * Is the same value, when generated, returned up the call stack?
     * Does the return value build or accumulate as it’s returned up the call stack?
     * Is any value returned?


## Create `LinkedListRecursive` Class
Create `LinkedListRecursive` in the `src/` folder of the `edu.ncsu.csc216.pack_scheduler.util` package.  

`LinkedListRecursive` should have a generic type parameter, `E`.

Add the methods specified in the design and add temporary return values like null or false so that the class compiles.


## Create `LinkedListRecursiveTest` Class
Create `LinkedListRecursiveTest` in the `test/` folder of the `edu.ncsu.csc216.pack_scheduler.util` package.  

Since the `LinkedListRecursiveTest` expected functionality is identical to `LinkedList`'s functionality, you should start from the `LinkedList` tests.  Copy those into `LinkedListRecursiveTest`. 

When testing, you should work with a list of `String`s.  Those will be easier to test that more complex objects like `Course`s.


## Start `ListNode`
`ListNode` is an inner class of `LinkedListRecursive`.  Add the class after the last method but before closing the `LinkedListRecursive` curly brace.  The `ListNode` class header should look like the following:

    private class ListNode { ... }
    
Note that `ListNode`'s class header has no generic type in this implementation.  `ListNode` will use `LinkedListRecursive`'s generic type.  

`ListNode` has two public fields and represents a node in a singly linked list.  Add the fields to the `ListNode` class:

  * `data`: type `E` - the data in the node
  * `next`: type `ListNode` - the next node in the list
  
`ListNode` needs only a single constructor.  Add the constructor to the `ListNode` class.  The constructor should assign the parameter to the associated fields:

  * `ListNode(E data, ListNode next)`
  
Add the methods specified in the design and add temporary return values such as null or false so that the class compiles.
  

## Implement `LinkedListRecursive` State
`LinkedListRecursive` has the following state:

  * `front`: a `ListNode`
  * `size`: the size of the list
  

## Implement `LinkedListRecursive.LinkedListRecursive()`
The constructor of `LinkedListRecursive` should initialize the state to represent an empty list.  That means `front` is `null` and `size` is 0.


## Implement `LinkedListRecursive.size()` and `LinkedListRecursive.isEmpty()`
Implement `size()` to return the `size` field.  `isEmpty()` should return true if `size` is 0.


## Implement `LinkedListRecursive.contains(E)`
You'll start by implementing the functionality that checks if an element already exists in the list.  This will be used when adding to ensure that we have no duplicates.

This implementation will have a public/private pair of methods. The public method is `LinkedListRecursive.contains(E element)` and returns a `boolean`. The `private` method is `ListNode.contains(E element)`. The `public` method handles the special case of an empty list. If the list is not empty, then the `public` method transfers the flow of control to the private `ListNode.contains(E element)` method, which completes the recursion to check the elements in the list.


## Implement `LinkedListRecursive.add(E)`
Next you'll implement the functionality that adds an element to the end of the list.

This implementation will have a public/private pair of methods. The public method is `LinkedListRecursive.add(E element)` and returns a `boolean`. The `private` method is `ListNode.add(E element)`. The `public` method checks that the `element` isn't already in the list (an `IllegalArgumentException` is thrown if the element already exists) and handles the special case of adding a node to an empty list. If the list is not empty, then the `public` method transfers the flow of control to the private `ListNode.add(E element)` method, which completes the recursion to add to element to the end of the list.

Don't forget to increment size on all paths where the `element` is added!


## Implement `LinkedListRecursive.add(int, E)`
Next you'll implement the functionality that adds an element at an index.

This implementation will have a public/private pair of methods. The public method is `LinkedListRecursive.add(int idx, E element)`. The private method is `ListNode.add(int idx, E element)`. The `public`method checks that the `element` isn't already in the list (an `IllegalArgumentException` is thrown if the `element` already exists), handles bounds checking on the index (an `IndexOutOfBoundsException` is thrown for an invalid index), checks that the `element` isn't null (a `NullPointerException` is thrown if `element` is null), and the special case of adding a node to the front of the list. If the element is added to the middle or end of the list, then the `public` method transfers the flow of control to the `private` `ListNode.add(int idx, E element)` method, which completes the recursion to add to element at the appropriate location.

Don't forget to increment size on all paths where the `element` is added!


## Implement `LinkedListRecursive.get(int)`
Next you'll implement the functionality that gets an element at an index.

This implementation will have a public/private pair of methods. The public method is `LinkedListRecursive.get(int idx)`. The private method is `ListNode.get(int idx)`. Both methods return the data in the `ListNode`. The `public` method handles bounds checking on the `index`. Then the public method transfers the flow of control to the `private` `ListNode.get(int idx)` method, which completes the recursion to get to element at the appropriate location.


## Implement `LinkedListRecursive.remove(int)`
Next you'll implement the functionality that removes an element at an index.

This implementation will have a public/private pair of methods. The `public` method is `LinkedListRecursive.remove(int idx)`. The `private` method is `ListNode.remove(int idx)`. Both methods return the data of the removed `ListNode`. The public method handles bounds checking on the `index` and the special case of removing the first node in the list. Then the `public` method transfers the flow of control to the `private` `ListNode.remove(int idx)` method, which completes the recursion to remove to element at the appropriate location. You'll need to look ahead.

Don't forget to decrement size on all paths where the `element` is removed!


## Implement `LinkedListRecursive.remove(E)`
Next you’ll implement the functionality that removes the provided element.

This implementation will have a public/private pair of methods. The `public` method is `LinkedListRecursive.remove(E element)`. The `private` method is `ListNode.remove(E element)`. Both methods return the true if the `element` is removed. The `public` method checks if the `element` is `null`, if the list is empty, and handles the special case of removing the first node in the list. Then the `public` method transfers the flow of control to the `private` `ListNode.remove(E element)` method, which completes the recursion to remove to element at the appropriate location.  You'll need to look ahead.

Don't forget to decrement size on all paths where the `element` is removed!


## Implement `LinkedListRecursive.set(int, E)`
Next you’ll implement the functionality that sets an element at an index.

This implementation will have a public/private pair of methods. The `public` method is `LinkedListRecursive.set(int idx, E element)`. The `private` method is `ListNode.set(int idx, E element)`. Both methods return the `data`previously in the `ListNode`. The `public` method handles bounds checking on the `index`. Then the public method transfers the flow of control to the `private` `ListNode.set(int idx, E element)` method, which completes the recursion to set to element at the appropriate location.


## Test `LinkedListRecursive`
Run your unit tests on `LinkedListRecursive` and ensure they all pass.  

Check your coverage.  Add additional tests to ensure that you fully cover all functionality.


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}


## Check Jenkins
Check your project on Jenkins to ensure that you are making progress.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}