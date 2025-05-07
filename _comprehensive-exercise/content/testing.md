The _test phase_ is "the period of time in the software life cycle during which the components of a software product are evaluated and integrated, and the software product is evaluated to determine whether or not requirements have been satisfied".[^IEEE2010]  While there are several different types of tests, the focus will be on _unit tests_ and _system tests_.  Unit tests focus on evaluation of individual methods or modules and are typically written by the developer.[^IEEE2010]  System tests evaluate a completed system to ensure that the requirements are met.[^IEEE2010]


**Goal:**  Execute software with intent of finding errors


**Software Artifacts:** test code (including test harnesses, scaffolding, etc.), bug database, test database, test inputs and outputs, documentation



{% for res in site.data.comprehensive-exercise.testing-resources %}
* [{{res.resource}}]({{res.url}}){:target="_blank"}{% if res.note %} {{res.note}}{% endif%}{% endfor %}