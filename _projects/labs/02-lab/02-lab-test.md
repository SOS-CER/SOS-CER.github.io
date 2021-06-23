---
title: CSC216 Lab 02 - Software Engineering Best Practices
tags: [software engineering, software lifecycle, CS2, CSC216, Lab02]
description: CSC216 Lab 02 - System Testing
navigation: on
pagegroup: 02-lab
---
# CSC216 Lab 02: System Testing
{% include iconHeader.html type="systemTest" %}
As with any software development project, you must test your code to know if it meets the [requirements](01-lab-requirements) and [design](01-lab-design).  You have now written unit tests for `Student`, `StudentRecordIO`, and `StudentDirectory` and achieved at least 80% statement coverage (hopefully more).  Now, you need to incorporate the GUI and complete system level testing to ensure that the full program meets the requirements.


## Bug Fixes in `StudentDirectoryPanel`
For the Javadoc error, either 

  * Replace `{@link Student}` with `Student`
  * Or import `edu.ncsu.csc216.pack_scheduler.user.Student`


## Create Folder for System Test Plan
Create a folder called `project_docs` in your `PackScheduler` project.  You will use this folder to hold documentation artifacts associated with `PackScheduler`.


## Download the System Test Plan Template
A [template Black Box Test Plan is available on Google Drive](https://docs.google.com/a/ncsu.edu/document/d/1FsvIFk8DG1ZNk2qmKltdOwx9uj6bAK940amzB3qtkRM/edit?usp=sharing).  Download the document as a Word document by selecting **File > Download > Microsoft Word** in Google Drive.  Copy the file into the `project_docs` folder and name it `StudentDirectory_STP.docx`.  

The lab machines should have Microsoft Office installed locally.  If you're working at home, you can use [Office 365 through NCSU](https://oit.ncsu.edu/my-it/hardware-software/software/office-365/) to edit the document in Microsoft Word.  The document must be in Word format (*.docx) so that PTFs have the option of providing commented feedback. 


## Write System Tests
Write at least 15 black box tests for the `StudentDirectory` portion of `PackScheduler`.  Each test should consider a different equivalence class or boundary value (which should be labeled under the Test ID).  Remember to use repeatable and specific values.  

Any new input or expected output files should be created and placed in your `test-files/` directory so the teaching staff can run your tests. 

Actual results of execution MUST be reported for full credit.


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  
  
Since we can't automate black box tests, you won't need to check Jenkins.  But you should make sure that your Black Box Test Plan was submitted!


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}
