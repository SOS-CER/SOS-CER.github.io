---
title: CSC 217 Lab 08 - LinkedAbstractList
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab08]
description: CSC 217 Lab 08 - Implement and Test Custom `LinkedAbstractList`
navigation: on
pagegroup: 08-lab
---
# CSC 217 Lab 08 Implement and Test Custom `LinkedAbstractList`
{% include iconHeader.html type="implementation,unitTest" %}
The design of the course roll functionality calls for a custom implementation of an array list that doesn't allow for null elements or duplicate elements as defined by the `equals()` method, and has a capacity.  

You will use test driven development to implement the custom `LinkedAbstractList`.  This utility class is named `LinkedAbstractList` since it will extend `AbstractList`.  Later you will implement a `LinkedList` class that extends `AbstractSequentialList`, which is the more correct implementation.  But for now, you'll focus on the main linked list functionality by extending `AbstractList`.  Each section below describes the methods that you will be implementing.


## Create `LinkedAbstractList` Class
Create `LinkedAbstractList` in the `src/` folder of the `edu.ncsu.csc216.pack_scheduler.util` package.  

`LinkedAbstractList` should extend `java.util.AbstractList` and should have a generic type parameter, `E`.


## Create `LinkedAbstractListTest` Class
Create `LinkedAbstractListTest` in the `test/` folder of the `edu.ncsu.csc216.pack_scheduler.util` package.  

Since the `LinkedAbstractList` implementation is very similiar to `ArrayList`'s implementation, you should start from the `ArrayList` tests.  Copy those into `LinkedAbstractListTest`.  The one difference is that `LinkedAbstractList` has a capacity.  Update your tests to handle a capacity.

When testing, you should work with a list of `String`s.  Those will be easier to test that more complex objects like `Course`s.


## Implement `ListNode`
`ListNode` is an inner class of `LinkedAbstractList`.  Add the class after the last method but before closing the `LinkedAbstractList` curly brace.  The `ListNode` class header should look like the following:

    private class ListNode { ... }

`ListNode` has two private fields.  Add the fields to the `ListNode` class:

  * `data`: type `E` - the data in the node
  * `next`: type `ListNode` - the next node in the list
  
`ListNode` has two constructors.  Add the constructors to the `ListNode` class.  They should assign the parameter to the associated fields:

  * `ListNode(E data)`
  * `ListNode(E data, ListNode next)`


## Implement `LinkedAbstractList` State
`LinkedAbstractList` has the following state:

  * `front`: a `ListNode` of type `E`
  * `size`: the size of the list
  * `capacity`: the capacity of the list
  

## Test and Implement `LinkedAbstractList.LinkedAbstractList()`
The constructor of `LinkedAbstractList` should initialize the state.  `front` will be `null`, `size` will be 0, and `capacity` will be assigned the parameter value if the parameter is greater than or equal to 0.  If the parameter is less than 0, throw an `IllegalArgumentException`.  If the `capacity` is less than the current list's `size`, throw an `IllegalArgumentException`.


## Implement `LinkedAbstractList.add(int, E)`
Update tests for `LinkedAbstractList.add(int, E)`.  Elements cannot be added to the list once the capacity is reached. You should implement `LinkedAbstractList.get()` so that you can test the contents of the list after adding elements.

Override and implement the `LinkedAbstractList.add(int, E)` method that will add the element to the given index.  Update the references as appropriate.  If the size is equal to the capacity, the list throw an `IllegalArgumentException`.  

If the element to add is null, the method should throw a `NullPointerException`.

If the element to add is a duplicate of an element already in the list as determined by the `equals()` method, the method should throw an `IllegalArgumentException`.  

If the index is out of range (`index < 0 || index > size()`), the method should throw an `IndexOutOfBoundsException`.


## Implement `LinkedAbstractList.remove(int)`
Override and implement the `LinkedAbstractList.remove(int)` method so that it will remove elements at the given index.  The removed element, of type `E` should be returned.  If the first or only element is removed, update the `front` reference.  Otherwise, update references to go around the removed element.

If the index is out of range (`index < 0 || index >= size()`), the method should throw an `IndexOutOfBoundsException`.


## Implement `LinkedAbstractList.set(int, E)`
Override and implement the `LinkedAbstractList.set(int, E)` method so that the element at the specified index is replaced with the given element.  The overwritten element, of type `E` should be returned.

If the element to set is null, the method should throw a `NullPointerException`.

If the element to set is a duplicate of an element already in the list as determined by the `equals()` method, the method should throw an `IllegalArgumentException`.  

If the index is out of range (`index < 0 || index >= size()`), the method should throw an `IndexOutOfBoundsException`.


## Implement `LinkedAbstractList.get(int)`
Override and implement the `LinkedAbstractList.get(int)` method so that it will return the element, of type `E` at the given index.  

If the index is out of range (`index < 0 || index >= size()`), the method should throw an `IndexOutOfBoundsException`.


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