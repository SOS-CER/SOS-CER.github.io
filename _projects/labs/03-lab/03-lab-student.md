---
title: CSC 217 Lab 03 - Collections
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab03]
description: CSC 217 Lab 03 - Implement `Comparable` in `Student`
navigation: on
pagegroup: 03-lab
---
# CSC 217 Lab 03: Implement `Comparable` in `Student`
{% include iconHeader.html type="implementation,unitTest" %}
Since the [updated requirements](03-lab-requirements) state that `Student`s must be stored in the directory in sorted order by last name, first name, and then unity id, you need to define the functionality for ordering `Student`s.  The `SortedList` implementation requires that elements implement the `Comparable` interface so that elements are added to the list in sorted order. 


## Implement `Comparable` Interface
Add the statement `implements Comparable<Student>` to the `Student` class header.  

The `Comparable` interface is a generic interface, which means that a type must be specified when used.  Since you are implementing `Comparable` in `Student`, the compared type is `Student` and that is used as the generic type.  

There will be a compiler error after adding the `implements` statement and importing `Comparable`.  Use Eclipse's Quick Fix to add the unimplemented method `compareTo()` to `Student`.  The method signature should be:

```java
public int compareTo(Student s)
```    

## Test `compareTo()`
Test that the `compareTo()` method works correctly by adding a new test method to `StudentTest`.  `Student`s should be ordered by last name, then first name, then their unity id.  [Use the documentation for the `Comparable.compareTo()` method to write tests for `Student.compareTo()`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#compareTo(T)).  Your tests will initially fail.


## Implement `compareTo()`
Implement the `compareTo()` method to pass your unit tests.  You may need to iterate on the tests and implementation until you are done.


## Run your Tests
Run your tests instrumented for coverage.  Make sure that your tests execute at least 80% of the statements in `Student` and that there are no regressions in functionality due to adding the new `compareTo()` method.  


## Javadoc your Code
Make sure that you update the Javadoc in the `Student` and `StudentTest` classes.  

Run [CheckStyle](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-static-analysis#checkstyle) to ensure that your Javadoc has all elements.

We do expect that all test classes are commented!


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
Make sure that you have a job and it's pulling from GitHub.

Your project will have a red ball.  That is because you have not yet completed some of the refactorings that the teaching staff tests will expect.  Therefore, the teaching staff tests are unable to compile against your code.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [Coverage Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#coverage-report)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}
