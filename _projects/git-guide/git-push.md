---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Push Your Local Repository to Your Remote Repository
navigation: on
pagegroup: git-tutorial
---

# Push Your Local Repository to Your Remote Repository
When you have your project code in a satisfactory state and want to send your local commit snapshots to your remote NCSU GitHub repository, you need to push your code.

{% capture callout_content %}
After a push, you should always go to your [NCSU GitHub](https://github.ncsu.edu) repository to verify that the files are indeed there.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Check Your Submission" %}

You can push by using [Git Bash](#push-using-git-bash) or [EGit](#push-using-EGit).

## Push Using Git Bash
To see the remote repositories currently configured in your Git, execute the following command:

     git remote -v

The `-v` flag shows the specific URLs that Git has stored for each remote repository.

For example:

{% include image.html file="images/remote.png" caption="Figure: Remote Repositories in Git Bash" %} 

In this example, Git tells us that the "short name" for the `csc216-001-GP1-021` repository URL is `origin`. When you clone a remote repository, the shortname defaults to `origin` unless you specify otherwise.

To push your local commits to NCSU GitHub, execute the following command:

     git push [shortname] [branchname]

The [branchname] will be `master`, by default.

*While not required for this course, you can read more about creating other branches and merging branches in the [Pro Git Book](https://git-scm.com/book/en/v2/Git-Branching-Basic-Branching-and-Merging).*

{% include image.html file="images/pushSuccess.png" caption="Figure: After Pushing Local Commits to your Remote Repository" %} 

If you are working on a team and sharing the same repository with all team members, the `git push` command only works if nobody else has pushed code to the remote repository in the meantime. 

If you are working as a team and someone else pushes code, then you try to push your own code, your push will be **rejected** with either a **`fetch first error`** or a **`non-fast-forward error`**. Whenever you see these errors, try [git pull](git-pull) first to pull the remote changes, then try `git push` again. If [git pull](git-pull) results in merge conflicts, you will have to first [manually fix conflicts](git-merge) in your code and your teammate's code.

{% include image.html file="images/fetchFirst.png" caption="Figure: Fetch-First Error" %} 

{% capture callout_content %}
Notice the *hints* provided by Git Bash. The hints tell you exaclty what you should do to try to resolve the problem!
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Git Bash Hints" %}

Once again, the Git Bash output tells you **exactly** what to do: you will have to first [git pull](git-pull) your teammate's pushed code first before you are allowed to `git push` your own code.

## Push Using EGit
If you **Commit and Push** as the last step in [committing files to your local repository](git-commit), then your code is automatically pushed to your remote repository at NCSU GitHub. If you simply commit without a push, then you must subsequently push the code at a later time follow these steps:

   1. Navigate to the **Package Explorer** view in Eclipse.
   2. Right-click the project containing the code and choose **Team** > **Push to Upstream**.

If you are working on a team and sharing the same repository with all team members, pushing only works if nobody else has pushed code to the remote repository in the meantime. 

If you are working as a team and someone else pushes code, then you try to push your own code, your push will be rejected with either a **`fetch first error`** or a **`non-fast-forward error`**. 

{% include image.html file="images/nonFastForwardEclipse.png" caption="Figure: Non-Fast-Forward Error*" %} 

{% capture callout_content %}
Notice that (unlike Git Bash), EGit does *not* provide helpful hints about what you should do to resolve the problem! This is why we suggest that you use Git Bash whenever you get errors in EGit and don't know how to proceed.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: EGit Push Feedback" %}

Whenever you see these errors, try [pulling](#pull-your-remote-repository-contents-to-your-local-repository) first to pull the remote changes, then try `git push` again. If [git pull](git-pull) results in merge conflicts, you will have to first [manually fix conflicts](git-merge) in your code and your teammate's code.
