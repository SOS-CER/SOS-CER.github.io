---
title: Testing Lab Exercises (BBT - Triangle)
tags: [Testing Exercises, CS1, CSC116, java, programming]
description: "Create Project Directory"
navigation: on
pagegroup: testing-exercise-BBT-Triangle
---

# Create Project Directory

To help keep our TriangleClassification code and other files organized, first create a project directory, which will eventually contain all of your source and test code for your project along with other documents. Since we require GitHub repos for submissions, your project directory would go within the repo directory 


For example, assuming your assigned repo is `csc116-001-LabX-Y`:

```
% pwd
/afs/unity.ncsu.edu/users/j/jdyoung2/csc116/csc116-001-LabX-Y/

% mkdir TriangleClassification

% ls
TriangleClassification

% cd TriangleClassification
% pwd
/afs/unity.ncsu.edu/users/j/jdyoung2/csc116/csc116-001-LabX-Y/TriangleClassification

```

Within the project directory, create the following directories, which will help organize and separate your files into:
   * `src` (source) code,
   * `test` (test) code,
   * `lib` (library) files,
   * `bin` (compiled `.class`) files,
   * `doc` (generated Javadoc) files, and
   * `project_docs` (project document) files (e.g., Black Box Test Plan)


## Download JUnit Libraries
{% include iconHeader.html type="unitTest" %}

JUnit is not provided in the default Java libraries (`String`, `Scanner`, etc. are provided with Java). Instead, we have to download the JUnit libraries.

   1. Browse to the [JUnit Github project](https://github.com/junit-team/junit4/wiki/Download-and-Install), and download `junit-4.12.jar` into your `lib` directory in your project.
   2. Also download `hamcrest-core-1.3.jar` into your `lib` directory in your project.
   
Both `junit-4.12.jar` and `hamcrest-core-1.3.jar` are required to run test cases from the command line.