---
title: CSC 217 Lab 03 - Collections
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab03]
description: CSC 217 Lab 03 - Design
navigation: on
pagegroup: 03-lab
---

# CSC 217 Lab 03: Design
{% include iconHeader.html type="design" %}
The design of `PackScheduler` for Lab 03's `StudentDirectory` functionality consists of four classes in four packages.  There are a couple of modifications from the [design in Lab 01](../01-lab/01-lab-design).

{% include image.html file="images/PackScheduler_Lab3_ClassDiagram.gif" caption="Figure: `StudentDirectory` Functionality of `PackScheduler`" %} 

The figure above is an example of a **UML class diagram**. Each class is represented by a rectangle; the text in the class describes the class members. Arrows indicate relationships between classes. The software used to generate the diagram in the figure uses the following notation conventions:

  * A square (empty or solid) in front of a name means private. Solid squares are operations, empty squares are data.
  * A green circle in front of a name means public. Solid circles are operations, empty circles are data.
  * Members embellished with S are static. 
  * Members embellished with SF are static, final. (`Student.MAX_CREDITS` is public, static, and final.)
  * Methods embellished with C are constructors. (See `StudentDirectory.StudentDirectory()`.)
  * Solid arrows with simple heads indicate *has-a* relationships, in which one class has a member whose type is another class or interface. The containing class is at the tail of the arrow and the class that is contained is at the head. The arrow is decorated with the name and access of the member in the containing class (- for private, + for public). The arrow is also decorated with the "multiplicity" of the relationship, where 0..1 means there is 1 instance of the member in the containing class and 0..* means there are many, usually indicating a collection such as an array. (`StudentDirectory` has a private member named `studentDirectory` that is an array of `Student`s.)

The details of the classes are mostly described in [Lab 01](../01-lab/01-lab-design).  The modifications to each of the classes for Lab 03 are previewed below.

  * [edu.ncsu.csc216.pack_scheduler.user.Student](03-lab-student)
     * `Student` now implements the `Comparable` interface and therefore defines the `compareTo()` method.
  * [edu.ncsu.csc216.pack_scheduler.io.StudentRecordIO](03-lab-studentrecordio)
     * `StudentRecordIO` now uses the `SortedList` class rather than `ArrayList`.  Both the `readStudentRecords()` and `writeStudentRecords()` method headers are updated.
  * [edu.ncsu.csc216.pack_scheduler.directory.StudentDirectory](03-lab-studentdirectory)
     * `StudentDirectory`'s field `studentDirectory` is a `SortedList`.  No method headers are changed.
  * [edu.ncsu.csc216.pack_scheduler.ui.StudentDirectoryPanel](03-lab-test)
     * There are no changes to the GUI.

