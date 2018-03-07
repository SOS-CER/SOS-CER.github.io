---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Commit to Your Local Repository
navigation: on
pagegroup: git-tutorial
---

# Commit to Your Local Repository
Now that you have a working git repository with staged files, you need to record a snapshot of your changes to your repository. 

{% capture callout_content %}
You should commit often -- each time your project reaches a state you want to record.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: How Often Should I Commit?" %}

{% capture callout_content %}
You should **always** include a meaningful, descriptive commit message that briefly summarizes the changes you have made to your files since the last snapshot was committed. For more information about how to write meaningful commit messages, check the [Pro Git Book](https://git-scm.com/book/ch5-2.html#Commit-Guidelines).
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="conceptualKnowledge" title="Conceptual Knowledge: Commit Messages" %}

You can add files to your staging area by using [Git Bash](#commit-using-git-bash) or [eGit](#commit-using-egit).

## Commit Using Git Bash
To commit a snapshot of your changes into your repository, use the `git commit` command.

{% capture callout_content %}
**Remember:** anything that is not in your staging area will not be part of your commit! The unstaged files will remain modified on your local disk.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Files Included in Your Commit" %}


Use the `git commit` command as follows:

     git commit -m "provide a commit message summarizing the changes you have made to your code"


Additionally, as a shortcut, you can skip the staging area on already-tracked files by adding the -a flag to the git commit command (`-a` adds a snapshot of all tracked files to your staging area automatically):

     git commit -am "descriptive commit message"
   
{% capture callout_content %}
By using the `-a` flag, you do not have to manually `git add` the unstaged files to your staging area.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: The `-a` Flag" %}


{% include image.html file="images/commitAdd.png" caption="Figure: Commit Files Using Git Bash" %} 

After executing the `git commit` command, you should see a a summary of the commit:

{% include image.html file="images/initialCommit.png" caption="Figure: After Committing Files Using Git Bash" %} 

The summary tells you which branch you committed to (`master`), a short version of the SHA-1 checksum (`e6f148c`) of the commit, how many files were modified, and other statistics.

## Commit Using eGit
To commit through EGit, follow these steps:

   1.  Right-click your project in **Package Explorer**.
   2. Select **Team** > **Commit**. The **Git Stating** view should open.
   3. Double-check the files that you have staged for commit.
   
{% include image.html file="images/eGitStaging.png" caption="Figure: eGit Staging Area" %}      
   
   {:start="4"}
   4. Enter a descriptive commit message, author, and committer.  
   5. You now have two options to complete your task:
     
     
  * Click **Commit** to save your changes to your local repository ONLY. You will then have to later [git push](git-push) your local snapshot to your remote NCSU GitHub repository.
	     
**OR**
     
  * Click **Commit and Push** to save your changes to your local repository AND push your changes to your remote repository all at once.
    * You should probably always use this option for this course, unless you have a specific reason to commit ONLY to your local repository. Jenkins builds code that is in your remote NCSU GitHub repository!
	