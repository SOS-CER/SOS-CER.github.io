---
title: Guided Project 1 WolfScheduler - Course and Schedule
tags: [software engineering, software lifecycle, CS2, CSC216, GP1]
description: Guided Task - `WolfSchedulerGUI`
navigation: on
pagegroup: gp1
---
 
# Guided Task: `WolfSchedulerGUI`
Up to this point, you've been working with *model* classes.  Model classes represent the data and business logic of an application and are part of the **Model-View-Controller (MVC)** design pattern.  MVC provides a separation of the major areas of a large application.  

  * **Model**: data and business logic
  * **View**: view that the users interact with 
  * **Controller**: connection between the view and the model
  
In Java, you can create Graphical User Interfaces (GUIs) using the Swing libraries.  The Swing libraries provide both the *view* and the *controller* aspects of MVC.  In Swing, the view is the look and feel of the application and includes form elements and how they are organized.  The controller is the functionality that connects to the underlying model when the user interacts with the GUI by clicking a button or other form element.

You are still learning all of the skills needed to write a GUI.  Until Project 3, the teaching staff will provide GUIs for you.  

{% capture callout_content %}
  * Create `WolfSchedulerGUI`
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}
 
## Create `edu.ncsu.csc216.wolf_scheduler.ui` Package
Create a new package called `edu.ncsu.csc216.wolf_scheduler.ui` in the `src` folder of the `WolfScheduler` project.

{% capture callout_content %}
If you need help creating the `edu.ncsu.csc216.wolf_scheduler.ui` package, see [Guided Task: Your First Eclipse Project - Create a Package](gp1-eclipse-intro#create-a-package).
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Eclipse Java Package Creation" %}
  
 
## Create `WolfSchedulerGUI` Class
Create a new Java class called `WolfSchedulerGUI` in the `edu.ncsu.csc216.wolf_scheduler.ui` package of the `src` source directory of the `WolfScheduler` project.

{% capture callout_content %}
If you need help creating the `WolfSchedulerGUI` Java Class, see [Guided Task: Your First Eclipse Project - Create a Class](gp1-eclipse-intro#create-a-class).
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Eclipse Java Class Creation" %}

[Copy the code from `WolfSchedulerGUI.java](files/WolfSchedulerGUI.java) into your Eclipse file.

 
## Push to GitHub
Before moving on to the next portion of the Guided Project, complete the following tasks:

  * Ensure all classes and methods are fully commented.
  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  Try writing your own commit message for this push!

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}