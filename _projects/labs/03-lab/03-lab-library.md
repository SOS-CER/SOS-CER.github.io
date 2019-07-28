---
title: CSC216 Lab 03 - Collections
tags: [software engineering, software lifecycle, CS2, CSC216, Lab03]
description: CSC216 Lab 03 - CSC216Collections Library
navigation: on
pagegroup: 03-lab
---
# CSC216 Lab 03: CSC216Collections Library
The [updated requirements for Lab 03](03-lab-requirements) state that students must be sorted in the student directory.  Your manager has provided a new library for a sorted list: [CSC216Collections.jar](files/CSC216Collections.jar).  You must add this library to your project to 1) test library to ensure it will help with meeting the requirements and to understand how it works, and 2) integrate the library into the `PackScheduler` project.


## Create a `lib/` Directory
Create a new folder, named `lib/`, in the `PackScheduler` project by right clicking on the project and selecting **New > Folder**.  Name the folder `lib`.  


## Download Library
Download the [CSC216Collections.jar.](files/CSC216Collections.jar) library and save it in the `lib/` folder of your project.  If it doesn't show up in your workspace, right click your project in the **Package Explorer** and select **Refresh**.  Ensure that the jar file is located in the `lib/` directory of `PackScheduler`.


## Add Library to Build Path
Open the `lib/` directory in the **Package Explorer**.  Right click on the CSC216Collections.jar, and select **Build Path > Add to Build Path**.  

After you add the library to the build path, there will be a new listing under the `PackScheduler` project called **Referenced Libraries**.  `CSC216Collections.jar` will be listed there.  You can click the arrows to open up the `SortedList` class and see its methods.  


## Review CSC216Collections API
Since the source isn't provided for the `SortedList` class, you will want to refer to the [`SortedList` API documentation](javadoc/index.html) as you work through Lab 03.


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


## Check Jenkins
Make sure that you have a job and it's pulling from GitHub.  

Your project will have a red ball.  That is because you have not yet completed some of the refactorings that the teaching staff tests expect.  Therefore, the teaching staff tests are currently unable to compile against your code.  


{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/#build-summary-page) and use the results to [estimate your grade](../../jenkins/#grade-estimation-example):

  * [Test Results](../../jenkins/#test-results)
  * [Coverage Report](../../jenkins/#coverage-report)
  * [FindBugs Report](../../jenkins/#findbugs-report)
  * [CheckStyle Report](../../jenkins/#checkstyle-report)
  * [PMD Report](../../jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}
