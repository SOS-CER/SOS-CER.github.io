---
title: CSC216 Lab 12 - Graphical User Interfaces
tags: [software engineering, software lifecycle, CS2, CSC216, Lab12]
description: CSC216 Lab 12 - Write Black Box Tests
navigation: on
pagegroup: 12-lab
---
# CSC216 Lab 12 Write Black Box Tests
{% include iconHeader.html type="systemTest" %}
The new functionality is in the GUI; therefore, you need to define black box tests for [[UC11]](12-lab-requirements#uc11).
  
 
## System Testing and Debugging
[Download a copy of the black box test plan for `PackScheduler` for Lab 12](https://docs.google.com/a/ncsu.edu/document/d/1xe3e0rMHlBt3WVqd0de1yrIEkbcPoubGfayXeaUxqsw/edit?usp=sharing).  Save the black box test plan file in the `project_docs` folder.

**Please use the Lab 12 Black Box Test Plan so that it will be easy for the PTFs to find and grade your assignment with the focus on the Lab 12 functionality.**

Write **three** tests for [[UC11]](12-lab-requirements#uc11).  Each test case should handle a different equivalence class (for example, a test on a faculty without a scheduled course would be in a different equivalence class from a faculty with a scheduled course.)

To simplify the tests that you have to write, a common test initialization has been written for you that included the Registrar steps to add students, faculty, and courses to the system.

You will run your tests on your GUI during and after implementation.

 
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