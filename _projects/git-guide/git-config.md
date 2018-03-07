---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: First Time Git Configuration
navigation: on
pagegroup: git-tutorial
---

# First Time Git Configuration
Configuring your local Git installation will streamline your usage of Git.  Configuration is required for both [EGit](#egit-configuration) and [Git Bash](#git-bash-configuration).  You want to configure your Git to use your NCSU unity id.  If we see pushes to a repository under a different id (e.g., your local computer's name or a public GitHub id), we'll investigate a possible academic integrity violation.

If you configure [Git Bash](#git-bash-configuration) first, the global user name and email will be configured for [EGit](#egit-configuration) and you can skip the first EGit step. 


## Git Bash Configuration
Before using Git through Git Bash, you need to customize variables for your Git environment.  If you customize them at a global level (as shown below), they may be used by Eclipse.

**Creating a Git Identity**
The first thing you need to do is set your identity in Git. Your identity is saved as part of each Git commit you make. The git config command lets you get and set configuration variables that control how Git looks and operates.

  1. Open the Git Bash command line client.
  2. Type the following commands:
   
        ```
        git config --global user.name "Your Name"
        git config --global user.email yourUnityID@ncsu.edu
        ```
    
  3. Double-check your settings by typing the following command:
  
        ```
        git config --list
        ```
    
Your name and email should appear in the list of configuration variables.
	
{% capture callout_content %}
**OPTIONAL**: Sometimes, you may find that Git Bash opens a text editor and waits for you to save the text file before continuing. The text editor is called **Vi**, and you may find it difficult to use. Please refer to [online sources](http://www.atmos.albany.edu/daes/atmclasses/atm350/vi_cheat_sheet.pdf) for more information about how to use the *Vi* editor.
In short, to exit the *Vi* editor type ':q' and hit the 'enter' key.  If you want to edit the file, hit 'i' to insert.  When you are done, press Esc then type ':wq' to write and quit.
   
Alternatively, you can also [change the default text editor](https://git-scm.com/book/en/v2/Customizing-Git-Git-Configuration) in Git Bash. For example, in Windows, you can execute:
     
	 git config --global core.editor notepad
	
to use the Windows Notepad text editor instead of *Vi*.
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="tools" title="Tool: Text Editing in Git Bash" %}


## EGit Configuration
The first time you use EGit, you must configure the plugin options. Follow these steps to configure your name and email address:

   1. Open Eclipse.
   1. Select one of the following based on your operating system:
      * Windows/Linux: **Window > Preferences**
      * Mac: **Eclipse > Preferences**
   1. Navigate to **Team > Git > Configuration**
   1. Under **User Settings**, edit the **name** and **email** entries to be your NCSU unity ID and your NCSU email address.  If your Eclipse does not have entries for name and email, you will need to click **Add Entry** and add the following two entries, then click **OK**:
      * Key: `user.name`, Value: `<your unity id>`
      * Key: `user.email`, Value: `<your NCSU email address>`
   1. Click **OK** to save your changes.
    
{% include image.html file="images/01_config_name.png" caption="Figure: User Settings for Git Configuration" %} 
