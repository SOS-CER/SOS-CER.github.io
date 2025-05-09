---
title: CSC216 Lab 02 - Software Engineering Best Practices
tags: [software engineering, software lifecycle, CS2, CSC216, Lab02]
description: CSC216 Lab 02 - Deployment
navigation: on
pagegroup: 02-lab
---
# CSC216 Lab 02: Deployment
{% include iconHeader.html type="deployment" %}
When you have deployed your software, you have released it to your customer.  For CSC216, that means your work is ready for evaluation by the teaching staff.  We will evaluate your work against the [Lab 02 rubric](#lab-rubric).  As you compare your submission against the rubric and make your final push to GitHub, you will complete these final tasks:

  * You have met the [requirements](02-lab-requirements) and [design](02-lab-design) for the [Lab 02 `PackScheduler`](../02-lab) project
  * You have a green ball on [your lab section's Jenkins](#lab-deadlines-jenkins-servers) (No test failures and no static analysis notifications)
  * All student unit tests pass with a green bar (0 errors)
  * At least 80% statement coverage on `Student`, `StudentRecordIO`, and `StudentDirectory` (Note you may have a green ball on Jenkins and lose points here.  When grading, we look at each class individually.  Jenkins gives a green ball for an average of 80% statement coverage.  A green ball for coverage does NOT mean full credit for coverage!)
  * All teaching staff JUnit tests pass with a green bar (0 errors)
  * You have run system level black box tests on your submission and reported actual results of execution
  * There are no FindBugs notifications
  * There are no PMD notifications
  * There are no CheckStyle notifications
  * All code is commented with meaningful comments
  * [Javadoc webpages](#generate-javadoc) are generated with the latest comments
  * That you [meet all rubric items for the assignment](#lab-rubric)

Make sure that [all code and other required artifacts are pushed to GitHub](#push-to-github) by the [assignment deadline](#lab-deadlines-jenkins-servers).  [Check your Jenkins results](#check-jenkins) on [your lab's Jenkins server](#lab-deadlines-jenkins-servers)  **Lab assignments will not be accepted late!**


## Lab Deadlines & Jenkins Servers
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section in Fall 2016.


{% capture callout_content %}
You will receive a certificate warning about a self-signed certificate when accessing the Jenkins servers for CSC216.  All of the certificates for CSC216 Jenkins servers were self signed personally by Dr. Heckman.  Please accept the exception each time you visit a Jenkins server.

Also note that permissions to the Jenkins server are at the job level.  If you have no permissions to any job, you will be unable to sign into the Jenkins server.  Once jobs are created,  you will be able to sign in.
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Jenkins Certificate Wranings" %}


{% include lab_deadlines.md mon=site.data.labs.lab02.mon02 tues=site.data.labs.lab02.tues02 wed=site.data.labs.lab02.wed02 %}

## Generate Javadoc
Commenting your code is important! Comments describe what the code is supposed to do. At a minimum, you should comment your classes, fields, and methods. All methods should be Javadoc-ed, including methods that were automatically generated by Eclipse. When working with CSC 216 projects, you should delete any automatically generated non-Javadoc documentation and replace it with Javadoc appropriate for the overridden method.

Java provides the Javadoc tool to generate a set of web pages that display the comments for your code.

We recommend deleting your existing `doc/` directory before generating your Javadoc to ensure that all changes are there.


{% capture callout_content %}
To generate Javadoc, you need to [configure and run the Javadoc tool](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-javadoc#configure-and-run-javadoc-for-your-project), [fix Javadoc errors and warnings](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-javadoc#fix-javadoc-errors-and-warnings), and [check the generated Javadoc pages](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-javadoc#check-generated-javadoc-pages).  Make sure you push your changes to GitHub!
{% endcapture %}
{% include callout.html content=callout_content icon="dtTool" type="reminder" title="Reminder: Generating Javadoc" %}


{% include rubric.md project="lab02" extra-credit="true" %} 

## Push to GitHub
Finalize your submission by pushing all of your code and other project artifacts to [GitHub](https://github.ncsu.edu)

  * Ensure all classes and methods are fully commented and your Javadoc pages are up to date.
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
Ensure that your Jenkins job is reflecting the results that you expect for the level of completion of your lab assignment.

{% capture callout_content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}