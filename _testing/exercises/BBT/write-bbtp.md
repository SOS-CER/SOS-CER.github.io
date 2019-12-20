---
title: Testing Lab Exercises (BBT)
tags: [Testing Exercises, CS1, CSC116, java, programming]
description: "Black Box Test Plan"
navigation: on
pagegroup: testing-exercise-BBT
---

# Black Box Test Plan
{% include iconHeader.html type="systemTest" %}

## Black Box Test Plan Starter File

For the Black Box Test plan, you will be using [this starter file](https://docs.google.com/document/d/1dESw_B3SSzB1H5LFpW5JcbeWfiYkFr1PCsucamnF3nU/edit#heading=h.yg4kq2yer813).

### Setting up the Google Document
1. Open [file](https://docs.google.com/document/d/1dESw_B3SSzB1H5LFpW5JcbeWfiYkFr1PCsucamnF3nU/edit#heading=h.yg4kq2yer813)
2. File > Make a copy
3. Share (edit permissions) with teammate/s

<!---3. Add your section and group letter to name of file
4. Share (edit permissions) with teammate/s (present today)
5. Share (edit permissions) with your instructor and TAs.--->

## Writing Black Box Tests

Create at least 10 black-box test cases (in addition to the two you were given) for the Somewhat More Simplified Solitaire software.[^non-error] Your test cases must be non-redundant, repeatable, and specific! 
*Non-redundant* means that each test case should correspond to a unique error condition or a unique combination of valid inputs.  Remember to test against the requirements, incorporate equivalence classes, and incorporate boundary testing. Beneath your Test ID, indicate which strategy you used when developing the test case (*R* for requirements, *EC* for equivalence classes, *BV* for boundary testing). 

For the black box test plan, you should not look at the code.[^class] Instead your tests should only be based on the [requirements](index#requirements) given.

### Hints for Writing Black Box Tests

- Remember that for each test, you will have to go through the [full algorithm](../../../smssolitaire) for each letter.
- Use the Notes section of the google document or your README.md to write out each step of the algorithm (similar to HELLO example in [Dr. Schmidt's lecture slides](https://pages.github.ncsu.edu/engr-csc116-staff/Schmidt/Slides/LabDiscussions/CSC116_Lab10-BBT.pdf) and on the [algorithm description](../../../smssolitaire/#example)). This will allow to look back at the steps if you find a mistake in your application of the algorithm.
- If you create a Encrypt test case, you can easily write the Decrypt test case without going through the algorithm again. See the two test cases that were given.
- To come up with test cases, look through the algorithm and consider equivalence classes and boundary values (e.g., placement of jokers).
- You want your message to be multiple letters long so that you test going through the algorithm multiple times in a row, but for your sanity, you likely do not want long messages.

## Footnote
[^class]: We are intentionally providing you with a compiled version of the program so that you do not look at the code.
[^non-error]: For the 10 black-box test cases for this exercise, the expected output should be the encrypted or decrypted message, not an error.