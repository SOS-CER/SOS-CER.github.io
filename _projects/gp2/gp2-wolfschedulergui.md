---
title: Guided Project 2 WolfScheduler - Activity and Event
tags: [software engineering, software lifecycle, CS2, CSC216, GP2]
description: Independent Task - Update `WolfSchedulerGUI`
navigation: on
pagegroup: gp2
---

# Independent Task: Update `WolfSchedulerGUI`
`WolfSchedulerGUI` should be updated to interact with the updated `Event` functionality.


{% capture callout_content %}
  * Update `WolfSchedulerGUI`
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}


## Update `WolfSchedulerGUI`
[Copy the code from `WolfSchedulerGUI.java`](files/WolfSchedulerGUI.java) into your Eclipse file.  Overwrite the entirety of the old file.


## Run Unit Tests
Run your tests!  If any are still failing, use the debugger to help you find the problem.


## Run System Tests
Run `WolfSchedulerGUI` and ensure that you pass [the new and updated suite of black box tests for the `WolfScheduler` project](https://docs.google.com/a/ncsu.edu/document/d/1WFNfjRiCVHksbYfR6ugw1q_9yTvy7Sv87zaFWDY_SUY/edit?usp=sharing). As part of running your tests, you must report the actual results of execution.   

Make sure all your black box tests pass!  However, if you run out of time, report the actual results of execution - EVEN IF THEY ARE FAILING! You'll earn some points on the system test portion of the [grading rubric](../wolf-scheduler/ws-rubric#guided-project-2-rubric) for reporting actual, failing results.

{% capture callout_content %}
If you need additional help with running `WolfScheduler` in Eclipse, see [Guided Task: Run Black Box Tests](../gp1/gp1-bbtp).
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Running Tests in Eclipse" %}


## Push to GitHub
Use the feedback from Jenkins to make changes to your code.  Any time you make a change, push to GitHub and check the Jenkins results.

  * Ensure tests are passing, Javadoc is generated, and all static analysis notifications are removed.
  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  Try writing your own commit message for this push!

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %} 
