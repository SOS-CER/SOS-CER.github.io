---
title: Testing Lab Exercises (DE Section)
tags: [Testing Exercises, CS1, CSC116, java, programming]
description: "White Box Test Plan: Triangle classification by side lengths"
navigation: on
pagegroup: testing-exercise-DE
---

# WBTP: Triangle classification by side lengths
{% include iconHeader.html type="unitTest" %}

## Control Flow Diagrams

First, you will draw control flow diagrams for the following methods: `isValidTriangleSideLength` and `getTriangleTypeSideLength`. Calculate the cyclomatic complexity of each method. You may consider using <https://www.draw.io>.

## Writing White Box Test Cases

You have been given a starter test class ([TriangleClassificationTest.java](TriangleClassificationTest.java)), which you should place in your `test` directory. You should add 10 test cases to the test class:[^1] five test cases for `isValidTriangleSideLength` and five test cases for `getTriangleTypeSideLength`. Your test cases must be non-redundant, repeatable, and specific! *Non-redundant* means that each test case should correspond to a unique error condition or a unique combination of valid inputs. Be sure to consider paths through the code, equivalence classes, and boundary values when designing your test cases. 

Run the test cases on the given TriangleClassification program, and fix the program until all your test cases pass. At this point, you should ***only*** be making changes related to side length failing tests. (You may need to modify your control flow graph as you edit your program).

## Compiling and Executing White Box Tests

Download [TriangleClassification.java](TriangleClassification.java) to your `src` directory.

Assuming you are currently in your top-level project directory (`TriangleClassification`):

* compile your source code using the following command:
```
javac -d bin src/TriangleClassification.java
```
* compile your test code using the following command: 
```
javac -d bin -cp bin:lib/* test/TriangleClassificationTest.java
```
* execute your test code using the following command:
```
 java -cp bin:lib/* org.junit.runner.JUnitCore TriangleClassificationTest
```

## Footnotes

[^1]: Note that `TriangleClassificationTest.java` contains test methods for angles. You will be testing angles in a later step once you finishing testing for side length.
