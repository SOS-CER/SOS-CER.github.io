---
title: CSC 217 Lab 07 - ArrayLists
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab07]
description: CSC 217 Lab 07 - Implement and Test Custom `ArrayList`
navigation: on
pagegroup: 07-lab
---

# CSC 217 Lab 07 Implement and Test Custom `ArrayList`
{% include iconHeader.html type="implementation,unitTest" %}
The design of the student schedule functionality calls for a custom implementation of an array list that doesn't allow for null elements or duplicate elements as defined by the `equals()` method.  

You will use test driven development to implement the custom `ArrayList`.  Each section below describes the methods that you will be implementing.


## Create `edu.ncsu.csc216.pack_scheduler.util` Package
Create the `edu.ncsu.csc216.pack_scheduler.util` package in the `src/` folder of `PackScheduler`.


## Create `ArrayList` Class
Create `ArrayList` in the `src/` folder of the `edu.ncsu.csc216.pack_scheduler.util` package.  

`ArrayList` should extend `java.util.AbstractList` and should have a generic type parameter, `E`.  Your class header should look like the following:

```java
public class ArrayList<E> extends AbstractList<E> {
```


## Create `ArrayListTest` Class
Create `ArrayListTest` in the `test/` folder of the `edu.ncsu.csc216.pack_scheduler.util` package.  You will need to create the `edu.ncsu.csc216.pack_scheduler.util` package in the `test/` source folder.

When testing, you should work with a list of `String`s.  Those will be easier to test that more complex objects like `Course`s.


## Implement `ArrayList` State
`ArrayList` has the following state:

  * `INIT_SIZE`: a constant value for initializing the list size.  The value should be 10.
  * `list`: an array of type `E`
  * `size`: the size of the list
  

## Test and Implement `ArrayList.ArrayList()`
Write a test for `ArrayList`'s constructor.  You should implement `ArrayList.size()` to help with testing the constructor.

The constructor of `ArrayList` should create an empty `ArrayList` (e.g., `size` is zero) with a `list` of capacity `INIT_SIZE`.  Remember, you cannot directly construct an array of type `E`.  Instead you have to create an array of `Object`s and cast to an array of type `E`.  You may add the annotation `@SuppressWarnings("unchecked")` above the constructor to remove the warning about an unchecked cast.


## Implement `ArrayList.add(int, E)`
Write tests for `ArrayList.add(int, E)`.  You should implement `ArrayList.get()` so that you can test the contents of the list after adding elements.

Override and implement the `ArrayList.add(int, E)` method that will add the element to the given index.  If the element is inserted at the front or the middle of the list, the other elements are shifted to make room.  If the size is equal to the capacity, the list should automatically double in capacity to make room for the new element.  The private method `growArray()` is used to double the capacity.  You may create a private method or implement the grow functionality in the `add()` method.

If the element to add is null, the method should throw a `NullPointerException`.

If the element to add is a duplicate of an element already in the list as determined by the `equals()` method, the method should throw an `IllegalArgumentException`.  

If the index is out of range `(index < 0 || index > size())`, the method should throw an `IndexOutOfBoundsException`.


## Implement `ArrayList.remove(int)`
Write tests for `ArrayList.remove(int)`.  `ArrayList.remote(int)` should return the element removed and the return type should be `E`.

Override and implement the `ArrayList.remove(int)` method so that it will remove elements at the given index.  If an element at the front or middle of the list is removed, the elements are left shifted to close the gap.  Don't forget to set the element at `size-1` to null after the left shift to remove the extra reference.

If the index is out of range `(index < 0 || index >= size())`, the method should throw an `IndexOutOfBoundsException`.


## Implement `ArrayList.set(int, E)`
Write tests for `ArrayList.set(int, E)`.  `ArrayList.set(int, E)` should return the original element at the location and the return type should be `E`.

Override and implement the `ArrayList.set(int, E)` method so that the element at the specified index is replaced with the given element.

If the element to set is null, the method should throw a `NullPointerException`.

If the element to set is a duplicate of an element already in the list as determined by the `equals()` method, the method should throw an `IllegalArgumentException`.  

If the index is out of range `(index < 0 || index >= size())`, the method should throw an `IndexOutOfBoundsException`.


## Implement `ArrayList.get(int)`
Write tests for `ArrayList.get(int)` that consider when the index is out of range.  `ArrayList.get(int)` returns the element at the index and the return type is `E`.

Override and implement the `ArrayList.get(int)` method so that it will return elements at the given index.  

If the index is out of range `(index < 0 || index >= size())`, the method should throw an `IndexOutOfBoundsException`.


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
