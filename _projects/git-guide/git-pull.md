---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Pull Your Remote Repository Contents to Your Local Repository
navigation: on
pagegroup: git-tutorial
---

## Pull Your Remote Repository Contents to Your Local Repository

There are at least three situations when a pull is required:

   * Your computer fails and you need to retrieve a backup of your project.
   * You want to work on the project on a different computer.
   * You are working with a partner or a team of programmers on the same project.

{% capture callout_content %}
**WHEN WORKING ON A TEAM: Always pull the latest code from the remote repository before making any new changes to files in Eclipse. This will help reduce the number of [conflicts that may need to be merged](git-merge).**
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="bestPractices" title="Best Practice: Collaboration in Git" %}


You can pull by using [Git Bash](#pull-using-git-bash) or [EGit](#pull-using-egit).

### Pull Using Git Bash
To see the remote repositories currently configured in your Git, execute the following command:

     git remote -v

The `-v` flag shows the specific URLs that Git has stored for each remote repository.

For example:

{% include image.html file="images/remote.png" caption="Figure: Remote Repositories in Git Bash" %} 

In this example, Git tells us that the "short name" for the `csc216-001-GP1-021` repository URL is `origin`. When you clone a remote repository, the shortname defaults to `origin` unless you specify otherwise.

You can use the `git pull` command to automatically `fetch` and `merge` remote repository contents into the code in your current working directory. (The default branch name is `master`)

     git pull [shortname] [branchname]
	
{% include image.html file="images/pull.png" caption="Figure: Pulling Using Git Bash" %} 	 

Git pulled the updated file snapshots from the remote NCSU GitHub repository.

{% capture callout_content %}
Sometimes, you may find that Git Bash opens a text editor and waits for you to save the text file before continuing. The text editor is called **Vi**, and you may find it difficult to use. Please refer to [online sources](http://www.atmos.albany.edu/daes/atmclasses/atm350/vi_cheat_sheet.pdf) for more information about how to use the *Vi* editor.
In short, to exit the *Vi* editor type ':q' and hit the 'enter' key.  If you want to enter a commit message, hit 'i' to insert.  Type your commit message.  The hit Esc and type ':wq' to write and quit. 
   
Alternatively, you can also [change the default text editor](https://git-scm.com/book/en/v2/Customizing-Git-Git-Configuration) in Git Bash. For example, in Windows, you can execute:
     
	 git config --global core.editor notepad
	
to use the Windows Notepad text editor instead of *Vi*.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="tools" title="Tool: Text Editing in Git Bash" %}


### Pull Using EGit
To use EGit for pulling code from the remote repository, follow these steps:

   1. Navigate to the **Package Explorer** view in Eclipse.
   2. Right-click the project for the code and choose **Team** > **Pull**.

A summary window will open showing details of the Pull operation.

If your local repository contents match the contents of your remote repository, you will see a window similar to:


{% include image.html file="images/50_pull_empty.png" caption="Figure: ulling When Your Local Repository Contents Matches Your Remote Repository" %} 

If your remote repository has updated versions of your files, you will see a window similar to the following when executing a pull request:


{% include image.html file="images/51_pull_results.png" caption="Figure: Pulling That Results in Updates" %} 

Git pulled the updated file snapshots from the remote NCSU GitHub repository.
	