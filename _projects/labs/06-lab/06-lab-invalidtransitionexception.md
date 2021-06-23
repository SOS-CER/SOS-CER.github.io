---
title: CSC 217 Lab 06 - Finite State Machines
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab06]
description: CSC 217 Lab 06 - `InvalidTransitionException`
navigation: on
pagegroup: 06-lab
---

# CSC 217 Lab 06 `InvalidTransitionException`
{% include iconHeader.html type="implementation" %}
The [updated design](06-lab-design) contains a a new package, `edu.ncsu.csc216.pack_scheduler.course.validator`, and a new exception type, `InvalidTransitionException`.  


## Create `edu.ncsu.csc216.pack_scheduler.course.validator` Package
Since the `*.validator` package is a sub-package to the `*.course` package, do the following:

  * Right click on the `*.course` package
  * Select **New > Package**
  * Add `.validator` to the end of the `edu.ncsu.csc216.pack_scheduler.course` package listed in the New Java Package dialog. 
  * Click **Finish**.
  

## Implement and Test `InvalidTransitionException`
Create a *checked exception* in the `edu.ncsu.csc216.pack_scheduler.course.validator` package named `InvalidTransitionException`. 

The default exception message should be "Invalid FSM Transition.".

Test your new exception to ensure that it works as expected.


{% capture callout_content %}
Use the instructions from [Guided Project 3: Create `ConflictException`](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp3/gp3-conflict-interface#create-conflictexception) to help you with creating a *checked* `InvalidTransitionException`. 

Use the instructions from [Guided Project 3: Implement and Test `ConflictException`](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp3/gp3-conflictexception) to help you with the implementation and testing of the `InvalidTransitionException`.
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Creating and Testing an Exception" %}


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}
