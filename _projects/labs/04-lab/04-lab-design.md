---
title: CSC 217 Lab 04 - Design
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab04]
description: CSC 217 Lab 04 - Design
navigation: on
pagegroup: 04-lab
---
# CSC 217 Lab 04: Design
{% include iconHeader.html type="design" %}
You have explored 2 different possible designs that could lead to successful implementation of the `PackSchduler` system.  For the remainder of Lab 04, you will integrate the common portion of the designs in the *.catalog, *.user, *.io, *.directory, and *.catalog packages.  The creation and implementation of the *.manager and *.ui packages will be handled in future labs.  


{% include image.html file="images/PackScheduler_Lab4_ClassDiagram.gif" caption="Figure: Integrated PackScheduler" %} 

The figure above is an example of a **UML class diagram**. Each class is represented by a rectangle; the text in the class describes the class members. Arrows indicate relationships between classes. The software used to generate the diagram in the figure uses the following notation conventions:

  * A square (empty or solid) in front of a name means private. Solid squares are operations, empty squares are data.
  * A green circle in front of a name means public. Solid circles are operations, empty circles are data.
  * Members embellished with S are static. 
  * Members embellished with SF are static, final. (`Student.MAX_CREDITS` is public, static, and final.)
  * Methods embellished with C are constructors. (See `StudentDirectory.StudentDirectory()`.)
  * Solid arrows with simple heads indicate *has-a* relationships, in which one class has a member whose type is another class or interface. The containing class is at the tail of the arrow and the class that is contained is at the head. The arrow is decorated with the name and access of the member in the containing class (- for private, + for public). The arrow is also decorated with the "multiplicity" of the relationship, where 0..1 means there is 1 instance of the member in the containing class and 0..* means there are many, usually indicating a collection such as an array. (`StudentDirectory` has a private member named `studentDirectory` that is an array of `Student`s.)

Most of the functionality already exists in `PackScheduler` or `WolfScheduler`.  The next section will have instructions about how to integrate pieces of `WolfScheduler` into `PackScheduler`.
