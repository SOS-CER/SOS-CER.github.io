---
title: CSC216 Lab 01 - Installation and Project Creation
tags: [software engineering, software lifecycle, CS2, CSC216, Lab01]
description: CSC216 Lab 01 - Design
navigation: on
pagegroup: 01-lab
---

# CSC216 Lab 01: Design
{% include iconHeader.html type="design" %}
The design of `PackScheduler` for Lab 01's `StudentDirectory` functionality consists of four classes in four packages.

{% include image.html file="images/PackScheduler_Lab1_ClassDiagram.gif" caption="Figure: `StudentDirectory` Functionality of `PackScheduler`" %} 

The figure above is an example of a **UML class diagram**. Each class is represented by a rectangle; the text in the class describes the class members. Arrows indicate relationships between classes. The software used to generate the diagram in the figure uses the following notation conventions:

  * A square (empty or solid) in front of a name means private. Solid squares are operations, empty squares are data.
  * A green circle in front of a name means public. Solid circles are operations, empty circles are data.
  * Members embellished with S are static. 
  * Members embellished with SF are static, final. (`Student.MAX_CREDITS` is public, static, and final.)
  * Methods embellished with C are constructors. (See `StudentDirectory.StudentDirectory()`.)
  * Solid arrows with simple heads indicate *has-a* relationships, in which one class has a member whose type is another class or interface. The containing class is at the tail of the arrow and the class that is contained is at the head. The arrow is decorated with the name and access of the member in the containing class (- for private, + for public). The arrow is also decorated with the "multiplicity" of the relationship, where 0..1 means there is 1 instance of the member in the containing class and 0..* means there are many, usually indicating a collection such as an array. (`StudentDirectory` has a private member named `studentDirectory` that is an array of `Student`s.)

The details of the classes in the UML class diagram above are described in the following sections. You should complete them in the given order.

  * [edu.ncsu.csc216.pack_scheduler.user.Student](01-lab-student)
  * [edu.ncsu.csc216.pack_scheduler.io.StudentRecordIO](01-lab-studentrecordio)
  * [edu.ncsu.csc216.pack_scheduler.directory.StudentDirectory](01-lab-studentdirectory)
  * [edu.ncsu.csc216.pack_scheduler.ui.StudentDirectoryPanel](01-lab-studentdirectorypanel)

