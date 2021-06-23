---
title: Guided Project 2 WolfScheduler - Activity and Event
tags: [software engineering, software lifecycle, CS2, CSC216, GP2]
description: Independent Task - Update `WolfSchedulerGUI`
navigation: on
pagegroup: gp2
---

# Independent Task: Update `WolfSchedulerGUI`
{% include iconHeader.html type="task" %}

`WolfSchedulerGUI` should be updated to interact with the updated `Event` functionality.


{% capture callout_content %}
  * Update `WolfSchedulerGUI`
{% endcapture %}
{% include callout.html content=callout_content icon="objective" type="learningOutcomes" title="Learning Outcomes" %}


## Update `WolfSchedulerGUI`
[Copy the code from `WolfSchedulerGUI.java`](files/WolfSchedulerGUI.java) into your Eclipse file.  Overwrite the entirety of the old file.


## Run Unit Tests
Run your tests!  If any are still failing, use the debugger to help you find the problem.

{% capture reminder_content %}
[Guided Task: Run System Tests](../gp1/gp1-bbtp).
{% endcapture %}
{% include mention.html content=reminder_content icon="ideTool" type="reminder" title="Reminder: Running Tests in Eclipse" %}
## Run System Tests
Run `WolfSchedulerGUI` and ensure that you pass [the new and updated suite of system tests for the `WolfScheduler` project](https://docs.google.com/document/d/1bqESm2No4IaTP7mC6i1Hd22fSYWjknjJA_K4_XnFzEI/edit?usp=sharing).  As part of running your tests, you must report the actual results of execution.  Download the document as a Word document by select **File > Download > Microsoft Word** in Google Drive.  Create a new folder in your `WolfScheduler` project called `project_docs` by right clicking on `WolfScheduler` and selecting **New > Folder**.   Save your black box test plan as a Word document (`*.doc` or `*.docx`) in the `project_docs` folder.  As you run each test, report the results of execution in the black box test plan in the actual results column.  DO NOT record, "Passed" or "Failed."  Instead, describe the results, similar to the provided Expected Results.

Make sure all your black box tests pass!  However, if you run out of time, report the actual results of execution - EVEN IF THEY ARE FAILING! You'll earn some points on the system test portion of the [grading rubric](#grading-rubric) for reporting actual, failing results.


{% capture reminder-content %} 
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %} {% include mention.html content=reminder-content type="reminder" title="Reference: Staging and Pushing to GitHub"%} 
## Check Your Progress
{% include iconHeader.html type="glance" %}

Complete the following tasks before pushing your work to GitHub.

  - [ ] Make sure that all fields, methods, and constructors are commented.
  - [ ] Resolve all static analysis notifications.
  - [ ] Fix test failures.
  - [ ] Commit and push your code changes with a meaningful commit message.  Label your commit with "[GUI]" and "[Test]" for future you!
  - [ ] Check Jenkins results for a green ball!  Fix any Jenkins issues.
