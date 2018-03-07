---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Handling Merge Conflicts
navigation: on
pagegroup: git-tutorial
---

# Handling Merge Conflicts
When you are working with a team on a project, you will likely experience merge conflicts. Git does not know which version of the code to keep, so you have to help Git by manually specifying which version to use.

Two common conflicts you may encounter are:

   * [Edit collisions](#resolving-edit-collisions): when you and a team member edit the same section of code in the same file. 
   * [Removed file collisions](#resolving-removed-file-collisions): when you edit a file, but a team member deleted the file from the repository.

## Resolving Edit Collisions
For example, if you edit code on line 5 in `Square.java`, and your teammate made a change on line 5 of the same file and pushes his or her changes to the remote repository, you will experience an **edit collision** when you try to pull your teammate's changes from the remote repository. That means your version of the file conflicts with your team member's version of the file.

If your **pull** request results in a **CONFLICT**, then you will need to resolve the conflict.

For example, in Git Bash:

{% include image.html file="images/gitBashConflict.png" caption="Figure: Pull Resulting in a CONFLICT" %} 

In the figure above, Git says that a conflict exists in the `Square.java` file. 

Similarly, in eGit:

{% include image.html file="images/eGitPullConflict.png" caption="Figure: Pull Resulting in a CONFLICT" %} 

In the figure above, eGit says that the pull results in the *CONFLICTING* state.

To resolve the conflict, you should:

   1. Switch back to Eclipse.
   2. Right-click your project in **Package Explorer**.
   3. Choose **Refresh** to ensure Eclipse has refreshed to show the updated files that were pulled from the remote repository. 
   
Eclipse will show red problem markers in the files that conflict.

{% include image.html file="images/conflictPackageExplorer.png" caption="Figure: Conflict Markers in Package Explorer" %} 

Opening `Square.java` reveals:

{% include image.html file="images/conflictMarkers.png" caption="Figure: Conflict Markers in Package Explorer" %} 

{% capture callout_content %}
When a collision happens, Git adds a special block of text into the code file. These lines of text that Git added are called *conflict markers*. The block of text contains both versions of code where the conflict occurred. For example:

   * Everything between the <<<<<<< HEAD and ======= lines presents the version of code *in **your** local repository on your machine*.
   * Everything between the ======= and >>>>>>> [checksum] lines presents the version of *code that was pulled from the commit* snapshot represented by the given SHA-1 checksum hash.

   Now, you have three options:

   * Keep your local changes
   * Take your teammate's changes
   * Change the conflicting code to something completely new
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="conceptualKnowledge" title="Conceptual Knowledge: Collision Resolution Options" %}

In Eclipse, *manually* delete the conflict markers, and edit the code to be the final version you wish to save.

Now that you have manually fixed the collision in your code file:

   1. Save the updated `Square.java`, which now has all conflicts resolved.
   2. Add the `Square.java` file to [move it to your staging area](git-staging).
   3. Finally, [commit to record a snapshot](git-commit) of your updated code into your local repository.

Now, you should [push your changes to your remote repository](git-remote) so that your teammates can pull the updated code and continue working with the most up-to-date codebase.


## Resolving Removed File Collisions
You may encounter **removed file collisions** if you edit a file, but a teammate deletes the file in the remote repository. Git does not know whether to keep your edits or delete the file entirely.

When you [pull](git-remote) your teammate's code from the remote NCSU GitHub repository, you may see a message similar to:

     CONFLICT (modify/delete): Square.java deleted in HEAD and modified in 6d4cd552fd63ce5856145171c2382767088104a8.
     Version 6d4cd55 of Square.java left in tree.
     Automatic merge failed; fix conflicts and then commit the result.
   
You have two options:

   * **Keep the edited file:** To keep the edited version of the file, [add the file to your staging area](git-staging), then [commit the code](git-commit) again to re-establish its presence in the repository.
   * **Delete the file:**
      * To delete the file from the repository using Git Bash, use the `git rm [filename]` command.
	  * To delete the file using eGit, right-click the file in **Package Explorer** and select **Team** > **Remove from Index**. Then, right-click and **Delete** the file in **Package Explorer**
	  * Now, [commit](git-commit) so that Git knows the file has been deleted from the repository.	

## Resolving Conflicts on Configuration Files

Conflicts can also happen in project configuration files. For example, the configuration files `.project` and `.classpath` are required for Eclipse to recognize your project as an Eclipse project, but the files are not listed in Package Explorer.  Instead you can see them on your file system.  

If you have a conflict with no visible conflict markers in Eclipse, the conflict may be on a configuration file.  You will have to resolve the conflict on your file system using a text editor and Git Bash.