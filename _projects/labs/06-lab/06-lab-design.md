---
title: CSC 217 Lab 06 - Finite State Machines
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab06]
description: CSC 217 Lab 06 - Design
navigation: on
pagegroup: 06-lab
---

# CSC 217 Lab 06 Design
{% include iconHeader.html type="design" %}
The design for Lab 06 is shown below.  To follow the development paradigm of *additive change*, the course name validation functionality will be implemented in a new `edu.ncsu.csc216.pack_scheduler.course.validator` package.  The only change to the remainder of the design occurs in the `Course` class, which now uses the `CourseNameValidator` to check for a valid course name as per the [requirements](06-lab-requirements).

![*Lab 06 Course Validation in `PackScheduler`*](images/CourseNameValidator_Lab6_ClassDiagram.gif)

The figure above is an example of a **UML class diagram**. Each class is represented by a rectangle; the text in the class describes the class members. Arrows indicate relationships between classes. The software used to generate the diagram in the figure uses the following notation conventions:

  * A square (empty or solid) in front of a name means private. Solid squares are operations, empty squares are data.
  * A green circle in front of a name means public. Solid circles are operations, empty circles are data.
  * Members embellished with S are static. 
  * Members embellished with SF are static, final. (`Course.MAX_CREDITS` is public, static, and final.)
  * Methods embellished with C are constructors. (See `Course.Course()`.)
  * Solid arrows with simple heads indicate *has-a* relationships, in which one class has a member whose type is another class or interface. The containing class is at the tail of the arrow and the class that is contained is at the head. The arrow is decorated with the name and access of the member in the containing class (- for private, + for public). The arrow is also decorated with the "multiplicity" of the relationship, where 0..1 means there is 1 instance of the member in the containing class and 0..* means there are many, usually indicating a collection such as an array. (`Course` has a private member named `validator` that is a `CourseNameValidator`.)
  * The connector with a circle containing a cross indicates an inner class relationship.  The class with the crossed circle is the enclosing class and the other class is the inner class.  (`LetterState` is an inner class of `State`).

The following sections will provide details about how to implement the changes to the design.
