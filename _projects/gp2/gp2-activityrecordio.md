---
title: Guided Project 2 WolfScheduler - Activity and Event
tags: [software engineering, software lifecycle, CS2, CSC216, GP2]
description: Guided Task - Create `ActivityRecordIO`
navigation: on
pagegroup: gp2
---

# Guided Task: Create `ActivityRecordIO`
`CourseRecordIO` handles reading course records from a file to create a course catalog and writing `Course`s to a file.  Now that you have `Events` that should also be written to an output file (as per [[UC3, S2]](../wolf-scheduler/ws-requirements#gp2-uc3-s2), you need to create a new IO class to handle writing `Activity` objects.

{% capture callout_content %}
  * Refactor file I/O functionality
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}


## Create `ActivityRecordIO` Class
Create a new Java class called `ActivityRecordIO` in the `edu.ncsu.csc216.wolf_scheduler.io` package of the `WolfScheduler` project.  Do not create the constructor or any methods in `ActivityRecordIO`.

{% capture callout_content %}
If you need help creating the `ActivityRecordIO` Java Class, see [Guided Task: Your First Eclipse Project - Create a Class](../gp1/gp1-eclipse-intro#create-a-class).
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Eclipse Java Class Creation" %}


## Move `writeCourseRecords()` to `ActivityRecordIO`
Complete the following steps to move `writeCourseRecords()` from `CourseRecordIO` to `ActivityRecordIO`.

  * Open `CourseRecordIO` in the editor.
  * Select the `writeCourseRecords` method name in the editor. You only want to select the method name.
  
   
{% include image.html file="images/MoveMethod.PNG" caption="Figure: Selecting a Method for Moving" %}
    
  * Right click on the `writeCourseRecords` method name and select **Refactor > Move**.
  * **Browse** for `ActivityRecordIO`.  Uncheck the options to keep original member as delegate to moved member.
  
    
{% include image.html file="images/MoveMethodWizard.PNG" caption="Figure: Moving a Method" %}
    
  * The method is now in `ActivityRecordIO`.  `WolfScheduler` and `CourseRecordIOTest` have been udpated with the change.  
  * Refactor the method name.  Select the method name, right click on the method and select **Refactor > Rename**.  Enter `writeActivityRecords()` and click **Enter**.
  * Update the generic parameter of the `ArrayList` to be `Activity` instead of `Course`.  At this point, there will be a compilation error in `WolfScheduler.exportSchedule()`. 
  
After you are done, `ActivityRecordIO` should look like the following:

```java
package edu.ncsu.csc216.wolf_scheduler.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import edu.ncsu.csc216.wolf_scheduler.course.Activity;

public class ActivityRecordIO {

    /**
     * Writes the given list of Courses to 
     * @param fileName file to save to
     * @param courses list of course to save
     * @throws IOException if the file cannot be written
     */
    public static void writeActivityRecords(String fileName, ArrayList<Activity> courses) throws IOException {
        PrintStream fileWriter = new PrintStream(new File(fileName));
        
        for (Activity c : courses) {
            fileWriter.println(c.toString());
        }
        
        fileWriter.close();
    }

}
```
  

## Run Tests
Run your tests!  If any are still failing in the `course` or `io` packages, use the debugger to help you find the problem.  For now, the `WolfScheduler` tests may fail due to compilation errors.

Right now, your suite of tests is not sufficient to evaluate if events are correctly written to file.  Create a class `ActivityRecordIOTest` the `edu.ncsu.csc216.wolf_scheduler.io` package of the `test/` folder in the `WolfScheduler` project.  Copy in the [provided `ActivityRecordIOTest` code](files/ActivityRecordIOTest.java) and [the provided `expected_activity_records.txt`](files/expected_activity_records.txt) and run the tests.  Ensure they all pass!


## Push to GitHub
Use the feedback from Jenkins to make changes to your code.  Any time you make a change, push to GitHub and check the Jenkins results.

  * Ensure tests are passing, Javadoc is generated, and all static analysis notifications are removed.
  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  Try writing your own commit message for this push!

{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}
