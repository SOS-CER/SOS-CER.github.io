---
title: Comprehensive Exercise
description: Black-Box Test Planning
tags:  [software engineering, software lifecycle, CS1, CSC, Black-Box Testing]
navigation: on
pagegroup: comprehensive-exercise
---
# Black-Box Test Planning
{% include iconHeader.html type="systemTest" %}

Black box testing, which is also called functional or system testing, ignores the internals of the program and instead focuses on the inputs and the expected results of the program as defined by the requirements. The tester treats the program as a "black box"; the program implementation that generates the program output is unknown. The tester identifies the expected program output from the requirements and can compare the actual output with the expected output.

## TASK: Black-Box Test Plan
{% include iconHeader.html type="teamTask" %}

We are completing the black box test plan prior to the design because, as discussed in the testing lecture earlier this semester, the black box tests should only be based on your requirements and should work independent of design. You currently know the program input and output based on the requirements you documented. How exactly the user will interact with the system/program will come out of the design; you can be general with this for now. The Actual Results column of the black box test plan will remain blank for now until you have implemented your software.
 Discussion and formal documentation will be done in [your team's report file](./team-documentation). 
 
## TASK: Reflection
{% include iconHeader.html type="individualTask" %}

Once you have completed the black-box test plan task, each student should individually complete the reflection on [black-box testing]({{site.data.comprehensive-exercise.bbt-reflection}}).

##  Additional Resources

{% for res in site.data.comprehensive-exercise.testing-resources %}
* [{{res.resource}}]({{res.url}}){% if res.note %} {{res.note}}{% endif%}{% endfor %}
