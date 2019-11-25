---
title: Comprehensive Exercise
description: Software Life Cycle
tags:  [software engineering, software lifecycle, CS1, CSC, Software Life Cycle]
navigation: on
pagegroup: comprehensive-exercise
---
# Software Life Cycle
The _software life cycle_ (SLC) covers the time between product conception and end of life for the product [1].  Like all engineering disciplines, engineering high quality software requires _process_ to guide a software process through the SLC. _Software engineering_ is "the systematic application of scientific and technological knowledge, methods, and experience to the design, implementation, testing, and documentation of software" [1].  Software engineers use a _software development process_ to translate user needs into a software product that correctly and securely meets those needs [1]. The process of engineering software involves several _phases_, which may overlap: [requirements](#requirements), [design](#design), [implementation](#implementation), [test](#test), and [deployment](#deployment).  Software development processes are supported by _practices_, which are activities, maybe supported by techniques and tooling, that provide a systematic way for developers to develop software as part of a larger software development process [1].

A _software process model_ or _life cycle model_ provides a "simplified, abstracted description of a software development process" [1, 2].  There are two high-level _software development models_ that provide a paradigm and culture of software development: plan-driven and agile.  From a software model, a specific software development process (which may also be called a _software development methodology) is created that adheres to the spirit of the model and describes the specific practices that support development for each phase.  The idea of a software development model is an interface that provides behaviors associated with each major phase.  Plan-driven and agile models are the abstract classes that implement the interface and provide the "spirit" of the model.  The concrete software development processes are subclasses of the models and provide an interpretation of the processes involved at each phase of development and the associated practices and tools to support development when using the process.  Different companies and even different groups with in the same company will adopt and/or customize a process that fits the team culture and the type of product that is under development.  

_Plan-driven models_ are typically used for projects where there are stable requirements that are known up front, like mission- or safety-critical systems.  The phases of development are handled sequentially, but there may be interweaving of some phases like implementation and testing when practices like test-driven development are used.  An example plan-driven development model is [Team Software Process](http://www.sei.cmu.edu/tsp/).

_Agile models_ focus on change as a part of software development.  Software is developed in short iterations, with each iteration including the standard phases of development.  [Agile models value interactions, collaboration, and change over strict processes, contracts, and plans](http://www.agilemanifesto.org).  Products are typically always in a deployable state (e.g., the practice of continuous integration).  An example agile development model is [Scrum](https://www.scrum.org/Resources/What-is-Scrum).


## Software Development Phases
While there are many different software development processes that developers may use, there are five fundamental areas of concern, or phases, in any process: [requirements](#requirements), [design](#design), [implementation](#implementation), [test](#test), and [deployment](#deployment). These phases may be distinct or may be integrated depending on the specific software development process used [1].


### Requirements Phase {#requirements}
{% include iconHeader.html type="requirements" %}
The _requirements phase_ is "the period of time in the software life cycle during which the requirements for a software product are defined and documented" [1].  Requirements define, from the customer perspective, what a software system _should do_ or a capability that a system must have [1]. Requirements are NOT a list of tasks that a developer should accomplish to create a system, but instead describe the system itself.  Requirements include a description of the functionality (required behavior) and non-functional aspects of the system (how the software will do the functionality and how the system is constrained) [1]. 

### Design Phase {#design}
{% include iconHeader.html type="design" %}
The _design phase_ is "the period in the software life cycle during which definitions for architecture, software components, interfaces, and data are created, documented, and verified to satisfy requirements" [1].  


### Implementation Phase {#implementation}
{% include iconHeader.html type="implementation" %}
The _implementation phase_ is the "period of time in the software life cycle during which a software product is created from design documentation and debugged" [1].

### Test Phase {#test}
{% include iconHeader.html type="systemTest,unitTest" %}
The _test phase_ is "the period of time in the software life cycle during which the components of a software product are evaluated and integrated, and the software product is evaluated to determine whether or not requirements have been satisfied" [1].  While there are several different types of tests, the focus will be on _unit tests_ and _system tests_.  Unit tests focus on evaluation of individual methods or modules and are typically written by the developer [1].  System tests evaluate a completed system to ensure that the requirements are met [1].


### Deployment Phase {#deployment}
{% include iconHeader.html type="deployment" %}
The _deployment phase_ is the "phase of a project in which a system is put into operation and cutover issues are resolved" [1].  When software is completed, it must be deployed or delivered to the customer. Additionally, software must be maintained such that user problems are addresses after operationalization.

## References

1. "Systems and software engineering – Vocabulary," ISO/IEC/IEEE 24765:2010(E), pp. 1–418, Dec. 2010.
2.  L. Williams, An Introduction to Software Engineering. Amazon Digital Services LLC, 2013.