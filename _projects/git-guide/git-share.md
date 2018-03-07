---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Sharing an Existing Java Project to your Repository
navigation: on
pagegroup: git-tutorial
---
# Sharing an Existing Java Project to your Repository
This section describes what to do if you have already been working on a Project locally within Eclipse, but have not shared it to your git repository yet.

When you think your existing Eclipse project is in a good state to commit a snapshot of it to your git repository, you need to tell Eclipse which git repository to send your code to.

   1. In Eclipse, right-click your project in **Package Explorer**.
   2. Choose: **Team** -> **Share Project**.
   
{% include image.html file="images/shareProject.png" caption="Figure: Sharing an Eclipse Project to Your Git Repository" %} 

   {:start="3"}
   3. Select the correct git repository from the drop-down. *If no repositories are listed, double-check that you have [cloned your NCSU GitHub repository](git-clone) correctly.*
   
{% include image.html file="images/selectRepository.png" caption="Figure: Selecting a Git Repository" %} 
   
   {:start="4"}
   4. Your **Git Repositories** window should now show your project listed inside your **Working Directory**.
   
{% include image.html file="images/projectShared.png" caption="Figure: Your Project in Repository's Working Directory" %} 

Your Eclipse project should now know which git repository it should communicate with. 

## Use Git Bash to Check that your Project is Connected to your Repository
In Git Bash, execute:

     git status
	
{% include image.html file="images/statusShare.png" caption="Figure: Checking the Status of Your Repository in Git Bash" %} 
	
Git now says that your **.gitignore** file and your **ShapeCalculator** project directory (and its contents) are currently associated with your repository, but are currently untracked.
	