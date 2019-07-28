---
title: CSC216 Lab 07 - ArrayLists
tags: [software engineering, software lifecycle, CS2, CSC216, Lab07]
description: CSC216 Lab 07 - Requirements
navigation: on
pagegroup: 07-lab
---

# CSC216 Lab 07 Requirements
{% include iconHeader.html type="requirements" %}
`PackScheduler` is a course registration system for a university, similar to the system in MyPackPortal that you use to register for your classes.  You'll work on implementing a system that provides the functionality for admitted students to register for courses that are taught by faculty.  The courses will have enrollment caps and waitlists.  

<font color="red">For Lab 07, you will focus on the student schedule functionality, which is described in </font>[[UC6]](#uc6).


## <a id="uc0"></a>Use Case 0: Authentication

**Main Flow:** The program starts by providing an authentication window requesting a user id and password. The user enters their id and password and clicks the OK button [[S1]](#uc0-s1)[[E1]](#uc0-e1) or the Cancel button [[S2]](#uc0-s2).

**Sub Flows:** 

  * <a id="uc0-s1"></a>[S1]: The provided password is hashed using the SHA-256 algorithm and is compared with the user's stored password [[E2]](#uc0-e2)[[E3]](#uc0-e3). The user is directed to the appropriate interface depending on their role in the system:
     * If the user is the registrar, they are directed to the registrar user interface [[UC1]](#uc1).  
     * If the user is a student, they are directed to the student user interface [[UC6]](#uc6).
  * <a id="uc0-s2"></a>[S2]: The program exits with no changes to any stored data.

**Alternative Flows:**

  * <a id="uc0-e1"></a>[E1]: If a user is already logged into the system, a new user may not log in.
  * <a id="uc0-e2"></a>[E2]: If the user doesn't exist in the system, a pop-up message stating "User doesn't exist" is displayed.  The user clicks OK and is returned to the authentication window [[UC0]](#uc0).
  * <a id="uc0-e3"></a>[E3]: If the user's hashed password doesn't match the stored hashed password, a pop-up message stating "Invalid id or password" is displayed.  The user clicks OK and is returned to the authentication window [[UC0]](#uc0).


## <a id="uc1"></a>Use Case 1: Registrar Functionality

**Main Flow:** The registrar initially starts with an empty student directory and course catalog.  The registrar can work with the student directory [[UC2]](#uc2) and the course catalog [[UC4]](#uc4).

  

## <a id="uc2"></a>Use Case 2: Student Directory

**Main Flow:** The registrar can create a new, empty, student directory [[S1]](#uc2-s1); load an existing student directory from a text file [[S2]](#uc2-s2); save the current student directory to a text file [[S3]](#uc2-s3); add a student to the directory [[S4]](#uc2-s4); and remove a student from the directory [[S5]](#uc2-s5).  If the user quits the program, any changes to the student directory are lost unless the user saves the student directory [[S3]](#uc2-s3). All students are stored in the directory in alphabetical order by last name and then by first name.  If there are two students with the same name, then the id is considered in the sort.

<!-- ![*Student Directory GUI*](images/StudentDirectoryPanel.PNG) -->

**Sub Flows:**

  * <a id="uc2-s1"></a>[S1]: The user clicks the **New Student Directory** button.  Any students in the directory are cleared, and a new empty directory is created.  The *Student Directory* list is empty.
  * <a id="uc2-s2"></a>[S2]: The user clicks the **Load Student Directory** button.  A dialog opens where the user selects a text file containing student information [[E1]](#uc2-e1).  A list of students from valid records is created and displayed in the *Student Directory* list in sorted order.  Any invalid records [[UC3, E1]](#uc3-e1) are ignored. 
  * <a id="uc2-s3"></a>[S3]: The user clicks the **Save Student Directory** button.  A dialog opens where the user selects the location to save the list of students [[E2]](#uc2-e2)  The list of students is saved to a text file with a student record on each line.  Each student record is a comma separated list of items [[UC3]](#uc3) and the students are saved in sorted order.
  * <a id="uc2-s4"></a>[S4]: The user adds a student, with a unique id [[E3]](#uc2-e3), by entering a first name [[E4]](#uc2-e4), last name [[E5]](#uc2-e5), id [[E6]](#uc2-e6), email [[E7]](#uc2-e7), password [[E8]](#uc2-e8), repeated password, and max credits [[E9]](#uc2-e9)[[E10]](#uc2-e10) and clicks the **Add Student** button.  The password and repeated password are hashed using SHA-256 and must match [[E11]](#uc2-e11).  The student is added to the directory in sorted order.
  * <a id="uc2-s5"></a>[S5]: The user selects a student in the *Student Directory* list and clicks the **Remove Student** button [[E12]](#uc2-e12).  The student is removed from the *Student Directory* list.
  
**Alternative Flows:**

  * <a id="uc2-e1"></a>[E1]: If the file cannot be found on the file system, the error message "Unable to read file <filename>" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e2"></a>[E2]: If the file cannot be written to, the error message "Unable to write to file <filename>" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e3"></a>[E3]: If the student's id is not unique, the error message "Student already in system." is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e4"></a>[E4]: If the student's first name is invalid [[UC3, E1]](#uc3-e1), the error message "Invalid first name" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e5"></a>[E5]: If the student's last name is invalid [[UC3, E1]](#uc3-e1), the error message "Invalid last name" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e6"></a>[E6]: If the student's id is invalid [[UC3, E1]](#uc3-e1), the error message "Invalid id" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e7"></a>[E7]: If the student's email is invalid [[UC3, E1]](#uc3-e1), the error message "Invalid email" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e8"></a>[E8]: If the student's password is invalid [[UC3, E1]](#uc3-e1), the error message "Invalid password" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e9"></a>[E9]: If the student's max credits are invalid [[UC3, E1]](#uc3-e1), the error message "Invalid max credits" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e10"></a>[E10]: If the max credits value is not a number, the error message "Max credits must be a positive number between 3 and 18." is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e11"></a>[E11]: If the student's password and repeated passwords do not match, the error message "Passwords do not match" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e12"></a>[E12]: If there is no student selected, the error message "No student selected." is displayed. The user clicks OK and is returned to the student directory display.


## <a id="uc3"></a>Use Case 3: Student Records

**Main Flow:** Every student has a first name, last name, id, email address, password, and max number of credits they can take in a given semester [[E1]](#uc3-e1). To protect the student's information, the student's password should be hashed using SHA-256 when stored.  When stored in a text file, a student record is a comma separated list in the following format:

    firstName,lastName,id,email,hashedPassword,maxCredits

**Alternative Flows:**

  * <a id="uc3-e1"></a>[E1]: A student is invalid if any of the following are true:
     * an item is missing
     * first name is null or an empty string
     * last name is null or an empty string
     * id is null or an empty string
     * email is null or an empty string
     * email doesn't contain an '@' character
     * email doesn't contain a '.' character
     * the index of the last '.' character in the email string is smaller than the index of the first '@' character (e.g., first.last@address would be invalid)
     * the password is null or an empty string
     * max credits is below 3 or above 18


## <a id="uc4"></a>Use Case 4: Course Catalog

**Main Flow:** The registrar can create a new, empty, course catalog [[S1]](#uc4-s1); load an existing course catalog from a text file [[S2]](#uc4-s2); save the current course catalog to a text file [[S3]](#uc4-s3); add a course to the catalog [[S4]](#uc4-s4); and remove a course from the catalog [[S5]](#uc4-s5).  If the user quits the program, any changes to the course catalog are lost unless the user saves the course catalog [[S3]](#uc4-s3). All courses are stored in the catalog in sorted order by course name and section.  There may be multiple sections of the same course, but a course/section pair must be unique.

<!-- TODO: Add in an item for assigning a faculty member to a course -->

<!--![*Course Catalog GUI*](images/CourseCatalogPanel.PNG) -->

**Sub Flows:**

  * <a id="uc4-s1"></a>[S1]: The user clicks the **New Course Catalog** button.  Any courses in the catalog are cleared, and a new empty catalog is created.  The *Course Catalog* list is empty.
  * <a id="uc4-s2"></a>[S2]: The user clicks the **Load Course Catalog** button.  A dialog opens where the user selects a text file containing course information [[E1]](#uc4-e1).  A list of courses from valid records is created and displayed in the *Course Catalog* list in sorted order.  Any invalid records [[UC5, E1]](#uc5-e1) are ignored. 
  * <a id="uc4-s3"></a>[S3]: The user clicks the **Save Course Catalog** button.  A dialog opens where the user selects the location to save the list of courses [[E2]](#uc4-e2)  The list of courses is saved to a text file with a course record on each line.  Each course record is a comma separated list of items [[UC5]](#uc5) and the courses are saved in sorted order.
  * <a id="uc4-s4"></a>[S4]: The user adds a course, with a unique name/section pair [[E3]](#uc4-e3), by entering a course name [[E4]](#uc4-e4), course title [[E5]](#uc4-e5), section number [[E6]](#uc4-e6), credit hours [[E7]](#uc4-e7), instructor unity id [[E8]](#uc4-e8), meeting days [[E9]](#uc4-e9), start time [[E10]](#uc4-e10), and end time [[E11]](#uc4-e11)[[E12]](#uc4-e12) and clicks the **Add Course** button.  The course is added to the catalog in sorted order.
  * <a id="uc4-s5"></a>[S5]: The user selects a course in the *Course Catalog* list and clicks the **Remove Course** button [[E13]](#uc4-e13).  The course is removed from the *Course Catalog* list.
  
**Alternative Flows:**

  * <a id="uc4-e1"></a>[E1]: If the file cannot be found on the file system, the error message "Unable to read file <filename>" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e2"></a>[E2]: If the file cannot be written to, the error message "Unable to write to file <filename>" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e3"></a>[E3]: If the course's name and section already exist in the catalog, the error message "Course already in system." is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e4"></a>[E4]: If the course's name is invalid [[UC5, E1]](#uc5-e1), the error message "Invalid course name" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e5"></a>[E5]: If the course's title is invalid [[UC5, E1]](#uc5-e1), the error message "Invalid course title" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e6"></a>[E6]: If the course's section number is invalid [[UC5, E1]](#uc5-e1), the error message "Invalid section number" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e7"></a>[E7]: If the course's credit hours is invalid [[UC5, E1]](#uc5-e1), the error message "Invalid credit hours" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e8"></a>[E8]: If the course's instructor unity id is invalid [[UC5, E1]](#uc5-e1), the error message "Invalid instructor unity id" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e9"></a>[E9]: If the course's meeting days are invalid [[UC5, E1]](#uc5-e1), the error message "Invalid meeting days" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e10"></a>[E10]: If the course's start time is invalid, the error message "Invalid start time" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e11"></a>[E11]: If the course's end time is invalid, the error message "Invalid end time" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e12"></a>[E12]: If the course's end time and start time together are invalid, the error message "Invalid course times" is displayed. The user clicks OK and is returned to the course catalog display.
  * <a id="uc4-e13"></a>[E13]: If there is no course selected, the error message "No course selected." is displayed. The user clicks OK and is returned to the course catalog display.

     
## <a id="uc5"></a>Use Case 5: Course Records

**Main Flow:** Every course has a course name, course title, section number, number of credit hours, instructor's unity id, meeting days, start time, and end time [[S1]](#uc5-s1). When stored in a text file, a course record is a comma separated list in the following format:

    courseName,courseTitle,sectionNumber,creditHours,instructorUnityID,meetingDays,startTime,endTime

**Sub Flows:**

  * <a id="uc5-s1"></a>[S1]: Information about scheduled courses are stored in a file with one course record per line.  A course record is a comma separated list of the course name, course title, section number, the number of credit hours, instructor's unity id, meeting days, start time, and end time.  The start time and end time may be omitted if the meeting days are listed as 'A'(rranged).  Valid course records are stored in a list of courses [[E1]](#uc5-e1).  An example of what a course schedule file might look like is below:

        
        CSC116,Intro to Programming - Java,001,3,jdyoung2,MW,0910,1100
        CSC116,Intro to Programming - Java,002,3,spbalik,MW,1120,1310
        CSC116,Intro to Programming - Java,003,3,tbdimitr,TH,1120,1310
        CSC216,Programming Concepts - Java,001,4,sesmith5,TH,1330,1445
        CSC216,Programming Concepts - Java,002,4,jtking,MW,1330,1445
        CSC216,Programming Concepts - Java,601,4,jep,A
        
    
**Alternative Flows:**

  * <a id="uc5-e1"></a>[E1] An invalid course record is ignored and not added to the list of courses stored by the system. A course record is invalid if one or more of the following are true, and an invalid course records is skipped:
     * an item is missing
     * the course name is null or an empty string
     * the course name doesn't meet the format of beginning with 1-4 letters, followed by exactly 3 digits, followed by an optional 1 letter suffix
     * the course name is fewer than 4 characters or greater than 8 characters
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


## <a id="uc6"></a>Use Case 6: Student Scheduling

**Preconditions:** The student exists in the student directory [[UC2]](#uc2) and has successfully authenticated to the system [[UC0]](#uc0).  At least one course for the upcoming semester has been loaded into the system [[UC4]](#uc4).

**Main Flow:** The student starts with an empty schedule.  The student can name their schedule [[S1]](#uc6-s1), add a course to their schedule [[S2]](#uc6-s2), and remove a course from their schedule [[S3]](#uc6-s3).  The student can reset their schedule [[S4]](#uc6-s4).  The student can display their final schedule [[UC7]](#uc7).  Any time a course in the catalog list is selected, details about the course are displayed [[S5]](#uc6-s5).

**Sub Flows:**

  * <a id="uc6-s1"></a>[S1]: The schedule's default name is "My Schedule".  The student can name their schedule or leave the title empty [[E1]](#uc6-e1).
  * <a id="uc6-s2"></a>[S2]: All courses are listed.  The student may select a course and add the course to their schedule [[E2]](#uc6-e2)[[E3]](#uc6-e3).
  * <a id="uc6-s3"></a>[S3]: The student selects a course from their schedule and clicks the remove course button.  The course is removed from the schedule [[E4]](#uc6-e4).
  * <a id="uc6-s4"></a>[S4]: The student clicks the reset schedule button.  All courses are removed from the schedule.  The schedule's name is reset.
  * <a id="uc6-s5"></a>[S5]: The student clicks on a course in the catalog list.  The course details are displayed with the course name, section, title, instructor, credit hours, and meeting information.  If the meeting days are "A", the details view shows "Arranged".  Otherwise, the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time.  Only "AM" and "PM" are used.

**Alternative Flows:**

  * <a id="uc6-e1"></a>[E1]: If the title name is invalid, a pop-up message stating "Invalid title." is displayed.  The student clicks OK and is returned to the GUI with no change.
  * <a id="uc6-e2"></a>[E2]: If the student has already added a course with the same name to their schedule (the same section or a different section), a pop-up message stating "You are already enrolled in &lt;course name&gt;" is displayed, where &lt;course name&gt; is replaced with the name of the course.  The student clicks OK and is returned to their schedule with no change.
  * <a id="uc6-e3"></a>[E3]: If the course conflicts with another course (meaning there is an overlap of at least one day and time, even by the same minute) on the student's schedule, a pop-up message stating "The course cannot be added due to a conflict." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="uc6-e4"></a>[E4]: If no course is selected in the student's schedule, a pop-up message stating "No item selected in the schedule." is displayed.  The student clicks OK and is returned to their schedule with no change.


## <a id="uc7"></a>Use Case 7: Display Final Schedule

**Preconditions:** At least one course has been added to the student's schedule [[UC6]](#uc6).

**Main Flow:** The student's schedule is displayed showing the courses in a table listing [[S1]](#uc7-s1).  The schedule can be exported as a comma-separated list of courses [[S2]](#uc7-s2).  The student can revise their schedule [[UC6]](#uc6).

**Sub Flows:**

  * <a id="uc7-s1"></a>[S1]: A text table will list all student courses  with columns for course name, section, title, instructor, credit hours, meeting information.  If the meeting days are "A", the details view shows "Arranged".  Otherwise, and the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time.  Only "AM" and "PM" are used.  
  * <a id="uc7-s2"></a>[S2]: If the export button is pressed, the student is prompted with a file dialog where they can provide a file name for saving the schedule.  The schedule is stored in a text file with a comma-separated list of courses, in sorted order by name and section, with an ordering of information as follows: [[E1]](#uc7-e1).
     * Course: name,section,title,credits,instructor,meetingDays[,startTime,endTime]

**Alternative Flows:**

  * <a id="uc7-e1"></a>[E1]: If the file cannot be saved, a pop-up message stating "The file cannot be saved." is displayed.  The student clicks OK and is returned to the file saving dialog [[S2]](#uc7-s2).
