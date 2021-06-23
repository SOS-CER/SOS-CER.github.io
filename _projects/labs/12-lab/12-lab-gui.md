---
title: CSC 217 Lab 12 - Graphical User Interfaces
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab12]
description: CSC 217 Lab 12 - FacultySchedule GUI
navigation: on
pagegroup: 12-lab
---

# CSC 217 Lab 12 FacultySchedule GUI
{% include iconHeader.html type="implementation, systemTest" %}
Add a GUI for [[UC26]](12-lab-requirements#uc26) so that a faculty user can see their schedule and the course roll of registered students.  Use the [design](12-lab-design) for guidance.

 
## Create `FacultySchedulePanel`
`FacultySchedulePanel` (or another name of your choosing) will contain the authenticated faculty's schedule and space for course details and a listing of the course roll.  A screenshot of the teaching staff GUI is provided as a suggestion, but you may design the panel as you want (as long as it's easy to grade!).

{% include image.html file="images/FacultySchedulePanel.PNG" caption="Figure: Lab 12 FacultySchedulePanel in PackScheduler" %} 

Parts of the functionality that you need are found in `StudentRegistrationPanel`, `StudentDirectoryPanel`, and `CourseCatalogPanel`.  You may pull code from there to help you with your implementation, but you will need to customize to the specifics of displaying a `FacultySchedule` and `CourseRoll`.

The teaching staff recommend that you create the layout first (and the connection in `PackSchedulerGUI` -- see next step) first and then integrate in the controller portions.

**** CourseRoll.getRoll()
     
 
## Update `PackSchedulerGUI`
You will need to connect `PackScheduleGUI` to `FacultySchedulePanel` so that you can test it.  The connection is similar to the connection between `PackScheduleGUI` and `StudentRegistrationPanel`.  Use that for guidance.

 
## Testing the New Functionality
Run your black box tests on the new functionality.  **Record the actual results of execution.**

 
## Javadoc your Code
Javadoc your classes and methods. 

Run [CheckStyle](../../gp1/gp1-static-analysis#checkstyle) to ensure that your Javadoc has all elements.

 
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


## Check Jenkins
If you have test failures, use the feedback from Jenkins to help you resolve the issues. 

{% capture callout_content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}