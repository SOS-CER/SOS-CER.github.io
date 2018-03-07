---
title: CSC Git Guide
tags: [software engineering, software lifecycle, CS2, CSC, git, github]
description: Git Workflow
navigation: on
---

# Git Workflow
In this section, we describe the typical Git workflow and indicate where users commonly have trouble.

## One-Time Steps
   
   1. First, [install Git tools](git-tools).
   2. Next, [configure your git installation](git-config) to set your username and password.
   
## Steps for Working on Projects

   1. Make sure you have completed the [one-time steps](#one-time-steps) for installing and configuring Git on your machine.
   2. When you first begin working on a project, you will need to [clone your NCSU GitHub repository](git-clone).
   3. Next, you will either need to:
      * [Share your existing Eclipse project](git-share) to your repository, OR
      * [Import an existing Eclipse project](git-import) from your NCSU GitHub repository.
   4. If your project doesn't already include a .gitignore file, [create a .gitignore file](git-ignore).
   5. Typically, you will now begin writing code or continue editing existing code. 
   6. If you are working on a team that shares a common repository, you should frequently [pull](git-remote) any updates your team members [push](git-remote) to the team's NCSU GitHub repository. If the [pull](git-remote) results in *CONFLICTING* code, you will need to [resolve merge conflicts](git-merge).
   7. Once you are ready to save a snapshot of your code to your repository, you need to [add the files you want to save in the snapshot](git-staging) to your staging area/index.
   8. After staging your commit by adding files to your staging area/index, you need to [commit your staged snapshot](git-commit) to your local repository.
   9. To send your local repository's commit snapshots to your NCSU GitHub remote repository, you will need to [push](git-remote) your local commit snapshots. If you experience `fetch-first` or `non-fast-forward` errors, try to [pull](git-remote) before you [push](git-remote).
   10. Repeat with step 4 to continue working on your project.
 