---
title: CSC216 Lab 08 - LinkedAbstractList
tags: [software engineering, software lifecycle, CS2, CSC216, Lab08]
description: CSC216 Lab 08 - Update `RegistrationManager`
navigation: on
pagegroup: 08-lab
---
# CSC216 Lab 08 Update `RegistrationManager`
{% include iconHeader.html type="implementation,unitTest" %}
`RegistrationManger` will handle the new enroll and drop functionality at a global level.  When a student tries to enroll in a course, they must be able to add the `Course` to their `Schedule` and the `Student` must be added to the `Course`'s `CourseRoll`.  This requires several checks before a student can be enrolled or dropped.

Due to the complicated logic, the teaching staff has provided the implementation and unit tests for the `RegistrationManager` functionality.  Updates to the GUI classes are also required.


## Update `RegistrationManager`
Add the following three methods to `RegistrationManager`.

```java
/**
 * Returns true if the logged in student can enroll in the given course.
 * @param c Course to enroll in
 * @return true if enrolled
 */
public boolean enrollStudentInCourse(Course c) {
    if (currentUser == null || !(currentUser instanceof Student)) {
        throw new IllegalArgumentException("Illegal Action");
    }
    try {
        Student s = (Student)currentUser;
        Schedule schedule = s.getSchedule();
        CourseRoll roll = c.getCourseRoll();
        
        if (s.canAdd(c) && roll.canEnroll(s)) {
            schedule.addCourseToSchedule(c);
            roll.enroll(s);
            return true;
        }
        
    } catch (IllegalArgumentException e) {
        return false;
    }
    return false;
}

/**
 * Returns true if the logged in student can drop the given course.
 * @param c Course to drop
 * @return true if dropped
 */
public boolean dropStudentFromCourse(Course c) {
    if (currentUser == null || !(currentUser instanceof Student)) {
        throw new IllegalArgumentException("Illegal Action");
    }
    try {
        Student s = (Student)currentUser;
        c.getCourseRoll().drop(s);
        return s.getSchedule().removeCourseFromSchedule(c);
    } catch (IllegalArgumentException e) {
        return false; 
    }
}

/**
 * Resets the logged in student's schedule by dropping them
 * from every course and then resetting the schedule.
 */
public void resetSchedule() {
    if (currentUser == null || !(currentUser instanceof Student)) {
        throw new IllegalArgumentException("Illegal Action");
    }
    try {
        Student s = (Student)currentUser;
        Schedule schedule = s.getSchedule();
        String [][] scheduleArray = schedule.getScheduledCourses();
        for (int i = 0; i < scheduleArray.length; i++) {
            Course c = courseCatalog.getCourseFromCatalog(scheduleArray[i][0], scheduleArray[i][1]);
            c.getCourseRoll().drop(s);
        }
        schedule.resetSchedule();
    } catch (IllegalArgumentException e) {
        //do nothing 
    }
}
```

## Update `RegistrationManagerTest`
Add the following three methods to `RegistrationManagerTest`.  Note that the leading strings describe the tests.

