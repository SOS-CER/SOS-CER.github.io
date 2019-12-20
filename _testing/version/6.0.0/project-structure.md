---
title: Software Testing
description: "Create Project Directory"
navigation: on
pagegroup: testing-v6-0-0
--- 

# Create Project Directory

To help keep our project[^project] code and other files organized, first create a project directory, which will eventually contain all of your source and test code for your project along with other documents. If your section required GitHub repos for submissions, your project directory would go within the repo directory.

{% capture GH-structure %}
If your section required GitHub repos for submissions, your project directory would go within the repo directory. You will clone the repo and move into the repo directory prior to creating project directory. For example, `pwd` would result in `/afs/unity.ncsu.edu/users/j/jtking/csc116/`<br>`csc116-001-LabX-01/Paycheck` where your cloned repo is `csc116-001-LabX-01`.
{% endcapture %}

{% include mention.html title="Reminder" content=GH-structure %}

For example:

```
% pwd
/afs/unity.ncsu.edu/users/j/jtking/csc116

% mkdir Paycheck

% ls
Paycheck

% cd Paycheck
% pwd
/afs/unity.ncsu.edu/users/j/jtking/csc116/Paycheck

```

## Project Structure
Within the project directory, we will create the following directories, which will help organize and separate your files into:
   * `src` (source) code,
   * `test` (test) code,
   * `lib` (library) files,
   * `bin` (compiled `.class`) files,
   * `doc` (generated Javadoc) files, and
   * `project_docs` (project document) files (e.g., Black Box Test Plan)

```
Paycheck
    -> src  (directory will contain your source code)
    -> test (directory will contain your test code)
    -> lib  (directory will contain your JUnit library file)
    -> bin  (directory that will contain all of your .class files)
    -> doc  (directory that will contain all of your Javadoc files)
    -> project_docs (directory that will contain all of your project documents, e.g., Black Box Test Plan)
```


## Place `Paycheck.java` in `src`
We will place [Paycheck.java](assets/TestingCode/Paycheck/src/Paycheck.java) into `src` directory.

Our directory structure[^displayStructure] will be:

```
Paycheck
    -> src
        -> Paycheck.java
    -> test
    -> lib
    -> bin
    -> doc
    -> project_docs
```

## Compile Code
Assuming you are currently in your top-level project directory (`Paycheck`), then compile your source code using the following command:
  
```
javac -d bin src/Paycheck.java
```

{% include callout.html type="learningOutcomes" content="The `-d` argument tells Java the *destination* directory that it should save the compiled `.class` files into. Here, we tell Java to save the `.class` files into the `bin` directory. "%}  

## Execute Code
Now that we have compiled the source code, your directory structure should currently look like:

```
Paycheck
    -> src 
        -> Paycheck.java
    -> test
    -> lib 
    -> bin
        -> Paycheck.class
    -> doc
    -> project_docs
```   

When we execute Java programs, we are actually *executing* the `.class` files.

To execute the `Paycheck` program, make sure you are in your top-level project directory (`Paycheck`) and use the following command:

```
 java -cp bin Paycheck
```

{% include callout.html type="learningOutcomes" content="The `-cp` argument tells Java the *classpath* where the compiled `.class` files are located. Here, we tell Java that the `.class` files are in the `bin` directory. "%} 

## Footnotes
[^project]: Throughout the Testing materials, the term "project" refers to any program assignment, including projects and exercises.
[^displayStructure]: To view the contents of a directory along with the contents of its subdirectories, you can use the `-R` option of `ls`: `ls -R`
[^GH]: You will clone the repo and move into the repo directory prior to creating project directory. For example, `pwd` would result in `/afs/unity.ncsu.edu/users/j/jtking/csc116/csc116-001-LabX-01/Paycheck` where your cloned repo is `csc116-001-LabX-01`.