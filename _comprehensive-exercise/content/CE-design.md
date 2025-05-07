# Design

{% include iconHeader.html type="design" %}

{% capture lectureDesign %}
{% include_relative content/design.md %}
{% endcapture %}
{% include expand.html title="Expand for Design Overview" content=lectureDesign %}


## Hints & Suggestions

{% capture DesignHints %}
The following are helpful hints[^BS09] for working on your design:

1. Determine the classes that your implementation will use. 
    * Begin by noting the nouns in the requirements/analysis documentation (or problem statement).
    * These nouns give us a good starting point for considering possible classes.
    * Not all nouns will become classes. Some nouns may become attributes/fields (see 3). Other nouns may not become classes or attributes/fields.
    * Not all classes will correspond to nouns of problem statement.
    * Once you have a list of possible classes, consider different design options along with the pros and cons of each. We often do not come up with the best design on our first attempt.
2. Determine the methods for each class. 
    * “As the nouns indicate classes, the verbs of the problem statement help determine class responsibilities.”[^BS09]
    * Consider:
        * What service does the class provide?
        * What is each class’s responsibility?
        * What are the actions and behaviors of each class?
        * What attributes/fields used in the methods?
    * Not all verbs will become methods.
    * Not all methods will correspond to verbs in the problem statements.
3. Determine the attributes/fields of each class by observing which classes need to send messages to which.
    * Nouns can also help with these
    * Remember, not all nouns will become classes or attributes/fields.
    * Not all attributes/fields will correspond to nouns in the problem statement.
4. Refine your design. Write headers for all methods, but do not implement the methods. 
5. It may be helpful to consider particular algorithms that you may need and write pseudocode. Do not write actual code!

### Reference 

[^BS09]: Ralph Bravaco and Shai Simonson, *Java Programming: From the Ground Up*, 1st edition, 2009.
{% endcapture %}
{% include expand.html title="Expand for Design Hints & Suggestions" content=DesignHints %}

## TASK: Design
{% include iconHeader.html type="teamTask" %}

Use the helpful hints above and the journal prompts listed in the [comprehensive exercise report](#team-documentation) to guide your design process and document your thought process (or any decisions made). For your software design, you will include the classes, methods, and fields that will used in the project. Your design should include UML class diagrams in which the connection between classes is shown. You still will not be writing code at this point in the process.

During the design phase, you should also consider the user interface. Will you use the text-based console or a graphical user interface (GUI)? If your design includes writing or drawing on paper, please scan (or take pictures of) the paper and include digital version in document. Recall that clients do not always know what they want from the beginning of the software process and requirements may change. Consider the flexibility of your design as you complete this portion of the exercise.

**Prior to starting the formal documentation, you should show your instructor your answers to the journal prompts.**

{% capture design %}
Your design must include at least two classes that define object types.
{% endcapture %}
{% include callout.html type="reminder" title="Design" content=design %}

## TASK: Design Reflection
{% include iconHeader.html type="individualTask" %}

Once you have completed the design task, ***each student*** should ***individually*** complete the reflection on [design]({{site.data.comprehensive-exercise.design-reflection}}){:target="_blank"}.

##  Additional Resources for Design

{% for res in site.data.comprehensive-exercise.design-resources %}
* [{{res.resource}}]({{res.url}}){:target="_blank"}{% if res.note %} {{res.note}}{% endif%}{% endfor %}

