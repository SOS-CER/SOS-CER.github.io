---
title: CSC216 Lab 01 - Installation and Project Creation
tags: [software engineering, software lifecycle, CS2, CSC216, Lab01]
description: CSC216 Lab 01 - Import `PackScheduler` Project
navigation: on
pagegroup: 01-lab
---

# CSC216 Lab 01: Import `PackScheduler` Project
{% include iconHeader.html type="ideTool" %}
The teaching staff have provided a starting Eclipse project for `PackScheduler`.  If you are working individually (Section 701 Distance Students), you only need to complete Steps 1-3 before moving on to the next page.  Students in the on-campus section should complete all steps to ensure that all members of the team have the project in their workspace and connected to the same repository.

**On-campus Students:** Identify which person in the pair is Partner 1 and who is Partner 2.  If you have a team of 3, then two students are Partner 2.


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


## Push to GitHub
**Partner 1:** Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../../git-tutorial/git-staging)
  * [Committing Files](../../git-tutorial/git-commit)
  * [Pushing Files](../../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}


## Check Jenkins
**Partner 1 & 2:** At this point your project will not build on Jenkins.  That is because the basic skeleton provided in the project is not sufficient for the hidden teaching staff tests to compile.  What you want to check for is that your Jenkins job runs.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/#build-summary-page) and use the results to [estimate your grade](../../jenkins/#grade-estimation-example):

  * [Test Results](../../jenkins/#test-results)
  * [FindBugs Report](../../jenkins/#findbugs-report)
  * [CheckStyle Report](../../jenkins/#checkstyle-report)
  * [PMD Report](../../jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}


## Clone and Import
**Partner 2:** You will now clone the lab repository and import the `PackScheduler` project into your workspace.


{% capture callout_content %}
GitHub Resources:

  * [Cloning an Existing Repository](../../git-tutorial/git-clone)
  * [Importing an Existing Project from your Repository](../../git-tutorial/git-import.html)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Cloning and Importing in GitHub" %}

**Partner 2:** Add your name to the author list in one of the files.  Stage, commit, and push your change to GitHub.


## Pull Changes from GitHub
**Partner 1:** Pull your partner's changes from GitHub.


{% capture callout_content %}
GitHub Resources:

  * [Pull Your Remote Repository Contents to Your Local Repository](../../git-tutorial/git-pull)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Pulling in GitHub" %}


## Collaborating in GitHub
Make sure that you are following the [standard Git workflow](../../git-tutorial/git-workflow) when working on teams.  Always commit your changes and then pull the latest changes before starting work.

