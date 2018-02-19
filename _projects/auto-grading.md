---
title: Science of Software - Computing Education Research 
tags: [sos-cer, cer, auto-grading]
description: SOS-CER Auto-Grading
navigation: on
pagegroup: projects
---
# Automated Grading with the Canary Framework

## Canary Framework Overview

The Canary Framework is a set of open source software engineering tools and supplemental resources that support automated grading.  Details about how the Canary Framework is used at NC State Computer Science in our SIGCSE 2018 paper.

Students push their code submissions to [GitHub](https://enterprise.github.com/home_.  The continuous integration system, [Jenkins](https://jenkins.io/), pulls their code and evaluates it as appropriate for the class.  We run the Jenkins master and executors on the [Virtual Computing Lab (VCL)](https://vcl.ncsu.edu). 

**Setup Instructions**

  * [Jenkins Master Setup Instructions](https://docs.google.com/document/d/1Spi_FVPSl0Q-MkvB8PXOAS3TYxReStYokekRXN771lA/edit?usp=sharing)
  * [Jenkins Executor Setup Instructions](https://docs.google.com/document/d/1xUtZun0BjbIQBrZu_6xX12NoLzdohopvrNKsT8W6h20/edit?usp=sharing)

## Tooling

We have created (or are creating) tooling to support the Canary Framework automated grading system and other teaching related tasks.  Information about each tool are set of tools are below:

  * [GitHubManager](https://github.com/SOS-CER/GitHubManager): tool that creates GitHub repositories, adds students to teams, and updates repository permissions from push (write) to pull (read) when a project is closed.
  * [JenkinsJobResources](https://github.com/SOS-CER/JenkinsJobResources): tools to create and close Jenkins jobs.
  * [BuildResources](https://github.com/SOS-CER/BuildResources): scripts and build configuration files to evaluate student submissions.
  * [JenkinsWebScraper](https://github.com/SOS-CER/JenkinsWebScraper): Selenium program that scrapes results from the most recent build on Jenkins for use when grading.
  * [BuildDataCollector](https://github.com/SOS-CER/BuildDataCollector): *Forthcoming* tooling that supports the collection of student build information into a database for data analysis and grading.
  * [FeedbackFileGenerator](https://github.com/SOS-CER/FeedbackFileGenerator): generates a PDF feedback file with information about a student's grade on an assignment from a grade spreadsheet.   
    
<!--
### Time Costs - custom by course

Base Image Setup - 1 day
Setup of VMs for semester - 2-4 hours
Opening Assignments - 2 hours
Closing Assignments - 30 mins
Weekly Labs - 30 mins/week
-->

<!-- Course specific information -->