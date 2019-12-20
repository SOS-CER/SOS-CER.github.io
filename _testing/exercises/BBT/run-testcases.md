---
title: Testing Lab Exercises (BBT)
tags: [Testing Exercises, CS1, CSC116, java, programming]
description: "Running Black Box Tests"
navigation: on
pagegroup: testing-exercise-BBT
---

# Running Black Box Tests
{% include iconHeader.html type="systemTest" %}

Place [SomewhatMoreSimplifiedSolitaire.class](SomewhatMoreSimplifiedSolitaire.class) in your `bin` directory.

Your Black Box Test Plan should contain the results of running your test cases on the implementation. Note that if the expected and actual results are not the same, there is a bug in the code; highlight these tests in yellow. You should not correct the bug at this point since you do not have the .java file.

To execute the `SomewhatMoreSimplifiedSolitaire` program, make sure you are in your top-level project directory (`SomewhatMoreSimplifiedSolitaire`) and use the following command:

```terminal
$ java -cp bin SomewhatMoreSimplifiedSolitaire
```

{% include callout.html type="learningOutcomes" content="The `-cp` argument tells Java the *classpath* where the compiled `.class` files are located. Here, we tell Java that the `.class` files are in the `bin` directory. "%} 
