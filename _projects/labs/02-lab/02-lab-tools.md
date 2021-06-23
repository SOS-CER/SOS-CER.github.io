---
title: CSC216 Lab 02 - Software Engineering Best Practices
tags: [software engineering, software lifecycle, CS2, CSC216, Lab02]
description: CSC216 Lab 02 - Setting up Tools
navigation: on
pagegroup: 02-lab
---
# CSC216 Lab 02: Setting up Tools
We will be using static analysis and code coverage tools for this lab.  If they are not already installed in your local Eclipse development environment, please set them up now by following the [CSC216 Development Environment Install tutorial](../..install/install-overview).


{% capture callout_content %}
If you are unable to install or configure a development tool locally, you should use the Jenkins results to drive your feedback.  The local tools are faster to use, but Jenkins is available if you run into issues.  Ultimately, we pull grades from the Jenkins results.  You should always resolve to fix the Jenkins notifications!
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Tools on Jenkins" %}


## FindBugs
{% include iconHeader.html type="saTool" %}
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
{% include iconHeader.html type="saTool" %}
Do the following to run PMD on your project:

  * Right click on the project and select **PMD > Check Code**. This will run PMD on your code.

After PMD runs, you will automatically switch to the **PMD perspective**, where you can browse the PMD results. (Switch back to the **Java perspective** by clicking the **Java perspective** icon in the upper right of the workbench.) You can also look at the PMD results in the **Problems** view of the **Java perspective**.

If you want PMD to run every time your program compiles, right click on your project and select **Properties > PMD > Enable PMD**.



## CheckStyle
{% include iconHeader.html type="saTool" %}
Do the following to run CheckStyle on your project:

  * Right click on the project and select **CheckStyle > Check Code with CheckStyle**. This will run CheckStyle on your code.

CheckStyle alerts are listed in the **Problems** view of the **Java perspective**.

If you want CheckStyle to run every time your program compiles, right click on your project and select **Properties > CheckStyle > CheckStyle active for this project**.

Removing all of the CheckStyle notifications will help you when you [Generate Javadoc](gp1-javadoc).


## Static Analysis Tool Meta Data
{% include iconHeader.html type="saTool" %}
Each static analysis tool will create its own set of meta data or configuration files in your project folder.  **These files MAY be pushed to GitHub**.  

If you would prefer to leave them off, you can add the files to the `.gitignore`.  If you're using the Eclipse **Git Staging** view, right click on the file and select **Ignore**.  This will add the file to `.gitignore` and add the `.gitignore` file to the list of unstaged changes.

Also note that your `.project` file also changed.  The `.project` file contains information about the configuration of your project and has been updated to reflect your use of static analysis tools.  **DO NOT IGNORE THE `.project` FILE!!** If the `.project` file is not pushed to GitHub, the teaching staff will not be able to import your project into Eclipse for manual grading of the black box tests!  You will receive a deduction for any manual configuration of your project required to grade your work.  The same applies to the `.classpath` file even though it was not modified by using static analysis tools.


## EclEmma
{% include iconHeader.html type="ccTool" %}
Ensure that [EclEmma is installed](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/eclipse/eclipse-install.html) in Eclipse so that you can run your tests with your code instrumented for coverage.