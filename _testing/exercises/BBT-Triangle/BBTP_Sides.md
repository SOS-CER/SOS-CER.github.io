---
title: Testing Lab Exercises (BBT - Triangle)
tags: [Testing Exercises, CS1, CSC116, java, programming]
description: "Black Box Test Plan: Triangle classification by side lengths"
navigation: on
pagegroup: testing-exercise-BBT-Triangle
---

# BBTP: Triangle classification by side lengths
{% include iconHeader.html type="systemTest" %}

## Black Box Test Plan Starter File

For the Black Box Test plan, you will be using [this starter file](https://docs.google.com/a/ncsu.edu/document/d/1FhPC6vXaVBt2sH9i7KqL5T3GSfcxjtqotNVgps0gGgg/edit?usp=sharing).

### Setting up the Google Document
1. Open [file](https://docs.google.com/a/ncsu.edu/document/d/1FhPC6vXaVBt2sH9i7KqL5T3GSfcxjtqotNVgps0gGgg/edit?usp=sharing)
2. File > Make a copy
3. Share (edit permissions) with teammate/s

<!---3. Add your section and group letter to name of file
4. Share (edit permissions) with teammate/s (present today)
5. Share (edit permissions) with your instructor and TAs.--->

## Writing Black Box Tests

Given the Black Box Test Plan, you should add at least 5 more black box test cases for ***side length***.[^1] Your test cases must be non-redundant, repeatable, and specific! *Non-redundant* means that each test case should correspond to a unique error condition or a unique combination of valid inputs. Be sure to consider equivalence classes and boundary values when designing your test cases. Remember: For the black box test plan, you should not look at the code. Instead your tests should only be based on the [requirements](index#requirements) given.

## Running Test Cases

Place [TriangleClassification.class](TriangleClassification.class) in your `bin` directory.

Your Black Box Test Plan should contain the results of running your test cases on the implementation. Note that if the expected and actual results are not the same, there is a bug in the code. You should not correct the bug at this point.

To execute the `TriangleClassification` program, make sure you are in your top-level project directory (`TriangleClassification`) and use the following command:

```
 java -cp bin TriangleClassification
```

{% include callout.html type="learningOutcomes" content="The `-cp` argument tells Java the *classpath* where the compiled `.class` files are located. Here, we tell Java that the `.class` files are in the `bin` directory. "%} 


## Footnotes
[^1]: Note that the Black Box Test Plan contains a sample test for angles. You will be testing angles in a later step.


