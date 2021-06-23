---
title: CSC 217 Lab 08 - LinkedAbstractList
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab08]
description: CSC 217 Lab 08 - Design
navigation: on
pagegroup: 08-lab
---
# CSC 217 Lab 08 Design
{% include iconHeader.html type="design" %}
The design for Lab 08 is shown below.  To follow the development paradigm of *additive change*, the custom `LinkedAbstractList` will be implemented in the `edu.ncsu.csc216.pack_scheduler.util` package.  The `CourseRoll` will be implemented in the `edu.ncsu.csc216.pack_scheduler.course.roll` package.  `Course` and `CourseRecordIO` will require some additional work to add the enrollment capacity and `CourseRoll` object (which is a more invasive change, but needed to maintain a good object design).  There are additional minor changes to `Schedule`, `Student`, and `EnrollmentManager` to simplify the logic for adding `Student`s to `CourseRoll`s and adding `Course`s to `Schedule`s.

Note that the tool used to generate the class diagrams does not include generic return types in the diagrams.  If a method is missing a return type, the return type should be `E`.  In this case, `LinkedAbstractList.get(int)`, `LinkedAbstractList.remove(int)`, and `LinkedAbstractList.set(int, E)` should all return type `E`.

![*Lab 08 Student Schedule in `PackScheduler`*](images/StudentSchedule_Lab8_ClassDiagram.gif)

The figure above is an example of a **UML class diagram**. Each class is represented by a rectangle; the text in the class describes the class members. Arrows indicate relationships between classes. The software used to generate the diagram in the figure uses the following notation conventions:

  * A square (empty or solid) in front of a name means private. Solid squares are operations, empty squares are data.
  * A green circle in front of a name means public. Solid circles are operations, empty circles are data.
  * Members embellished with S are static. 
  * Members embellished with SF are static, final. (`Student.MAX_CREDITS` is public, static, and final.)
  * Methods embellished with C are constructors. (See `Student.Student()`.)
  * Solid arrows with simple heads indicate *has-a* relationships, in which one class has a member whose type is another class or interface. The containing class is at the tail of the arrow and the class that is contained is at the head. The arrow is decorated with the name and access of the member in the containing class (- for private, + for public). The arrow is also decorated with the "multiplicity" of the relationship, where 0..1 means there is 1 instance of the member in the containing class and 0..* means there are many, usually indicating a collection such as an array. (`Student` has a private member named `schedule` that is a `Schedule`.)
  * The connector with a circle containing a cross indicates an inner class relationship.  The class with the crossed circle is the enclosing class and the other class is the inner class.

The following sections will provide details about how to implement the changes to the design.

The major changes are:

  * `LinkedAbstractList`: new class
  * `CourseRoll`: new class
  * `Course`: new field and method; new parameter in the constructor
     * `roll`: `CourseRoll` object that is constructed with the new `enrollmentCap` parameter in the `Course` constructor
     * `getCourseRoll()`: returns the `CourseRoll` for the `Course`
  * `CourseRecordIO`: updated to handle enrollment capacity
  * `CourseCatalog`: updated to handle enrollment capacity 
  * `Schedule`: new method `canAdd()` that returns true the `Course` can be added to the `Schedule` and `getScheduleCredits()` that returns the number of credits in the schedule
  * `Student`: new method `canAdd()` that returns true if the `Course` can be added to the `Student`'s schedule
  * `EnrollmentManager`: three new methods for enrollment, drop, and schedule reset
  * The GUI classes are also updated and provided later.
