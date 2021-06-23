---
title: CSC 217 Lab 03 - Collections
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab03]
description: CSC 217 Lab 03 - Requirements
navigation: on
pagegroup: 03-lab
---
# CSC 217 Lab 03: Requirements
{% include iconHeader.html type="requirements" %}
`PackScheduler` is a course registration system for a university, similar to the system in MyPackPortal that you use to register for your classes.  You'll work on implementing a system that provides the functionality for admitted students to register for courses that are taught by faculty.  The courses will have enrollment caps and waitlists.  

For today's lab, you'll focus on the functionality related to the directory of students admitted to the university for study.

<font color="red">The update to the requirements for Lab 03 is that students must be stored in sorted order in the student directory.</font>

**Users**

  * [Registrar](#registrar)
  
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

**Data Formats**

  * [Student Records](#student-records)
  * [Invalid Student Records](#invalid-student-records)


## Users
{% include iconHeader.html type="teamTask" %}
There are several types of users for the PackScheduler system.  The users listed here are the people that would interact with the system.  They may or may not correspond to classes in the system.  The user roles are summarized below.

### Registrar
The registrar is a university official that maintains the directory of enrolled students.

## Requirements

### <a id="uc0"></a>Use Case 0: Start PackScheduler
{% include iconHeader.html type="objective" %}
Starts the PackScheduler application.

#### Main Flow

  1. The user starts the Pack Scheduler application. 
  2. The student directory UI is displayed with a new student directory.
  
        {% include image.html file="images/StudentDirectoryPanel.PNG" caption="Figure: Student Directory GUI" %} 
  
  {:start="3"}
  3. The registrar can do one or more of the following tasks related to the Student Directory:
     * [Use Case 2: Create Student Directory](#uc2)
     * [Use Case 3: Load Student Directory](#uc3)
     * [Use Case 4: Save Student Directory](#uc4)
     * [Use Case 5: Add Student to Student Directory](#uc5)
     * [Use Case 6: Remove Student from Student Directory](#uc6)


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
  2. A dialog appears and the user can browse the file system for the text file containing student information [[Student Records Data Format]](#student-records) [[Invalid File]](#uc3-invalid-file).
  3. A list of students is created from valid records. Invalid records are ignored [[Invalid Student Records]](#invalid-student-records).
  4. <font color="red">All students are stored in the directory in alphabetical order by last name and then by first name.  If there are two students with the same name, then the id is considered in the sort.</font>

#### Alternative Flows

  * <a id="uc3-invalid-file"></a>**[Invalid File]** If the file cannot be found on the file system, the error message "Unable to read file X" is displayed, where 'X' is the filename.  The user clicks OK and is returned to the student directory display.


### <a id="uc4"></a>Use Case 4: Save Student Directory
{% include iconHeader.html type="objective" %}
The registrar can save the current list of students in a student directory to a file.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Student Directories.

#### Main Flow

  1. The registrar clicks the **Save Student Directory** button.
  2. A dialog appears and the user selects the location to save the list of students and provides a name for the file [[Error Saving]](#uc4-error-saving).
  3. The list of students is saved to a text file with a student record on each line [[Student Records Data Format]](#student-records).  <font color="red">The students are saved in sorted order by last name, first name, and id</font>.

#### Alternative Flows

  * <a id="uc4-error-saving"></a>**[Error Saving]** If the file cannot be saved, the error message "Unable to write to file X" is displayed, where 'X' is the filename.  The user clicks OK and is returned to the student directory display.


### <a id="uc5"></a>Use Case 5: Add Student to Student Directory
{% include iconHeader.html type="objective" %}
The registrar can add a student to the student directory.

#### Preconditions
The PackScheduler application has started and the registrar has selected to work with Student Directories.

#### Main Flow

  1. The registrar enters information about a new student in the *Student Information* portion of the user interface [[Student Records Data Format]](#student-records) and clicks **Add Student** button.
     * first name [[Invalid First Name]](#uc5-invalid-first-name)
	 * last name [[Invalid Last Name]](#uc5-invalid-last-name)
	 * id [[Invalid ID]](#uc5-invalid-id)
	 * email [[Invalid Email]](#uc5-invalid-email)
	 * password [[Invalid Password]](#uc5-invalid-password)
	 * repeat password [[Invalid Password]](#uc5-invalid-password)
	 * max credits 
  2. The password and repeated password are hashed using SHA-256 and must match [[Non-matching Passwords]](#uc5-non-matching-passwords).
  3. The student is added to the *Student Directory* <font color="red">in sorted order by last name, first name, and id</font> [[Non-unique ID]](#uc5-non-unique-id). 

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

  1. The registrar selects a student in the *Student Directory* list and clicks the **Remove Student** button [[No Student Selected]](#uc6-no-student-selected).
  2. The student is removed from the *Student Directory* list.


#### Alternative Flows

  * <a id="uc6-no-student-selected"></a>**[No Student Selected]** If there is no student selected, the error message “No student selected.” is displayed. The user clicks OK and is returned to the student directory display.


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
