---
title: CSC 217 Lab 12 - Graphical User Interfaces
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab12]
description: CSC 217 Lab 12 - Student Schedule
navigation: on
pagegroup: 12-lab
---

# CSC 217 Lab 12 Missing Final Student Schedule Functionality
{% include iconHeader.html type="implementation, systemTest" %}
While [[UC17]](12-lab-requirements#uc17) has always been listed in the requirements, it has not yet been implemented in the GUI.  The button for showing the `Student`'s final schedule is in the `StudentRegistrationPanel`, but it is currently disabled.  Implement the functionality in [[UC17]](12-lab-requirements#uc17) for fun!


## Write Black Box Tests
Write three black box tests for [[UC17]](12-lab-requirements#uc17).  Add these tests to your Lab 12 Black Box Test Plan.


## Implement [[UC17]](12-lab-requirements#uc17)
Implement UC17.

 
## Test [[UC1]](12-lab-requirements#uc17)
Test [[UC1]](12-lab-requirements#uc17).  **Record the actual results of execution.**

 
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
If you have test failures, use the feedback from Jenkins to help you resolve the issues. 

{% capture callout_content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}
