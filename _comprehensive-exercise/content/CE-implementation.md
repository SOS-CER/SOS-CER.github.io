# Implementation
{% include iconHeader.html type="implementation" %}

{% capture lectureImplementation %}
{% include_relative content/implementation.md %}



## References

[^IEEE2010]: "Systems and software engineering – Vocabulary," ISO/IEC/IEEE 24765:2010(E), pp. 1–418, Dec. 2010.

[^Williams]:  L. Williams, An Introduction to Software Engineering. Amazon Digital Services LLC, 2013.

[^HJD05]: Elizabeth Hull, Ken Jackson, and Jeremy Dick. *Requirements Engineering.* Springer, London, 2nd edition, 2005.

[^BS09]: Ralph Bravaco and Shai Simonson, *Java Programming: From the Ground Up*, 1st edition, 2009.
{% endcapture %}
{% include expand.html title="Expand for Implementation Overview" content=lectureImplementation %}



## TASK: Implementation
{% include iconHeader.html type="teamTask" %}

During this phase of the process, you will begin to write code for the software you designed in the previous step. As you write code, remember to include proper documentation.

In the journal section of the [comprehensive exercise report](#team-documentation), identify a list of programming concepts you will need to implement your design and how they will be applied. In the formal documentation of Implementation, you should include a README for the user that explains how they will interact with the system (e.g., how to compile and run).

Note: You should work on the implementation and [testing](#testing) concurrently.

## TASK: Implementation Reflection
{% include iconHeader.html type="individualTask" %}

Once you have completed the implementation AND testing tasks, ***each student*** should ***individually*** complete the reflection on [implementation and testing]({{site.data.comprehensive-exercise.imp-test-reflection}}){:target="_blank"}.

##  Additional Resources

{% for res in site.data.comprehensive-exercise.imp-resources %}
* [{{res.resource}}]({{res.url}}){:target="_blank"}{% if res.note %} {{res.note}}{% endif%}{% endfor %}
