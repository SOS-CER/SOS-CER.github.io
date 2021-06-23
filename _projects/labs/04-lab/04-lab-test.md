---
title: CSC 217 Lab 04 - Design
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab04]
description: CSC 217 Lab 04 - Testing
navigation: on
pagegroup: 04-lab
---
# CSC 217 Lab 04: Testing
{% include iconHeader.html type="unitTest,systemTest" %}
As with any software development project, you must test your code to know if it meets the [requirements](04-lab-requirements) and [design](04-lab-design).  You should have been running your tests cases as you integrated the two systems together.  Now, you will focus on unit testing for coverage.


## `PackScheduler` Coverage
Ensure that all non-UI classes have at least 80% statement coverage.  Add any needed high quality tests to cover at least 80% of the statements in non-UI classes.


## System Testing
For the moment, you will forgo system testing.  Since there were no changes to `Student`, `StudentRecordIO`, and `StudentDirectory`, we do expect that your `StudentDirectoryPanel` tests will continue to pass (and you're welcome to run them to make sure they still do).  However, the GUI for the `Course` side of the project has not yet been provided so we will not be evaluating your application at a system test level for Lab 04.


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  
  
Since we can't automate black box tests, you won't need to check Jenkins.  But you should make sure that your Black Box Test Plan was submitted!


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}
