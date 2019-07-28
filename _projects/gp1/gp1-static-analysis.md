---
title: Guided Project 1 WolfScheduler - Course and Schedule
tags: [software engineering, software lifecycle, CS2, CSC216, GP1]
description: Guided Task - Run Static Analysis Tools
navigation: on
pagegroup: gp1
---
# Guided Task: Run Static Analysis Tools
{% include iconHeader.html type="saTool" %}

There are many potential things that can be done incorrectly when programming large applications. The compiler reveals syntactical mistakes in your code. However, once code compiles there can be other potential problems. Program analysis tools, like static analysis tools, can help you identify problems with your code early. Static analysis is the evaluation of your source code without execution. This is beneficial since errors may be found in places that are not executed during automated testing, but a limitation is that the analysis is complex and some notifications may not be important or really a problem.

You will use three different static analysis tools to find potential problems in your code. The reason for three static analysis tools is that each tool has an area of specialization. Those three tools are:

  * **FindBugs**: FindBugs finds potential security vulnerabilities and dangerous code patterns that may lead to runtime exceptions.
  * **PMD**: PMD can find some code problems and style issues. You'll focus on using PMD for finding style problems and incorrect JUnit tests.
  * **CheckStyle**: CheckStyle finds problems with style issues: naming, indentation, commenting, etc.
  
You will use static analysis tools to help remember good style and prevent careless mistakes while developing software.  These tools will need to be configured for each project and they may be set up to run automatically with every save.  

Any unaddressable static analysis notifications, unless otherwise allowed by the teaching staff, will result in a deduction from your [style grade](../wolf-scheduler/ws-rubric).  Make sure that you are using the CheckStyle and PMD configuration files for this class (details are in [CSC216 Environment Setup - PMD and CheckStyle Settings](../install/install-overview#pmd-and-checkstyle-settings)). If you are not using the provided style files, PMD and CheckStyle will generate an *abundance* of additional notifications on items that the teaching staff does not require you to fix.

 
## FindBugs
You will need to configure FindBugs for each project and then run using the instructions below. You should remove all notifications that are labeled **Scariest** and **Scary** before submitting your code. This will prevent potential silly mistakes.

 
### Configure FindBugs
Do the following to configure FindBugs for your project:

  * Right click on the project and select **Properties > FindBugs**.
  * Check the boxes labeled **Enable project specific settings**, **Run automatically**, and **(also on full build)**.
  * In the **Reporter Configuration** tab, move the slider all the way to the right so that the text **9 (Scary)** is listed below the slider.
  * Leave the default selection of **Reported (visible) bug categories** (Bad practice, Correctness, Performance, Dodgy code, and Multithreaded correctness).
  * Select the drop down boxes next to **Scariest** and **Scary** to contain **Error**.
  * Click **OK**.
  * Click **OK** on the pop-up box about **Full FindBugs build required**.

 
### Run FindBugs
Do the following to run FindBugs on your project:

  * Right click on the project and select **FindBugs > FindBugs**.

The counts of the number of FindBugs notifications will be in parentheses next to each project, package, and class. Details about the notifications will be listed in the **Problems** view of the Java perspective.

Selecting a notification in the **Problems** view will take you to the associated line of code in the editor. Selecting the notification icon in the left gutter of the editor will open a **Bug Info** view that will provide additional details about the notification.

 
## Run PMD
Do the following to run PMD on your project:

  * Right click on the project and select **PMD > Check Code**. This will run PMD on your code.

After PMD runs, you will automatically switch to the **PMD perspective**, where you can browse the PMD results. (Switch back to the **Java perspective** by clicking the **Java perspective** icon in the upper right of the workbench.) You can also look at the PMD results in the **Problems** view of the **Java perspective**.

If you want PMD to run every time your program compiles, right click on your project and select **Properties > PMD > Enable PMD**.

 
## CheckStyle
Do the following to run CheckStyle on your project:

  * Right click on the project and select **CheckStyle > Check Code with CheckStyle**. This will run CheckStyle on your code.

CheckStyle alerts are listed in the **Problems** view of the **Java perspective**.

If you want CheckStyle to run every time your program compiles, right click on your project and select **Properties > CheckStyle > CheckStyle active for this project**.

Removing all of the CheckStyle notifications will help you when you [Generate Javadoc](gp1-javadoc).

 
## Static Analysis Tool Meta Data
Each static analysis tool will create its own set of meta data or configuration files in your project folder.  **These files MAY be pushed to GitHub**.  

If you would prefer to leave them off, you can add the files to the `.gitignore`.  If you're using the Eclipse **Git Staging** view, right click on the file and select **Ignore**.  This will add the file to `.gitignore` and add the `.gitignore` file to the list of unstaged changes.

Also note that your `.project` file also changed.  The `.project` file contains information about the configuration of your project and has been updated to reflect your use of static analysis tools.  **DO NOT IGNORE THE `.project` FILE!!** If the `.project` file is not pushed to GitHub, the teaching staff will not be able to import your project into Eclipse for manual grading of the black box tests!  You will receive a deduction for any manual configuration of your project required to grade your work.  The same applies to the `.classpath` file even though it was not modified by using static analysis tools.

 
## Push to GitHub
Before moving on to the next portion of the Guided Project, complete the following tasks:

  * Remove all static analysis notifications.
  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  Try writing your own commit message for this push!

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}
    
