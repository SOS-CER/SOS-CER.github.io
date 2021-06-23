---
title: FaultBench
tags: [software engineering, fault bench, static analysis alert prioritization]
pagegroup: faultbench
---

# The AWARE Eclipse Plug-in

Email Sarah Heckman at sarah_heckman AT ncsu.edu with questions, comments, and problems.

## AWARE

**Description:** an Eclipse plug-in that gathers static analysis reports to create a ranked listing of static analysis alerts in a program throughout development. Alerts found to be a false positive may be suppressed. The ranking of remaining alerts will be adjusted based on developer feedback of suppressing and closing alerts. AWARE comes bundled with an instrumented version of FindBugs.

Installation Instructions for AWARE only.

Plug-in Update Site URL: http://arches.csc.ncsu.edu/AWARE/AWARE-UPDATE

System Requirements:

Eclipse 3.x
Launch Eclipse workbench using Java 1.5 (once the workbench is launched the project(s) under analysis can be compiled and run with any version of Java)
If you use Check 'n' Crash as part of AWARE please read the system requirements for CnC below.
Check 'n' Crash Eclipse Plug-in

Description: an Eclipse plug-in based on the Check 'n' Crash (CnC) program written by Christoph Csallner and Yannis Smaragdakis at Georgia Tech. CnC combines static analysis with automatic test case generation to remove false positives. CnC will be used as one of the static analysis tools in AWARE. The CnC plug-in and compatable version of AWARE are not currently supported by the AWARE team!

Plug-in Download: CnC Eclipse Plug-in and AWARE Eclipse Plug-in combatable with CnC.

Installation Instructions: Download the plug-in and unzip into your Eclipse directory.

System Requirements:

The CnC Eclipse plug-in currently ONLY runs on Windows machines. This is due to the theorm prover that is used with CnC.
For the CnC Eclipse plug-in to run, you must launch your Eclipse workbench using Java 1.5
To run CnC on a project, you must compile the project under analysis with Java 1.4.2 (I use JRE 1.4.2_04)