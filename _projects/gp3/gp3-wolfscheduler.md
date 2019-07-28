---
title: Guided Project 3 WolfScheduler - Conflict
description: Independent Task - Update `WolfScheduler`
tags: [software engineering, software lifecycle, CS2, CSC216, GP3]
navigation: on
pagegroup: gp3
---
# Independent Task: Update `WolfScheduler`
There are several updates required for `WolfScheduler` to work with the `Activity.checkConflict` functionality.  `WolfScheduler` will catch any `ConflictExceptions` and throw `IllegalArgumentException`s out to the client. 

{% capture callout_content %}
  * Refactor `WolfScheduler` to check for conflict
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}

## Update `WolfSchedulerTest`
`WolfScheduler` should check for possible conflicts when `addCourse()` and `addEvent()` are called.  Update `WolfSchedulerTest` to include tests for the conflict functionality.  `WolfScheduler` will catch any `ConflictExceptions` and throw `IllegalArgumentException`s out to the client with appropriate messages for the dialog boxes.

## Run Coverage
Ensure that `WolfScheduler` has 80% or higher statement coverage.  If not, use the coverage feedback to create more high quality tests.

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
{% include callout.html content=callout_content type="reminder" icon="vcTool" title="Reminder: Staging and Pushing to GitHub" %}