---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Adding Files to your Staging Area
navigation: on
pagegroup: git-tutorial
---
# Adding Files to your Staging Area
You now need to add the files that you want to version control to your staging area. 

{% capture callout_content %}
A code file in your working directory (or Eclipse Project) can either be **tracked** or **untracked**.

   * A **tracked** file is one that was in the last snapshot. Tracked files can be unmodified since the previous snapshot, modified since the previous snapshot, or staged in your staging area.
   * An **untracked** file is everything else: any files in your working directory that were not in your last snapshot and not in your staging area.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="conceptualKnowledge" title="Conceptual Knowledge: Tracked and Untracked Files in Git" %}

{% capture callout_content %}
**Remember** that when you add a file to your staging area, you are adding a snapshot of the file *at that moment in time*. If you make future edits to the file before committing the snapshot, you will need to re-add the file to your staging area so that you grab the most recent version of the file!
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="bestPractices" title="Best Practice: Changes in Staged Files" %}

You can add files to your staging area by using [Git Bash](#adding-files-to-your-staging-area-using-git-bash) or [eGit](#adding-files-to-your-staging-area-using-egit).

## Adding Files to your Staging Area using Git Bash
To add files to your staging area, use the following command:

     git add [filename]

For example, you need to add all Java code files in the project to your staging area. Type the following command:

     git add *.java
	
After adding files to your staging area, check the status of your files again using `git status`.

{% include image.html file="images/gitAddJava.png" caption="Figure: Adding Files to your Staging Area Using Git Bash" %} 

In the figure above, note that all the .java files have been added to the staging area. The status output shows that four files are still untracked:

   * **.gitignore** -- you need to track this file so that the same files are consistently ignored on your teammate's machines
   * **.classpath** -- you need to track this file so that Eclipse can correctly and consistently build your project on other machines
   * **.project** -- you need to track this file so that Eclipse can correctly identify your code as a valid Eclipse project on other machines
   * **example.txt** -- suppose you do not want your repository to store a snapshot of example.txt file yet. You would not add it to your staging area. If you did not want your repository to track the file *at all*, you could add an additional rule to your [.gitignore](git-ignore) file.
   * You should **NOT** see a bin directory or .settings directory listed. If you do see a bin or .settings directory, your .gitignore file is missing or incorrect.

Using `git add`, add each of the above four files. Now, execute `git status` again.
   
{% include image.html file="images/gitAddAll.png" caption="Figure: Adding Files to your Staging Area Using Git Bash" %} 

Once you have staged all the files that you would like to go into your next commit snapshot, you need to [commit the snapshot](git-commit) to your repository.

After you commit, and as you continue to work on your project, suppose:
  
  1. You edit the already tracked code file `Square.java`.
  2. You execute git add on `Square.java` to add the modified version to your staging area.
  3. You later edit the `Square.java` file again without first committing the original `Square.java` modification.  
   
The `git status` command should display: 
   
{% include image.html file="images/statusModifiedTwice.png" caption="Figure: Adding a File to the Staging Area without Committing the Previously-added Version of the File" %} 
   
**Whoa!** Why is `Square.java` listed twice? Because the `git add` command adds a snapshot of the file at that *specific* *moment* in time when you executed the `add` command. Now that you have made additional changes to the file, you have to execute the `git add` command again to add the latest snapshot of the file to the staging area.   
  
{% include image.html file="images/statusModifiedOnce.png" caption="Figure: Adding an Edited File Using Git Bash" %} 

Now that you have all of the necessary files in your staging area, you can [commit a snapshot of the current version of these files](git-commit) to your git repository.
   
## Adding Files to your Staging Area using eGit
To add files to your staging area using eGit:

  1. In **Package Explorer**, right-click the files that you would like to add to your staging area and choose **Team** > **Add to Index**. This makes sure the files are marked to be added to your staging area (or "index").
  
{% include image.html file="images/33_commit_add.png" caption="Figure: Adding Files to your Staging Area Using eGit" %} 
  
To view your staging area in Eclipse:

  1. Click **Window** > **Show View** > **Other**.
  2. Expand the **Git** folder, and select **Git Staging**.
  3. Click **OK**.
  
{% include image.html file="images/eGitStaging.png" caption="Figure: Staging Area View in Eclipse" %} 
  
Now that you have all of the necessary files in your staging area, you can [commit a snapshot of the current version of the staged files](git-commit) to your git repository.