_Requirements_ define what a software system _should do_.  Software developers work with various stakeholders for a software system to fully understand the needs of all interested party.  Those needs are defined into software requirements - statements of functionality for a software system.  

**Goal:**  Understand customer requirements for the software system

**Software Artifacts:** requirements documents, use cases, user stories

## Types of Requirements

There are three types of requirements:

  * **Functional**: Functional requirements define what the system should do or the *functionality* of the system.  There are many ways to write functional requirements.  We describe functional requirements in use cases.
  * **Non-functional**: Non-functional requirements describe characteristics that the system should have that are not related to direct functionality.  Non-functionality requirements typically fall in the areas of performance, usability, security, and reliability.  For example, a page on a website shall load in less than a second would be a non-functional requirement.
  * **Constraints**: Constraints describe limitations on the development of the system.  For example, constraints define the operating system or programming language that the system must be developed for/with.
  
## Format of Requirements

Formats are from Hull, Jackson and Dick.[^HJD05]

Functional Requirements

* The [stakeholder type] shall be able to [capability/function].
* The system shall allow the [stakeholder type] to [capability/function].
* The system shall [capability/function].

Nonfunctional Requirements

* Performance/capability: The [system] shall be able to [function] [object] not less than [performance] times per [units].
* Performance/capability: The [system] shall be able to [function] [object] of type [qualification] within [performance] [units]
* Performance/capacity: The [system] shall be able to [function] not less than [quantity] [object].
* Performance/timeliness: The [system] shall be able to [function] [object] within [performance] [units] from [event]. 
* Performance/periodicity: The [system] shall be able to [function] not less than [quantity] [object] within [performance] [units]
* Interoperability/capacity: The [system] shall be able to [function] [object] composed of not less than [performance] [units] with [external entity].
* Sustainability/periodicity: The [system] shall be able to [function] [object] for [performance] [units] every [performance] [units].
* Environmental/operability: The [system] shall be able to [function] [object] while [operational condition].


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

## User Stories

* Describe software functionality that will be important for the users
* Allow software engineers to gain an understanding of what the software may include
* A written description of the story used for planning and as a reminder
* Conversations about the story that serve to flesh out the details of the story
* Tests that convey and document details and that can be used to determine when a story is complete