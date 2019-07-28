---
title: Guided Project 3 WolfScheduler - Conflict
description: Independent Task - Write and Update Black Box Test Plan
tags: [software engineering, software lifecycle, CS2, CSC216, GP3]
navigation: on
pagegroup: gp3
---

# Independent Task: Write and Update Black Box Test Plan
Test Driven Development (TDD) means that tests are written before code is written.  For system level tests, that means they are written as soon as the requirements are finalized. You will use the [Guided Project 3 Requirements](../wolf-scheduler/ws-requirements) to write additional test cases for the conflict functionality.  Additionally, you will update any test cases that are no longer appropriate once the conflict functionality is added. 

{% capture callout_content %}
  * Write and update black box tests
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}


## Create GP3 BBTP Document
If you don't already have a `project_docs` folder in your `WolfScheduler` project, create it by right clicking on `WolfScheduler` and selecting **New > Folder**. 

You'll start with a copy of the Guided Project 2 Black Box Test Plan that [has been updated with instructions for Guided Project 3](https://docs.google.com/a/ncsu.edu/document/d/1nlA4r6RaMTmbW94F6__qiNGOnbmRVZSAryprbxCRruY/edit?usp=sharing).  Download the document as a Word document by selecting **File > Download > Microsoft Word** in Google Drive.
Save your black box test plan as a Word document (`*.doc` or `*.docx`) in the `project_docs` folder.  


## Add and Modify Tests
Read the `WolfScheduler` requirements.  Do the following tasks to update your black box test plan:

  * Identify any tests that will fail with the conflict requirement fully implemented. Revise or rewrite the test(s).
  * Write 5 additional tests that consider different conflict scenarios.
  

## Push to GitHub
Use the feedback from Jenkins to make changes to your code.  Any time you make a change, push to GitHub and check the Jenkins results.

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content type="reminder" icon="vcTool" title="Reminder: Staging and Pushing to GitHub" %} 