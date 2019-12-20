---
title: Testing Lab Exercises (BBT)
tags: [Testing Exercises, CS1, CSC116, java, programming]
description: "Running Black Box Tests"
navigation: on
pagegroup: testing-exercise-BBT-sss
---

# Running Black Box Tests
{% include iconHeader.html type="systemTest" %}

Place [SomewhatSimplifiedSolitaire.class](SomewhatSimplifiedSolitaire.class) in your `bin` directory.

Your Black Box Test Plan should contain the results of running your test cases on the implementation. Note that if the expected and actual results are not the same, there is a bug in the code. You should not correct the bug at this point.

To execute the `SomewhatSimplifiedSolitaire` program, make sure you are in your top-level project directory (`SomewhatSimplifiedSolitaire`) and use the following command:

```
 java -cp bin SomewhatSimplifiedSolitaire
```

{% include callout.html type="learningOutcomes" content="The `-cp` argument tells Java the *classpath* where the compiled `.class` files are located. Here, we tell Java that the `.class` files are in the `bin` directory. "%} 
