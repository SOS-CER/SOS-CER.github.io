---
title: Comprehensive Exercise
description: Requirements/Analysis
tags:  [software engineering, software lifecycle, CS1, CSC, requirements]
navigation: on
pagegroup: comprehensive-exercise
---
# Requirements/Analysis
{% include iconHeader.html type="requirements" %}

_Requirements_ define what a software system _should do_.  Software developers work with various stakeholders for a software system to fully understand the needs of all interested party.  Those needs are defined into software requirements - statements of functionality for a software system.  There are three types of requirements:

  * **Functional**: Functional requirements define what the system should do or the *functionality* of the system.  There are many ways to write functional requirements.  We describe functional requirements in use cases.
  * **Non-functional**: Non-functional requirements describe characteristics that the system should have that are not related to direct functionality.  Non-functionality requirements typically fall in the areas of performance, usability, security, and reliability.  For example, a page on a website shall load in less than a second would be a non-functional requirement.
  * **Constraints**: Constraints describe limitations on the development of the system.  For example, constraints define the operating system or programming language that the system must be developed for/with.
  
For this exercise, we will focus on functional requirements - or what the system shall do - rather than non-functional requirements or constraints.  There are implicit non-functional requirements (i.e., no infinite loops, no bugs, etc.). 


## Use Cases
Use cases are a *user* centric way of defining functional requirements.  A use case combines together related scenarios about using a software system from the *user's* perspective.  A use case may be specific to a particular user or general for all users.

A use case is broken into four sections: preconditions, main flow, sub flows, and alternative flows.  The only required section is the main flow.  

A use case may be referred to by another use case using brackets (e.g, [ and ]).  Each use case should be referred to by another use case to connect all parts of the system together.  

Sub flows and alternative flows are also referenced using brackets.  Each sub flow and alternative flow should be referred to at least once from another element of the use case.  If a sub flow or alternative flow is part of the use case, then only the [S#] or [E#] is needed.  If a sub flow or alternative flow from another use case is referred to, then the use case is used in the reference (i.e., [UC-S#]).


### Preconditions
The *preconditions* describe how to reach a given use case. 


### Main Flow
The main flow describes the high level set of scenarios for a use case.  Details are described in sub flows and alternative or error paths are described in the alternative flows.



### Sub Flows
Sub flows provide details to portions of the main flow.   The sub flow describes the functionality and provides references for what should happen if there's an error.  Those are defined in the alternative flows.


### Alternative Flows
Alternative flows provide details about error conditions, or how the program should fail gracefully if the user provides invalid or incorrect information.

## TASK: Requirements
{% include iconHeader.html type="teamTask" %}

As discussed in the Software Lifecycle lecture/slides, completing the requirements/analysis is the first step of a project. Requirements tell us *what* the software will do, not *how* (design) the software will do it. Recall that clients do not always know what they want from the beginning of the software process and requirements may change. Consider the flexibility of your requirements as you complete this portion of the exercise.

The client has given you a brief, incomplete description of what is expected for the software. As a group, you should have a detailed discussion of what the software should do and what features it should have. Discussion and formal documentation will be done in [your team's report file](./team-documentation). Use the journal prompts listed in the report to guide your group's discussion and document your thought process (or any decisions made). Remember, you are not discussing design here. Within the formal documentation of the report, the Software Requirements section should include a detailed description of the project, including a paragraph overview of the project followed by a list of requirements. You may also choose to include user stories. 

## TASK: Reflection
{% include iconHeader.html type="individualTask" %}

Once you have completed the requirements task, each student should individually complete the reflection on [requirements]({{site.data.comprehensive-exercise.re-reflection}}).

##  Additional Resources

{% for res in site.data.comprehensive-exercise.re-resources %}
* [{{res.resource}}]({{res.url}}){% if res.note %} {{res.note}}{% endif%}{% endfor %}