---
title: CSC 217 Lab 09 - Stacks and Queues
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab09]
description: CSC 217 Lab 09 - Design
navigation: on
pagegroup: 09-lab
---

# CSC 217 Lab 09 Design
{% include iconHeader.html type="design" %}
The design for Lab 09 is shown below.  To follow the development paradigm of *additive change*, the custom Stacks and Queues classes will be implemented in the `edu.ncsu.csc216.pack_scheduler.util` package.  The `CourseRoll` will be implemented in the `edu.ncsu.csc216.pack_scheduler.course.roll` package. 

{% capture callout_content %}
There are missing names in the class diagram for a reason!  Part of this lab will be to determine which specialized data structure implementation to use for the waitlist functionality.  
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}

{% include image.html file="images/StudentSchedule_Lab9_ClassDiagram.gif" caption="Figure: Lab 09 CourseRoll in PackScheduler" %} 
The figure above is an example of a **UML class diagram**. Each class is represented by a rectangle; the text in the class describes the class members. Arrows indicate relationships between classes. The software used to generate the diagram in the figure uses the following notation conventions:

  * A square (empty or solid) in front of a name means private. Solid squares are operations, empty squares are data.
  * A green circle in front of a name means public. Solid circles are operations, empty circles are data.
  * Members embellished with S are static. 
  * Members embellished with SF are static, final. (`Student.MAX_CREDITS` is public, static, and final.)
  * Methods embellished with C are constructors. (See `Student.Student()`.)
  * Solid arrows with simple heads indicate *has-a* relationships, in which one class has a member whose type is another class or interface. The containing class is at the tail of the arrow and the class that is contained is at the head. The arrow is decorated with the name and access of the member in the containing class (- for private, + for public). The arrow is also decorated with the "multiplicity" of the relationship, where 0..1 means there is 1 instance of the member in the containing class and 0..* means there are many, usually indicating a collection such as an array. (`Student` has a private member named `schedule` that is a `Schedule`.)
  * The connector with a circle containing a cross indicates an inner class relationship.  The class with the crossed circle is the enclosing class and the other class is the inner class.

The following sections will provide (some) details about how to implement the changes to the design.

The design shows the that waitlist is some type of collection that implements some type of interface.  You will determine which interface you will implement and which concrete type of list will be the underlying data structure!

