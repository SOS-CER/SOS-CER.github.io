---
title: CSC 217 Lab 06 - Finite State Machines
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab06]
description: CSC 217 Lab 06 - Course Name Finitie State Machine
navigation: on
pagegroup: 06-lab
---

# CSC 217 Lab 06 Course Name Finite State Machine
{% include iconHeader.html type="design" %}
The university registrar has refined the rules for identifying a valid course name in the `PackScheduler` system.  The rules can be modeled as a finite state machine.  You'll start the process of adding the updated course name functionality by first designing the finite state machine that identifies a correct course name.


## Design FSM
Draw a finite state machine that identifies if a course name string is valid or invalid.  

**A valid course name begins with 1-4 letters, followed by exactly 3 digits, followed by an optional 1 letter suffix.  If a course name doesn't meet the description, the course name is invalid.**  Spaces are no longer allowed between the prefix and number.

There are several tools that you may use to design your FSM:

  * [Finite State Machine Designer](http://madebyevan.com/fsm/) - recommended for use, you'll need to screenshot the FSM and save as an image file.
  * [UMLetino](http://www.umlet.com/umletino/umletino.html)
     * There's a drop down menu in the upper right where the icons are.  Select UML State Machine.  
     * The final/end states are represented with the solid circle surrounded with another circle rather than the state circle.
  * Dia
  

## FSM Inspection
As you design your FSM, you should consider the following questions:

  * How did you determine the state to include in your diagram?
  * Did you include a start state?  A final/end state?  (If you didn't, you should.)
  * How did you determine what transitions to include in your diagram?
  * Go through the course names in your class schedule.  Would your FSM consider them valid?
  * What are some invalid course names that you could use for testing?
  * How will you handle cases when the user enters a non-alphanumeric character?  (for example, CSC2!6)
  

## Save FSM
Export or save your FSM as an image file.  Include it in the `project_docs` directory of `PackScheduler`.

Note that as you continue working on the lab, you may want to refine your FSM.  You are welcome to do so throughout the lab.


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
