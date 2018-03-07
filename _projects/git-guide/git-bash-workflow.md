---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
---
###CSC Git Guide
!#breadcrumbs
[NC State University](http://ncsu.edu) > CSC > Git Guide

!#wrapper

!#nav-row
!#nav-prev [Remote Repositories](git-remote.md)
!#nav-next [Git Guide](git.md)       
!#nav-end

!#row
#Retrieving Older Versions of Files From Your Repository
One of the benefits of version control systems involves the ability to retrieve a previous version of a file that was committed to your repository. In Git, you can checkout a version of a file that you committed in a previous snapshot in your repository.

If you want to save your current working version of your file, make sure you either:
   (1) save a backup copy of the file locally on your machine, or
   (#) commit the file to your repository FIRST before you checkout an older version of the file, or you may accidentally overwrite and lose any code you've written since your last commit.
   
You can retrieve older versions of files using [Git Bash](#retrieving-using-git-bash) or [eGit](#retrieving-using-egit).
	
##Retrieving Using Git Bash
First, you will need to identify the snapshot in your repository that contains the version of the file you want to retrieve. Execute the following command to view your previous commits:

     git log --oneline

The `log` command will display your commit history for the current repository. The `--oneline` flag allows us to specify the format of the log output into something more readable.

     ![*Figure: Executing the Log Command in Git Bash](images/log.png)

   * The first string of text on each line represents the SHA-1 hash of the Git commit snapshot. While the SHA-1 hash is really 40 characters long, Git will display only the first few characters of the hashcode, and also ensures that no two abbreviated versions of the hashcodes will be the same.
   * The second string of text on each line represents the message you entered when you committed that snapshot to the Git repository. This is why it is important to provide descriptive and meaningful commit messages when you commit snapshots to your repository.

   Sometimes, you might need more information about which commit contains the code you want to retrieve. In this case, we can specify a more advanced log format:

     git log --pretty=format:"%C(yellow) %h %Creset - %ci %cn %C(green)%s"

The `log` command will display your commit history for the current repository. The `--pretty=format` flag allows us to specify the format of the log output into something more readable.

   * %C(yellow): sets the **output text color** to yellow
   * %h: display the **abbreviated hashcode** of the commit snapshot
   * %Creset: **resets the output text color** to the default
   * %ci: display the **date/time** of the commit
   * %cn: display the **name of the person who committed** the snapshot
   * %C(green): sets the **output text color** to green
   * %s: display the **commit message**
   
     ![*Figure: Executing the Log Command in Git Bash with Customizations](images/logAdvanced.png)   

After you identify the abbreviated hashcode for the commit snapshot that contains the version of the file you want to retrieve, you can optionally ask git to show you the contents of the file in that snapshot:

     git show [abbreviatedHash]:[pathToFile]

     ![*Figure: Show the file in Git Bash](images/show.png)   

Use the `git checkout` command to retrieve the file and place it in your working directory.

     git checkout [abbreviatedHash] [pathToFile]
	
     ![*Figure: Checkout a file in Git Bash](images/checkout.png) 

Notice that the file now appears as "modified" in your staging area. In Eclipse, you can now refresh your workspace. The previous version of the file should appear in Eclipse.


##Retrieving Using eGit	
First, you will need to identify the snapshot in your repository that contains the version of the file you want to retrieve. 

In Eclipse,

   (1) In **Package Explorer**, right-click the file you would like to revert.
   (#) Select **Repalce With** > **Commit...**.
   
     ![*Figure: Replace With Menu](images/replaceWithCommit.png)

     ![*Figure: Commit History](images/commitHistory.png)

   (#) Click the revision that contains the version of the file you would like to retrieve.
   (#) Click **OK**.
 
!#nav-end