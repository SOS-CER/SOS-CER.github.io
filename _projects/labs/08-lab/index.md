---
title: CSC216 Lab 08 - LinkedAbstractList
tags: [software engineering, software lifecycle, CS2, CSC216, Lab08]
description: CSC216 Lab 08 - LinkedAbstractList
navigation: on
pagegroup: 08-lab
---
# CSC216 Lab 08 - LinkedAbstractList
The next step in implementing `PackScheduler` is to add functionality for students to register for classes they want to take by adding students to a course roll. You'll create a utility package that will have a custom implementation of a generic `LinkedAbstractList` that doesn't allow null elements or duplicates. Additionally, the list will have an enrollment capacity. From there, you will create a `CourseRoll` and incorporate it into the `Course` class.  There will be some additional modifications to `Schedule`, `Student`, and `EnrollmentManager` to create the end-to-end implementation.
  

{% capture callout_content %}
  * Create a custom `LinkedAbstractList` implementation that extends `AbstractList`.
  * Integrate the custom `LinkedAbstractList` into a larger implementation.
{% endcapture %}
{% include callout.html content=callout_content icon="" type="learningOutcomes" title="Learning Outcomes" %}


{% if site.data.labs.lab08open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="08-lab" %}
{% endif %}

## Lab Checks
There are several checks that will occur during your build to ensure that you're following software engineering best practices:

  * Library checks: You'll be working with the `SortedList` class that is part of the CSC216Collections library.  Additionally, you're creating a custom `ArrayList` and `LinkedAbstractList` implementation.  You must remove all of your references to `java.util.ArrayList` and `java.util.LinkedList` from your project - including the Javadoc.  If you receive a red ball and a message in the console output about using `java.util.ArrayList` or `java.util.LinkedList`, search your project for the string and regenerate your Javadoc!
  * Coverage checks: You must have 80% coverage for *each* non-GUI and non-test class in `PackScheduler`.  A tool will check that you have passed the 80% threshold before running any of the teaching tests.


## Lab Deadlines & Jenkins Servers
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.


{% capture callout_content %}
You will receive a certificate warning about a self-signed certificate when accessing the Jenkins servers for CSC216.  All of the certificates for CSC216 Jenkins servers were self signed personally by Dr. Heckman.  Please accept the exception each time you visit a Jenkins server.

Also note that permissions to the Jenkins server are at the job level.  If you have no permissions to any job, you will be unable to sign into the Jenkins server.  Once jobs are created,  you will be able to sign in.
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Jenkins Certificate Warnings" %}

{% include lab_deadlines.md mon=site.data.labs.lab08.mon08 tues=site.data.labs.lab08.tues08 wed=site.data.labs.lab08.wed08 %}


## Lab Rubric
You will be evaluated out of 70 points in the [Technical Rubric](#technical-rubric).  On-campus students will also be [evaluated on their teaming](#on-campus-collaboration-rubric): a combination of In-Lab Participation and Out-Lab Participation.  Collaborating DE students will also be [evaluated on their participation in their pair](#de-collaboration-rubric).  

Pair/teams are expected to work together on all aspects of the lab activity.  Points may be deducted for not contributing or for not providing a partner the opportunity to contribute.  The teaching staff strongly encourages working synchronously and **requires** that these collaborative sessions are documented in GitHub commit messages for the teaching staff to note the team contribution.


### Technical Rubric

|Phase|Rubric Item|Points|Description|
|:---|:----------|----------:|:------------------------------------------------------|
|{% include icon.html type="design" width="30px" %}{% include icon.html type="unitTest" width="30px" %}|Teaching Staff Unit Tests|15|Pass all of the teaching staff unit tests (no regressions), both provided and hidden.|
|{% include icon.html type="unitTest" width="30px" %}|Student Unit Tests|15|Pass all of your unit tests.|
|{% include icon.html type="unitTest" width="30px" %}|Student Test Coverage|15|80% statement/line coverage on every non-UI/non-test class|
|{% include icon.html type="systemTest" width="30px" %}|Teaching Staff Acceptance Tests|10|Passing teaching staff acceptance tests|
|{% include icon.html type="implementation" width="30px" %}|Javadoc Comments|5|All classes, including the tests are commented with meaningful comments.|
|{% include icon.html type="implementation" width="30px" %}|Javadoc Generation|5|Javadoc tool was used to generate the HTML version of the API, which matches the current version of the in-code Javadoc.|
|{% include icon.html type="implementation" width="30px" %}|Style|5|Any PMD, CheckStyle, or FindBugs Scary or Scariest notifications will result in a one point deduction, up to the available points.|
| |**Total**|**70**| |


### Collaboration Rubric
The collaboration rubric will only be applied to those working on teams.  

#### On-Campus Collaboration Rubric

|Rubric Item|Points|Description|
|:----------|----------:|:------------------------------------------------------|
|In-Lab Participation|15|PTFs will be looking for collaboration with your partner during lab activities.  Did you participate in completing the lab assignment?  Did you balance your roles of driver and navigator?  There will be deductions for observations of non-participation or hogging of one role or the other so a partner cannot participate.|
|Out-Lab Participation|15|Did you make at least one meaningful commit to GitHub for completing the lab (e.g., meaningful means that the commit has to contribute to the solution and isn't superficial)?  If you pair programmed, is it noted in the commit message?  Did you not allow your partner, who wanted to contribute, to commit?|
|**Total**|**30**| |

#### DE Collaboration Rubric

|Rubric Item|Points|Description|
|:----------|----------:|:------------------------------------------------------|
|Collaboration|15|Did you make at least one meaningful commit to GitHub for completing the lab (e.g., meaningful means that the commit has to contribute to the solution and isn't superficial)?  If you pair programmed, is it noted in the commit message?  Did you not allow your partner, who wanted to contribute, to commit?|
|**Total**|**15**| |


### Deductions

|Deduction Item|Deduction|Details|
|:--------------|---------:|----------------------------------------|
|Misnamed submission file|-5|Your entire Eclipse project, named `PackScheduler`, must be pushed to GitHub for automated grading.  If your Jenkins job cannot find and grade your project, the teaching staff will attempt to grade it manually.  The deduction will apply in this case.|
|Incomplete project submission|-5|If the teaching staff are unable to directly import your submission as an Eclipse project into our workspaces when grading, you will receive a 5 point deduction. Make sure that your `.project` and `.classpath` files are pushed to GitHub.|
|Other Deductions|-5|If the project has to be manually graded due, you will receive a 5 point deduction.  Make sure that your project builds on Jenkins!|
