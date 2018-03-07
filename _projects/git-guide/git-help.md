---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Git Help
navigation: on
pagegroup: git-tutorial
---

# Git Help
Three commands can provide the manual page (manpage) information for any Git command:

     git help [verb]
	 
     git [verb] --help

     man git-[verb]

Since Git is installed locally on your machine, you can access the manual pages from anywhere, even when offline.

{% capture callout_content %}
If you ever have trouble using the EGit plugin in Eclipse, then use Git Bash! Git Bash typically provides descriptive hints about how to resolve common issues you may face. EGit tends to only show a vague error message that you may not understand.
{% endcapture %}
{% include callout.html content=callout_content type="reminder" title="Reminder: If You Run Into Trouble..." %}
