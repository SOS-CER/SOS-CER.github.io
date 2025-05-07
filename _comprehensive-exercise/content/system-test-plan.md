System testing ignores the internals of the program and instead focuses on the inputs and the expected results of the program as defined by the requirements. The tester treats the program as a "black box"; the program implementation that generates the program output is unknown. The tester identifies the expected program output from the requirements and can compare the actual output with the expected output.


{% for res in site.data.comprehensive-exercise.testing-resources %}
* [{{res.resource}}]({{res.url}}){:target="_blank"}{% if res.note %} {{res.note}}{% endif%}{% endfor %}