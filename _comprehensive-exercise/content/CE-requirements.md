# Requirements/Analysis
{% include iconHeader.html type="requirements" %}

{% capture lectureRequirements %}
{% include_relative content/requirements.md %}


## References

[^IEEE2010]: "Systems and software engineering – Vocabulary," ISO/IEC/IEEE 24765:2010(E), pp. 1–418, Dec. 2010.

[^Williams]:  L. Williams, An Introduction to Software Engineering. Amazon Digital Services LLC, 2013.

[^HJD05]: Elizabeth Hull, Ken Jackson, and Jeremy Dick. *Requirements Engineering.* Springer, London, 2nd edition, 2005.

[^BS09]: Ralph Bravaco and Shai Simonson, *Java Programming: From the Ground Up*, 1st edition, 2009.
{% endcapture %}
{% include expand.html title="Expand for Requirements Overview" content=lectureRequirements %}




## TASK: Requirements
{% include iconHeader.html type="teamTask" %}

As discussed in the Software Process lecture materials, completing the requirements/analysis is the first step of a project. Requirements tell us *what* the software will do, not *how* (design) the software will do it. Recall that clients do not always know what they want from the beginning of the software process and requirements may change. Consider the flexibility of your requirements as you complete this portion of the exercise.

  
For this exercise, we will focus on functional requirements---or what the system shall do---rather than non-functional requirements or constraints.  There are implicit non-functional requirements (i.e., no infinite loops, no bugs, etc.). 

The client has given you a brief, incomplete description of what is expected for the software. As a group, you should have a detailed discussion of what the software should do and what features it should have. Discussion and formal documentation will be done in [your team's report file](#team-documentation). Use the journal prompts listed in the report to guide your group's discussion and document your thought process (or any decisions made). Remember, you are not discussing *design* here:
 
  * **Requirements** focus on *what the software should be able to do* ("The software should allow a user to do...")
  * **Design** focuses on *how the software should do something* ("The Calendar will loop through the array to find events for each day")
  
Note that statements such as "The user clicks a button to add a calendar event" is also a *design*-related statement. Instead, a relevant requirement may be "The system should allow a user to create a calendar event"---the details of *how* that event is created is a design-related decision.

Within the formal documentation of the report, the Software Requirements section should include a detailed description of the project, including a paragraph overview of the project followed by a list of requirements. 

## TASK: Requirements Reflection
{% include iconHeader.html type="individualTask" %}

Once you have completed the requirements task, ***each student*** should ***individually*** complete the reflection on [requirements]({{site.data.comprehensive-exercise.re-reflection}}){:target="_blank"}.

##  Additional Resources about Requirements

{% for res in site.data.comprehensive-exercise.re-resources %}
* [{{res.resource}}]({{res.url}}){:target="_blank"}{% if res.note %} {{res.note}}{% endif%}{% endfor %}



