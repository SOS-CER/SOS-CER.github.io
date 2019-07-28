---
title: CSC216 Lab 02 - Software Engineering Best Practices
tags: [software engineering, software lifecycle, CS2, CSC216, Lab02]
description: CSC216 Lab 02 - Design
navigation: on
pagegroup: 02-lab
---
# CSC216 Lab 02: Design
{% include iconHeader.html type="design" %}
The design of `PackScheduler` for Lab 02's `StudentDirectory` functionality consists of four classes in four packages.

{% include image.html file="images/PackScheduler_Lab1_ClassDiagram.gif" caption="Figure: `StudentDirectory` Functionality of `PackScheduler`" %} 

The figure above is an example of a **UML class diagram**. Each class is represented by a rectangle; the text in the class describes the class members. Arrows indicate relationships between classes. The software used to generate the diagram in the figure uses the following notation conventions:

  * A square (empty or solid) in front of a name means private. Solid squares are operations, empty squares are data.
  * A green circle in front of a name means public. Solid circles are operations, empty circles are data.
  * Members embellished with S are static. 
  * Members embellished with SF are static, final. (`Student.MAX_CREDITS` is public, static, and final.)
  * Methods embellished with C are constructors. (See `StudentDirectory.StudentDirectory()`.)
  * Solid arrows with simple heads indicate *has-a* relationships, in which one class has a member whose type is another class or interface. The containing class is at the tail of the arrow and the class that is contained is at the head. The arrow is decorated with the name and access of the member in the containing class (- for private, + for public). The arrow is also decorated with the "multiplicity" of the relationship, where 0..1 means there is 1 instance of the member in the containing class and 0..* means there are many, usually indicating a collection such as an array. (`StudentDirectory` has a private member named `studentDirectory` that is an array of `Student`s.)

The details of the classes are described in [Lab 01](../01-lab/01-lab-design).  For Lab 02, you will be writing unit tests for `Student`, `StudentRecordIO`, and `StudentDirectory`.  Your unit tests must cover at least 80% of the statements in `Student`, `StudentRecordIO`, and `StudentDirectory`. Additionally, you will be writing a black box test plan for the [requirements](02-lab-requirements).  

  * [edu.ncsu.csc216.pack_scheduler.user.Student](02-lab-student)
  * [edu.ncsu.csc216.pack_scheduler.io.StudentRecordIO](02-lab-studentrecordio)
  * [edu.ncsu.csc216.pack_scheduler.directory.StudentDirectory](02-lab-studentdirectory)
  * [edu.ncsu.csc216.pack_scheduler.ui.StudentDirectoryPanel](02-lab-test)
