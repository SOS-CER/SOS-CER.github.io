---
title: Comprehensive Exercise
description: Testing
tags:  [software engineering, software lifecycle, CS1, CSC, Implementation]
navigation: on
pagegroup: comprehensive-exercise
---
# Testing
{% include iconHeader.html type="systemTest,unitTest" %}

The _test phase_ is "the period of time in the software life cycle during which the components of a software product are evaluated and integrated, and the software product is evaluated to determine whether or not requirements have been satisfied" [1].  While there are several different types of tests, the focus will be on _unit tests_ and _system tests_.  Unit tests focus on evaluation of individual methods or modules and are typically written by the developer [1].  System tests evaluate a completed system to ensure that the requirements are met [1].


## TASK: Testing
{% include iconHeader.html type="teamTask" %}

During this phase of the process, you will thoroughly test your project. This testing will include white box and black box testing. Each class you have written should have an associated white box test program. Complete the Black Box Test Plan by running the program and filling in the Actual Results column. You may also find that you need to add additional black box test to your plan.

Use the journal prompts listed in the [comprehensive exercise report](./team-documentation) to guide your planning for white box testing and document your thought process (or any decisions made). The formal documentation of Testing should include a list of your test programs along with descriptions of what they are testing.

Note: You should work on the [implementation](./implementation) and testing concurrently.

## TASK: Reflection
{% include iconHeader.html type="individualTask" %}

Once you have completed the implementation AND testing tasks, each student should individually complete the reflection on [implementation and testing]({{site.data.comprehensive-exercise.imp-test-reflection}}).

##  Additional Resources

{% for res in site.data.comprehensive-exercise.testing-resources %}
* [{{res.resource}}]({{res.url}}){% if res.note %} {{res.note}}{% endif%}{% endfor %}

## References

[1] "Systems and software engineering – vocabulary," ISO/IEC/IEEE 24765:2010(E), pp. 1–418, Dec 2010.