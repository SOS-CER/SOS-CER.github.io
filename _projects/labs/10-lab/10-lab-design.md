---
title: CSC 217 Lab 10 - Iterators
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab10]
description: CSC 217 Lab 10 - Design
navigation: on
pagegroup: 10-lab
---

# CSC 217 Lab 10 Design
{% include iconHeader.html type="design" %}
The design for Lab 10 is shown below.  To follow the development paradigm of *additive change*, the custom `LinkedList` will be implemented in the `edu.ncsu.csc216.pack_scheduler.util` package.  The `Faculty` functionality will be added as separate classes throughout the major user packages and integrated into `RegistrationManager` in a manner similar to `Student` functionality.  Use `Student` and associated classes as a guide about how to integrate `Faculty` at every level.

{% include image.html file="images/Faculty_Lab10_ClassDiagram.gif" caption="Figure: Lab 10 Faculty in PackScheduler" %} 

The figure above is an example of a **UML class diagram**. Each class is represented by a rectangle; the text in the class describes the class members. Arrows indicate relationships between classes. The software used to generate the diagram in the figure uses the following notation conventions:

  * A square (empty or solid) in front of a name means private. Solid squares are operations, empty squares are data.
  * A green circle in front of a name means public. Solid circles are operations, empty circles are data.
  * Members embellished with S are static. 
  * Members embellished with SF are static, final. (`Faculty.MAX_COURSES` is public, static, and final.)
  * Methods embellished with C are constructors. (See `Faculty.Faculty()`.)
  * Solid arrows with simple heads indicate *has-a* relationships, in which one class has a member whose type is another class or interface. The containing class is at the tail of the arrow and the class that is contained is at the head. The arrow is decorated with the name and access of the member in the containing class (- for private, + for public). The arrow is also decorated with the "multiplicity" of the relationship, where 0..1 means there is 1 instance of the member in the containing class and 0..* means there are many, usually indicating a collection such as an array. (`FacultyDirectory` has a private member named `facultyDirectory` that is a `LinkedList`.)
  * The connector with a circle containing a cross indicates an inner class relationship.  The class with the crossed circle is the enclosing class and the other class is the inner class.

The following sections will provide details about how to implement the changes to the design.
