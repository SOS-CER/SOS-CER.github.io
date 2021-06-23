---
title: Guided Project 1 - Software Development Practices and Tools
tags: [software engineering, software lifecycle, CS2, CSC216, GP1]
description: Guided Task - Conclusion
navigation: on
pagegroup: gp1
---

# Guided Task: Conclusion
{% include iconHeader.html type="task,ciTool" %}

A common software engineering practice is [*continuous integration*](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/overview/#continuous-integration). That means developers are continuously committing/pushing their code to version control and evaluating the code by running tests and other analysis tools against their code. The evaluation of the code is typically completed by a continuous integration system, which is a software system that will automatically build, test, run analysis tools (like static analysis), and deploy software. Since this is what the teaching staff does when evaluating your work, we can use a continuous integration system to evaluate your work every time you push to GitHub. That means you should be able to estimate your grade on an assignment from the feedback from Jenkins, the continuous integration server we use for CSC216. On future assignments, Jenkins will also run hidden teaching staff tests and provide you feedback on how well you meet the teaching staff's design!

 
## Check Jenkins Results
You can access the Guided Project and Project Jenkins via https://csc216-jenkins.csc.ncsu.edu/jenkins/. (Labs will have their own Jenkins servers.)  When you log in, your Jenkins job will be listed using the pattern of `GP1-<unityid>`. If you don't see a project, then email the teaching staff!

Learn more about the [Jenkins continuous integration system and how to use it to for feedback and to estimate your grade by reading the Jenkins tutorial](../jenkins/). Your goal is a green ball (no test failures and no static analysis notifications).  

The Jenkins build for Guided Project 1 will copy the provided teaching staff test cases into your project, overwriting the ones that you were provided. This is to make sure that you don't accidentally modify the teaching staff tests through an Eclipse QuickFix. If you did modify a test, that will likely lead to a red ball on Jenkins, which means code didn't compile. You'll want to use the console output (as described in the Jenkins tutorial) on the build to help you find the compiler error.

## Estimate Your Grade Against the Rubric
All assignments have a rubric that you can use to estimate your grade.  Use the Jenkins feedback and your black box test results to [estimate the grade for Guided Project 1](../wolf-scheduler/ws-rubric).  

 
## Final Tasks
Before you complete your final submission to [GitHub](https://github.ncsu.edu), you should ensure the following:

  * You have met the [requirements and design for the `WolfScheduler` project](../wolf-scheduler/ws-requirements)
  * You have a green ball on [Jenkins](http://go.ncsu.edu/jenkins-csc216) (No test failures and no static analysis notifications)
  * All JUnit tests pass with a green bar (0 errors).  There should be no modifications to the teaching staff tests.
  * All [Black Box Tests](gp1-bbtp) pass
  * There are no FindBugs notifications
  * There are no PMD notifications
  * There are no CheckStyle notifications
  * All code is commented with meaningful comments
  * Javadoc webpages are generated with the latest comments
  * That you [meet all rubric items for the assignment](#grading-rubric).

Make sure that all code is pushed to GitHub by the assignment deadline.  There are deductions for any late work up to 48 hours.

## Grading Rubric
{% include iconHeader.html type="rubric" %}

Your Wolf Scheduler Guided Project 1 will be evaluated on the following items:

### Overall Rubric

{% include rubricTable.html project="gp1" grade-category="overall" %} 

### Deductions

{% include deductionsRubricTable.html project="deductions" grade-category="overall" %}

### Javadoc Rubric

{% include javadocRubricTable.html project="javadoc" grade-category="overall" %}

 
{% capture reminder-content %} 
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %} {% include mention.html content=reminder-content type="reminder" title="Reference: Staging and Pushing to GitHub"%} 
## Submit!
{% include iconHeader.html type="glance" %}
Use the feedback from Jenkins to make changes to your code.  Any time you make a change, push to GitHub and check the Jenkins results.

  - [ ] Make sure that all fields, methods, and constructors are commented.
  - [ ] Resolve all static analysis notifications.
  - [ ] Fix test failures.
  - [ ] Commit and push your code changes with a meaningful commit message.  Label your commit with "[Implementation]" for future you!
  - [ ] Check Jenkins results for a green ball!  Fix any Jenkins issues.