```java
/**
 * Tests RegistrationManager.enrollStudentInCourse()
 */
@Test
public void testEnrollStudentInCourse() {
    StudentDirectory directory = manager.getStudentDirectory();
    directory.loadStudentsFromFile("test-files/student_records.txt");
    
    CourseCatalog catalog = manager.getCourseCatalog();
    catalog.loadCoursesFromFile("test-files/course_records.txt");
    
    manager.logout(); //In case not handled elsewhere
    
    //test if not logged in
    try {
        manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC216", "001"));
        fail("RegistrationManager.enrollStudentInCourse() - If the current user is null, an IllegalArgumentException should be thrown, but was not.");
    } catch (IllegalArgumentException e) {
        assertNull("RegistrationManager.enrollStudentInCourse() - currentUser is null, so cannot enroll in course.", manager.getCurrentUser());
    }
    
    //test if registrar is logged in
    manager.login("registrar", "Regi5tr@r");
    try {
        manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC216", "001"));
        fail("RegistrationManager.enrollStudentInCourse() - If the current user is registrar, an IllegalArgumentException should be thrown, but was not.");
    } catch (IllegalArgumentException e) {
        assertEquals("RegistrationManager.enrollStudentInCourse() - currentUser is registrar, so cannot enroll in course.", "registrar", manager.getCurrentUser().getId());
    }
    manager.logout();
    
    manager.login("efrost", "pw");
    assertFalse("Action: enroll\nUser: efrost\nCourse: CSC216-001\nResults: False - Student max credits are 3 and course has 4.", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC216", "001")));
    assertTrue("Action: enroll\nUser: efrost\nCourse: CSC226-001\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    assertFalse("Action: enroll\nUser: efrost\nCourse: CSC226-001, CSC230-001\nResults: False - cannot exceed max student credits.", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC230", "001")));
    
    //Check Student Schedule
    Student efrost = directory.getStudentById("efrost");
    Schedule scheduleFrost = efrost.getSchedule();
    assertEquals(3, scheduleFrost.getScheduleCredits());
    String[][] scheduleFrostArray = scheduleFrost.getScheduledCourses();
    assertEquals(1, scheduleFrostArray.length);
    assertEquals("CSC226", scheduleFrostArray[0][0]);
    assertEquals("001", scheduleFrostArray[0][1]);
    assertEquals("Discrete Mathematics for Computer Scientists", scheduleFrostArray[0][2]);
    assertEquals("MWF 9:35AM-10:25AM", scheduleFrostArray[0][3]);
    assertEquals("9", scheduleFrostArray[0][4]);
            
    manager.logout();
    
    manager.login("ahicks", "pw");
    assertTrue("Action: enroll\nUser: ahicks\nCourse: CSC216-001\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC216", "001")));
    assertTrue("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC226-001\nResults: False - duplicate", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-001\nResults: False - time conflict", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC116", "001")));
    assertTrue("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-003\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC116", "003")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-003, CSC116-002\nResults: False - already in section of 116", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC216", "601")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-003, CSC230-001\nResults: False - exceeded max credits", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC230", "001")));
    
    //Check Student Schedule
    Student ahicks = directory.getStudentById("ahicks");
    Schedule scheduleHicks = ahicks.getSchedule();
    assertEquals(10, scheduleHicks.getScheduleCredits());
    String[][] scheduleHicksArray = scheduleHicks.getScheduledCourses();
    assertEquals(3, scheduleHicksArray.length);
    assertEquals("CSC216", scheduleHicksArray[0][0]);
    assertEquals("001", scheduleHicksArray[0][1]);
    assertEquals("Programming Concepts - Java", scheduleHicksArray[0][2]);
    assertEquals("TH 1:30PM-2:45PM", scheduleHicksArray[0][3]);
    assertEquals("9", scheduleHicksArray[0][4]);
    assertEquals("CSC226", scheduleHicksArray[1][0]);
    assertEquals("001", scheduleHicksArray[1][1]);
    assertEquals("Discrete Mathematics for Computer Scientists", scheduleHicksArray[1][2]);
    assertEquals("MWF 9:35AM-10:25AM", scheduleHicksArray[1][3]);
    assertEquals("8", scheduleHicksArray[1][4]);
    assertEquals("CSC116", scheduleHicksArray[2][0]);
    assertEquals("003", scheduleHicksArray[2][1]);
    assertEquals("Intro to Programming - Java", scheduleHicksArray[2][2]);
    assertEquals("TH 11:20AM-1:10PM", scheduleHicksArray[2][3]);
    assertEquals("9", scheduleHicksArray[2][4]);
    
    manager.logout();
}

/**
 * Tests RegistrationManager.dropStudentFromCourse()
 */
@Test
public void testDropStudentFromCourse() {
    StudentDirectory directory = manager.getStudentDirectory();
    directory.loadStudentsFromFile("test-files/student_records.txt");
    
    CourseCatalog catalog = manager.getCourseCatalog();
    catalog.loadCoursesFromFile("test-files/course_records.txt");
    
    manager.logout(); //In case not handled elsewhere
    
    //test if not logged in
    try {
        manager.dropStudentFromCourse(catalog.getCourseFromCatalog("CSC216", "001"));
        fail("RegistrationManager.dropStudentFromCourse() - If the current user is null, an IllegalArgumentException should be thrown, but was not.");
    } catch (IllegalArgumentException e) {
        assertNull("RegistrationManager.dropStudentFromCourse() - currentUser is null, so cannot enroll in course.", manager.getCurrentUser());
    }
    
    //test if registrar is logged in
    manager.login("registrar", "Regi5tr@r");
    try {
        manager.dropStudentFromCourse(catalog.getCourseFromCatalog("CSC216", "001"));
        fail("RegistrationManager.dropStudentFromCourse() - If the current user is registrar, an IllegalArgumentException should be thrown, but was not.");
    } catch (IllegalArgumentException e) {
        assertEquals("RegistrationManager.dropStudentFromCourse() - currentUser is registrar, so cannot enroll in course.", "registrar", manager.getCurrentUser().getId());
    }
    manager.logout();
    
    manager.login("efrost", "pw");
    assertFalse("Action: enroll\nUser: efrost\nCourse: CSC216-001\nResults: False - Student max credits are 3 and course has 4.", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC216", "001")));
    assertTrue("Action: enroll\nUser: efrost\nCourse: CSC226-001\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    assertFalse("Action: enroll\nUser: efrost\nCourse: CSC226-001, CSC230-001\nResults: False - cannot exceed max student credits.", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC230", "001")));
    
    assertFalse("Action: drop\nUser: efrost\nCourse: CSC216-001\nResults: False - student not enrolled in the course", manager.dropStudentFromCourse(catalog.getCourseFromCatalog("CSC216", "001")));
    assertTrue("Action: drop\nUser: efrost\nCourse: CSC226-001\nResults: True", manager.dropStudentFromCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    
    //Check Student Schedule
    Student efrost = directory.getStudentById("efrost");
    Schedule scheduleFrost = efrost.getSchedule();
    assertEquals(0, scheduleFrost.getScheduleCredits());
    String[][] scheduleFrostArray = scheduleFrost.getScheduledCourses();
    assertEquals(0, scheduleFrostArray.length);
    
    manager.logout();
    
    manager.login("ahicks", "pw");
    assertTrue("Action: enroll\nUser: ahicks\nCourse: CSC216-001\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC216", "001")));
    assertTrue("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC226-001\nResults: False - duplicate", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-001\nResults: False - time conflict", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC116", "001")));
    assertTrue("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-003\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC116", "003")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-003, CSC116-002\nResults: False - already in section of 116", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC216", "601")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-003, CSC230-001\nResults: False - exceeded max credits", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC230", "001")));
    
    Student ahicks = directory.getStudentById("ahicks");
    Schedule scheduleHicks = ahicks.getSchedule();
    assertEquals(10, scheduleHicks.getScheduleCredits());
    String[][] scheduleHicksArray = scheduleHicks.getScheduledCourses();
    assertEquals(3, scheduleHicksArray.length);
    assertEquals("CSC216", scheduleHicksArray[0][0]);
    assertEquals("001", scheduleHicksArray[0][1]);
    assertEquals("Programming Concepts - Java", scheduleHicksArray[0][2]);
    assertEquals("TH 1:30PM-2:45PM", scheduleHicksArray[0][3]);
    assertEquals("9", scheduleHicksArray[0][4]);
    assertEquals("CSC226", scheduleHicksArray[1][0]);
    assertEquals("001", scheduleHicksArray[1][1]);
    assertEquals("Discrete Mathematics for Computer Scientists", scheduleHicksArray[1][2]);
    assertEquals("MWF 9:35AM-10:25AM", scheduleHicksArray[1][3]);
    assertEquals("9", scheduleHicksArray[1][4]);
    assertEquals("CSC116", scheduleHicksArray[2][0]);
    assertEquals("003", scheduleHicksArray[2][1]);
    assertEquals("Intro to Programming - Java", scheduleHicksArray[2][2]);
    assertEquals("TH 11:20AM-1:10PM", scheduleHicksArray[2][3]);
    assertEquals("9", scheduleHicksArray[2][4]);
    
    assertTrue("Action: drop\nUser: efrost\nCourse: CSC226-001\nResults: True", manager.dropStudentFromCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    
    //Check schedule
    ahicks = directory.getStudentById("ahicks");
    scheduleHicks = ahicks.getSchedule();
    assertEquals(7, scheduleHicks.getScheduleCredits());
    scheduleHicksArray = scheduleHicks.getScheduledCourses();
    assertEquals(2, scheduleHicksArray.length);
    assertEquals("CSC216", scheduleHicksArray[0][0]);
    assertEquals("001", scheduleHicksArray[0][1]);
    assertEquals("Programming Concepts - Java", scheduleHicksArray[0][2]);
    assertEquals("TH 1:30PM-2:45PM", scheduleHicksArray[0][3]);
    assertEquals("9", scheduleHicksArray[0][4]);
    assertEquals("CSC116", scheduleHicksArray[1][0]);
    assertEquals("003", scheduleHicksArray[1][1]);
    assertEquals("Intro to Programming - Java", scheduleHicksArray[1][2]);
    assertEquals("TH 11:20AM-1:10PM", scheduleHicksArray[1][3]);
    assertEquals("9", scheduleHicksArray[1][4]);
    
    assertFalse("Action: drop\nUser: efrost\nCourse: CSC226-001\nResults: False - already dropped", manager.dropStudentFromCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    
    assertTrue("Action: drop\nUser: efrost\nCourse: CSC216-001\nResults: True", manager.dropStudentFromCourse(catalog.getCourseFromCatalog("CSC216", "001")));
    
    //Check schedule
    ahicks = directory.getStudentById("ahicks");
    scheduleHicks = ahicks.getSchedule();
    assertEquals(3, scheduleHicks.getScheduleCredits());
    scheduleHicksArray = scheduleHicks.getScheduledCourses();
    assertEquals(1, scheduleHicksArray.length);
    assertEquals("CSC116", scheduleHicksArray[0][0]);
    assertEquals("003", scheduleHicksArray[0][1]);
    assertEquals("Intro to Programming - Java", scheduleHicksArray[0][2]);
    assertEquals("TH 11:20AM-1:10PM", scheduleHicksArray[0][3]);
    assertEquals("9", scheduleHicksArray[0][4]);
    
    assertTrue("Action: drop\nUser: efrost\nCourse: CSC116-003\nResults: True", manager.dropStudentFromCourse(catalog.getCourseFromCatalog("CSC116", "003")));
    
    //Check schedule
    ahicks = directory.getStudentById("ahicks");
    scheduleHicks = ahicks.getSchedule();
    assertEquals(0, scheduleHicks.getScheduleCredits());
    scheduleHicksArray = scheduleHicks.getScheduledCourses();
    assertEquals(0, scheduleHicksArray.length);
    
    manager.logout();
}

/**
 * Tests RegistrationManager.resetSchedule()
 */
@Test
public void testResetSchedule() {
    StudentDirectory directory = manager.getStudentDirectory();
    directory.loadStudentsFromFile("test-files/student_records.txt");
    
    CourseCatalog catalog = manager.getCourseCatalog();
    catalog.loadCoursesFromFile("test-files/course_records.txt");
    
    manager.logout(); //In case not handled elsewhere
    
    //Test if not logged in
    try {
        manager.resetSchedule();
        fail("RegistrationManager.resetSchedule() - If the current user is null, an IllegalArgumentException should be thrown, but was not.");
    } catch (IllegalArgumentException e) {
        assertNull("RegistrationManager.resetSchedule() - currentUser is null, so cannot enroll in course.", manager.getCurrentUser());
    }
    
    //test if registrar is logged in
    manager.login("registrar", "Regi5tr@r");
    try {
        manager.resetSchedule();
        fail("RegistrationManager.resetSchedule() - If the current user is registrar, an IllegalArgumentException should be thrown, but was not.");
    } catch (IllegalArgumentException e) {
        assertEquals("RegistrationManager.resetSchedule() - currentUser is registrar, so cannot enroll in course.", "registrar", manager.getCurrentUser().getId());
    }
    manager.logout();
    
    manager.login("efrost", "pw");
    assertFalse("Action: enroll\nUser: efrost\nCourse: CSC216-001\nResults: False - Student max credits are 3 and course has 4.", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC216", "001")));
    assertTrue("Action: enroll\nUser: efrost\nCourse: CSC226-001\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    assertFalse("Action: enroll\nUser: efrost\nCourse: CSC226-001, CSC230-001\nResults: False - cannot exceed max student credits.", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC230", "001")));
    
    manager.resetSchedule();
    //Check Student Schedule
    Student efrost = directory.getStudentById("efrost");
    Schedule scheduleFrost = efrost.getSchedule();
    assertEquals(0, scheduleFrost.getScheduleCredits());
    String[][] scheduleFrostArray = scheduleFrost.getScheduledCourses();
    assertEquals(0, scheduleFrostArray.length);
    
    manager.logout();
    
    manager.login("ahicks", "pw");
    assertTrue("Action: enroll\nUser: ahicks\nCourse: CSC216-001\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC216", "001")));
    assertTrue("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC226-001\nResults: False - duplicate", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC226", "001")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-001\nResults: False - time conflict", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC116", "001")));
    assertTrue("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-003\nResults: True", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC116", "003")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-003, CSC116-002\nResults: False - already in section of 116", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC216", "601")));
    assertFalse("Action: enroll\nUser: ahicks\nCourse: CSC216-001, CSC226-001, CSC116-003, CSC230-001\nResults: False - exceeded max credits", manager.enrollStudentInCourse(catalog.getCourseFromCatalog("CSC230", "001")));
    
    manager.resetSchedule();
    //Check Student schedule
    Student ahicks = directory.getStudentById("ahicks");
    Schedule scheduleHicks = ahicks.getSchedule();
    assertEquals(0, scheduleHicks.getScheduleCredits());
    String[][] scheduleHicksArray = scheduleHicks.getScheduledCourses();
    assertEquals(0, scheduleHicksArray.length);
    
    manager.logout();
}
```

## Update GUI Classes
Update the GUI classes so that your program will compile.

  * [`PackSchedulerGUI` Code](files/PackSchedulerGUI.java)
  * [`CourseCatalogPanel` Code](files/CourseCatalogPanel.java)
  * [`StudentDirectoryPanel` Code](files/StudentDirectoryPanel.java)
  * [`StudentRegistrationPanel` Code](files/StudentRegistrationPanel.java)
    

## Pass all Tests
Run all unit tests and ensure that they are all passing and that the teaching staff unit tests are also all passing before moving on.


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  


{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../../git-tutorial/git-staging)
  * [Committing Files](../../git-tutorial/git-commit)
  * [Pushing Files](../../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}