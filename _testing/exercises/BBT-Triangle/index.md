---
title: Software Testing
tags: [Testing Exercises, CS1, CSC116, java, programming]
description: "Testing Lab Exercises (BBT - Triangle)"
navigation: on
pagegroup: testing-exercise-BBT-Triangle
---

# Testing Lab Exercises (BBT - Triangle)

The CSC116 Software Testing materials can be found [here](../..). For the testing lab, you will be testing a program that classifies triangles based on sides and angles.

{% capture callout_content %}
  * Describe the purpose of testing.
  * Describe the testing process.
  * Describe how black box and white box testing differ and why each are necessary.
  * Describe the purpose of black box testing.
  * Write black box test cases in table form (Black Box Test Plan) based on program requirements.
  * Write black box test cases using equivalence classes and boundary value analysis.
{% endcapture %}
{% include callout.html type="learningOutcomes" title="Learning Outcomes" content=callout_content%}

## Requirements
{% include iconHeader.html type="requirements" %}

The `TriangleClassification` program can be used to determine the classification of triangles either based on their side lengths or angles. The program should first prompt the user about which classification type (sides or angles) they would like to use. Depending on the classification type, the user is either prompted for the three sides or angles of the triangle. If the user provides invalid measurements for a triangle, an error message is printed; otherwise, the type of triangle is printed. The program assumes that the user will only enter integer values.

Both classification types require valid triangles:

* Invalid triangle for side lengths: if one side’s length is longer than (or equal to) the sum of the other two, or a side length is non-positive.
* Invalid triangle for angles: if three angles do not add to 180 degrees, or angle is less than or equal to 0.

Triangle Classifications by Side Lengths

* Equilateral: all three sides are same length
* Isosceles: two sides are same length
* Scalene: none of the sides are the same length

Triangle Classifications by Angles 

* Acute: all angles are less than 90 degrees
* Right: one right angle (90 degrees)
* Obtuse: one angle is greater than 90 degrees


## Implementation
{% include iconHeader.html type="implementation" %}

You will be testing the given TriangleClassification implementation.


## Lab Tasks
You are expected to complete the following tasks to complete this lab:

{% include tableOfContents.html pagegroup="testing-exercise-BBT-Triangle"%}
