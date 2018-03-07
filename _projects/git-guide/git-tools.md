---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Installing Git Tools
navigation: on
pagegroup: git-tutorial
---
# Installing Git Tools
There are two main ways to work with Git and GitHub:

  1. [EGit plug-in for Eclipse](#installing-egit-for-eclipse): EGit integrates Git functionality into the Eclipse workspace.  
  2. [Git Bash](#installing-git-bash): Command-line console for running Git commands.

  
{% capture callout_content %}
We recommend that you have both options installed on your local machine.  You will likely use EGit for most of your Git interactions, but there are times when working with command-line Git through Git Bash will be easier.  
**When in doubt, use Git Bash!**
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: What to Install?" %}


## Installing EGit for Eclipse
The EGit plug-in comes bundled with Eclipse.  However, if you uninstall EGit, you can find EGit in the Eclipse Marketplace. 


## Installing Git Bash
Browse to the [Git Downloads](https://git-scm.com/downloads) page. Follow the instructions for downloading and installing Git on your specific operating system.

Once you feel like you have a solid understanding of Git commands and the Git Bash command-line workflow, you can also use a Git GUI to help you work with your repositories. However, this guide will only discuss the Git Bash command-line workflow.
