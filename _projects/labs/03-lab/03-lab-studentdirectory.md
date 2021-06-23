---
title: CSC 217 Lab 03 - Collections
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab03]
description: CSC 217 Lab 03 - Use `SortedList` in `StudentDirectory`
navigation: on
pagegroup: 03-lab
---

# CSC 217 Lab 03: Use `SortedList` in `StudentDirectory`
{% include iconHeader.html type="implementation,unitTest" %}
`StudentDirectory` maintains the directory of students in sorted order.  So you should update the `studentDirectory` to the type `SortedList<Student>` and refactor the rest of the class to handle the change.


## Refactor `studentDirectory`
Manually change the type of `studentDirectory` from `ArrayList<Student>` to `SortedList<Student>`  Update the construction of `studentDirectory` in the `StudentDirectory()` constructor.

The rest of the compilation errors related to `StudentRecordIO`'s methods should resolve after changing `studentDirectory`'s type.


## Update your Tests
Run your tests.  There is likely at least one failure because of the new sorted order functionality.  Update your tests for the new use case.

Run your tests instrumented for coverage.  Make sure that your tests execute at least 80% of the statements in `StudentDirectory`.  
    

## Javadoc your Code
Update any need Javadoc in `StudentDirectory` and  `StudentDirectoryTest`. 

Run [CheckStyle](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-static-analysis#checkstyle) to ensure that your Javadoc has all elements.

## Removing References to `ArrayList`
Now that we're using the `SortedList` library, all references to `java.util.ArrayList` should be removed from your `PackScheduler` system.  Automated grading on Jenkins will be checking that there are no references to `java.util.ArrayList` in your project.  This is a global check, and will consider ALL files in your project!  If a reference to `java.util.ArrayList` is found, Jenkins will fail the build and not run the teaching staff tests.

So where should you look to remove references to `ArrayList`?

  * Import statements in all classes
  * Source Javadoc that has a link to `java.util.ArrayList`
  * Generated Javadoc that references `java.util.ArrayList`
  
Finding and removing a reference to `java.util.ArrayList` in your generated Javadoc can be tedious.  The easiest way to remove any reference to `java.util.ArrayList` in generated Javadoc is to: 

  1. Remove references to `java.util.ArrayList` in your source code.
  2. Delete your `doc/` folder
  3. Regenerate your Javadoc on your updated code.
  
We want to purge your code of references to `java.util.ArrayList` now because from this point on, you're no longer allowed to use the Java Collections Framework in your code!  One of the learning outcomes in CSC 216 & CSC 217 is to **implement** and **test** your own linear data structures.  Future labs will cover writing your own `ArrayList` and `LinkedList`, which will then be used in `PackScheduler` rather than any Java Collections Framework classes!


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
At this point, your project should build on Jenkins, hopefully with a green ball!  If not, work through Jenkins's feedback to fix any errors with the integration of your code with the provided code.  All tests should be passing before you walk through the GUI.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [Coverage Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#coverage-report)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}