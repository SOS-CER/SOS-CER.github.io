---
title: Guided Project 2 WolfScheduler - Activity and Event
tags: [software engineering, software lifecycle, CS2, CSC216, GP2]
description: Guided Task - Guided Project 2 GitHub Repository
navigation: on
pagegroup: gp2
---

# Guided Task: Guided Project 2 GitHub Repository
You will be assigned a separate [GitHub](https://github.ncsu.edu) repository for each Guided Project and each major Project.  This is to ensure that your work on each is distinct and that any work on a new project doesn't get recorded as late work on an old project.  However, you will continue with the same WolfScheduler project for GP2.  You need to share the project to your GP2 repository.

{% capture callout_content %}
  * Disconnect a project from a GitHub repository
  * Share a project with a new GitHub repository
  * Push changes to a new remote GitHub repository
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}
  
{% capture callout_content %}
A project may belong to only a single local repository.  That is because a Git repository is represented as a folder on a file system with a special `.git/` folder that stores Git metadata.  A project cannot be in two locations on the file system at once.  The process outlined below will let you share an existing Eclipse project with a new repository and then retain a copy of your Guided Project 1 submission in a local copy of your Guided Project 1 repository.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="bestPractices" title="Best Practice: Version Control" %}

{% capture callout_content %}
[Git](https://git-scm.com/) is a distributed version control system.  Git supports the [creation of repositories](../git-tutorial/git-repo), [copying of repositories (cloning)](../git-tutorial/git-clone), [committing changes](../git-tutorial/git-commit), [working with remote repositories](../git-tutorial/git-remote), and [merging changes](../git-tutorial/git-merge).  In Git, all repositories are considered equal and each maintains its own history.  You can move information between connected repositories through pulling and pushing any changes.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="tools" title="Tools: Git and GitHub" %}


## Disconnect `WolfScheduler` from GP1 Repository
Disconnecting a project from a Git repository removes any associated metadata about the project from the repository.  To disconnect, do the following:

  * Right click on the `WolfScheduler` project
  * Select **Team > Disconnect**.
  * The repository name to the right of the `WolfScheduler` project will no longer be available.


## Clone GP2 Repository
Clone your GP2 repository provided by the teaching staff.  The pattern will be `csc216-XXX-GP2-YYY`, where XXX is your section number and YYY is your repository number.

{% capture callout_content %}
If you need additional help cloning a repository using Git Bash, see [Cloning in Git Bash](../git-tutorial/git-clone#cloning-in-git-bash).

If you need additional help cloning a repository using EGit, see [Cloning in EGit](../git-tutorial/git-clone#cloning-in-egit).
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Cloning a Repository" %}


## Adding (Staging) `WolfScheduler` to GP2 Repository
Stage your `WolfScheduler` to your GP2 repository by sharing the project.

Uncheck the option **Use or create repository in parent folder of project**. Then select your new repository from the drop down and check your project. 

{% include image.html file="images/ShareRepo.PNG" caption="Figure: Sharing Project with Repository" %}

{% capture callout_content %}
If you need additional help adding (staging) a project to a repository in Git Bash, see [Add Files to the Staging Area in Git Bash](../git-tutorial/git-staging#adding-files-to-your-staging-area-using-git-bash).

If you need additional help adding (staging) a project to a repository using EGit, see [Add Files to the Staging Area in EGit](../git-tutorial/git-staging#adding-files-to-your-staging-area-using-egit).
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Adding (Staging a Project)" %}
  

## Committing Local Changes and Pushing `WolfScheduler` to GP2 Remote Repository
Now that your project is staged for the GP2 repository, add the files to the index by right clicking on the `WolfScheduler` project and selecting **Team > Add to index**. Then commit and push the project to start GP2!

{% capture callout_content %}
If you need additional help committing to your local repository in Git Bash, see [Commit Using Git Bash](../git-tutorial/git-commit.html#commit-using-git-bash).

If you need additional help committing to your local repository in EGit, see [Commit Using EGit](../git-tutorial/git-commit.html#commit-using-egit).
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Committing Staged Changes" %}

{% capture callout_content %}
If you need additional help pushing to the remote in Git Bash, see [Push Using Git Bash](../git-tutorial/git-push.html#push-using-git-bash).

If you need additional help pushing to the remote in EGit, see [Push Using Git Bash](../git-tutorial/git-push.html#push-using-egit).
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Pushing Committed Changes" %}

## Reset your GP1 `WolfScheduler`
When you shared `WolfScheduler` with your new GP2 repo, that removed the `WolfScheduler` directory from your GP1 repo.  If you want to keep a copy of your GP1 `WolfScheduler`, you should reset your local GP1 repository to the last commit in the remote.  Then your local GP1 repository will have a copy of your final `WolfScheduler` submission.  You can use that as a backup as you're working on GP2!

Choose to do the reset in either Eclipse or Git Bash!

In Eclipse, do the following:

  * Right click on your GP1 repository in the **Git Repositories** view and select **Reset**.
  * Make sure the last commit is selected and select the option for a **Reset type** of **Hard (HEAD, index, and working tree updated)**.  Click **Reset**.
  * You will receive a warning about overwriting your local changes.  This is what we want since we want to undo the delete from the GP2 repository to move to the GP3 repository.  Click **Yes**.
  * Check that `WolfScheduler` is now in the `Working Tree/` directory of your GP1 repository.
  
In Git Bash, do the following:

  * Change directory to your repository location.
  * Enter the command `git reset --hard HEAD`.  This will reset the local repository to the same information as the remote and erase all of your uncommitted local changes (which in this case is all the deleted `WolfScheduler` files).
  
In this case, resetting the repo is useful, but the reset command can lead to major problems.  Use the power of the reset command carefully!
           

## Check Your Submission
You should ALWAYS verify that your pushed changes are on the remote repository.  You can do this by going to your repository on the GitHub website and making sure that your `WolfScheduler` project has been pushed to your GP2 repository.

  * Log into [NCSU's GitHub](https://github.ncsu.edu)
  * Select the appropriate organization and repository.
  * Verify that your latest commit message is listed and that all pushed files are in the repository.
     
Verify that your [Jenkins job](http://go.ncsu.edu/jenkins-csc216) is pulling your `WolfScheduler` from your GP2 repository.  If [Jenkins](http://go.ncsu.edu/jenkins-csc216) does not recognize your project, please notify the teaching staff via Piazza or the sup list as early as possible to ensure that your project is set up correctly for auto grading.