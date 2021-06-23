---
title: CSC 217 Lab 07 - ArrayLists
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab07]
description: CSC 217 Lab 07 - Design
navigation: on
pagegroup: 07-lab
---

# CSC 217 Lab 07 Design
{% include iconHeader.html type="design" %}
The design for Lab 07 is shown below.  To follow the development paradigm of *additive change*, the custom `ArrayList` will be implemented in the `edu.ncsu.csc216.pack_scheduler.util` package.  The `Schedule` will be implemented in the `edu.ncsu.csc216.pack_scheduler.user.schedule` package.  The only change to the remainder of the design occurs in the `Student` class, which now has a `Schedule` as per the [requirements](07-lab-requirements).

Note that the tool used to generate the class diagrams does not include generic return types in the diagrams.  If a method is missing a return type, the return type should be `E`.  In this case, `remove(int)`, `set(int, E)`, and `get(int)` should all return type `E`.

{% include image.html file="images/StudentSchedule_Lab7_ClassDiagram.gif" caption="Figure: Lab 07 Student Schedule in PackScheduler" %} 

The figure above is an example of a **UML class diagram**. Each class is represented by a rectangle; the text in the class describes the class members. Arrows indicate relationships between classes. The software used to generate the diagram in the figure uses the following notation conventions:

  * A square (empty or solid) in front of a name means private. Solid squares are operations, empty squares are data.
  * A green circle in front of a name means public. Solid circles are operations, empty circles are data.
  * Members embellished with S are static. 
  * Members embellished with SF are static, final. (`Student.MAX_CREDITS` is public, static, and final.)
  * Methods embellished with C are constructors. (See `Student.Student()`.)
  * Solid arrows with simple heads indicate *has-a* relationships, in which one class has a member whose type is another class or interface. The containing class is at the tail of the arrow and the class that is contained is at the head. The arrow is decorated with the name and access of the member in the containing class (- for private, + for public). The arrow is also decorated with the "multiplicity" of the relationship, where 0..1 means there is 1 instance of the member in the containing class and 0..* means there are many, usually indicating a collection such as an array. (`Student` has a private member named `schedule` that is a `Schedule`.)
  * The connector with a circle containing a cross indicates an inner class relationship.  The class with the crossed circle is the enclosing class and the other class is the inner class.

The next sections of the lab activity will provide details about how to implement the changes to the design.
