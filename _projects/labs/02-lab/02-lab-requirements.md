---
title: CSC216 Lab 02 - Software Engineering Best Practices
tags: [software engineering, software lifecycle, CS2, CSC216, Lab02]
description: CSC216 Lab 02 - Requirements
navigation: on
pagegroup: 02-lab
---
# CSC216 Lab 02: Requirements
{% include iconHeader.html type="requirements" %}
`PackScheduler` is a course registration system for a university, similar to the system in MyPackPortal that you use to register for your classes.  We'll work on implementing a system that provides the functionality for admitted students to register for courses that are taught by faculty.  The courses will have enrollment caps and waitlists.  For today's lab, we'll focus on the functionality related to the directory of students admitted to the university for study.


## <a id="uc1"></a>Use Case 1: Student Records

**Main Flow:** A student has a first name, last name, id, email address, password, and max number of credits they can take in a given semester [[E1]](#uc1-e1). To protect the student's information, the student's password should be hashed using SHA-256 when stored.  When stored in a text file, a student record is a comma separated list in the following format:

    firstName,lastName,id,email,hashedPassword,maxCredits

**Alternative Flows:**

  * <a id="uc1-e1"></a>[E1]: A student is invalid if any of the following are true:
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


## <a id="uc2"></a>Use Case 2: Student Directory

**Main Flow:** The program starts and provides an empty student directory.  The registrar may create a new, empty, student directory [[S1]](#uc2-s1); load an existing student directory from a text file [[S2]](#uc2-s2); save the current student directory to a text file [[S3]](#uc2-s3); add a student to the directory [[S4]](#uc2-s4); and remove a student from the directory [[S5]](#uc2-s5).  If the user quits the program, any changes to the student directory are lost unless the user saves the student directory [[S3]](#uc2-s3).


{% include image.html file="images/StudentDirectoryPanel.PNG" caption="Figure: Student Directory GUI" %} 

**Sub Flows:**

  * <a id="uc2-s1"></a>[S1]: The user clicks the **New Student Directory** button.  Any students in the directory are cleared, and a new empty directory is created.  The *Student Directory* list is empty.
  * <a id="uc2-s2"></a>[S2]: The user clicks the **Load Student Directory** button.  A dialog appears and the user may select a text file containing student information [[E1]](#uc2-e1).  A list of students from valid records is created and displayed in the *Student Directory* list.  Any invalid records [[UC1, E1]](#uc1-e1) are ignored. 
  * <a id="uc2-s3"></a>[S3]: The user clicks the **Save Student Directory** button.  A dialog appears and the user selects the location to save the list of students [[E2]](#uc2-e2)  The list of students is saved to a text file with a student record on each line.  Each student record is a comma separated list of items [[UC1]](#uc1).
  * <a id="uc2-s4"></a>[S4]: The user adds a student, with a unique id [[E3]](#uc2-e3), by entering a first name [[E4]](#uc2-e4), last name [[E5]](#uc2-e5), id [[E6]](#uc2-e6), email [[E7]](#uc2-e7), password [[E8]](#uc2-e8), repeated password, and max credits [[E9]](#uc2-e9)[[E10]](#uc2-e10) and clicks the **Add Student** button.  The password and repeated password are hashed using SHA-256 and must match [[E11]](#uc2-e11). 
  * <a id="uc2-s5"></a>[S5]: The user selects a student in the *Student Directory* list and clicks the **Remove Student** button [[E12]](#uc2-e12).  The student is removed from the *Student Directory* list.
  
**Alternative Flows:**

  * <a id="uc2-e1"></a>[E1]: If the file cannot be found on the file system, the error message "Unable to read file <filename>" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e2"></a>[E2]: If the file cannot be written to, the error message "Unable to write to file <filename>" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e3"></a>[E3]: If the student's id is not unique, the error message "Student already in system." is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e4"></a>[E4]: If the student's first name is invalid [[UC1, E1]](#uc1-e1), the error message "Invalid first name" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e5"></a>[E5]: If the student's last name is invalid [[UC1, E1]](#uc1-e1), the error message "Invalid last name" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e6"></a>[E6]: If the student's id is invalid [[UC1, E1]](#uc1-e1), the error message "Invalid id" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e7"></a>[E7]: If the student's email is invalid [[UC1, E1]](#uc1-e1), the error message "Invalid email" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e8"></a>[E8]: If the student's password is invalid [[UC1, E1]](#uc1-e1), the error message "Invalid password" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e9"></a>[E9]: If the student's max credits are invalid [[UC1, E1]](#uc1-e1), the error message "Invalid max credits" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e10"></a>[E10]: If the max credits are not a number, the error message "Max credits must be a positive number between 3 and 18." is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e11"></a>[E11]: If the student's password and repeated passwords do not match, the error message "Passwords do not match" is displayed.  The user clicks OK and is returned to the student directory display.
  * <a id="uc2-e12"></a>[E12]: If there is no student selected, the error message "No student selected." is displayed. The user clicks OK and is returned to the student directory display.
