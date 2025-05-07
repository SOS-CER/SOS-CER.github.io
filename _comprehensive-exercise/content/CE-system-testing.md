# System Test Planning
{% include iconHeader.html type="systemTest" %}

{% capture lectureSystemTesting %}
{% include_relative content/system-test-plan.md %}
{% endcapture %}
{% include expand.html title="Expand for System Testing Overview" content=lectureSystemTesting %}

## TASK: System Test Plan
{% include iconHeader.html type="teamTask" %}

We are completing the system test plan prior to the design because, as discussed in the testing lecture earlier this semester, the system tests should only be based on your requirements and should work independent of design. You currently know the program input and output based on the requirements you documented. How exactly the user will interact with the system/program will come out of the design; you can be general with this for now. The Actual Results column of the system test plan will remain blank for now until you have implemented your software.
 Discussion and formal documentation will be done in [your team's report file](#team-documentation). 
 
## TASK: System Testing Reflection
{% include iconHeader.html type="individualTask" %}

Once you have completed the system test plan task, ***each student*** should ***individually*** complete the reflection on [system testing]({{site.data.comprehensive-exercise.st-reflection}}){:target="_blank"}.

##  Additional Resources

{% for res in site.data.comprehensive-exercise.testing-resources %}
* [{{res.resource}}]({{res.url}}){:target="_blank"}{% if res.note %} {{res.note}}{% endif%}{% endfor %}


