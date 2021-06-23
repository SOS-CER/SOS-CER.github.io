---
title: CSC 217 Lab 06 - Finite State Machines
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab06]
description: CSC 217 Lab 06 - Testing `CourseNameValidatorFSM`
navigation: on
pagegroup: 06-lab
---

# CSC 217 Lab 06 Testing `CourseNameValidatorFSM`
{% include iconHeader.html type="unitTest" %}
The registrar's office has provided an implementation of their internal course validation finite state machine that is implemented using a while-switch idiom.  The implementation is a little long and hard to maintain.  The registrar's office had difficulty modifying the FSM when a forth prefix letter was allowed because of changes in the Physical Education department.  While `PackScheduler` will ultimately implement a state pattern for the course name validation FSM, you can use the provided one from the registrar's office to create a suite of tests for evaluating the state pattern implementation.
  

## Create `CourseNameValidatorFSM`
Create a class `CourseNameValidatorFSM` in the `edu.ncsu.csc216.pack_scheduler.course.validator` package and copy in the provided code.  

  * [`CourseNameValidatorFSM` Code](files/CourseNameValidatorFSM.java)


## Create `CourseNameValidatorFSMTest`
Create a test class `CourseNameValidatorFSMTest` in the `test/` directory in `edu.ncsu.csc216.pack_scheduler.course.validator` package.


## Test `CourseNameValidatorFSM`
Create unit tests for `CourseNameValidatorFSM`.  You will want to test the transition out from each state.  There are three types of input that would lead to transitions: a letter, a digit, and any other character.  The teaching staff recommends that you create a test method for each state and transition type.  Your tests will need to be constructed so that you can reach the state and then transition out of the state for the test.  You should then provide valid characters for the remainder of the string.

For example, a test input for `STATE_LLLL` with a digit transition might be: "CSCA116".  This would result in `isValid()` returning true.

Before moving on, ensure:

  * All your tests pass
  * That you have 100% statement coverage of `CourseNameValidatorFSM`


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
