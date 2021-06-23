---
title: CSC 217 Lab 11 - Recursive Linked Lists
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab11]
description: CSC 217 Lab 11 - Update `RegistrationManager`
navigation: on
pagegroup: 11-lab
---

# CSC 217 Lab 11 Update `RegistrationManager`
{% include iconHeader.html type="implementation,unitTest" %}
`Registrar` requires functionality in `RegistrationManager` for assigning a `Faculty` to a `Course`, removing a `Faculty` from a `Course`, and resetting a `Faculty`'s `FacultySchedule`.


## Implement `RegistrationManager.addFacultyToCourse(Course, Faculty)`
If the `currentUser` isn't `null` and is the `Registrar`, the `Faculty`'s `FacultySchedule` should be updated with the given `Course`.  Any exceptions should be propagated to the GUI.


## Implement `RegistrationManager.removeFacultyFromCourse(Course, Faculty)`
If the `currentUser` isn't `null` and is the `Registrar`, the `Faculty`'s `FacultySchedule` should be updated by removing the given `Course`.  Any exceptions should be propagated to the GUI.



## Implement `RegistrationManager.resetFacultySchedule(Faculty)`
If the `currentUser` isn't `null` and is the `Registrar`, the `Faculty`'s `FacultySchedule` should be reset.  Any exceptions should be propagated to the GUI.


## Update `RegistrationManagerTest`
Add test cases to ensure the new functionality is working correctly and that you have at least 80% statement coverage.
    

## Pass all Tests
Run all unit tests and ensure that they are all passing and that the teaching staff unit tests are also all passing before moving on.


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