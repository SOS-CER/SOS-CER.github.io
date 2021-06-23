---
title: CSC 217 Lab 04 - Design
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab04]
description: CSC 217 Lab 04 - Designing `PackScheduler` Faculty Functionality
navigation: on
pagegroup: 04-lab
---
# CSC 217 Lab 04: Designing `PackScheduler` Faculty Functionality
{% include iconHeader.html type="design" %}
Now that you have compared two designs and integrated two systems to meet a provided design, you should propose your own design for the faculty functionality.


## Creating your Design
Using the [extended requirements below](#faculty-requirements), current requirements(04-lab-requirements), and the candidate designs from Part 1, you will extend the one of the designs to include the faculty functionality discussed below.

**Updated or New Requirements**

  * **PackScheduler**
     * [Use Case 0: Start PackScheduler](#uc0)
	 
  * **Faculty Directory**
     * [Use Case 18: Create Faculty Directory](#uc18)
     * [Use Case 19: Load Faculty Directory](#uc19)
     * [Use Case 20: Save Faculty Directory](#uc20)
     * [Use Case 21: Add Faculty to Faculty Directory](#uc21)
     * [Use Case 22: Remove Faculty from Faculty Directory](#uc22)
	 
  * **Faculty Scheduling**
     * [Use Case 23: View Faculty Schedule](#uc23)


We have provided an UXF class diagram file that can be used by the [web application UMLetino](http://www.umlet.com/umletino/umletino.html). Select **File Import** and select an UXF file.

  * [Candidate Design A](images/DesignA.uxf)
  * [Candidate Design B](images/DesignB.uxf)
  
Another diagramming tool option is [PlantUML](http://plantuml.com/)
  
## Submitting your Design
For Dia, export the finished design as a *.png file by selecting **File > Export**.  Under **Export Options** select **PNG (anti-aliased)(*.png)**.

For UMLetino, select the **File Export** option, right click on XML AND image export.  Export both.

Save your class diagram files to the `project_docs/` folder in your `PackScheduler` project.


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  
  
Make sure that your design is submitted for grading!


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-staging)
  * [Committing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-commit)
  * [Pushing Files](https://pages.github.ncsu.edu/engr-csc-software-development/practices-tools/git/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}


## Faculty Requirements
Below are the requirements for faculty in the `PackScheduler` system.  


### <a id="uc0"></a>Use Case 0: Start PackScheduler
{% include iconHeader.html type="objective" %}
Starts the PackScheduler application.

#### Main Flow

  1. The user starts the Pack Scheduler application. 
  2. The user enters their id and password in the authentication area and clicks the OK button **[[Hash Password]](#uc0-hashpassword)** **[[Already Logged In]](#uc0-alreadyloggedin)** **[[Invalid Authentication]](#uc0-invalidauthentication)**. 
  3. The user is redirected to the appropriate functionality for the user type of **[[Registrar]](#uc0-registrar)**, **[[Student]](#uc0-student)**, or **[[Faculty]](#uc0-faculty)**.
	 
#### Extensions (Sub-flows)

  * <a id="uc0-hashpassword"></a>**[Hash Password]** The provided password is hashed using the SHA-256 algorithm and is compared with the user's stored password **[[Invalid Authentication]](#uc0-invalidauthentication)**.
  * <a id="uc0-registrar"></a>**[Registrar]** The Registrar can work with the **[[Student Directory]](#uc0-studentdirectory)**, **[[Course Catalog]](#uc0-coursecatalog)**, and the **[[Faculty Directory]](#uc0-facultydirectory)**.
  * <a id="uc0-student"></a>**[Student]** The Student can **[[Modify their Schedule]](#uc0-modifytheirschedule)**.
  * <a id="uc0-faculty"></a>**[Faculty]** The Faculty member can **[[View their Schedule]](#uc0-viewschedule)**.
  * <a id="uc0-studentdirectory"></a>**[Student Directory]** The **registrar** can do one or more of the following tasks related to the Student Directory:
     * [Use Case 2: Create Student Directory](04-lab-requirements#uc2)
     * [Use Case 3: Load Student Directory](04-lab-requirements#uc3)
     * [Use Case 4: Save Student Directory](04-lab-requirements#uc4)
     * [Use Case 5: Add Student to Student Directory](04-lab-requirements#uc5)
     * [Use Case 6: Remove Student from Student Directory](04-lab-requirements#uc6)
  * <a id="uc0-coursecatalog"></a>**[Course Catalog]** The **registrar** can do one or more of the following tasks related to the Course Catalog:
     * [Use Case 7: Create Course Catalog](04-lab-requirements#uc7)
	 * [Use Case 8: Load Course Catalog](04-lab-requirements#uc8)
	 * [Use Case 9: Save Course Catalog](04-lab-requirements#uc9)
	 * [Use Case 10: Add Course to Course Catalog](04-lab-requirements#uc10)
	 * [Use Case 11: Remove Course from Course Catalog](04-lab-requirements#uc11)
  * <a id="uc0-modifytheirschedule"></a>**[Modify their Schedule]** The **student** can do one or more of the following tasks realated to Student Scheduling:
     * [Use Case 12: Rename Schedule](04-lab-requirements#uc12)
	 * [Use Case 13: View Course Information](04-lab-requirements#uc13)
	 * [Use Case 14: Add Course to Schedule](04-lab-requirements#uc14)
	 * [Use Case 15: Remove Course from Schedule](04-lab-requirements#uc15)
	 * [Use Case 16: Reset Schedule](04-lab-requirements#uc16)
	 * [Use Case 17: Display Final Schedule](#uc17)
  * <a id="uc0-facultydirectory"></a>**[Faculty Directory]**  The **registrar** can do one or more of the following tasks realted to the Faculty Directory:
     * [Use Case 18: Create Faculty Directory](#uc18)
     * [Use Case 19: Load Faculty Directory](#uc19)
     * [Use Case 20: Save Faculty Directory](#uc20)
     * [Use Case 21: Add Faculty to Faculty Directory](#uc21)
     * [Use Case 22: Remove Faculty from Faculty Directory](#uc22)
  * <a id="uc0-viewschedule"></a>**[View Schedule]** The **faculty** can do the following:
     * [Use Case 23: View Faculty Schedule](#uc23)
  
#### Alternative Flows

  * <a id="uc0-alreadyloggedin"></a>[Already Logged In] If a user is already logged into the system, a new user may not log in.
  * <a id="uc0-invalidauthentication"></a>[Invalid Authentication] If the user doesn't exist in the system or the user's hashed password doesn't match the stored hashed password, a pop-up message stating "Invalid id or password" is displayed.  The user clicks OK and is returned to the authentication window.

  
### <a id="uc18"></a>Use Case 18: Create Faculty Directory
{% include iconHeader.html type="objective" %}
The registrar can create a new, empty, faculty directory.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Faculty Directories.

#### Main Flow

  1. The registrar clicks the **New Faculty Directory** button.
  2. A new empty Faculty Directory is created.
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
  4. All faculty are stored in the directory in alphabetical order by last name and then by first name.  If there are two faculty with the same name, then the id is considered in the sort.

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
  3. The list of faculty is saved to a text file with a faculty record on each line **[[Faculty Records Data Format]](#faculty-records)**.  The faculty are saved in sorted order by last name, first name, and id.

#### Alternative Flows

  * <a id="uc20-error-saving"></a>**[Error Saving]** If the file cannot be saved, the error message "Unable to write to file X" is displayed, where 'X' is the filename.  The user clicks OK and is returned to the faculty directory display.


### <a id="uc21"></a>Use Case 21: Add Faculty to Faculty Directory
{% include iconHeader.html type="objective" %}
The registrar can add a faculty to the faculty directory.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Faculty

#### Main Flow

  1. The registrar enters information about a new faculty member in the *Faculty Information* portion of the user interface **[[Faculty Records Data Format]](#faculty-records)** and clicks **Add Faculty** button.
     * first name **[[Invalid First Name]](#uc21-invalid-first-name)**
	 * last name **[[Invalid Last Name]](#uc21-invalid-last-name)**
	 * id **[[Invalid ID]](#uc21-invalid-id)**
	 * email **[[Invalid Email]](#uc21-invalid-email)**
	 * password **[[Invalid Password]](#uc21-invalid-password)**
	 * repeat password **[[Invalid Password]](#uc21-invalid-password)**
	 * max courses **[[Invalid Max Courses]](#uc21-invalid-max-courses)** 
  2. The password and repeated password are hashed using SHA-256 and must match **[[Non-matching Passwords]](#uc21-non-matching-passwords)**.
  3. The faculty is added to the *Faculty Directory* in sorted order by last name, first name, and id **[[Non-unique ID]](#uc21-non-unique-id)**. 

#### Alternative Flows

  * <a id="uc21-invalid-first-name"></a>**[Invalid First Name]** If the faculty's first name is invalid **[[Invalid Faculty Records]](#invalid-faculty-records)**, the error message "Invalid first name" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc12-invalid-last-name"></a>**[Invalid Last Name]**  If the faculty's last name is invalid **[[Invalid Faculty Records]](#invalid-faculty-records)**, the error message "Invalid last name" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc21-invalid-id"></a>**[Invalid ID]** If the faculty's id is invalid **[[Invalid Faculty Records]](#invalid-faculty-records)**, the error message "Invalid id" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc21-invalid-email"></a>**[Invalid Email]** If the faculty's email is invalid **[[Invalid Faculty Records]](#invalid-faculty-records)**, the error message "Invalid email" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc21-invalid-password"></a>**[Invalid Password]** If the faculty's password or repeated password is invalid **[[Invalid Faculty Records]](#invalid-faculty-records)**, the error message "Invalid password" is displayed.  The user clicks OK and is returned to the faculty directory display.
  * <a id="uc21-invalid-max-courses"></a>**[Invalid Max Courses]** If the faculty's max courses are invalid **[[Invalid Faculty Records]](#invalid-faculty-records)**, the error message "Invalid max courses" is displayed.  The user clicks OK and is returned to the faculty directory display.
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
  
### <a id="uc23"></a>Use Case 23: View Faculty Schedule
{% include iconHeader.html type="objective" %}
A faculty member can view their class schedule.

#### Preconditions
The PackScheduler application has started and a registered faculty member has logged in.

#### Main Flow

  1. The faculty member can see their schedule in a table.
  2. The faculty member selects a course.
  3. The course details are displayed with the course name, section, title, instructor, credit hours, and meeting information. If the meeting days are “A”, the details view shows “Arranged”. Otherwise, the meeting information shows the meeting days followed by the start time in standard time (e.g., 1:30PM), a dash, and the end time in standard time. Only “AM” and “PM” are used.


## Data Format

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

A faculty record has a first name, last name, id, email address, password, and max number of courses they can teach in a given semester. To protect the faculty's information, the faculty's password should be hashed using SHA-256 when stored.  

When stored in a text file, a faculty record is a comma separated list in the following format:

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
  * max courses is under 0 or above 3