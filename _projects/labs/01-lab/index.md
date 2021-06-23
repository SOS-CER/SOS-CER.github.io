---
title: CSC216 Lab 01 - Project Creation
tags: [software engineering, software lifecycle, CS2, CSC216, Lab01]
description: CSC216 Lab 01 - Project Creation
navigation: on
---

# CSC216 Lab 01: Project Creation
For Lab 01, you will complete a pair programming activity (on-campus students only); learn about GitHub, the version control system we use in CSC216; and start work on the `PackScheduler` project that will be developed throughout the semester as part of the lab activities.


{% capture callout_content %}
  * Practice working on a pair or small team to understand the benefits
  * Learn about the version control system GitHub
  * Work with an Eclipse project, packages, and classes
  * Implement a plain old java object class
  * Implement file I/O
  * Use composition
  * Run unit tests
{% endcapture %}
{% include callout.html content=callout_content icon="objective" type="learningOutcomes" title="Learning Outcomes" %}
  


## Pre-lab Activity:
{% include iconHeader.html type="ideTool" %}
Go through the [Eclipse Install Tutorial](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/eclipse/eclipse-install.html).  Note down any problems that you run into.  Ask questions about install issues on Piazza!


{% if site.data.labs.lab01open %}
## Lab Overview
{% include iconHeader.html type="task" %}
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="01-lab" %}
{% endif %}


## Lab Deadlines & Jenkins Servers
{% include iconHeader.html type="overview" %}
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.


{% capture callout_content %}You will receive a certificate warning about a self-signed certificate when accessing the Jenkins servers for CSC216.  All of the certificates for CSC216 Jenkins servers were self signed by CSC IT.  Please accept the exception each time you visit a Jenkins server.
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Jenkins Certificates" %}


{% include lab_deadlines.md mon=site.data.labs.lab01.mon01 tues=site.data.labs.lab01.tues01 wed=site.data.labs.lab01.wed01 %}


{% include rubric.md project="lab01" %}  
