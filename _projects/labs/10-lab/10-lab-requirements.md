---
title: CSC216 Lab 10 - Iterators
tags: [software engineering, software lifecycle, CS2, CSC216, Lab10]
description: CSC216 Lab 10 - Requirements
navigation: on
pagegroup: 10-lab
---

# CSC216 Lab 10 Requirements
{% include iconHeader.html type="requirements" %}
`PackScheduler` is a course registration system for a university, similar to the system in MyPackPortal that you use to register for your classes.  You'll work on implementing a system that provides the functionality for admitted students to register for courses that are taught by faculty.  The courses will have enrollment caps and waitlists.  

<font color="red">For Lab 10, you will add faculty functionality at all layers of the system </font>[[UC1]](#uc1), [[UC8]](#uc8), and [[UC9]](#uc9).


## <a id="uc0"></a>Use Case 0: Authentication

**Main Flow:** The program starts by providing an authentication window requesting a user id and password. The user enters their id and password and clicks OK  [[S1]](#uc0-s1)[[E1]](#uc0-e1) or Cancel [[S2]](#uc0-s2).

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

**Main Flow:** The registrar initially starts with an empty student directory, <font color="red">an empty faculty directory</font>, and course catalog.  The registrar can work with the student directory [[UC2]](#uc2), <font color="red"> faculty directory</font> [[UC8]](#uc8), and the course catalog [[UC4]](#uc4).

  

## <a id="uc2"></a>Use Case 2: Student Directory

**Main Flow:** The registrar can create a new, empty, student directory [[S1]](#uc2-s1); load an existing student directory from a text file [[S2]](#uc2-s2); save the current student directory to a text file [[S3]](#uc2-s3); add a student to the directory [[S4]](#uc2-s4); and remove a student from the directory [[S5]](#uc2-s5).  If the user quits the program, any changes to the student directory are lost unless the user saves the student directory [[S3]](#uc2-s3). All students are stored in the directory in alphabetical order by last name and then by first name.  If there are two students with the same name, then the id is considered in the sort.

<!-- ![*Student Directory GUI*](images/StudentDirectoryPanel.PNG) -->

**Sub Flows:**

  * <a id="uc2-s1"></a>[S1]: The user clicks **New Student Directory**.  Any students in the directory are cleared, and a new empty directory is created.  The *Student Directory* list is empty.
  * <a id="uc2-s2"></a>[S2]: The user clicks **Load Student Directory**.  A dialog opens where the user selects a text file containing student information [[E1]](#uc2-e1).  A list of students from valid records is created and displayed in the *Student Directory* list in sorted order.  Any invalid records [[UC3, E1]](#uc3-e1) are ignored. 
  * <a id="uc2-s3"></a>[S3]: The user clicks **Save Student Directory**.  A dialog opens where the user selects the location to save the list of students [[E2]](#uc2-e2)  The list of students is saved to a text file with a student record on each line.  Each student record is a comma separated list of items [[UC3]](#uc3) and the students are saved in sorted order.
  * <a id="uc2-s4"></a>[S4]: The user adds a student, with a unique id [[E3]](#uc2-e3), by entering a first name [[E4]](#uc2-e4), last name [[E5]](#uc2-e5), id [[E6]](#uc2-e6), email [[E7]](#uc2-e7), password [[E8]](#uc2-e8), repeated password, and max credits [[E9]](#uc2-e9)[[E10]](#uc2-e10) and clicks **Add Student**.  The password and repeated password are hashed using SHA-256 and must match [[E11]](#uc2-e11).  The student is added to the directory in sorted order.
  * <a id="uc2-s5"></a>[S5]: The user selects a student in the *Student Directory* list and clicks **Remove Student** [[E12]](#uc2-e12).  The student is removed from the *Student Directory* list.
  
**Alternative Flows:**

  * <a id="uc2-e1"></a>[E1]: If the file cannot be found on the file system, the error message "Unable to read file <filename>" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e2"></a>[E2]: If the file cannot be written to, the error message "Unable to write to file <filename>" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e3"></a>[E3]: If the student's id is not unique, the error message "Student already in system." is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e4"></a>[E4]: If the student's first name is invalid [[UC3, E1]](#uc3-e1), the error message "Invalid first name" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e5"></a>[E5]: If the student's last name is invalid [[UC3, E1]](#uc3-e1), the error message "Invalid last name" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e6"></a>[E6]: If the student's id is invalid [[UC3, E1]](#uc3-e1), the error message "Invalid id" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e7"></a>[E7]: If the student's email is invalid [[UC3, E1]](#uc3-e1), the error message "Invalid email" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e8"></a>[E8]: If the student's password is invalid [[UC3, E1]](#uc3-e1), the error message "Invalid password" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e9"></a>[E9]: If the student's max credits value is invalid [[UC3, E1]](#uc3-e1), the error message "Invalid max credits" is displayed.  The user clicks OK and is returned to the student directory display.
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

**Main Flow:** The registrar can create a new, empty, course catalog [[S1]](#uc4-s1); load an existing course catalog from a text file [[S2]](#uc4-s2); save the current course catalog to a text file [[S3]](#uc4-s3); add a course to the catalog [[S4]](#uc4-s4); and remove a course from the catalog [[S5]](#uc4-s5).  If the user quits the program, any changes to the course catalog are lost unless the user saves the course catalog [[S3]](#uc4-s3). All courses are stored in the catalog in sorted order by course name and section. All courses have a waitlist of size 10.  There may be multiple sections of the same course, but a course/section pair must be unique.

<!-- TODO: Add in an item for assigning a faculty member to a course -->

<!--![*Course Catalog GUI*](images/CourseCatalogPanel.PNG) -->

**Sub Flows:**

  * <a id="uc4-s1"></a>[S1]: The user clicks **New Course Catalog**.  Any courses in the catalog are cleared, and a new empty catalog is created.  The *Course Catalog* list is empty.
  * <a id="uc4-s2"></a>[S2]: The user clicks **Load Course Catalog**.  A dialog opens where the user selects a text file containing course information [[E1]](#uc4-e1).  A list of courses from valid records is created and displayed in the *Course Catalog* list in sorted order.  Any invalid records [[UC5, E1]](#uc5-e1) are ignored. 
  * <a id="uc4-s3"></a>[S3]: The user clicks **Save Course Catalog**.  A dialog opens where the user selects the location to save the list of courses [[E2]](#uc4-e2)  The list of courses is saved to a text file with a course record on each line.  Each course record is a comma separated list of items [[UC5]](#uc5)and the courses are saved in sorted order.
  * <a id="uc4-s4"></a>[S4]: The user adds a course, with a unique name/section pair [[E3]](#uc4-e3), by entering a course name [[E4]](#uc4-e4), course title [[E5]](#uc4-e5), section number [[E6]](#uc4-e6), credit hours [[E7]](#uc4-e7), instructor unity id [[E8]](#uc4-e8), meeting days [[E9]](#uc4-e9), start time [[E10]](#uc4-e10), and end time [[E11]](#uc4-e11)[[E12]](#uc4-e12) and clicks **Add Course**.  The course is added to the catalog in sorted order.
  * <a id="uc4-s5"></a>[S5]: The user selects a course in the *Course Catalog* list and clicks **Remove Course** [[E13]](#uc4-e13).  The course is removed from the *Course Catalog* list.
  
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

**Main Flow:** Every course has a course name, course title, section number, number of credit hours, instructor's unity id, enrollment capacity, meeting days, start time, and end time. [[S1]](#uc5-s1). When stored in a text file, a course record is a comma separated list in the following format:

    courseName,courseTitle,sectionNumber,creditHours,instructorUnityID,enrollmentCap,meetingDays,startTime,endTime

**Sub Flows:**

  * <a id="uc5-s1"></a>[S1]: Information about scheduled courses are stored in a file with one course record per line.  A course record is a comma separated list of the course name, course title, section number, the number of credit hours, instructor's unity id, enrollment capacity, meeting days, start time, and end time.  The start time and end time may be omitted if the meeting days are listed as 'A'(rranged).  Valid course records are stored in a list of courses [[E1]](#uc5-e1).  An example of what a course schedule file might look like is below:

```
CSC116,Intro to Programming - Java,001,3,jdyoung2,10,MW,1010,1100
CSC116,Intro to Programming - Java,002,3,spbalik,10,MW,1120,1310
CSC116,Intro to Programming - Java,003,3,tbdimitr,10,TH,1120,1310
CSC216,Programming Concepts - Java,001,4,sesmith5,10,TH,1330,1445
CSC216,Programming Concepts - Java,002,4,jtking,10,MW,1330,1445
CSC216,Programming Concepts - Java,601,4,jep,10,A
```
    
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
     * the enrollment capacity is less than 10 or greater than 250
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
  * <a id="uc6-s2"></a>[S2]: All courses are listed.  The student can select a course and add the course to their schedule [[E2]](#uc6-e2)[[E3]](#uc6-e3).  The student is added to the course's roll [[E5]](#uc6-e5).  If the course is at max enrollment and there's room on the waitlist, the student is added to the end of the waitlist[[E6]](#uc6-e6).
  * <a id="uc6-s3"></a>[S3]: The student selects a course from their schedule and clicks **Remove Course**.  The course is removed from the schedule [[E4]](#uc6-e4)  and the student is removed from the course roll.  If there is a student on the waitlist, the student who joined the waitlist first is removed from the waitlist and is enrolled in the course [[E5]](#uc6-e5)[[E6]](#uc6-e6).  The waitlisted student's schedule is updated with the new course.
  * <a id="uc6-s4"></a>[S4]: The student clicks **Reset Schedule**.  All courses are removed from the schedule.  The student is removed from each of those courses [[S3]](#uc6-s3). The schedule's name is reset.
  * <a id="uc6-s5"></a>[S5]: The student clicks on a course in the catalog list.  The course details are displayed with the course name, section, title, instructor, credit hours, and meeting information.  If the meeting days are "A", the details view shows "Arranged".  Otherwise, the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time.  Only "AM" and "PM" are used.

**Alternative Flows:**

  * <a id="uc6-e1"></a>[E1]: If the title name is invalid, a pop-up message stating "Invalid title." is displayed.  The student clicks OK and is returned to the GUI with no change.
  * <a id="uc6-e2"></a>[E2]: If the student has already added a course with the same name to their schedule (the same section or a different section), a pop-up message stating "Course cannot be added to schedule." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="uc6-e3"></a>[E3]: If the course conflicts with another course (meaning there is an overlap of at least one day and time, even by the same minute) on the student's schedule, a pop-up message stating "Course cannot be added to schedule." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="uc6-e4"></a>[E4]: If no course is selected in the student's schedule, a pop-up message stating "No item selected in the schedule." is displayed.  The student clicks OK and is returned to their schedule with no change.
  * <a id="uc6-e5"></a>[E5]: If the student is already enrolled in the course (i.e., on the course roll), a pop-up message stating "Course cannot be added to schedule." is displayed. The student clicks OK and is returned to their schedule with no change.
  * <a id="uc6-e6"></a>[E6]: If the course is full (meaning the course has reached capacity and the waitlist has no more spots), a pop-up message stating "The course cannot be added" is displayed.  The student clicks OK and is returned to their schedule with no change.


## <a id="uc7"></a>Use Case 7: Display Final Schedule

**Preconditions:** At least one course has been added to the student's schedule [[UC6]](#uc6).

**Main Flow:** The student's schedule is displayed showing the courses in a table listing [[S1]](#uc7-s1).  The schedule can be exported as a comma-separated list of courses [[S2]](#uc7-s2).  The student can revise their schedule [[UC6]](#uc6).

**Sub Flows:**

  * <a id="uc7-s1"></a>[S1]: A text table will list all student courses  with columns for course name, section, title, instructor, credit hours, meeting information.  If the meeting days are "A", the details view shows "Arranged".  Otherwise, and the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time.  Only "AM" and "PM" are used.  
  * <a id="uc7-s2"></a>[S2]: If the export button is pressed, the student is prompted with a file dialog where they can provide a file name for saving the schedule.  The schedule is stored in a text file with a comma-separated list of courses, in sorted order by name and section, with an ordering of information as follows: [[E1]](#uc7-e1).
     * Course: name,section,title,credits,instructor,meetingDays[,startTime,endTime]

**Alternative Flows:**

  * <a id="uc7-e1"></a>[E1]: If the file cannot be saved, a pop-up message stating "The file cannot be saved." is displayed.  The student clicks OK and is returned to the file saving dialog [[S2]](#uc7-s2).
  
  


## <a id="uc8"></a>Use Case 8: Faculty Directory

**Main Flow:** <font color="red">The registrar can create a new, empty, faculty directory </font>[[S1]](#uc8-s1)<font color="red">; load an existing faculty directory from a text file </font>[[S2]](#uc8-s2)<font color="red">; save the current faculty directory to a text file </font>[[S3]](#uc8-s3)<font color="red">; add a faculty to the directory </font>[[S4]](#uc8-s4)<font color="red">; and remove a faculty from the directory </font>[[S5]](#uc8-s5)<font color="red">.  If the user quits the program, any changes to the faculty directory are lost unless the user saves the faculty directory </font>[[S3]](#uc8-s3)<font color="red">. All faculty are stored in the directory in order of insertion.</font>

<!-- ![*Student Directory GUI*](images/StudentDirectoryPanel.PNG) -->

**Sub Flows:**

  * <a id="uc8-s1"></a><font color="red">[S1]: The user clicks **New Faculty Directory**.  Any faculty in the directory are cleared, and a new empty directory is created.  The *Faculty Directory* list is empty.</font>
  * <a id="uc8-s2"></a><font color="red">[S2]: The user clicks **Load Faculty Directory**.  A dialog opens where the user selects a text file containing faculty information </font>[[E1]](#uc8-e1)<font color="red">.  A list of faculty from valid records is created and displayed in the *Faculty Directory* list in order of insertion.  Any invalid records</font> [[UC9, E1]](#uc9-e1)<font color="red"> are ignored. </font>
  * <a id="uc8-s3"></a><font color="red">[S3]: The user clicks **Save Faculty Directory**.  A dialog opens where the user selects the location to save the list of faculty </font>[[E2]](#uc8-e2)<font color="red">.  The list of faculty is saved to a text file with a faculty record on each line.  Each faculty record is a comma separated list of items </font>[[UC9]](#uc9)<font color="red"> and the faculty are saved in order of insertion.</font>
  * <a id="uc8-s4"></a><font color="red">[S4]: The user adds a faculty, with a unique id </font>[[E3]](#uc8-e3)<font color="red">, by entering a first name </font>[[E4]](#uc8-e4)<font color="red">, last name </font>[[E5]](#uc8-e5)<font color="red">, id </font>[[E6]](#uc8-e6)<font color="red">, email </font>[[E7]](#uc8-e7)<font color="red">, password </font>[[E8]](#uc8-e8)<font color="red">, repeated password, and max courses </font>[[E9]](#uc8-e9)[[E10]](#uc8-e10) <font color="red">and clicks **Add Faculty**.  The password and repeated password are hashed using SHA-256 and must match </font>[[E11]](#uc8-e11)<font color="red">.  The faculty is added to the directory in sorted order.</font>
  * <a id="uc8-s5"></a><font color="red">[S5]: The user selects a faculty in the *Faculty Directory* list and clicks **Remove Faculty** </font>[[E12]](#uc8-e12)<font color="red">.  The faculty is removed from the *Faculty Directory* list.</font>
  
**Alternative Flows:**

  * <a id="uc8-e1"></a><font color="red">[E1]: If the file cannot be found on the file system, the error message "Unable to read file <filename>" is displayed.  The user clicks OK and is returned to the faculty directory display.</font>
  * <a id="uc8-e2"></a><font color="red">[E2]: If the file cannot be written to, the error message "Unable to write to file <filename>" is displayed.  The user clicks OK and is returned to the faculty directory display.</font>
  * <a id="uc8-e3"></a><font color="red">[E3]: If the faculty's id is not unique, the error message "Faculty already in system." is displayed.  The user clicks OK and is returned to the faculty directory display.</font>
  * <a id="uc8-e4"></a><font color="red">[E4]: If the faculty's first name is invalid </font>[[UC9, E1]](#uc9-e1)<font color="red">, the error message "Invalid first name" is displayed.  The user clicks OK and is returned to the faculty directory display.</font>
  * <a id="uc8-e5"></a>[<font color="red">E5]: If the faculty's last name is invalid </font>[[UC9, E1]](#uc9-e1)<font color="red">, the error message "Invalid last name" is displayed.  The user clicks OK and is returned to the faculty directory display.</font>
  * <a id="uc8-e6"></a><font color="red">[E6]: If the faculty's id is invalid </font>[[UC9, E1]](#uc9-e1)<font color="red">, the error message "Invalid id" is displayed.  The user clicks OK and is returned to the faculty directory display.</font>
  * <a id="uc8-e7"></a><font color="red">[E7]: If the faculty's email is invalid </font>[[UC9, E1]](#uc9-e1)<font color="red">, the error message "Invalid email" is displayed.  The user clicks OK and is returned to the faculty directory display.</font>
  * <a id="uc8-e8"></a><font color="red">[E8]: If the faculty's password is invalid </font>[[UC9, E1]](#uc9-e1)<font color="red">, the error message "Invalid password" is displayed.  The user clicks OK and is returned to the faculty directory display.</font>
  * <a id="uc8-e9"></a><font color="red">[E9]: If the faculty's max courses value is invalid </font>[[UC9, E1]](#uc9-e1)<font color="red">, the error message "Invalid max courses" is displayed.  The user clicks OK and is returned to the faculty directory display.</font>
  * <a id="uc8-e10"></a><font color="red">[E10]: If the max courses value is not a number, the error message "Max courses must be a positive number between 1 and 3." is displayed.  The user clicks OK and is returned to the faculty directory display.</font>
  * <a id="uc8-e11"></a><font color="red">[E11]: If the faculty's password and repeated passwords do not match, the error message "Passwords do not match" is displayed.  The user clicks OK and is returned to the faculty directory display.</font>
  * <a id="uc8-e12"></a><font color="red">[E12]: If there is no faculty selected, the error message "No faculty selected." is displayed. The user clicks OK and is returned to the faculty directory display.</font>


## <a id="uc9"></a>Use Case 9: Faculty Records

**Main Flow:** <font color="red">Every faculty has a first name, last name, id, email address, password, and max number of courses they can teach in a given semester </font>[[E1]](#uc9-e1)<font color="red">. To protect the faculty's information, the faculty's password should be hashed using SHA-256 when stored.  When stored in a text file, a faculty record is a comma separated list in the following format:</font>

    firstName,lastName,id,email,hashedPassword,maxCourses

**Alternative Flows:**

  * <a id="uc9-e1"></a><font color="red">[E1]: A faculty is invalid if any of the following are true:</font>
     * <font color="red">an item is missing</font>
     * <font color="red">first name is null or an empty string</font>
     * <font color="red">last name is null or an empty string</font>
     * <font color="red">id is null or an empty string</font>
     * <font color="red">email is null or an empty string</font>
     * <font color="red">email doesn't contain an '@' character</font>
     * <font color="red">email doesn't contain a '.' character</font>
     * <font color="red">the index of the last '.' character in the email string is smaller than the index of the first '@' character (e.g., first.last@address would be invalid)</font>
     * <font color="red">the password is null or an empty string</font>
     * <font color="red">max courses is under 1 or above 3</font>
     

