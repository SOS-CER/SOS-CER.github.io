---
title: CSC 217 Lab 05 - Inspection & Debugging
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab05]
description: CSC 217 Lab 05 - Design
navigation: on
pagegroup: 05-lab
---
# CSC 217 Lab 05: Design
{% include iconHeader.html type="design" %}
The design for Lab 05 is shown below.  There are three changes from Lab 04 that you will work on:

  * `User` hierarchy
  * `StudentDirectory.getStudentById(String id)` method
  * `RegistrationManger` class (which contains the `Registrar` inner class)

{% include image.html file="images/PackScheduler_Lab5_ClassDiagram.gif" caption="Figure: Lab 05 PackScheduler Design" %} 

The figure above is an example of a **UML class diagram**. Each class is represented by a rectangle; the text in the class describes the class members. Arrows indicate relationships between classes. The software used to generate the diagram in the figure uses the following notation conventions:

  * A square (empty or solid) in front of a name means private. Solid squares are operations, empty squares are data.
  * A green circle in front of a name means public. Solid circles are operations, empty circles are data.
  * Members embellished with S are static. 
  * Members embellished with SF are static, final. (`Student.MAX_CREDITS` is public, static, and final.)
  * Methods embellished with C are constructors. (See `StudentDirectory.StudentDirectory()`.)
  * Solid arrows with simple heads indicate *has-a* relationships, in which one class has a member whose type is another class or interface. The containing class is at the tail of the arrow and the class that is contained is at the head. The arrow is decorated with the name and access of the member in the containing class (- for private, + for public). The arrow is also decorated with the "multiplicity" of the relationship, where 0..1 means there is 1 instance of the member in the containing class and 0..* means there are many, usually indicating a collection such as an array. (`StudentDirectory` has a private member named `studentDirectory` that is an array of `Student`s.)
  * The connector with a circle containing a cross indicates an inner class relationship.  The class with the crossed circle is the enclosing class and the other class is the inner class.  (`Registrar` is an inner class of `RegistrationManager`).

The following sections will provide details about how to implement the changes to the design.
