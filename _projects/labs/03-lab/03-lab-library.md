---
title: CSC 217 Lab 03 - Collections
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab03]
description: CSC 217 Lab 03 - CSC217Collections Library
navigation: on
pagegroup: 03-lab
---
# CSC 217 Lab 03: CSC217Collections Library
The [updated requirements for Lab 03](03-lab-requirements) state that students must be sorted in the student directory.  Your manager has provided a new library for a sorted list: [CSC217Collections.jar](files/CSC217Collections.jar).  You must add this library to your project to 1) test the library to ensure it will help with meeting the requirements and to understand how it works, and 2) integrate the library into the `PackScheduler` project.


## Create a `lib/` Directory
Create a new folder, named `lib/`, in the `PackScheduler` project by right clicking on the project and selecting **New > Folder**.  Name the folder `lib`.  


## Download Library
Download the [CSC217Collections.jar.](files/CSC217Collections.jar) library and save it in the `lib/` folder of your project.  If it doesn't show up in your workspace, right click your project in the **Package Explorer** and select **Refresh**.  Ensure that the jar file is located in the `lib/` directory of `PackScheduler`.


## Add Library to Build Path
Open the `lib/` directory in the **Package Explorer**.  Right click on the CSC217Collections.jar, and select **Build Path > Add to Build Path**.  

After you add the library to the build path, there will be a new listing under the `PackScheduler` project called **Referenced Libraries**.  `CSC217Collections.jar` will be listed there.  You can click the arrows to open up the `SortedList` class and see its methods.  


## Review CSC217Collections API
Since the source isn't provided for the `SortedList` class, you will want to refer to the [`SortedList` API documentation](javadoc/index.html) as you work through Lab 03.


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
Make sure that you have a job and it's pulling from GitHub.  

Your project will have a red ball.  That is because you have not yet completed some of the refactorings that the teaching staff tests expect.  Therefore, the teaching staff tests are currently unable to compile against your code.  


{% capture callout_content %}
Check the following items on Jenkins for [your last build](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#build-summary-page) and use the results to [estimate your grade](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#grade-estimation-example):

  * [Test Results](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#test-results)
  * [Coverage Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#coverage-report)
  * [FindBugs Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#findbugs-report)
  * [CheckStyle Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#checkstyle-report)
  * [PMD Report](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}
