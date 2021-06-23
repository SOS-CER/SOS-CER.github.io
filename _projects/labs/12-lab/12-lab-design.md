---
title: CSC 217 Lab 12 - Graphical User Interfaces
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab12]
description: CSC 217 Lab 12 - Design
navigation: on
pagegroup: 12-lab
---
# CSC 217 Lab 12 Design
{% include iconHeader.html type="design" %}
The design for Lab 12 is shown below.  To follow the development paradigm of *additive change*, you will implement the main Faculty functionality in `FacultySchedulePanel`.  

You will need to add a method to `CourseRoll` or some other class in your program to return the information about the `Student`s enrolled in a selected `Course`.  You may decide where that method goes in your design.  The teaching staff tests will not evaluate that functionality at a unit level.

Note that this design is provided as guidance, but you are NOT required to follow this design exactly as listed.  We can only evaluate the GUI through black box tests, so if you have a different design, including modifications to existing classes, that is ok.

The guidelines that you must follow for GUI design are as follows:

  * The GUI should be as easy as possible for the PTFs to manually grade (name things well, easy to find, etc.). [Of course, we're not grading them, but it's a good guideline.]
  * The GUI should NOT hurt the PTFs eyes. [Again, not grading, but good guideline.]

{% include image.html file="images/PackScheduler_UI_ClassDiagram.gif" caption="Figure: Lab 12 PackSchedule UI Design" %} 

The figure above is an example of a **UML class diagram**. Each class is represented by a rectangle; the text in the class describes the class members. Arrows indicate relationships between classes. The software used to generate the diagram in the figure uses the following notation conventions:

  * A square (empty or solid) in front of a name means private. Solid squares are operations, empty squares are data.
  * A green circle in front of a name means public. Solid circles are operations, empty circles are data.
  * Members embellished with S are static. 
  * Members embellished with SF are static, final. 
  * Methods embellished with C are constructors. 
  * Solid arrows with simple heads indicate *has-a* relationships, in which one class has a member whose type is another class or interface. The containing class is at the tail of the arrow and the class that is contained is at the head. The arrow is decorated with the name and access of the member in the containing class (- for private, + for public). The arrow is also decorated with the "multiplicity" of the relationship, where 0..1 means there is 1 instance of the member in the containing class and 0..* means there are many, usually indicating a collection such as an array. 
  * The connector with a circle containing a cross indicates an inner class relationship.  The class with the crossed circle is the enclosing class and the other class is the inner class.

The following sections will provide details about how to implement the changes to the design.

