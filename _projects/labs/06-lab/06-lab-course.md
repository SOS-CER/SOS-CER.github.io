---
title: CSC216 Lab 06 - Finite State Machines
tags: [software engineering, software lifecycle, CS2, CSC216, Lab06]
description: CSC216 Lab 06 - Integrate into `Course`
navigation: on
pagegroup: 06-lab
---

# CSC216 Lab 06 Integrate into `Course`
{% include iconHeader.html type="implementation" %}
Now that the `CourseNameValidator` is complete, the `Course` class should use it to validate course names at construction.  


## Integrate `CourseNameValidator` into `Course`
Follow the [provided design](06-lab-design) to integrate `CourseNameValidator` into the `Course` class.

The introduction of the new course name validation functionality shouldn't lead to the regression of any existing tests unless you specifically tested a string that earlier may have been invalid but is now valid.  If so, update the test to reflect the new requirements. 


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../../git-tutorial/git-staging)
  * [Committing Files](../../git-tutorial/git-commit)
  * [Pushing Files](../../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}
