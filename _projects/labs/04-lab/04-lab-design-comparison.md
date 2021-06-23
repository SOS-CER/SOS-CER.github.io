---
title: CSC 217 Lab 04 - Design
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab04]
description: CSC 217 Lab 04 - Design Comparison
navigation: on
pagegroup: 04-lab
---
# CSC 217 Lab 04: Design Comparison
{% include iconHeader.html type="design" %}
There are two proposed designs for the integrated and extended requirements for `PackScheduler`. You must compare and contrast the designs and give a recommendation to the manager on which design should be implemented.

[You will complete your design comparison and recommendation in Google Forms](https://docs.google.com/a/ncsu.edu/forms/d/e/1FAIpQLSfWC4_tOrLRQAXT1B--Bv5tTEUh-vTnb-wWreWKxMWJl-7ZFw/viewform). 

It will be easiest to work with the designs if you open the images in a new tab.  Then you can zoom in to study the designs.  The major differences are noted with each candidate design.

Unless otherwise shown on the diagram, there is an assumption of public getters/setters for the fields of plain old java objects.  Additionally, the appropriate `equals()`, `hashCode()`, and `toString()` methods are assumed.  They are left off for brevity of the diagrams.

If you work with a partner/team for the design comparison (on-campus labs only), only submit one form.  Include the unity ids of all participants.


## Candidate Design A
Here are the major design elements in Candidate Design A:

  * Incorporates `Activity`, `Course`, `ConflictException`, and `Conflict` from `WolfScheduler` into `PackScheduler` in the `edu.ncsu.csc216.pack_scheduler.course` package.  
  * `CourseRecordIO` is returned to its original design (from GP1) and is added to the `edu.ncsu.csc216.pack_scheduler.io` package.
  * A new `edu.ncsu.csc216.pack_scheduler.catalog` package is created with a `CourseCatalog` class.  The `CourseCatalog` class has similar functionality to `StudentDirectory` and several methods can be modified from `WolfScheduler`.
  * `Student`, `StudentRecordIO`, and `StudentDirectory` remain unchanged from Lab 03.
  * A new `edu.ncsu.csc216.pack_scheduler.manager` package contains classes that manage the major functionality.  
     * `RegistrationManager` has the `CourseCatalog` and `StudentDirectory`.  It also handles user authentication.
     * `RegistrarManager` provides the functionality for a registrar.
     * `StudentRegistrationManager` provides the functionality for a student.
  * The `edu.ncsu.csc216.pack_scheduler.ui` package has been updated with a class that handles user authentication and the flow of events in the GUI with separate panels for each of the major functions.


{% include image.html file="images/DesignA.png" caption="Figure: PackScheduler Candidate Design A" %} 


## Candidate Design B
Here are the major design elements in Candidate Design B:

  * Incorporates `Activity`, `Course`, `ConflictException`, and `Conflict` from `WolfScheduler` into `PackScheduler` in the `edu.ncsu.csc216.pack_scheduler.course` package.  
  * `CourseRecordIO` is returned to its original design (from GP1) and is added to the `edu.ncsu.csc216.pack_scheduler.io` package.
  * A new `edu.ncsu.csc216.pack_scheduler.catalog` package is created with a `CourseCatalog` class.  The `CourseCatalog` class has similiar functionality to `StudentDirectory` and several methods can be modified from `WolfScheduler`.
  * A new `User` hierarchy has `Student` and `Registrar` as sub classes.
  * `StudentRecordIO` and `StudentDirectory` remain unchanged from Lab 03.
  * A new `edu.ncsu.csc216.pack_scheduler.manager` package contains the `RegistrationManager` class that handles authentication and enrollment functionality.
  * The `edu.ncsu.csc216.pack_scheduler.ui` package has been updated with a class that handles user authentication and the flow of events in the GUI with separate panels for each of the major functions.


{% include image.html file="images/DesignB.png" caption="Figure: PackScheduler Candidate Design B" %} 
