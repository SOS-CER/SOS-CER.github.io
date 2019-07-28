---
title: CSC216 Lab 12 - Graphical User Interfaces
tags: [software engineering, software lifecycle, CS2, CSC216, Lab12]
description: CSC216 Lab 12 - Student Schedule
navigation: on
pagegroup: 12-lab
---

# CSC216 Lab 12 Missing Final Student Schedule Functionality
{% include iconHeader.html type="implementation, systemTest" %}
While [[UC7]](12-lab-requirements.md#uc7) has always been listed in the requirements, it has not yet been implemented in the GUI.  The button for showing the `Student`'s final schedule is in the `StudentRegistrationPanel`, but it is currently disabled.  Implement the functionality in [[UC7]](12-lab-requirements.md#uc7) for extra credit!


## Write Black Box Tests
Write three black box tests for [[UC7]](12-lab-requirements.md#uc7).  Add these tests to your Lab 12 Black Box Test Plan.


## Implement [[UC7]](12-lab-requirements.md#uc7)
Implement UC7.

 
## Test [[UC7]](12-lab-requirements.md#uc7)
Test [[UC7]](12-lab-requirements.md#uc7).  **Record the actual results of execution.**

 
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
If you have test failures, use the feedback from Jenkins to help you resolve the issues. 

{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/jenkins-overview#build-summary-page) and use the results to [estimate your grade](../../jenkins/jenkins-overview#grade-estimation-example):

  * [Test Results](../../jenkins/jenkins-overview#test-results)
  * [FindBugs Report](../../jenkins/jenkins-overview#findbugs-report)
  * [CheckStyle Report](../../jenkins/jenkins-overview#checkstyle-report)
  * [PMD Report](../../jenkins/jenkins-overview#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}
