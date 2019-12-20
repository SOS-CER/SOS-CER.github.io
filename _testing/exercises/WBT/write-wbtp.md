---
title: Testing Lab Exercises (WBT)
tags: [Testing Exercises, CS1, CSC116, java, programming]
description: "Create White-Box Test Cases"
navigation: on
pagegroup: testing-exercise-WBT
---

# Create White-Box Test Cases
{% include iconHeader.html type="unitTest" %}


1. Within the given `SomewhatMoreSimplifiedSolitaireTest.java`, create at least two test cases for each of the public methods in `SomewhatMoreSimplifiedSolitaire.java`. Your test cases must be non­-redundant, repeatable, and specific! Non­-redundant means that each test case should correspond to a unique error condition or a unique combination of valid inputs. Be sure to consider:
    - paths through the code
    - equivalence classes
    - boundary values
2. Compile and execute your `SomewhatMoreSimplifiedSolitaireTest.java`. Some of the test cases may fail! 

## Hints for Creating White-Box Test Cases

- The control flow diagram and looking at the paths through your code can help you come up with different test cases.
- Test cases for `encrypt` and `decrypt` could come from your BBT since they are testing the full algorithm.
- The `moveFirstJokerDownOne`, `moveSecondJokerDownTwo`, `tripleCut`, and `moveToBack` methods relate to a single step of the algorithm. Look back at your notes from BBT to help you come up with test cases that test equivalence classes and boundary values.