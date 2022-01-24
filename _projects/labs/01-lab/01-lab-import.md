---
title: CSC216 Lab 01 - Installation and Project Creation
tags: [software engineering, software lifecycle, CS2, CSC216, Lab01]
description: CSC216 Lab 01 - Import PackScheduler Project
navigation: on
pagegroup: 01-lab
task: 1
---

# CSC216 Lab 01: Import `PackScheduler` Project
{% include iconHeader.html type="ideTool" %}
The teaching staff have provided a starting Eclipse project for `PackScheduler`.  If you are working individually (some students in the async lab sections), you only need to complete Steps 1-3 before moving on to the next page.  Students working on teams should complete all steps to ensure that all members of the team have the project in their workspace and connected to the same repository.

**Collaborating Students:** Identify which person in the pair is Partner 1 and who is Partner 2.  If you have a team of 3, then two students are Partner 2.


## Import Project into Eclipse
**Partner 1:** Complete the following steps to import the `PackScheduler` project into Eclipse:

  * Download [`PackScheduler.zip`](files/PackScheduler.zip).  
  * Start Eclipse.
  * Right click in the **Package Explorer** and select **Import...**
  * Select **General > Existing Projects into Workspace**.  Click **Next >**.

    
{% include image.html file="images/Import1.PNG" caption="Figure: Eclipse Import Project" %} 
    
  * Select the radio button for **Select archive file** and **Browse** for `PackScheduler.zip`.  The project will display in the **Projects** window.  Click **Finish** to import.
  

{% include image.html file="images/Import2.PNG" caption="Figure: Selecting Project to Import" %} 
    
You have been provided a project with enough skeleton code so that it compiles.  You'll complete the code and add more methods throughout the lab.

{% capture reminder-content %} 
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %} {% include mention.html content=reminder-content type="reminder" title="Reference: Staging and Pushing to GitHub"%}
## Push to GitHub
**Partner 1:** Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  


{% capture reminder-content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include mention.html content=reminder-content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}
## Check Jenkins
**Partner 1 & 2:** At this point your project will not build on Jenkins.  That is because the basic skeleton provided in the project is not sufficient for the hidden teaching staff tests to compile.  What you want to check for is that your Jenkins job runs.




{% capture callout_content %}
GitHub Resources:

  * [Cloning an Existing Repository](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-clone)
  * [Importing an Existing Project from your Repository](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-import.html)
{% endcapture %}
{% include mention.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Cloning and Importing in GitHub" %}
## Clone and Import
**Partner 2:** You will now clone the lab repository and import the `PackScheduler` project into your workspace.




**Partner 2:** Add your name to the author list in one of the files.  Stage, commit, and push your change to GitHub.

{% capture callout_content %}
GitHub Resources:

  * [Pull Your Remote Repository Contents to Your Local Repository](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-pull)
{% endcapture %}
{% include mention.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Pulling in GitHub" %}
## Pull Changes from GitHub
**Partner 1:** Pull your partner's changes from GitHub.





## Collaborating in GitHub
Make sure that you are following the [standard Git workflow](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-workflow) when working on teams.  Always commit your changes and then pull the latest changes before starting work.

