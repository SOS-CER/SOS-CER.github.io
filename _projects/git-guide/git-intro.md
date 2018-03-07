---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Git Introduction
navigation: on
pagegroup: git-tutorial
---

# Git Introduction
Other version control systems (like Subversion, CVS, etc.) tend to consider information as a set of *files* and *changes made to each file* over time. Git considers data as more like a set of *snapshots*; every time you commit (save the state of your project), Git "takes a picture" of your files at that moment and stores a reference to that snapshot. The *entire history* of your project is in your repository on your local hard disk. This means you can continue to write code and commit even if you're offline and have no internet connection. Once you regain internet access, you can then push your history of commits to your remote repository on NCSU GitHub.

Everything in Git is check-summed before it is stored, then referenced by that checksum throughout Git. 

{% capture callout_content %}
In computer science, a *checksum* is a computed value based on the number of bits contained in transmitted data to help ensure no data is lost or corrupted during transfer. 
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="conceptualKnowledge" title="Conceptual Knowledge: Checksum" %}

As a result, it is impossible to change the contents of any file or directory without Git knowing about it. You also cannot lose information in transit or get file corruption without Git being able to detect it. Git uses SHA-1 hash for checksumming. The SHA-1 hash is a 40 character hexadecimal string (0-9, a-f) and calculated based on the contents of a file or directory structure in Git. Git stores everything in its database by the hash value of its contents.

{% capture callout_content %}
Git (generally) only *adds* data. After you commit a snapshot into Git, it is very difficult to lose. This means you can experiment and write code without losing all of your work!
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Git Paradigm" %}


## The Three State of Code Files in Git
Git has three states your code can reside in: modified, staged, and committed.

  * **Modified** means that you have changed a code file but have not committed it to your repository yet.
  * **Staged** means that you have marked a modified code file in its current version to go into your next commit snapshot.
  * **Committed** means that the snapshot is safely stored in your local git repository.


## The Three Sections of a Git Project
  * The **staging area** (sometimes called the **"index"**) is a file that stores information about what will go into your next snapshot.
  * The **working directory** is a single checkout of one snapshot of your repsitory contents. These files are pulled out of the compressed database in the Git directory and placed on the disk for you to use or modify.
  * The **.git directory (repository)** is where Git stores the metadata and object database for your project. This is what is copied when you clone a repository from another computer.
  

## Basic Git Workflow
In summary, the following steps represent a basic Git workflow:

  * In Eclipse, **modify code** in your workspace (your Eclipse project directory will be your working directory).
  * Using Git, **stage** the code files, which adds the files to your staging area for your next commit snapshot.
  * Using Git, **commit**, which takes a snapshot of the code files as they are in the staging area and stores the snapshot permanently in your Git repository.
  * Using Git, **pull** remote repository data to your local repository (and, if necessary, merge conflicts).
  * Using Git, **push** your local repository data to the remote [NCSU GitHub](https://github.ncsu.edu) repository for your teammates to pull on their local machines.
  
{% include image.html file="images/diagram.png" caption="Figure: Simple Git File Lifecycle" %}

