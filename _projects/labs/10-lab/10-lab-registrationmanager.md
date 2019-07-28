---
title: CSC216 Lab 10 - Iterators
tags: [software engineering, software lifecycle, CS2, CSC216, Lab10]
description: CSC216 Lab 10 - Update `RegistrationManager`
navigation: on
pagegroup: 10-lab
---

# CSC216 Lab 10 Update `RegistrationManager`
{% include iconHeader.html type="implementation,unitTest" %}
`RegistrationManager` is expected to maintain a `FacultyDirectory` in addition to the `StudentDirectory` and `CourseCatalog`.  Additionally, that means `Faculty` should be able to log into the system.  The following changes will integrate `FacultyDirectory` into `RegistrationManager`.


## Update `RegistrationManager` State
Add a private field `FacutlyDirectory` to `RegistrationManager` and construct the field in `ReigstrationManager()`.


## Implement `RegistrationManager.getFacultyDirectory()`
Add a method `RegistrationManager.getFacultyDirectory()` that returns the `FacultyDirectory`.


## Update `RegistrationManager.login()`
Update `RegistrationManager.login()` so that a `Faculty` in the `FacultyDirectory` can login.  You may assume that there a `Student` and `Faculty` member will not share an id.  However, if there was an id in common for a `Student` and `Faculty`, then the `User` would default to logging in the `Student` rather than the `Faculty`.


## Update `RegistrationManagerTest`
Add test cases to ensure the new functionality is working correctly and that you have at least 80% statement coverage.


## Update GUI Classes
Update the GUI classes so that your program will compile.

  * [`PackSchedulerGUI` Code](files/PackSchedulerGUI.java)
  * [`CourseCatalogPanel` Code](files/CourseCatalogPanel.java)
  * [`StudentDirectoryPanel` Code](files/StudentDirectoryPanel.java)
  * [`FacultyDirectoryPanel` Code](files/FacultyDirectoryPanel.java)
  * [`StudentRegistrationPanel` Code](files/StudentRegistrationPanel.java)
    

## Pass all Tests
Run all unit tests and ensure that they are all passing and that the teaching staff unit tests are also all passing before moving on.


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


## Check Jenkins
Ensure that your Jenkins job is reflecting the results that you expect for the level of completion of your lab assignment.

{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/#build-summary-page) and use the results to [estimate your grade](../../jenkins/#grade-estimation-example):

  * [Test Results](../../jenkins/#test-results)
  * [FindBugs Report](../../jenkins/#findbugs-report)
  * [CheckStyle Report](../../jenkins/#checkstyle-report)
  * [PMD Report](../../jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}