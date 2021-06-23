---
title: CSC 217 Lab 05 - Inspection & Debugging
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab05]
description: CSC 217 Lab 05 - Extract `User` Superclass
navigation: on
pagegroup: 05-lab
--- 
# CSC 217 Lab 05: Extract `User` Superclass
{% include iconHeader.html type="implementation" %}
The [updated design](05-lab-design) contains a new type of user: `Registrar`.  Since there are commonalities between a `Registrar` user and a `Student` user, a parent class `User` can contain those commonalities.  The common functionality currently exists is `Student`.  Extract a `User` superclass from `Student`.


{% capture callout_content %}
Use the instructions from [Guided Project 2: Extract a Super Class](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp2/gp2-super-class) to help you with extracting the `User` superclass from `Student`.
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Extracting a Superclass" %}


## Extract `User`
Refactor `Student` to extract the following members into a new class `User`:

  * `firstName`
  * `lastName`
  * `id`
  * `email`
  * `password`
  * associated getters and setters for the above fields
  

## Make `User` Abstract
Since `User` is a super class of `Student` and will soon be the super class of `Registrar`, there is no need for `User` to be a concrete class.  Instead, `User` should be abstract - that means you cannot directly construct `User`.

Add the `abstract` keyword to the `User` class header.


## Make `User`'s Fields Private
When creating the super class, Eclipse set the fields of `User` to protected level access.  This means that any sub-class can access the fields directly.  However, it also means that another class in the same package can also access the fields directly. To protect your fields, make them `private`.

There will be several compilation errors in `Student` after you make the fields in `User` private: `hashCode()`, `equals()`, and `toString()`.  Do the following to resolve:  
 
  * Remove `hashCode()` and `equals()`.  Now that there is a super class, you should regenerate `hashCode()` and `equals()` to use the super class. 
  * Change direct references to `User` fields to use the associated getter methods.  
  * Run your tests.  The tests for `Student.hashCode()` and `Student.equals()` will fail.  You'll fix those shortly!


## Create `User`'s Constructor
`User` doesn't automatically have a constructor.  You want to continue to use the *one path of construction* paradigm.  That means you need a way to construct `User` and its fields.

  * Replace the default `User` constructor with one that requires all of the fields.  The parameters MUST be in the order of `firstName`, `lastName`, `id`, `email`, and `password`. 
  * After you add a parameterized constructor to `User`, `Student` no longer compiles.  Now, `Student` needs to call the parameterized `User` constructor.  Update `Student`'s non-compiling constructor to use `User`'s new constructor. 
  * Run your unit tests to make sure that everything is still passing (except for `Student.hashCode()` and `Student.equals()`).  Use your debugging skills to fix any failing tests.
  

## Generate `hashCode()` and `equals()`
Do the following to add back the `hashCode()` and `equals()` functionality:

  * Use Eclipse's source generation tools to generate `hashCode()` and `equals()` in `User`.
  * Then use Eclipse's source generation tools to generate `hashCode()` and `equals()` in `Student`.
  * Run your unit tests.  They should all be passing again!  Aren't they useful to ensure no regression of functionality!


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  


{% capture callout_content %}
To generate Javadoc, you need to [configure and run the Javadoc tool](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-javadoc#configure-and-run-javadoc-for-your-project), [fix Javadoc errors and warnings](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-javadoc#fix-javadoc-errors-and-warnings), and [check the generated Javadoc pages](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-javadoc#check-generated-javadoc-pages).  Make sure you push your changes to GitHub!
{% endcapture %}
{% include callout.html content=callout_content icon="dtTool" type="reminder" title="Reminder: Generating Javadoc" %}