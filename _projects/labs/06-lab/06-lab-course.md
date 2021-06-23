---
title: CSC 217 Lab 06 - Finite State Machines
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab06]
description: CSC 217 Lab 06 - Integrate into `Course`
navigation: on
pagegroup: 06-lab
---

# CSC 217 Lab 06 Integrate into `Course`
{% include iconHeader.html type="implementation" %}
Now that the `CourseNameValidator` is complete, the `Course` class should use it to validate course names at construction.  


## Integrate `CourseNameValidator` into `Course`
Follow the [provided design](06-lab-design) to integrate `CourseNameValidator` into the `Course` class.

## Update Tests!
With the new `CourseNameValidator` functionality, and no longer allowing any spaces in course names, you'll need to update the tests for `Course` and other classes in your `PackScheduler` system.

You can use the [updated `course_records.txt` file](files/course_records.txt) to test your code. The changes should only require removing the space from between the leading prefix and the ending number. 


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
