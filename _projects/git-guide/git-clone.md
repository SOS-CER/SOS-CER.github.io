---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Cloning a Repository
navigation: on
pagegroup: git-tutorial
---

# Cloning a Repository

If a remote Git repository exists (for example, on [NCSU GitHub](https://github.ncsu.edu)), you can get a copy of the existing repository. Cloning a remote repository gives Git a full copy of nearly all data that the remote repository has. Every version of every file for the history of the remote repository is pulled to your local .git repository directory by default when you execute the `git clone` command.

For this course, you will find the clone URL of a remote repository in [NCSU GitHub](https://github.ncsu.edu).

{% include image.html file="images/cloneUrl.png" caption="Figure: Location of Clone URL in NCSU GitHub" %} 
	 
You will have to authenticate each time you try to interact (clone, push, or pull) with your remote [NCSU GitHub](https://github.ncsu.edu) repository.

{% capture callout_content %}
If you want, you can [setup SSH Keys](https://help.github.com/articles/generating-ssh-keys/) so that you do not have to authenticate each time you type the git clone, git push, or git pull commands. If you decide to use SSH, you will need to use the SSH clone URL.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="bestPractices" title="Best Practice: Using SSH Keys for Authentication" %}

You can clone a repository using either [Git Bash](#cloning-in-git-bash) or [EGit](#cloning-in-egit).


## Cloning in Git Bash
To clone a remote repository, open Git Bash, and browse to your `GitRepositories` base directory. Execute the following command:

     git clone [url]

where [url] is the clone URL for your NCSU GitHub repository.

The name of the created repository directory will be the name of your repository (for example: `csc216-001-GP1-01` if your NCSU GitHub repository is `https://github.ncsu.edu/engr-csc216-fall2016/csc216-001-GP1-01`).

{% include image.html file="images/clone.png" caption="Figure: Using the git clone Command" %} 

{% capture callout_content %}
The `git clone` command creates a new project workspace directory, initializes a .git directory inside it, pulls down all data from the remote repository, and checks out a working copy of the latest version of the files in the remote repository.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="conceptualKnowledge" title="Conceptual Knowledge: `git clone` in Practice" %}

Your directory hierarchy should now look like:

     GitRepositories  [a directory that contains one or more of your Git repositories]
        -> <repository-name> [a single Git repository]
           -> .git [may be a hidden folder, depending on your operating system]
   
Now, open Eclipse to your chosen workspace location for your course-related assignments. Eclipse will show that your workspace is empty. You will need to tell Eclipse where your local git repository is:

   1. On the Eclipse menu bar, open: **Window** -> **Show View** -> **Other**...
   2. In the **Show View** window, expand the **Git** folder.
   3. Click **Git Repositories**, then click **OK**.

The Git Repositories window should now appear.

{% include image.html file="images/gitRepositories.png" caption="Figure: Git Repositories View" %} 

   {:start="4"}
   4. Select **Add an existing local Git repository**
   5. Browse to the location of the repository you cloned. (in the example above: GitRepositories/csc216-[section]-[project]-[repo-number])
   
{% include image.html file="images/eclipseAddRepository.png" caption="Figure: Add Git Repositories Window" %}   

   {:start="6"}
   6. Click **OK**, then click **Finish** to close the window.
   7. The local csc216-[section]-[project]-[repo-number] repository should now be displayed in your **Git Repositories** window in Eclipse.
  
{% include image.html file="images/gitTutorialRepository.png" caption="Figure: Git Repositories Window" %}   


## Cloning in EGit
To clone a remote repository:

   1. Open Eclipse.
   2. Select **Window** > **Show View** > **Other**. 
   3. Browse to select **Git** > **Git Repositories**.
   4. In the Git Repositories view, click **Clone a Git Repository**. That opens the **Clone Git Repository** wizard. You will be cloning remote repositories on NCSU GitHub to your local computer. You would also use this option if you were using a new or different computer that has not yet been connected to your remote repository. 

{% include image.html file="images/10_clone_view.png" caption="Figure: Cloning in Eclipse" %} 
   
   {:start="5"}
   5. On the clone wizard's Source Git Repository page, enter remote repository information as follows (if you copy your repository URI from NCSU GitHub and paste into the URL textbox, the other fields should be automatically filled-in for you):
     * **URI:** The URI of your NCSU GitHub repository.
     * **Host:** github.ncsu.edu
     * **Repository Path:** The suffix of the URI that follows the host (after the github.ncsu.edu)
     * **Connection Protocol (select only one):**
         Select HTTPS if you do not have an SSH key.
         Select SSH if you do have an SSH key. But first, follow the instructions in Preparing to clone under SSH.
     * **Port**: Leave this field blank.
     * **Authentication under HTTPS:**
         User: Your unity id
         Password: Your unity password
     * **Authentication under SSH:**
         User: git
         Password: Leave this blank
	
{% include image.html file="images/11_clone_source.png" caption="Figure: Clone a Git Repository using HTTPS" %} 
	 
{% include image.html file="images/11a_clone_source_ssh.png" caption="Figure: Clone a Git Repository using SSH" %} 
   
   {:start="6"}
   6. Click **Next** to continue to the next page.
   7. You may see a caution page saying Source Git repository is empty if you have not committed any files to the repository. Click **Next** to continue to the Local Destination page.
   
{% include image.html file="images/12_clone_branch.png" caption="Figure: Warning for Empty Remote Repository" %} 
   
   {:start="8"}
   8. On the Local Destination Page, click **Browse** to select a directory on your computer for your local repository. 
   
{% capture callout_content %}
Unless you change the default directory location, EGit will save all repositories in the `C:/Users/[user]/git/` directory.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Default EGit Repository Location" %}
   
{% include image.html file="images/13_clone_local.png" caption="Figure: Select Local Repository Location" %} 
   
   {:start="9"}
   9. Click **Finish**. Your Git Repository view shows the repository that you just cloned.
   
{% include image.html file="images/13a_clone_eclipse_view.png" caption="Figure: Git Repository View Showing One Repository" %} 
   
