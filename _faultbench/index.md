---
title: FaultBench
tags: [software engineering, fault bench, static analysis alert prioritization]
pagegroup: faultbench
---

# FaultBench

| [FaultBench Home](index) | [FaultBench Subjects](subjects) | [Evaluation](evaluation) | [Publications](publications) | [References](references) |

FaultBench is a set of real, subject Java programs for comparison and evaluation of actionable alert identification techniques (AAITs) that supplement automated static analysis. This webpage contains the benchmark subjects and related benchmark materials for dissemination and use by static analysis alert prioritization and classification researchers.

[**FaultBench v0.1**](version_0.1/index_content.html)

## FaultBench Definition v0.3

### Motivating Comparison
The *motivating comparison* [[SEH03]](references#seh02) of FaultBench is to find the static analysis alert prioritization or classification technique with the best rate of static analysis fault detection. We can use FaultBench to answer the following research questions:

  * RQ1: How accurately does an AAIT predict actionable and unactionable alerts? 
  * RQ2: What is the rate of anomaly detection for an AAIT? </p>
  * RQ3: How does an AAIT compare with other AAITs? </p>

### Task Sample
The *task sample* [[SEH03]](references#seh03) of FaultBench consists of:

  1. three real Java [subject programs](subjects#subjectdownloads) ranging from 355-15,516 lines of code (LOC)
  2. the set of FindBugs and Check 'n' Crash alerts and associated artifact characteristics identified as actionable and unactionable in the context of the [subject program's history](files/SubjectBaselineAlerts.xls) (*alert oracle*)

### Performance Measures
The following *performance measures* [[SEH03]](references#seh03) are used to evaluate static analysis prioritization and classification techniques:


**Alert Prioritization:**
  
  * Area under the curve [[RUC01]](references#ruc01): the area under the curve of the cumulative percentage of TP alerts detected after each inspection. 
  * Number of unactionable alerts identified before 50% of actionable alerts (UA50)
  * Inspections before first actionable alert (IFAA)
  * Number of alerts inspected before all actionable alerts identified (IAAA)

**Alert Classification:** We want to determine if an alert is correctly classified as a TP or FP. Therefore we use the following terms:

  * **True positive classification (TP):** classifying an alert as actionable when the alert is actionable. 
  * **True negative classification (TN):** classifying an alert as unactionable when the alert is unactionable.
  * **False positive classification (FP):**  classifying an alert as actionable when the alert is actually unactionable.
  * **False negative classification (FN):** classifying an alert as unactionable when the alert is actually actionable.


**Alert Classification Metrics:** We can use the following metrics to evaluate the alert classification:

  * Precision [[ZPZ07]](references#zpz07): The percentage of TP that are actually faults.
  * Recall [[ZPZ07]](references#zpz07): The percentage of TP out of all possible faults.
  * Accuracy [[ZPZ07]](references#zpz07): The percentage of correct (TP and TN) classifications.
  
### FaultBench Process

The scripts and programs implementing the process described below are linked to in Table 1, below. These programs are provided "as is" and with no technical support. The current versions of the program are specific to the creator's computer setup, and they should be modified to fit with the user's configurations.

  * Generate subject revision history through the source code repository log and select the sample of revisions.
  * Data collection for each subject (jdom, runtime, logging). Data collection consists of a set of batch scripts that download all of the files associated with a revision of the subject program from the source code repository. The project is then built, and a metrics program (<a href="http://www.kclee.de/clemens/java/javancss/">JavaNCSS</a>) and automated static analysis (<a href="http://findbugs.sourceforge.net/">FindBugs</a>, <a href="http://ranger.uta.edu/%7Ecsallner/cnc/">Check 'n' Crash</a>) are run. 
  * Alert oracle creation by iterating through the alerts created at each revision and determining which alerts were closed during the alert history.
  * Create artifact characteristics for each alert in the alert history


**Preresequites:**

  * <a href="http://java.sun.com">Java 1.5</a> installed 
  * <a href="http://java.sun.com">Java 1.4.2</a> installed
  * <a href="http://www.kclee.de/clemens/java/javancss/">JavaNCSS</a> versions 29.50 and 21.41 (both are required due to the use of generics in runtime) 
  * <a href="http://www.jdom.org/downloads/cvs.exe">CVS</a> (the binary offered by <a href="http://www.jdom.org/index.html">jdom</a>) and SVN installed
  * <a href="http://www.eclipse.org/">Eclipse</a> 3.3.1.1 installed
  * <a href="http://findbugs.sourceforge.net/">Findbugs</a> 1.3.7
  * <a href="http://ranger.uta.edu/%7Ecsallner/cnc/">Check 'n' Crash</a>  
  
<table width="600" border="1">
  <tr>
    <td>Artifact</td>
    <td><a href="http://www.jdom.org/index.html">jdom</a></td>
    <td><a href="http://eclipse.org/">runtime</a></td>
    <td><a href="http://commons.apache.org/logging/">logging</a></td>
  </tr>
  <tr>
    <td>Data Collection </td>
    <td colspan="3"><p><a href="files/version_0.3/RepositoryDataCollector.zip">RepositoryDataCollector.zip</a></p>
    <p><a href="files/version_0.3/Subjects.zip">Subjects.zip</a></p></td>
  </tr>
  <tr>
    <td>Alert Oracle and Artifact Characteristic Creation </td>
    <td colspan="3"><a href="files/version_0.3/AlertCharacteristicMerger.zip">AlertCharacteristicMerger.zip</a></td>
  </tr>
</table>