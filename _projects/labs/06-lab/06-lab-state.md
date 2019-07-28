---
title: CSC216 Lab 06 - Finite State Machines
tags: [software engineering, software lifecycle, CS2, CSC216, Lab06]
description: CSC216 Lab 06 - Implementing `CourseNameValidator`
navigation: on
pagegroup: 06-lab
---

# CSC216 Lab 06 Implementing `CourseNameValidator`
{% include iconHeader.html type="implementation" %}
The design of the course name validation functionality calls for `CourseNameValidator` to be implemented using the **State Pattern**.  The state pattern is an object-oriented way to implement an FSM, where each state is its own object and behaviors are defined for each input type.

The provided design provides four states: `InitialState`, `LetterState`, `DigitState` and `SuffixState,` all of which implement the `State` abstract class.  All are *inner classes* of `CourseNameValidator` since there is no need to expose them to the client.  

You MAY implement your state pattern using more states (for example, one state for each letter, digit, etc. as demonstrated in the `CourseNameValidatorFSM` while-switch implementation).  You may not use fewer than the suggested four states. 


{% capture callout_content %}
Inner or nested classes are classes that are defined within an enclosing class. An inner class implies that the class is only used in the context of the enclosing class; the enclosing class controls the lifecycle of the inner class.  An inner class is a mechanism for encapsulating an entire class from a client.

For more information on inner classes see:

  * [Dr. Heckman's lecture notes on inner classes (starts on Page 3 with slide 6)](https://www.csc.ncsu.edu/courses/csc216-common/Heckman/lectures/13_InnerClasses_Iterators.pdf)
  * [Dr. Perry's notes on nested classes](https://courses.ncsu.edu/csc216/lec/601/wrap/lectures/9_0_inner_classes.html)
{% endcapture %}
{% include callout.html content=callout_content icon="plTool" type="reminder" title="Reminder: Inner or Nested Classes" %}


## Create `CourseNameValidator` Class
Create `CourseNameValidator` in the `src/` folder of the `edu.ncsu.csc216.pack_scheduler.course.validator` package.  

Add the method `isValid()` to `CourseNameValidator`.  `isValid()` accepts a `String` parameter and returns a `boolean`.  The method should initially return `false` so the method will compile.


## Create `CourseNameValidatorTest` Class
Create `CourseNameValidatorTest` in the `src/` folder of the `edu.ncsu.csc216.pack_scheduler.course.validator` package.  Do so by copying `CourseNameValidatorFSMTest` and naming the copy `CourseNameValidatorTest`.  Then update the references to `CourseNameValidatorFSM` to `CourseNameValidator`.

Run your new test class.  Most if not all of the tests should fail.  If they all pass, check that all references to `CourseNameValidatorFSM` were removed.


## Implement `State` Class
Create the `State` abstract class as an inner class of `CourseNameValidator`.

`State` has three methods:

  * `onLetter()`: abstract method for handling a letter input
  * `onDigit()`: abstract method for handling a digit input
  * `onOther()`: concrete method for handling any other input.  It should throw an `InvalidTransitionException` with the message "Course name can only contain letters and digits."
  

## Implement Concrete States
Create each concrete state as an inner class of `CourseNameValidator`.  Each concrete class should extend the `State` abstract class and provide an implementation for `onLetter()` and `onDigit()`.  You may use `CourseNameValidatorFSM` to help you with your implementation.

If you decide to do the four-state implementation, note that you will have to keep track of the number of letters and digits that you have.  Counts should be stored as field in `CourseNameValidator` so that all inner classes can access and modify the fields.  Constants in the `LetterState` and `DigitState` classes provide the cutoffs for the number of letter and digits.  By using constants, you can quickly update the FSM if the number of allowed letters or numbers was to ever change.


## Implement Context Class
`CourseNameValidator` is the context class of the state pattern.  The `isValid()` method will identify the next character of input and then call the appropriate method on the `currentState`.  Implement `isValid()` to complete the state pattern.


## Test `CourseNameValidator`
Run `CourseNameValidatorTest` against `CourseNameValidator` to ensure that your FSM is implemented correctly.  Use the debugger to help you resolve any issues with your implementation.  

You should have over 95% coverage on `CourseNameValidator` with existing tests.  


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../../git-tutorial/git-staging)
  * [Committing Files](../../git-tutorial/git-commit)
  * [Pushing Files](../../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}
