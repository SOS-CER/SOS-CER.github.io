---
title: WolfScheduler
description: WolfScheduler Requirements
tags: [software engineering, software lifecycle, CS2, CSC216]
navigation: on
pagegroup: wolf-scheduler
---

# WolfScheduler Requirements
{% include iconHeader.html type="requirements" %}

*[Requirements](../se-overview/requirements)* describe what the system should do, typically from a system or user perspective, without design or implementation details.  The requirements for the **Wolf Scheduler** system are described as *[use cases](../se-overview/requirements#use-cases)*.  The requirements for the **Wolf Scheduler** are below.

## Guided Project 1 Requirements

### <a id="uc1"></a>Use Case 1: Loading Courses

**Main Flow:** The program starts and prompts for a file containing the listing of all courses for the upcoming semester [[S1]](#uc1-s1)[[E1]](#uc1-e1).  The program stores all of the course information and creates an empty schedule [[UC2]](#uc2).

**Sub Flows:**

  * <a id="uc1-s1"></a>[S1]: Information about scheduled courses are stored in a file with one course record per line.  A course record is a comma separated list of the course name, course title, section number, the number of credit hours, instructor's unity id, meeting days, start time, and end time.  The start time and end time may be omitted if the meeting days are listed as 'A'(rranged).  Valid course records are stored in a list of courses [[E2]](#uc1-e2). A course record is invalid if one or more of the following are true, and an invalid course records is skipped:
     * an item is missing
     * the course name is null or an empty string
     * the course name is fewer than 4 characters or greater than 6 characters
     * the course title is null or an empty string
     * the section number is NOT exactly three digits
     * the credit hours are not a number
     * the credit hours are less than 1 or greater than 5
     * the instructor's id is null or an empty string
     * meeting days consist of any characters other than 'M', 'T', 'W', 'H', 'F', or 'A' 
     * if 'A' is in the meeting days list, it must be the only character
     * the start time is not between 0000 and 2359 an invalid military time
     * the end time is not between 0000 and 2359 or an invalid military time
     * the end time is less than the start time (i.e., no overnight classes)
     * a start time and/or end time is listed when meeting days is 'A'
     * a course with the same name and section

    An example of what a course schedule file might look like is below:

        
        CSC116,Intro to Programming - Java,001,3,jdyoung2,MW,0910,1100
        CSC116,Intro to Programming - Java,002,3,spbalik,MW,1120,1310
        CSC116,Intro to Programming - Java,003,3,tbdimitr,TH,1120,1310
        CSC216,Programming Concepts - Java,001,4,sesmith5,TH,1330,1445
        CSC216,Programming Concepts - Java,002,4,jtking,MW,1330,1445
        CSC216,Programming Concepts - Java,601,4,jep,A
        
    
**Alternative Flows:**

  * <a id="uc1-e1"></a>[E1] If the file does not exist on the system, an error message, "Cannot find file." is displayed and the user is re-prompted for a file.
  * <a id="uc1-e2"></a>[E2] An invalid course record is ignored and not added to the list of courses stored by the system.


### <a id="uc2"></a>Use Case 2: Scheduling

**Preconditions:** At least one course for the upcoming semester has been loaded into the system [[UC1]](#uc1).

**Main Flow:** The student starts with an empty schedule.  The student can name their schedule [[S1]](#uc2-s1), add a course to their schedule [[S2]](#uc2-s2), remove a course from their schedule [[S3]](#uc2-s3), add an event to their schedule [[S4]](#uc2-s4), and remove an event from their schedule [[S5]](#uc2-s5).  The student can reset their schedule [[S6]](#uc2-s6).  The student can display their final schedule [[UC3]](#uc3).  Anytime a course in the catalog list is selected, details about the course are displayed [[S7]](#uc2-s7).

**Sub Flows:**

  * <a id="uc2-s1"></a>[S1]: The schedule's default name is "My Schedule".  The student can name their schedule or leave the title empty [[E1]](#uc2-e1).
  * <a id="uc2-s2"></a>[S2]: All courses are listed.  The student may select a course and add the course to their schedule [[E2]](#uc2-e2)[[E3]](#uc2-e3).
  * <a id="uc2-s3"></a>[S3]: The student selects a course from their schedule and clicks the remove course button.  The course is removed from the schedule [[E4]](#uc2-e4).
  * <a id="uc2-s4"></a>[S4]: A student clicks the button to add an event.  The student is prompted for the event title, days of the week, start time, and end time [[E5]](#uc2-e5)[[E6]](#uc2-e6)[[E7]](#uc2-e7)[[E8]](#uc2-e8).
  * <a id="uc2-s5"></a>[S5]: The student selects an event from their schedule and clicks the remove event button.  The event is removed from the schedule[[E9]](#uc2-e9).
  * <a id="uc2-s6"></a>[S6]: The student clicks the reset schedule button.  All events and courses are removed from the schedule.  The schedule's name is reset.
  * <a id="uc2-s7"></a>[S7]: The student clicks on a course in the catalog list.  The course details are displayed with the course name, section, title, instructor, credit hours, and meeting information.  If the meeting days are "A", the details view shows "Arranged".  Otherwise, the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time.  Only "AM" and "PM" are used.

**Alternative Flows:**

  * <a id="uc2-e1"></a>[E1]: If the title name is invalid, a pop-up message stating "Invalid title." is displayed.  The student clicks OK and is returned to the GUI with no change.
  * <a id="uc2-e2"></a>[E2]: If the student has already added a course with the same name to their schedule (the same section or a different section), a pop-up message stating "You are already enrolled in <course name>." is displayed, where <course name> is replaced with the name of the course.  The student clicks OK and is returned to their schedule with no change.
  * <a id="uc2-e3"></a>[E3]: If the course conflicts with another course or event on the student's schedule, a pop-up message stating "The course cannot be added due to a conflict." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="uc2-e4"></a>[E4]: If no course is selected in the student's schedule, a pop-up message stating "No item selected in the schedule." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="uc2-e5"></a>[E5]: If the student has already added an event with the same title to their schedule, a pop-up message stating "You have already created an event called <event title>." is displayed, where <event title> is replaced with the title of the event.  The student clicks OK and is returned to the event editing information that is populated will earlier values for editing.
  * <a id="uc2-e6"></a>[E6]: If the event conflicts with another course of event on the student's schedule, a pop-up message stating "The event cannot be added due to a conflict." is displayed.  The student clicks OK and is returned to the event editing information that is populated will earlier values for editing.
  * <a id="uc2-e7"></a>[E7]: If the event name is null or an empty string, a pop-up message stating "The event has no name." is displayed.  The student clicks OK and is returned to the event editing information that is populated will earlier values for editing.
  * <a id="uc2-e8"></a>[E8]: If the event start time or end time is empty, an invalid time, or if the end time is earlier than the start time, a pop-up message stating "The event times are invalid." is displayed. The student clicks OK and is returned to the event editing information that is populated will earlier values for editing.
  * <a id="uc2-e9"></a>[E9]: If no event is selected in the student's schedule, a pop-up message stating "No item selected in the schedule." is displayed.  The student clicks OK and is returned to their schedule with no change.


### <a id="uc3"></a>Use Case 3: Display Final Schedule

**Preconditions:** At least one course or event has been added to the student's schedule [[UC2]](#uc2).

**Main Flow:** The student's schedule is displayed showing the courses and events on in a table listing [[S1]](#uc3-s1).  The schedule can be exported as a comma-separated list of courses and events [[S2]](#uc3-s2).  The student can revise their schedule [[UC2]](#uc2).

**Sub Flows:**

  * <a id="uc3-s1"></a>[S1]: A text table will list all student courses and student events with columns for course name, section , title, instructor, credit hours, and meeting information.  If the meeting days are "A", the details view shows "Arranged".  Otherwise, the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time.  Only "AM" and "PM" are used.  If the row is an event, then the name, section, instructor, and credit hours are left blank.  After the table, the total number of credit hours is listed for the given schedule.
  * <a id="uc3-s2"></a>[S2]: If the export button is pressed, the student is prompted with a file dialog where they can provide a file name for saving the schedule.  The schedule is stored in a text file with a comma-separated list of courses followed by a comma-separated list of events with an ordering of information similar to the course fields [[E1]](#uc3-e1).

**Alternative Flows:**

  * <a id="uc3-e1"></a>[E1]: If the file cannot be saved, a pop-up message stating "The file cannot be saved." is displayed.  The student clicks OK and is returned to the file saving dialog [[S2]](#uc3-s2).


## Guided Project 2 Requirements

### <a id="gp2-uc1"></a>Use Case 1: Loading Courses

**Main Flow:** The program starts and prompts for a file containing the listing of all courses for the upcoming semester [[S1]](#gp2-uc1-s1)[[E1]](#gp2-uc1-e1).  The program stores all of the course information and creates an empty schedule [[UC2]](#gp2-uc2).

**Sub Flows:**

  * <a id="gp2-uc1-s1"></a>[S1]: Information about scheduled courses are stored in a file with one course record per line.  A course record is a comma separated list of the course name, course title, section number, the number of credit hours, instructor's unity id, meeting days, start time, and end time.  The start time and end time may be omitted if the meeting days are listed as 'A'(rranged).  Valid course records are stored in a list of courses [[E2]](#gp2-uc1-e2). A course record is invalid if one or more of the following are true, and an invalid course records is skipped:
     * an item is missing
     * the course name is null or an empty string
     * the course name is fewer than 4 characters or greater than 6 characters
     * the course title is null or an empty string
     * the section number is NOT exactly three digits
     * the credit hours are not a number
     * the credit hours are less than 1 or greater than 5
     * the instructor's id is null or an empty string
     * meeting days consist of any characters other than 'M', 'T', 'W', 'H', 'F', or 'A' 
     * if 'A' is in the meeting days list, it must be the only character
     * the start time is not between 0000 and 2359 an invalid military time
     * the end time is not between 0000 and 2359 or an invalid military time
     * the end time is less than the start time (i.e., no overnight classes)
     * a start time and/or end time is listed when meeting days is 'A'
     * a course with the same name and section

    An example of what a course schedule file might look like is below:

        
        CSC116,Intro to Programming - Java,001,3,jdyoung2,MW,0910,1100
        CSC116,Intro to Programming - Java,002,3,spbalik,MW,1120,1310
        CSC116,Intro to Programming - Java,003,3,tbdimitr,TH,1120,1310
        CSC216,Programming Concepts - Java,001,4,sesmith5,TH,1330,1445
        CSC216,Programming Concepts - Java,002,4,jtking,MW,1330,1445
        CSC216,Programming Concepts - Java,601,4,jep,A
        
    
**Alternative Flows:**

  * <a id="gp2-uc1-e1"></a>[E1] If the file does not exist on the system, an error message, "Cannot find file." is displayed and the user is re-prompted for a file.
  * <a id="gp2-uc1-e2"></a>[E2] An invalid course record is ignored and not added to the list of courses stored by the system.



### <a id="gp2-uc2"></a>Use Case 2: Scheduling

**Preconditions:** At least one course for the upcoming semester has been loaded into the system [[UC1]](#gp2-uc1).

**Main Flow:** The student starts with an empty schedule.  The student can name their schedule [[S1]](#gp2-uc2-s1), add a course to their schedule [[S2]](#gp2-uc2-s2), remove a course from their schedule [[S3]](#gp2-uc2-s3), add an event to their schedule [[S4]](#gp2-uc2-s4), and remove an event from their schedule [[S5]](#gp2-uc2-s5).  The student can reset their schedule [[S6]](#gp2-uc2-s6).  The student can display their final schedule [[UC3]](#gp2-uc3).  Anytime a course in the catalog list is selected, details about the course are displayed [[S7]](#gp2-uc2-s7).

**Sub Flows:**

  * <a id="gp2-uc2-s1"></a>[S1]: The schedule's default name is "My Schedule".  The student can name their schedule or leave the title empty [[E1]](#gp2-uc2-e1).
  * <a id="gp2-uc2-s2"></a>[S2]: All courses are listed.  The student may select a course and add the course to their schedule [[E2]](#gp2-uc2-e2)[[E3]](#gp2-uc2-e3).
  * <a id="gp2-uc2-s3"></a>[S3]: The student selects a course from their schedule and clicks the remove course button.  The course is removed from the schedule [[E4]](#gp2-uc2-e4).
  * <a id="gp2-uc2-s4"></a>[S4]: A student clicks the button to add an event.  The student is prompted for the event title, days of the week (Sunday through Saturday), start time, end time, how frequently the event repeats (between 1 and 4 weeks), and optional event details [[E5]](#gp2-uc2-e5)[[E6]](#gp2-uc2-e6)[[E7]](#gp2-uc2-e7)[[E8]](#gp2-uc2-e8)[[E10]](#gp2-uc2-e10).
  * <a id="gp2-uc2-s5"></a>[S5]: The student selects an event from their schedule and clicks the remove event button.  The event is removed from the schedule[[E9]](#gp2-uc2-e9).
  * <a id="gp2-uc2-s6"></a>[S6]: The student clicks the reset schedule button.  All events and courses are removed from the schedule.  The schedule's name is reset.
  * <a id="gp2-uc2-s7"></a>[S7]: The student clicks on a course in the catalog list.  The course details are displayed with the course name, section, title, instructor, credit hours, and meeting information.  If the meeting days are "A", the details view shows "Arranged".  Otherwise, the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time.  Only "AM" and "PM" are used.

**Alternative Flows:**

  * <a id="gp2-uc2-e1"></a>[E1]: If the title name is invalid, a pop-up message stating "Invalid title." is displayed.  The student clicks OK and is returned to the GUI with no change.
  * <a id="gp2-uc2-e2"></a>[E2]: If the student has already added a course with the same name to their schedule (the same section or a different section), a pop-up message stating "You are already enrolled in <course name>." is displayed, where <course name> is replaced with the name of the course.  The student clicks OK and is returned to their schedule with no change.
  * <a id="gp2-uc2-e3"></a>[E3]: If the course conflicts with another course or event on the student's schedule, a pop-up message stating "The course cannot be added due to a conflict." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="gp2-uc2-e4"></a>[E4]: If no course is selected in the student's schedule, a pop-up message stating "No item selected in the schedule." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="gp2-uc2-e5"></a>[E5]: If the student has already added an event with the same title to their schedule, a pop-up message stating "You have already created an event called <event title>." is displayed, where <event title> is replaced with the title of the event.  The student clicks OK and is returned to the event editing information that is populated with earlier values for editing.
  * <a id="gp2-uc2-e6"></a>[E6]: If the event conflicts with another course of event on the student's schedule, a pop-up message stating "The event cannot be added due to a conflict." is displayed.  The student clicks OK and is returned to the event editing information that is populated with earlier values for editing.
  * <a id="gp2-uc2-e7"></a>[E7]: If the event name is null or an empty string, a pop-up message stating "The event is invalid." is displayed.  The student clicks OK and is returned to the event editing information that is populated with earlier values for editing.
  * <a id="gp2-uc2-e8"></a>[E8]: If the event start time or end time is empty, an invalid time, or if the end time is earlier than the start time, a pop-up message stating "The event is invalid." is displayed. The student clicks OK and is returned to the event editing information that is populated with earlier values for editing.
  * <a id="gp2-uc2-e9"></a>[E9]: If no event is selected in the student's schedule, a pop-up message stating "No item selected in the schedule." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="gp2-uc2-e10"></a>[E10]: If no day of week is selected, a pop-up message stating "The event must occur on at least one day." is displayed. The student clicks OK and is returned to the event editing information that is populated with earlier values for editing. 


### <a id="gp2-uc3"></a>Use Case 3: Display Final Schedule

**Preconditions:** At least one course or event has been added to the student's schedule [[UC2]](#gp2-uc2).

**Main Flow:** The student's schedule is displayed showing the courses and events on in a table listing [[S1]](#gp2-uc3-s1).  The schedule can be exported as a comma-separated list of courses and events [[S2]](#gp2-uc3-s2).  The student can revise their schedule [[UC2]](#gp2-uc2).

**Sub Flows:**

  * <a id="gp2-uc3-s1"></a>[S1]: A text table will list all student courses and student events with columns for course name, section, title, instructor, credit hours, meeting information, weekly repeat, and description.  If the meeting days are "A", the details view shows "Arranged".  Otherwise, the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time.  Only "AM" and "PM" are used.  If the row is an event, then the name, section, instructor, and credit hours are left blank.  After the table, the total number of credit hours is listed for the given schedule.
  * <a id="gp2-uc3-s2"></a>[S2]: If the export button is pressed, the student is prompted with a file dialog where they can provide a file name for saving the schedule.  The schedule is stored in a text file with a comma-separated list of courses and events with an ordering of information as follows: [[E1]](#gp2-uc3-e1).
     * Course: name,section,title,credits,instructor,meetingDays[,startTime,endTime]
     * Event: title,meetingDays,startTime,endTime,weeklyRepeat,details

**Alternative Flows:**

  * <a id="gp2-uc3-e1"></a>[E1]: If the file cannot be saved, a pop-up message stating "The file cannot be saved." is displayed.  The student clicks OK and is returned to the file saving dialog [[S2]](#gp2-uc3-s2).
  

## Guided Project 3 Requirements


### <a id="gp3-uc1"></a>Use Case 1: Loading Courses

**Main Flow:** The program starts and prompts for a file containing the listing of all courses for the upcoming semester [[S1]](#gp3-uc1-s1)[[E1]](#gp3-uc1-e1).  The program stores all of the course information and creates an empty schedule [[UC2]](#gp3-uc2).

**Sub Flows:**

  * <a id="gp3-uc1-s1"></a>[S1]: Information about scheduled courses are stored in a file with one course record per line.  A course record is a comma separated list of the course name, course title, section number, the number of credit hours, instructor's unity id, meeting days, start time, and end time.  The start time and end time may be omitted if the meeting days are listed as 'A'(rranged).  Valid course records are stored in a list of courses [[E2]](#gp3-uc1-e2). A course record is invalid if one or more of the following are true, and an invalid course records is skipped:
     * an item is missing
     * the course name is null or an empty string
     * the course name is fewer than 4 characters or greater than 6 characters
     * the course title is null or an empty string
     * the section number is NOT exactly three digits
     * the credit hours are not a number
     * the credit hours are less than 1 or greater than 5
     * the instructor's id is null or an empty string
     * meeting days consist of any characters other than 'M', 'T', 'W', 'H', 'F', or 'A' 
     * if 'A' is in the meeting days list, it must be the only character
     * the start time is not between 0000 and 2359 an invalid military time
     * the end time is not between 0000 and 2359 or an invalid military time
     * the end time is less than the start time (i.e., no overnight classes)
     * a start time and/or end time is listed when meeting days is 'A'
     * a course with the same name and section

    An example of what a course schedule file might look like is below:

        
        CSC116,Intro to Programming - Java,001,3,jdyoung2,MW,0910,1100
        CSC116,Intro to Programming - Java,002,3,spbalik,MW,1120,1310
        CSC116,Intro to Programming - Java,003,3,tbdimitr,TH,1120,1310
        CSC216,Programming Concepts - Java,001,4,sesmith5,TH,1330,1445
        CSC216,Programming Concepts - Java,002,4,jtking,MW,1330,1445
        CSC216,Programming Concepts - Java,601,4,jep,A
        
    
**Alternative Flows:**

  * <a id="gp3-uc1-e1"></a>[E1] If the file does not exist on the system, an error message, "Cannot find file." is displayed and the user is re-prompted for a file.
  * <a id="gp3-uc1-e2"></a>[E2] An invalid course record is ignored and not added to the list of courses stored by the system.



### <a id="gp3-uc2"></a>Use Case 2: Scheduling

**Preconditions:** At least one course for the upcoming semester has been loaded into the system [[UC1]](#gp3-uc1).

**Main Flow:** The student starts with an empty schedule.  The student can name their schedule [[S1]](#gp3-uc2-s1), add a course to their schedule [[S2]](#gp3-uc2-s2), remove a course from their schedule [[S3]](#gp3-uc2-s3), add an event to their schedule [[S4]](#gp3-uc2-s4), and remove an event from their schedule [[S5]](#gp3-uc2-s5).  The student can reset their schedule [[S6]](#gp3-uc2-s6).  The student can display their final schedule [[UC3]](#gp3-uc3).  Anytime a course in the catalog list is selected, details about the course are displayed [[S7]](#gp3-uc2-s7).

**Sub Flows:**

  * <a id="gp3-uc2-s1"></a>[S1]: The schedule's default name is "My Schedule".  The student can name their schedule or leave the title empty [[E1]](#gp3-uc2-e1).
  * <a id="gp3-uc2-s2"></a>[S2]: All courses are listed.  The student may select a course and add the course to their schedule [[E2]](#gp3-uc2-e2)[[E3]](#gp3-uc2-e3).
  * <a id="gp3-uc2-s3"></a>[S3]: The student selects a course from their schedule and clicks the remove course button.  The course is removed from the schedule [[E4]](#gp3-uc2-e4).
  * <a id="gp3-uc2-s4"></a>[S4]: A student clicks the button to add an event.  The student is prompted for the event title, days of the week (Sunday through Saturday), start time, end time, how frequently the event repeats (between 1 and 4 weeks), and optional event details [[E5]](#gp3-uc2-e5)[[E6]](#gp3-uc2-e6)[[E7]](#gp3-uc2-e7)[[E8]](#gp3-uc2-e8)[[E10]](#gp3-uc2-e10).
  * <a id="gp3-uc2-s5"></a>[S5]: The student selects an event from their schedule and clicks the remove event button.  The event is removed from the schedule[[E9]](#gp3-uc2-e9).
  * <a id="gp3-uc2-s6"></a>[S6]: The student clicks the reset schedule button.  All events and courses are removed from the schedule.  The schedule's name is reset.
  * <a id="gp3-uc2-s7"></a>[S7]: The student clicks on a course in the catalog list.  The course details are displayed with the course name, section, title, instructor, credit hours, and meeting information.  If the meeting days are "A", the details view shows "Arranged".  Otherwise, the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time.  Only "AM" and "PM" are used.

**Alternative Flows:**

  * <a id="gp3-uc2-e1"></a>[E1]: If the title name is invalid, a pop-up message stating "Invalid title." is displayed.  The student clicks OK and is returned to the GUI with no change.
  * <a id="gp3-uc2-e2"></a>[E2]: If the student has already added a course with the same name to their schedule (the same section or a different section), a pop-up message stating "You are already enrolled in <course name>." is displayed, where <course name> is replaced with the name of the course.  The student clicks OK and is returned to their schedule with no change.
  * <a id="gp3-uc2-e3"></a>[E3]: If the course conflicts with another course or event (meaning there is an overlap of at least one day and time, even by the same minute) on the student's schedule, a pop-up message stating "The course cannot be added due to a conflict." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="gp3-uc2-e4"></a>[E4]: If no course is selected in the student's schedule, a pop-up message stating "No item selected in the schedule." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="gp3-uc2-e5"></a>[E5]: If the student has already added an event with the same title to their schedule, a pop-up message stating "You have already created an event called <event title>." is displayed, where <event title> is replaced with the title of the event.  The student clicks OK and is returned to the event editing information that is populated with earlier values for editing.
  * <a id="gp3-uc2-e6"></a>[E6]: If the event conflicts with another course of event (meaning there is an overlap of at least one day and time, even by the same minute) on the student's schedule, a pop-up message stating "The event cannot be added due to a conflict." is displayed.  The student clicks OK and is returned to the event editing information that is populated with earlier values for editing.
  * <a id="gp3-uc2-e7"></a>[E7]: If the event name is null or an empty string, a pop-up message stating "The event is invalid." is displayed.  The student clicks OK and is returned to the event editing information that is populated with earlier values for editing.
  * <a id="gp3-uc2-e8"></a>[E8]: If the event start time or end time is empty, an invalid time, or if the end time is earlier than the start time, a pop-up message stating "The event is invalid." is displayed. The student clicks OK and is returned to the event editing information that is populated with earlier values for editing.
  * <a id="gp3-uc2-e9"></a>[E9]: If no event is selected in the student's schedule, a pop-up message stating "No item selected in the schedule." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="gp3-uc2-e10"></a>[E10]: If no day of week is selected, a pop-up message stating "The event must occur on at least one day." is displayed. The student clicks OK and is returned to the event editing information that is populated with earlier values for editing. 


### <a id="gp3-uc3"></a>Use Case 3: Display Final Schedule

**Preconditions:** At least one course or event has been added to the student's schedule [[UC2]](#gp3-uc2).

**Main Flow:** The student's schedule is displayed showing the courses and events on in a table listing [[S1]](#gp3-uc3-s1).  The schedule can be exported as a comma-separated list of courses and events [[S2]](#gp3-uc3-s2).  The student can revise their schedule [[UC2]](#gp3-uc2).

**Sub Flows:**

  * <a id="gp3-uc3-s1"></a>[S1]: A text table will list all student courses and student events with columns for course name, section, title, instructor, credit hours, meeting information, weekly repeat, and description.  If the meeting days are "A", the details view shows "Arranged".  Otherwise, the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time.  Only "AM" and "PM" are used.  If the row is an event, then the name, section, instructor, and credit hours are left blank.  After the table, the total number of credit hours is listed for the given schedule.
  * <a id="gp3-uc3-s2"></a>[S2]: If the export button is pressed, the student is prompted with a file dialog where they can provide a file name for saving the schedule.  The schedule is stored in a text file with a comma-separated list of courses and events with an ordering of information as follows: [[E1]](#gp3-uc3-e1).
     * Course: name,section,title,credits,instructor,meetingDays[,startTime,endTime]
     * Event: title,meetingDays,startTime,endTime,weeklyRepeat,details

**Alternative Flows:**

  * <a id="gp3-uc3-e1"></a>[E1]: If the file cannot be saved, a pop-up message stating "The file cannot be saved." is displayed.  The student clicks OK and is returned to the file saving dialog [[S2]](#gp3-uc3-s2).
  
