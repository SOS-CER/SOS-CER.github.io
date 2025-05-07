# Testing
{% include iconHeader.html type="systemTest,unitTest" %}


{% capture lectureTesting %}
{% include_relative content/testing.md %}



## References

[^IEEE2010]: "Systems and software engineering – Vocabulary," ISO/IEC/IEEE 24765:2010(E), pp. 1–418, Dec. 2010.

[^Williams]:  L. Williams, An Introduction to Software Engineering. Amazon Digital Services LLC, 2013.

[^HJD05]: Elizabeth Hull, Ken Jackson, and Jeremy Dick. *Requirements Engineering.* Springer, London, 2nd edition, 2005.

[^BS09]: Ralph Bravaco and Shai Simonson, *Java Programming: From the Ground Up*, 1st edition, 2009.
{% endcapture %}
{% include expand.html title="Expand for Testing Overview" content=lectureTesting %}

## TASK: Testing
{% include iconHeader.html type="teamTask" %}

During this phase of the process, you will thoroughly test your project. This testing will include system, unit, and itegration testing. Each class you have written should have an associated unit test program. Complete the System Test Plan by running the program and filling in the Actual Results column. You may also find that you need to add additional system tests to your plan.

Use the journal prompts listed in the [comprehensive exercise report](#team-documentation) to guide your planning for unit testing and document your thought process (or any decisions made). The formal documentation of Testing should include a list of your test programs along with descriptions of what they are testing.

Note: You should work on the [implementation](#implementation) and testing concurrently.

## TASK: Testing Reflection
{% include iconHeader.html type="individualTask" %}

Once you have completed the implementation AND testing tasks, ***each student*** should ***individually***  complete the reflection on [implementation and testing]({{site.data.comprehensive-exercise.imp-test-reflection}}){:target="_blank"}.

##  Additional Resources

{% for res in site.data.comprehensive-exercise.testing-resources %}
* [{{res.resource}}]({{res.url}}){:target="_blank"}{% if res.note %} {{res.note}}{% endif%}{% endfor %}
