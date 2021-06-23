---
title: CSC 217 Lab 10 - Iterators
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab10]
description: CSC 217 Lab 10 - Requirements
navigation: on
pagegroup: 10-lab
---

# CSC 217 Lab 10 Requirements
{% include iconHeader.html type="requirements" %}
`PackScheduler` is a course registration system for a university, similar to the system in MyPackPortal that you use to register for your classes.  You'll work on implementing a system that provides the functionality for admitted students to register for courses that are taught by faculty.  The courses will have enrollment caps and waitlists.  

<font color="red">For Lab 10, you will add faculty functionality at all layers of the system </font>[[UC0]](#uc0), [[UC18]](#uc18), [[UC19]](#uc19), [[UC20]](#uc20), [[UC21]](#uc21), [[UC22]](#uc22), and in the new [[Faculty Records]](#faculty-records) and [[Invalid Faculty Records]](#invalid-faculty-records) data format.


---

**Users**

  * [Registrar](#registrar)
  * [Student](#student)
  * [Faculty](#faculty)
  
**Requirements**

  * **PackScheduler**
     * [Use Case 0: Start PackScheduler](#uc0)
     * [Use Case 1: Stop PackScheduler](#uc1)
  
  * **Student Directory**
     * [Use Case 2: Create Student Directory](#uc2)
     * [Use Case 3: Load Student Directory](#uc3)
     * [Use Case 4: Save Student Directory](#uc4)
     * [Use Case 5: Add Student to Student Directory](#uc5)
     * [Use Case 6: Remove Student from Student Directory](#uc6)
	 
  * **Course Catalog**
     * [Use Case 7: Create Course Catalog](#uc7)
	 * [Use Case 8: Load Course Catalog](#uc8)
	 * [Use Case 9: Save Course Catalog](#uc9)
	 * [Use Case 10: Add Course to Course Catalog](#uc10)
	 * [Use Case 11: Remove Course from Course Catalog](#uc11)
  
  * **Student Scheduling**
     * [Use Case 12: Rename Schedule](#uc12)
	 * [Use Case 13: View Course Information](#uc13)
	 * [Use Case 14: Add Course to Schedule](#uc14)
	 * [Use Case 15: Remove Course from Schedule](#uc15)
	 * [Use Case 16: Reset Schedule](#uc16)
	 * [Use Case 17: Display Final Schedule](#uc17)
  
  * **Faculty Directory**
     * [Use Case 18: Create Faculty Directory](#uc18)
     * [Use Case 19: Load Faculty Directory](#uc19)
     * [Use Case 20: Save Faculty Directory](#uc20)
     * [Use Case 21: Add Faculty to Faculty Directory](#uc21)
     * [Use Case 22: Remove Faculty from Faculty Directory](#uc22)

**Data Formats**

  * [Student Records](#student-records)
  * [Invalid Student Records](#invalid-student-records)
  * [Course Records](#course-records)
  * [Invalid Course Records](#invalid-course-records)
  * [Faculty Records](#faculty-records)
  * [Invalid Faculty Records](#invalid-faculty-records)

---

## Users
{% include iconHeader.html type="teamTask" %}
There are several types of users for the PackScheduler system.  The users listed here are the people that would interact with the system.  They may or may not correspond to classes in the system.  The user roles are summarized below.

### Registrar
The registrar is a university official that maintains the directory of enrolled students.

### Student
The student is registered in the system by the registrar and can create a schedule of courses from courses listed in the course catalog that do not conflict with each other.

### Faculty
The faculty is registered in the system by the registrar and can see their schedule of courses that they will be teaching in the upcoming semester.

## Requirements

### <a id="uc0"></a>Use Case 0: Start PackScheduler
{% include iconHeader.html type="objective" %}
Starts the PackScheduler application.

#### Main Flow

  1. The user starts the Pack Scheduler application. 
  2. The user enters their id and password in the authentication area and clicks the OK button **[[Hash Password]](#uc0-hashpassword)** **[[Already Logged In]](#uc0-alreadyloggedin)** **[[Invalid Authentication]](#uc0-invalidauthentication)**. 
  3. The user is redirected to the appropriate functionality for the user type of **[[Registrar]](#uc0-registrar)** or **[[Student]](#uc0-student)**.
	 
#### Extensions (Sub-flows)

  * <a id="uc0-hashpassword"></a>**[Hash Password]** The provided password is hashed using the SHA-256 algorithm and is compared with the user's stored password **[[Invalid Authentication]](#uc0-invalidauthentication)**.
  * <a id="uc0-registrar"></a>**[Registrar]** The Registrar can work with the **[[Student Directory]](#uc0-studentdirectory)**, **[[Course Catalog]](#uc0-coursecatalog)**, and the **[[Faculty Directory]](#uc0-facultydirectory)**.
  * <a id="uc0-student"></a>**[Student]** The Student can **[[Modify their Schedule]](#uc0-modifytheirschedule)**.
  * <a id="uc0-studentdirectory"></a>**[Student Directory]** The **registrar** can do one or more of the following tasks related to the Student Directory:
     * [Use Case 2: Create Student Directory](#uc2)
     * [Use Case 3: Load Student Directory](#uc3)
     * [Use Case 4: Save Student Directory](#uc4)
     * [Use Case 5: Add Student to Student Directory](#uc5)
     * [Use Case 6: Remove Student from Student Directory](#uc6)
  * <a id="uc0-coursecatalog"></a>**[Course Catalog]** The **registrar** can do one or more of the following tasks related to the Course Catalog:
     * [Use Case 7: Create Course Catalog](#uc7)
	 * [Use Case 8: Load Course Catalog](#uc8)
	 * [Use Case 9: Save Course Catalog](#uc9)
	 * [Use Case 10: Add Course to Course Catalog](#uc10)
	 * [Use Case 11: Remove Course from Course Catalog](#uc11)
  * <a id="uc0-modifytheirschedule"></a>**[Modify their Schedule]** The **student** can do one or more of the following tasks related to Student Scheduling:
     * [Use Case 12: Rename Schedule](#uc12)
	 * [Use Case 13: View Course Information](#uc13)
	 * [Use Case 14: Add Course to Schedule](#uc14)
	 * [Use Case 15: Remove Course from Schedule](#uc15)
	 * [Use Case 16: Reset Schedule](#uc16)
	 * [Use Case 17: Display Final Schedule](#uc17)
  * <a id="uc0-facultydirectory"></a>**[Faculty Directory]** <font color="red">The **registrar** can do one or more of the following tasks related to the Faculty Directory:</font>
     * [Use Case 18: Create Faculty Directory](#uc18)
     * [Use Case 19: Load Faculty Directory](#uc19)
     * [Use Case 20: Save Faculty Directory](#uc20)
     * [Use Case 21: Add Faculty to Faculty Directory](#uc21)
     * [Use Case 22: Remove Faculty from Faculty Directory](#uc22)
  
#### Alternative Flows

  * <a id="uc0-alreadyloggedin"></a>[Already Logged In] If a user is already logged into the system, a new user may not log in.
  * <a id="uc0-invalidauthentication"></a>[Invalid Authentication] If the user doesn't exist in the system or the user's hashed password doesn't match the stored hashed password, a pop-up message stating "Invalid id or password" is displayed.  The user clicks OK and is returned to the authentication window.


### <a id="uc1"></a>Use Case 1: Stop PackScheduler
{% include iconHeader.html type="objective" %}
Stops the PackScheduler application.

#### Preconditions
The user is in the main window of the PackScheduler application.

#### Main Flow

  1. The user clicks the close window button.
  2. The application closes without any errors.


### <a id="uc2"></a>Use Case 2: Create Student Directory
{% include iconHeader.html type="objective" %}
The registrar can create a new, empty, student directory.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Student Directories.

#### Main Flow

  1. The registrar clicks the **New Student Directory** button.
  2. A new empty Student Directory is created.
  3. The display is updated so that the *Student Directory* list is empty.


### <a id="uc3"></a>Use Case 3: Load Student Directory
{% include iconHeader.html type="objective" %}
The registrar can load a student directory from a file.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Student Directories.

#### Main Flow

  1. The registrar clicks the **Load Student Directory** button. 
  2. A dialog appears and the user can browse the file system for the text file containing student information **[[Student Records Data Format]](#student-records)** **[[Invalid File]](#uc3-invalid-file)**.
  3. A list of students is created from valid records. Invalid records are ignored **[[Invalid Student Records]](#invalid-student-records)**.
  4. All students are stored in the directory in alphabetical order by last name and then by first name.  If there are two students with the same name, then the id is considered in the sort.

#### Alternative Flows

  * <a id="uc3-invalid-file"></a>**[Invalid File]** If the file cannot be found on the file system, the error message "Unable to read file X" is displayed, where 'X' is the filename.  The user clicks OK and is returned to the student directory display.


### <a id="uc4"></a>Use Case 4: Save Student Directory
{% include iconHeader.html type="objective" %}
The registrar can save the current list of students in a student directory to a file.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Student Directories.

#### Main Flow

  1. The registrar clicks the **Save Student Directory** button.
  2. A dialog appears and the user selects the location to save the list of students and provides a name for the file **[[Error Saving]](#uc4-error-saving)**.
  3. The list of students is saved to a text file with a student record on each line **[[Student Records Data Format]](#student-records)**.  The students are saved in sorted order by last name, first name, and id.

#### Alternative Flows

  * <a id="uc4-error-saving"></a>**[Error Saving]** If the file cannot be saved, the error message "Unable to write to file X" is displayed, where 'X' is the filename.  The user clicks OK and is returned to the student directory display.


### <a id="uc5"></a>Use Case 5: Add Student to Student Directory
{% include iconHeader.html type="objective" %}
The registrar can add a student to the student directory.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Student Directories.

#### Main Flow

  1. The registrar enters information about a new student in the *Student Information* portion of the user interface **[[Student Records Data Format]](#student-records)** and clicks **Add Student** button.
     * first name **[[Invalid First Name]](#uc5-invalid-first-name)**
	 * last name **[[Invalid Last Name]](#uc5-invalid-last-name)**
	 * id **[[Invalid ID]](#uc5-invalid-id)**
	 * email **[[Invalid Email]](#uc5-invalid-email)**
	 * password **[[Invalid Password]](#uc5-invalid-password)**
	 * repeat password **[[Invalid Password]](#uc5-invalid-password)**
	 * max credits 
  2. The password and repeated password are hashed using SHA-256 and must match **[[Non-matching Passwords]](#uc5-non-matching-passwords)**.
  3. The student is added to the *Student Directory* in sorted order by last name, first name, and id **[[Non-unique ID]](#uc5-non-unique-id)**. 

#### Alternative Flows

  * <a id="uc5-invalid-first-name"></a>**[Invalid First Name]** If the student's first name is invalid [[Invalid Student Records]](#invalid-student-records), the error message "Invalid first name" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc5-invalid-last-name"></a>**[Invalid Last Name]**  If the student's last name is invalid [[Invalid Student Records]](#invalid-student-records), the error message "Invalid last name" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc5-invalid-id"></a>**[Invalid ID]** If the student's id is invalid [[Invalid Student Records]](#invalid-student-records), the error message "Invalid id" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc5-invalid-email"></a>**[Invalid Email]** If the student's email is invalid [[Invalid Student Records]](#invalid-student-records), the error message "Invalid email" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc5-invalid-password"></a>**[Invalid Password]** If the student's password or repeated password is invalid [[Invalid Student Records]](#invalid-student-records), the error message "Invalid password" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc5-non-matching-passwords"></a>**[Non-matching Passwords]** If the student's password and repeated passwords do not match, the error message "Passwords do not match" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc5-non-unique-id"></a>**[Non-unique ID]** If the student's id is not unique, the error message "Student already in system." is displayed.  The user clicks OK and is returned to the student directory display.


### <a id="uc6"></a>Use Case 6: Remove Student from Student Directory
{% include iconHeader.html type="objective" %}
The registrar can remove a student from the student directory.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Student Directories.

#### Main Flow

  1. The registrar selects a student in the *Student Directory* list and clicks the **Remove Student** button **[[No Student Selected]](#uc6-no-student-selected)**.
  2. The student is removed from the *Student Directory* list.


#### Alternative Flows

  * <a id="uc6-no-student-selected"></a>**[No Student Selected]** If there is no student selected, the error message “No student selected.” is displayed. The user clicks OK and is returned to the student directory display.
  
### <a id="uc7"></a>Use Case 7: Create Course Catalog
{% include iconHeader.html type="objective" %}
The registrar can create a new, empty, course catalog.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with the Course Catalog.

#### Main Flow

  1. The registrar clicks the **New Course Catalog** button.
  2. Any courses in the catalog are cleared.
  2. A new empty Course Catalog is created.
  3. The display is updated so that the *Course Catalog* list is empty.


### <a id="uc8"></a>Use Case 8: Load Course Catalog
{% include iconHeader.html type="objective" %}
The registrar can load a course catalog from a file.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with the Course Catalog.

#### Main Flow

  1. The registrar clicks the **Load Course Catalog** button. 
  2. A dialog appears and the user can browse the file system for the text file containing course information **[[Course Records Data Format]](#course-records)** **[[Invalid File]](#uc8-invalid-file)**.
  3. A list of courses is created from valid records. Invalid records are ignored **[[Invalid Course Records]](#invalid-course-records)**.
  4. All courses are stored in the catalog in alphabetical order by course name and section.
  5. All courses have a waitlist of size 10. 

#### Alternative Flows

  * <a id="uc8-invalid-file"></a>**[Invalid File]** If the file cannot be found on the file system, the error message "Unable to read file X" is displayed, where 'X' is the filename.  The user clicks OK and is returned to the course catalog display.


### <a id="uc9"></a>Use Case 9: Save Course Catalog
{% include iconHeader.html type="objective" %}
The registrar can save the current list of courses in the course catalog to a file.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with the Course Catalog.

#### Main Flow

  1. The registrar clicks the **Save Course Catalog** button.
  2. A dialog appears and the user selects the location to save the list of courses and provides a name for the file **[[Error Saving]](#uc9-error-saving)**.
  3. The list of courses is saved to a text file with a course record on each line **[[Course Records Data Format]](#course-records)**.  The courses are saved in sorted order by course name and section.

#### Alternative Flows

  * <a id="uc9-error-saving"></a>**[Error Saving]** If the file cannot be saved, the error message "Unable to write to file X" is displayed, where 'X' is the filename.  The user clicks OK and is returned to the course catalog display.


### <a id="uc10"></a>Use Case 10: Add Course to Course Catalog
{% include iconHeader.html type="objective" %}
The registrar can add a course to the course catalog.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with the Course Catalog.

#### Main Flow

  1. The registrar enters information about a new course in the *Course Information* portion of the user interface **[[Course Records Data Format]](#course-records)** and clicks **Add Course** button.
     * course name **[[Invalid Name]](#uc10-invalidname)**
	 * course title **[[Invalid Title]](#uc10-invalidtitle)**
	 * section number **[[Invalid Section]](#uc10-invalidsection)**
	 * credit hours **[[Invalid Credit Hours]](#uc10-invalidcredithours)**
	 * instructor unity id **[[Invalid Instructor ID]](#uc10-invalidinstructorid)**
	 * enrollment capacity **[[Invalid Enrollment Capacity]](#uc10-invalidenrollmentcap)**
	 * meeting days **[[Invalid Meeting Days]](#uc10-invalidmeetingdays)**
	 * start time **[[Invalid Time]](#uc10-invalidtime)**
	 * end time **[[Invalid Time]](#uc10-invalidtime)**
  2. The course is added to the *Course Catalog* in sorted order by course name and section **[[Duplicate Course]](#uc10-duplicatecourse)**. 
  3. All courses have a waitlist of size 10.

#### Alternative Flows

  * <a id="uc10-invalidname"></a>**[Invalid Name]** If the course's name is invalid **[[Invalid Course Records]](#invalid-course-records)**, the error message "Invalid course name" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc10-invalidtitle"></a>**[Invalid Title]**: If the course's title is invalid **[[Invalid Course Records]](#invalid-course-records)**, the error message "Invalid course title" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="ucs10-invalidsection"></a>**[Invalid Section]**: If the course's section number is invalid **[[Invalid Course Records]](#invalid-course-records)**, the error message "Invalid section number" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc10-invalidcredithours"></a>**[Invalid Credit Hours]**: If the course's credit hours is invalid **[[Invalid Course Records]](#invalid-course-records)**, the error message "Invalid credit hours" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc10-invalidinstructorid"></a>**[Invalid Instructor ID]**: If the course's instructor unity id is invalid **[[Invalid Course Records]](#invalid-course-records)**, the error message "Invalid instructor unity id" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc10-invalidenrollmentcap"></a>**[Invalid Instructor ID]**: If the course's enrollment capacity is invalid **[[Invalid Course Records]](#invalid-course-records)**, the error message "Invalid instructor unity id" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc10-invalidmeetingdays"></a>**[Invalid Meeting Days]**: If the course's meeting days are invalid **[[Invalid Course Records]](#invalid-course-records)**, the error message "Invalid meeting days" is displayed.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc10-invalidtime"></a>**[Invalid Time]**: If the course's start time is invalid, end time is invalid **[[Invalid Course Records]](#invalid-course-records)**, or the start time and end time together are invalid, the error message "Invalid X" is displayed, where X is start time, end time, or course times.  The user clicks OK and is returned to the course catalog display.
  * <a id="uc10-duplicatecourse"></a>**[Duplicate Course]** If the course's name and section already exist in the catalog, the error message "Course already in system." is displayed.  The user clicks OK and is returned to the course catalog display.
  


### <a id="uc11"></a>Use Case 11: Remove Course from Course Catalog
{% include iconHeader.html type="objective" %}
The registrar can remove a course from the course catalog.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with the Course Catalog.

#### Main Flow

  1. The registrar selects a course in the *Course Catalog* list and clicks the **Remove Course** button **[[No Course Selected]](#uc11-no-course-selected)**.
  2. The course is removed from the *Course Catalog* list.


#### Alternative Flows

  * <a id="uc11-no-course-selected"></a>**[No Course Selected]** If there is no course selected, the error message “No course selected.” is displayed. The user clicks OK and is returned to the course catalog display.
  
### <a id="uc12"></a>Use Case 12: Rename Schedule
{% include iconHeader.html type="objective" %}
The student changes the schedule's title from the default name of "My Schedule".  The student can provide a new title for their schedule or leave the title empty.

#### Preconditions 
The PackScheduler application has started, at least one course has been loaded into the course catalog, and the currently logged in user is a Student.

#### Main Flow

  1. The student replaces the current schedule title with a new name
  2. The student saves the new schedule title
  3. The system sets the title of the schedule to the submitted text **[[Invalid Title]](#uc12-a1)**
  
#### Alternative Flows

  * <a id="uc12-a1"></a>**[Invalid Title]**: The system displays a message stating "Invalid title.".  The student clicks OK and is returned to the main user interface with no change.

### <a id="uc13"></a>Use Case 13: View Course Information
{% include iconHeader.html type="objective" %}
The student selects a course from the catalog to see all the information about the course.

#### Preconditions 
The PackScheduler application has started, at least one course has been loaded into the course catalog, and the currently logged in user is a Student.

#### Main Flow

  1. The student selects a course in the catalog.
  2. The course details are displayed with the course name, section, title, instructor, credit hours, and meeting information. If the meeting days are “A”, the details view shows “Arranged”. Otherwise, the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time. Only “AM” and “PM” are used.
  

### <a id="uc14"></a>Use Case 14: Add Course to Schedule
{% include iconHeader.html type="objective" %}
The student adds a course from the course catalog into their schedule.

#### Preconditions 
The PackScheduler application has started, at least one course has been loaded into the course catalog, and the currently logged in user is a Student.

#### Main Flow

  1. The student selects the desired course to add from the course catalog.
  2. The student clicks the add course button.
  3. The system updates the schedule to include the selected course **[[Already Added]](#uc14-a1)** **[[Schedule Conflict]](#uc14-a2)** 
  4. The student is added to the course's roll. [[Already Enrolled]](#uc14-a3)
  5. If the course is at max enrollment and there's room on the waitlist, the student is added to the end of the waitlist **[[Course Full]](#uc14-a4)**

  
#### Alternative Flows

  * <a id="uc14-a1"></a> **[Already Added]**: If the student has already added a course with the same name to their schedule (the same section or a different section), a pop-up message stating “You are already enrolled in ." is displayed, where is replaced with the name of the course. The student clicks OK and is returned to their schedule with no change.
  * <a id="uc14-a2"></a> **[Schedule Conflict]**: If the course conflicts with another course or event (meaning there is an overlap of at least one day and time, even by the same minute) on the student’s schedule, a pop-up message stating “The course cannot be added due to a conflict.” is displayed. The student clicks OK and is returned to their schedule with no change.
  * <a id="uc14-a3"></a> **[Already Enrolled]**: If the student is already enrolled in the course (i.e., on the course roll), a pop-up message stating "Course cannot be added to schedule." is displayed. The student clicks OK and is returned to their schedule with no change.
  * <a id="uc14-a4"></a> **[Course Full]**: If the course is full (meaning the course has reached capacity and the waitlist has no more spots), a pop-up message stating "The course cannot be added" is displayed. The student clicks OK and is returned to their schedule with no change.



### <a id="uc15"></a>Use Case 15: Remove Course from Schedule
{% include iconHeader.html type="objective" %}
The student removes a course from their current schedule.

#### Preconditions 
The PackScheduler application has started, at least one course has been loaded into the course catalog, and the currently logged in user is a Student.

#### Main Flow

  1. The student selects the desired course to remove from their schedule.
  2. The student clicks the remove course button.
  3. The system updates the schedule to remove the selected course **[[No Selected Course]](#uc15-a1)**
  4. The student is removed from the course's roll.
  5. If there is a student on the waitlist, the student who joined the waitlist first is removed from the waitlist and is enrolled in the course [[UC14]](#uc14).

  
#### Alternative Flows

  * <a id="uc15-a1"></a> **[No Selected Course]**: If no course is selected in the student’s schedule, a pop-up message stating “No item selected in the schedule.” is displayed. The student clicks OK and is returned to their schedule with no change.


### <a id="uc16"></a>Use Case 16: Reset Schedule
{% include iconHeader.html type="objective" %}
The student clears their schedule and resets it to its defaults.

#### Preconditions 
The PackScheduler application has started, at least one course has been loaded into the course catalog, and the currently logged in user is a Student.

#### Main Flow

  1. The student clicks the reset schedule button.
  2. The system removes all events and courses from the schedule and changes the title of the schedule to the default “My Schedule”



### <a id="uc17"></a>Use Case 17: Display Final Schedule
{% include iconHeader.html type="objective" %}
The student displays their final schedule with all information about the scheduled activities.

#### Preconditions 
The PackScheduler application has started, at least one course has been loaded into the course catalog, and the currently logged in user is a Student.

#### Main Flow

  1. The student clicks the display schedule button.
  2. The student sees the list of scheduled courses and events with columns for name, section, title, instructor, credit hours, meeting information, weekly repeat, and description. If the meeting days are "A", the details view shows "Arranged".  Otherwise, the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time.  Only "AM" and "PM" are used.  If the row is an event, then the name, section, instructor, and credit hours are left blank.  
  3. The student clicks the revise schedule button to return to the schedule editing functionality.  
  
### <a id="uc18"></a>Use Case 18: Create Faculty Directory
{% include iconHeader.html type="objective" %}
The registrar can create a new, empty, faculty directory.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Faculty Directories.

#### Main Flow

  1. The registrar clicks the **New Faculty Directory** button.
  2. A new empty Faculty Directory is created. Any exiting faculty in the directory are cleared.
  3. The display is updated so that the *Faculty Directory* list is empty.


### <a id="uc19"></a>Use Case 19: Load Faculty Directory
{% include iconHeader.html type="objective" %}
The registrar can load a faculty directory from a file.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Faculty Directories.

#### Main Flow

  1. The registrar clicks the **Load Faculty Directory** button. 
  2. A dialog appears and the user can browse the file system for the text file containing faculty information **[[Faculty Records Data Format]](#faculty-records)** **[[Invalid File]](#uc19-invalid-file)**.
  3. A list of faculty is created from valid records. Invalid records are ignored **[[Invalid Faculty Records]](#invalid-faculty-records)**.
  4. Faculty are added to the faculty directory at the end of the list.

#### Alternative Flows

  * <a id="uc19-invalid-file"></a>**[Invalid File]** If the file cannot be found on the file system, the error message "Unable to read file X" is displayed, where 'X' is the filename.  The user clicks OK and is returned to the faculty directory display.


### <a id="uc20"></a>Use Case 20: Save Faculty Directory
{% include iconHeader.html type="objective" %}
The registrar can save the current list of faculty in a faculty directory to a file.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Faculty Directories.

#### Main Flow

  1. The registrar clicks the **Save Faculty Directory** button.
  2. A dialog appears and the user selects the location to save the list of faculty and provides a name for the file **[[Error Saving]](#uc20-error-saving)**.
  3. The list of faculty is saved to a text file with a faculty record on each line **[[Faculty Records Data Format]](#faculty-records)**.  The faculty are saved in order of insertion, where each new faculty is added to the end of the list.

#### Alternative Flows

  * <a id="uc20-error-saving"></a>**[Error Saving]** If the file cannot be saved, the error message "Unable to write to file X" is displayed, where 'X' is the filename.  The user clicks OK and is returned to the faculty directory display.


### <a id="uc21"></a>Use Case 21: Add Faculty to Faculty Directory
{% include iconHeader.html type="objective" %}
The registrar can add a faculty to the faculty directory.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Faculty Directories.

#### Main Flow

  1. The registrar enters information about a new faculty in the *Faculty Information* portion of the user interface **[[Faculty Records Data Format]](#faculty-records)** and clicks **Add Faculty** button.  The faculty id must be unique.
     * first name **[[Invalid First Name]](#uc21-invalid-first-name)**
	 * last name **[[Invalid Last Name]](#uc21-invalid-last-name)**
	 * id **[[Invalid ID]](#uc21-invalid-id)**
	 * email **[[Invalid Email]](#uc21-invalid-email)**
	 * password **[[Invalid Password]](#uc21-invalid-password)**
	 * repeat password **[[Invalid Password]](#uc21-invalid-password)**
	 * max courses **[[Invalid Max Courses]](#uc21-invalid-max-courses)** 
  2. The password and repeated password are hashed using SHA-256 and must match **[[Non-matching Passwords]](#uc21-non-matching-passwords)**.
  3. The faculty is added to the end of the *Faculty Directory* **[[Non-unique ID]](#uc21-non-unique-id)**. 

#### Alternative Flows

  * <a id="uc21-invalid-first-name"></a>**[Invalid First Name]** If the faculty's first name is invalid [[Invalid Faculty Records]](#invalid-faculty-records), the error message "Invalid first name" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc21-invalid-last-name"></a>**[Invalid Last Name]**  If the faculty's last name is invalid [[Invalid Faculty Records]](#invalid-faculty-records), the error message "Invalid last name" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc21-invalid-id"></a>**[Invalid ID]** If the faculty's id is invalid [[Invalid Faculty Records]](#invalid-faculty-records), the error message "Invalid id" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc21-invalid-email"></a>**[Invalid Email]** If the faculty's email is invalid [[Invalid Faculty Records]](#invalid-faculty-records), the error message "Invalid email" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc21-invalid-password"></a>**[Invalid Password]** If the faculty's password or repeated password is invalid [[Invalid Faculty Records]](#invalid-faculty-records), the error message "Invalid password" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc21-max-courses"></a>**[Invalid Max Courses]** If the max courses is invalid [[Invalid Faculty Records]](#invalid-faculty-records), the error message "Invalid max courses" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc21-non-matching-passwords"></a>**[Non-matching Passwords]** If the faculty's password and repeated passwords do not match, the error message "Passwords do not match" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc21-non-unique-id"></a>**[Non-unique ID]** If the faculty's id is not unique, the error message "Faculty already in system." is displayed.  The user clicks OK and is returned to the faculty directory display.
  


### <a id="uc22"></a>Use Case 22: Remove Faculty from Faculty Directory
{% include iconHeader.html type="objective" %}
The registrar can remove a faculty from the faculty directory.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Faculty Directories.

#### Main Flow

  1. The registrar selects a faculty in the *Faculty Directory* list and clicks the **Remove Faculty** button **[[No Faculty Selected]](#uc22-no-faculty-selected)**.
  2. The faculty is removed from the *Faculty Directory* list.


#### Alternative Flows

  * <a id="uc22-no-faculty-selected"></a>**[No Faculty Selected]** If there is no faculty selected, the error message “No faculty selected.” is displayed. The user clicks OK and is returned to the faculty directory display.



## Data Format
{% include iconHeader.html type="task" %}

### Student Records

Student records can be saved and loaded from a file in the correct format.  An example of a valid file would be:

```
Zahir,King,zking,orci.Donec@ametmassaQuisque.com,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,15
Cassandra,Schwartz,cschwartz,semper@imperdietornare.co.uk,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,4
Shannon,Hansen,shansen,convallis.est.vitae@arcu.ca,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,14
Demetrius,Austin,daustin,Curabitur.egestas.nunc@placeratorcilacus.co.uk,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,18
Raymond,Brennan,rbrennan,litora.torquent@pellentesquemassalobortis.ca,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,12
Emerald,Frost,efrost,adipiscing@acipsumPhasellus.edu,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,3
Lane,Berg,lberg,sociis@non.org,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,14
Griffith,Stone,gstone,porta@magnamalesuadavel.net,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,17
Althea,Hicks,ahicks,Phasellus.dapibus@luctusfelis.com,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,11
Dylan,Nolan,dnolan,placerat.Cras.dictum@dictum.net,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,5
```

A student has a first name, last name, id, email address, password, and max number of credits they can take in a given semester. To protect the student's information, the student's password should be hashed using SHA-256 when stored.  Note that the hashed values may look different depending on what application you are using to view the input file. 

When stored in a text file, a student record is a comma separated list in the following format:

    firstName,lastName,id,email,hashedPassword,maxCredits
	
### Invalid Student Records

A student record is invalid in at least the following situations:

  * an item is missing
  * first name is null or an empty string
  * last name is null or an empty string
  * id is null or an empty string
  * email is null or an empty string
  * email doesn't contain an '@' character
  * email doesn't contain a '.' character
  * the index of the last '.' character in the email string is earlier than the index of the first '@' character (e.g., first.last@address would be invalid)
  * the password is null or an empty string
  * max credits is below 3 or above 18
  
  
### Course Records

Course records can be saved and loaded from a file in the correct format.  An example of a valid file would be:

```
CSC116,Intro to Programming - Java,001,3,jdyoung2,10,MW,0910,1100
CSC116,Intro to Programming - Java,002,3,spbalik,10,MW,1120,1310
CSC116,Intro to Programming - Java,003,3,tbdimitr,10,TH,1120,1310
CSC116,Intro to Programming - Java,002,3,jtking,10,TH,0910,1100
CSC216,Software Development Fundamentals,001,3,sesmith5,10,TH,1330,1445
CSC216,Software Development Fundamentals,002,3,ixdoming,10,MW,1330,1445
CSC216,Software Development Fundamentals,601,3,jctetter,10,A
CSC217,Software Development Fundamentals Lab,202,1,sesmith5,10,M,1040,1230
CSC217,Software Development Fundamentals Lab,211,1,sesmith5,10,T,830,1020
CSC217,Software Development Fundamentals Lab,223,1,sesmith5,10,W,1500,1650
CSC217,Software Development Fundamentals Lab,601,1,sesmith5,10,A
CSC226,Discrete Mathematics for Computer Scientists,001,3,tmbarnes,10,MWF,935,1025
CSC230,C and Software Tools,001,3,dbsturgi,10,MW,1145,1300
CSC316,Data Structures and Algorithms,001,3,jtking,10,MW,830,945
```

A course has a course name, course title, section number, number of credit hours, instructor's unity id, enrollment capacity, meeting days, start time, and end time. When stored in a text file, a course record is a comma separated list in the following format:

    courseName,courseTitle,sectionNumber,creditHours,instructorUnityID,enrollmentCap,meetingDays,startTime,endTime
	// Note that enrollmentCap is a NEW item in the list
	
### Invalid Course Records

A course record is invalid in at least the following situations:

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
  * meeting days have a duplicate character
  * if 'A' is in the meeting days list, it must be the only character
  * the start time is not between 0000 and 2359 an invalid military time
  * the end time is not between 0000 and 2359 or an invalid military time
  * the end time is less than the start time (i.e., no overnight classes)
  * a start time and/or end time is listed when meeting days is 'A'
  * a course with the same name and section


### Faculty Records

Faculty records can be saved and loaded from a file in the correct format.  An example of a valid file would be:

```
Ashely,Witt,awitt,mollis@Fuscealiquetmagna.net,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,2
Fiona,Meadows,fmeadow,pharetra.sed@et.org,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,3
Brent,Brewer,bbrewer,sem.semper@orcisem.co.uk,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,1
Halla,Aguirre,haguirr,Fusce.dolor.quam@amalesuadaid.net,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,3
Kevyn,Patel,kpatel,risus@pellentesque.ca,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,1
Elton,Briggs,ebriggs,arcu.ac@ipsumsodalespurus.edu,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,3
Norman,Brady,nbrady,pede.nonummy@elitfermentum.co.uk,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,1
Lacey,Walls,lwalls,nascetur.ridiculus.mus@fermentum.net,0ÉRú±"ÃùuŸ¦Ù\7X²F´þâ9•{-OîFâapÄ,2
```

A faculty has a first name, last name, id, email address, password, and max number of courses they teach in a given semester (i.e., their course load). To protect the faculty's information, the faculty's password should be hashed using SHA-256 when stored.  Note that the hashed values may look different depending on what application you are using to view the input file. 

When stored in a text file, a facutly record is a comma separated list in the following format:

    firstName,lastName,id,email,hashedPassword,maxCourses
	
### Invalid Faculty Records

A faculty record is invalid in at least the following situations:

  * an item is missing
  * first name is null or an empty string
  * last name is null or an empty string
  * id is null or an empty string
  * email is null or an empty string
  * email doesn't contain an '@' character
  * email doesn't contain a '.' character
  * the index of the last '.' character in the email string is smaller than the index of the first '@' character (e.g., first.last@address would be invalid)
  * the password is null or an empty string
  * max courses is under 1 or above 3