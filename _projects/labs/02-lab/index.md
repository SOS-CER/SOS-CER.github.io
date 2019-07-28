---
title: CSC216 Lab 02 - Software Engineering Best Practices
tags: [software engineering, software lifecycle, CS2, CSC216, Lab02]
description: CSC216 Lab 02 - Software Engineering Best Practices
navigation: on
---

# CSC216 Lab 02: Software Engineering Best Practices
For Lab 02, you will test the `PackScheduler` project you developed in Lab 01.  For Lab 01, your project was evaluated against the teaching staff test suite.  Now you will develop your own test suite to demonstrate that your program meets the [`PackScheduler` requirements](02-lab-requirements).


{% capture callout_content %}
  * Write unit tests for `Student`, `StudentRecordIO`, and `StudentDirectory`
  * Achieve at least 80% statement coverage when executing your tests against   `Student`, `StudentRecordIO`, and `StudentDirectory`
  * Use code coverage tools to identify other paths to test
  * Use static analysis tools to identify potential problems
  * Write and run black box tests
  * Find an fix any bugs detected during testing
{% endcapture %}
{% include callout.html content=callout_content icon="" type="learningOutcomes" title="Learning Outcomes" %}


{% if site.data.labs.lab02open %}
## Lab Overview
The lab will be completed in the following steps:

{% include tableOfContents.html pagegroup="02-lab" %}

{% endif %}

 
## Lab Deadlines & Jenkins Servers
All labs are due 10 minutes before the start of the next lab.  Additionally, each lab section has their own dedicated lab Jenkins server.  The table below provides the deadline and server URL for each lab section for the current semester.


{% capture callout_content %}
You will receive a certificate warning about a self-signed certificate when accessing the Jenkins servers for CSC216.  All of the certificates for CSC216 Jenkins servers were self signed personally by Dr. Heckman.  Please accept the exception each time you visit a Jenkins server.

Also note that permissions to the Jenkins server are at the job level.  If you have no permissions to any job, you will be unable to sign into the Jenkins server.  Once jobs are created,  you will be able to sign in.
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Jenkins Certificate Warnings" %}
 
{% include lab_deadlines.md mon=site.data.labs.lab02.mon02 tues=site.data.labs.lab02.tues02 wed=site.data.labs.lab02.wed02 %}

 
## Lab Rubric
You will be evaluated out of 70 points in the [Technical Rubric](#technical-rubric).  On-campus students will also be [evaluated on their teaming](#on-campus-collaboration-rubric): a combination of In-Lab Participation and Out-Lab Participation.  Collaborating DE students will also be [evaluated on their participation in their pair](#de-collaboration-rubric).  

Pair/teams are expected to work together on all aspects of the lab activity.  Points may be deducted for not contributing or for not providing a partner the opportunity to contribute.  The teaching staff strongly encourages working synchronously and **requires** that these collaborative sessions are documented in GitHub commit messages for the teaching staff to note the team contribution.

 
### Technical Rubric

|Phase|Rubric Item|Points|Description|
|:---|:----------|----------:|:------------------------------------------------------|
|{% include icon.html type="design" width="30px" %}{% include icon.html type="unitTest" width="30px" %}|Teaching Staff Unit Tests|10|Pass all of the teaching staff unit tests (no regressions), both provided and hidden.|
|{% include icon.html type="unitTest" width="30px" %}|Student Unit Tests|10|Pass all of your unit tests.|
|{% include icon.html type="unitTest" width="30px" %}|Student Test Coverage|10|80% statement/line coverage on `Student`, `StudentRecordIO`, and `StudentDirectory`|
|{% include icon.html type="systemTest" width="30px" %}|Teaching Staff Black Box Tests|10|Pass all of the teaching staff black box tests (note that they will not be provided).|
|{% include icon.html type="systemTest" width="30px" %}|Student Black Box Tests|15|Pass all of your black box tests.|
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

 
### Extra Credit

|Extra Credit Item|Extra Credit|Details|
|:--------------|---------:|----------------------------------------|
|> 90% Statement Coverage|1-3|One point of extra credit for each class with > 90% statement coverage.|
|100% Statement Coverage|1-3|One point of extra credit for each class with 100% statement coverage (in addition to the points earned for the 90% statement threshold).|
|100% Condition Coverage|1-3|One point of extra credit for each class with 100% condition coverage (in addition to the points earned for the 90% & 100% statement threshold).|
