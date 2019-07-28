---
title: Guided Project 2 WolfScheduler - Activity and Event
tags: [software engineering, software lifecycle, CS2, CSC216, GP2]
description: Independent Task - Submit Project
navigation: on
pagegroup: gp2
---

# Independent Task: Submit Project
There are a few tasks that you must complete to wrap up Guided Project 2 for grading.

{% capture callout_content %}
  * Run black box tests and fix failures
  * Run static analysis tools and fix notifications
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}


## Run Black Box Tests
Run `WolfSchedulerGUI` and ensure that you pass the extended suite of black box tests for the `WolfScheduler` project.

{% capture callout_content %}
If you need additional help with running `WolfScheduler` in Eclipse, see [Guided Task: Run Black Box Tests](../gp1/gp1-bbtp).
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Running Tests in Eclipse" %}

The [Black Box Test Plan is stored on Google Drive](https://docs.google.com/a/ncsu.edu/document/d/1WFNfjRiCVHksbYfR6ugw1q_9yTvy7Sv87zaFWDY_SUY/edit?usp=sharing).  As part of running your tests, you must report the actual results of execution.  Download the document as a Word document by select **File > Download > Microsoft Word** in Google Drive.  Create a new folder in your `WolfScheduler` project called `project_docs` by right clicking on `WolfScheduler` and selecting **New > Folder**.   Save your black box test plan as a Word document (`*.doc` or `*.docx`) in the `project_docs` folder.  As you run each test, report the results of execution in the black box test plan in the actual results column.  DO NOT record, "Passed" or "Failed."  Instead, describe the results, similar to the provided Expected Results.

Make sure all your black box tests pass!  However, if you run out of time, report the actual results of execution - EVEN IF THEY ARE FAILING! You'll earn some points on the system test portion of the [grading rubric](../wolf-scheduler/ws-rubric#guided-project-2-rubric) for reporting actual, failing results.


## Run Static Analysis Tools
Run FindBugs, PMD, and CheckStyle on your code (if you haven't been already) and remove any notifications.  

{% capture callout_content %}
If you need additional help with running `WolfScheduler` in Eclipse, see [Guided Task: Run Static Analysis Tools](../gp1/gp1-static-analysis).
{% endcapture %}
{% include callout.html content=callout_content icon="saTool" type="reminder" title="Reminder: Running Static Analysis Tools" %}


## Generate Javadoc
If you haven't been commenting your code all along, go back and comment your code with Javadoc.  All classes, methods, and fields should be commented.  If you have been commenting as you have implemented the `Activity` hierarchy, go back and double check that the comments are up to date for the implemented functionality.

Generate Javadoc for `WolfScheduler`.

{% capture callout_content %}
If you need additional help with generating Javadoc for `WolfScheduler` in Eclipse, see [Guided Task: Generate Javadoc](../gp1/gp1-javadoc).
{% endcapture %}
{% include callout.html content=callout_content icon="dtTool" type="reminder" title="Reminder: Generating Javadoc" %}


## Continuous Integration and Automated Grading
As with Guided Project 1, and all programming assignments for CSC216, we are using Jenkins as an automated grading and feedback system.  Check your [Jenkins results](http://go.ncsu.edu/jenkins-csc216) and use them to [estimate your grade against the Guided Project 2 rubric](../wolf-scheduler/ws-rubric#guided-project-2-rubric).

{% capture callout_content %}
If you need additional help understanding Jenkins output, see [CSC216 Basics of Jenkins Guide](../jenkins/).
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Jenkins Feedback" %}


## Final Tasks
Before you complete your final submission to [GitHub](https://github.ncsu.edu), you should ensure the following:

  * You have met the [requirements and design for the `WolfScheduler` project](../wolf-scheduler/ws-requirements#guided-project-2-requirements)
  * You have a green ball on [Jenkins](http://go.ncsu.edu/jenkins-csc216). (No test failures and no static analysis notifications.)
  * All JUnit tests pass with a green bar (0 errors).  There should be no modifications to the teaching staff tests.
  * All [Black Box Tests](https://docs.google.com/a/ncsu.edu/document/d/1WFNfjRiCVHksbYfR6ugw1q_9yTvy7Sv87zaFWDY_SUY/edit?usp=sharing) pass and actual results are reported.
  * There are no FindBugs notifications.
  * There are no PMD notifications.
  * There are no CheckStyle notifications.
  * All code is commented with meaningful comments.
  * Javadoc webpages are generated with the latest comments.
  * That you [meet all rubric items for the assignment](../wolf-scheduler/ws-rubric#guided-project-2-rubric).

Make sure that all code is pushed to GitHub by the assignment deadline.  There are deductions for any late work up to 48 hours.


## Push to GitHub
Before moving to the next portion of the Guided Project, complete the following tasks:

  * Ensure all classes and methods are fully commented, your tests are passing, and you've filled out your black box test plan.
  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  Try writing your own commit message for this push!

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}
