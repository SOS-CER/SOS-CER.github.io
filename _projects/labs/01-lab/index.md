---
title: CSC216 Lab 01 - Project Creation
tags: [software engineering, software lifecycle, CS2, CSC216, Lab01]
description: CSC216 Lab 01 - Project Creation
navigation: on
---

# CSC216 Lab 01: Project Creation
For Lab 01, you will complete a pair programming activity (synchronous labs only); learn about GitHub, the version control system we use in CSC216; and start work on the `PackScheduler` project that will be developed throughout the semester as part of the lab activities.


{% capture callout_content %}
  <!--* Practice working on a pair or small team to understand the benefits-->
  <!--* Learn about the version control system GitHub-->
  * Work with an Eclipse project, packages, and classes
  * Implement a plain old java object class
  * Implement file I/O
  * Use composition
  * Run unit tests
{% endcapture %}
{% include callout.html content=callout_content icon="objective" type="learningOutcomes" title="Learning Outcomes" %}
  


## Pre-lab Activity:
{% include iconHeader.html type="ideTool" %}
Go through the [Eclipse Install Tutorial](https://ncsu.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=7c26cd98-9214-4946-a5d6-ae26000ebc13).  Note down any problems that you run into.  Ask questions about install issues on Piazza!


{% if site.data.labs.lab01open %}
## Lab Overview
For students in async lab sections (Sections 231 and 601), watch the [Lab 01 Overview Video](https://ncsu.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=2b6fa96a-8e80-4ffb-bf4b-ad8b002205f8).

{% include iconHeader.html type="task" %}
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="01-lab" %}
{% endif %}


## Lab Deadlines & Jenkins Servers
{% include iconHeader.html type="overview" %}
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.


{% include lab_deadlines.md mon=site.data.labs.lab01.mon01 tues=site.data.labs.lab01.tues01 wed=site.data.labs.lab01.wed01 %}


{% include rubric.md project="lab01" %}  
