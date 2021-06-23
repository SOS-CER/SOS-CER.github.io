---
title: CSC 217 Lab 07 - ArrayLists
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab07]
description: CSC 217 Lab 07 - Integrate into `Student`
navigation: on
pagegroup: 07-lab
---

# CSC 217 Lab 06 Integrate into `Student`
{% include iconHeader.html type="implementation,unitTest" %}
Now that the `Schedule` is complete, the `Student` class should use it keep track of a `Student`'s schedule.  


## Integrate `Schedule` into `Student`
Follow the [provided design](07-lab-design) to integrate `Schedule` into the `Student` class.

The introduction of the new schedule functionality shouldn't lead to the regression of any existing tests.  If you do run into any issues, determine if you need to update the tests to meet the new requirements OR if there is a bug in your new code.


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
