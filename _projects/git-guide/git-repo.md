---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Get a Repository
navigation: on
pagegroup: git-tutorial
---

# Get a Repository
For the examples in the Git Guide, we will use the following directory structure:

     -> GitRepositories [or a directory that contains one or more of your Git repositories]
	    -> <course>-<section>-<project>-<repo-number> [or the name of one of your Git repositories]
		   -> WolfScheduler [or the name of your Eclipse project]
		      -> src
			  -> test
			  -> ...
		   -> .git [the hidden Git-related files that manage your repository]


For example, in CSC216, your Git repository names will take the structure of `csc216-<section>-<project>-<repo-number>`.  If you're in CSC216 section 001 and working on Guided Project 1, your repo name may be something like `csc216-001-GP1-075`.  
           
For example, if you use the eGit plugin to manage your repositories, you may have a directory on your machine similar to:

     C:/Users/jtking/git  [a directory that contains one or more Git repositories]
	    -> csc216-001-GP1-01  [maps to your https://github.ncsu.edu/engr-csc216-fall2016/csc216-001-GP1-01 repository]
		   -> WolfScheduler [an Eclipse project containing your project code]
		      -> src
			  -> test
		   -> .git
		-> csc216-001-GP2-01 [maps to your https://github.ncsu.edu/engr-csc216-fall2016/csc216-001-GP2-01 repository]
		   -> WolfPackManager [an Eclipse project containing your project code]
		      -> src
			  -> test
		   -> .git
		-> csc216-001-L-01 [maps to your https://github.ncsu.edu/engr-csc216-fall2016/csc216-001-L-01 repository]
		   -> Collections	[an Eclipse project containing your project code]
		      -> src
			  -> test
		   -> CourseManager	[another Eclipse project -- repositories can contain more than one!]
		      -> src
			  -> test
		   -> FiniteStateMachine [another Eclipse project]
		      -> src
			  -> test
		   -> .git



There are two ways to get a Git project:

  1. [Clone an existing Git repository](git-clone) from another server. (Since we initialize NCSU GitHub repositories for you, you will typically clone your NCSU GitHub repository at the beginning of each assignment.)
  2. [Import an existing project/directory into Git](git-import).

Since you will only be required to clone repositories for this course, we will not discuss importing existing projects into Git.
