---
title: Guided Project 3 WolfScheduler - Conflict
description: Independent Task - Submit Project
tags: [software engineering, software lifecycle, CS2, CSC216, GP3]
navigation: on
pagegroup: gp3
---
# Independent Task: Submit Project
There are a few tasks that you must complete to wrap up Guided Project 3 for grading.

{% capture callout_content %}
  * Run static analysis tools and fix notifications
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}
  
## Run Static Analysis Tools
Run FindBugs, PMD, and CheckStyle on your code (if you haven't been already) and remove any notifications.  

{% capture callout_content %}
If you need additional help with running `WolfScheduler` in Eclipse, see [Guided Task: Run Static Analysis Tools](../gp1/gp1-static-analysis).
{% endcapture %}
{% include callout.html content=callout_content type="reminder" icon="saTool" title="Reminder: Running Static Analysis Tools" %}

## Generate Javadoc
If you haven't been commenting your code all along, go back and comment your code with Javadoc.  All classes, methods, and fields should be commented.  If you have been commenting as you have implemented the `Activity` hierarchy, go back and double check that the comments are up to date for the implemented functionality.

Generate Javadoc for `WolfScheduler`.

{% capture callout_content %}
If you need additional help with generating Javadoc for `WolfScheduler` in Eclipse, see [Guided Task: Generate Javadoc](../gp1/gp1-javadoc).
{% endcapture %}
{% include callout.html content=callout_content type="reminder" icon="dtTool" title="Reminder: Running Static Analysis Tools" %}


## Continuous Integration and Automated Grading
As with Guided Projects 1 & 2 and all programming assignments for CSC216, we are using Jenkins as an automated grading and feedback system.  Check your [Jenkins results](http://go.ncsu.edu/jenkins-csc216) and use them to [estimate your grade against the Guided Project 3 rubric](../wolf-scheduler/ws-rubric#guided-project-3-rubric).

{% capture callout_content %}
If you need additional help understanding Jenkins output, see [CSC216 Basics of Jenkins Guide](../jenkins/).
{% endcapture %}
{% include callout.html content=callout_content type="reminder" icon="ciTool" title="Reminder: Jenkins Feedback" %}

## Final Tasks
Before you complete your final submission to [GitHub](https://github.ncsu.edu), you should ensure the following:

  * You have met the [requirements and design for the `WolfScheduler` project](../wolf-scheduler/ws-requirements#guided-project-3-requirements).
  * You have a green ball on [Jenkins](http://go.ncsu.edu/jenkins-csc216). (No test failures and no static analysis notifications.)
  * All JUnit tests pass with a green bar (0 errors).  There should be no modifications to the teaching staff tests.
  * All black box tests pass.
  * There are no FindBugs notifications.
  * There are no PMD notifications.
  * There are no CheckStyle notifications.
  * All code is commented with meaningful comments.
  * Javadoc webpages are generated with the latest comments.
  * That you [meet all rubric items for the assignment](../wolf-scheduler/ws-rubric#guided-project-3-rubric).

Make sure that all code is pushed to GitHub by the assignment deadline.  There are deductions for any late work up to 48 hours.

## Push to GitHub
Before considering your work complete, complete the following tasks:

  * Ensure all classes and methods are fully commented, your tests are passing, and you've filled out your black box test plan.
  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  Try writing your own commit message for this push!

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content type="reminder" icon="vcTool" title="Reminder: Staging and Pushing to GitHub" %}