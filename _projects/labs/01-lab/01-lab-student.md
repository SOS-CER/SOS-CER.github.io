---
title: CSC216 Lab 01 - Installation and Project Creation
tags: [software engineering, software lifecycle, CS2, CSC216, Lab01]
description: CSC216 Lab 01 - Implement `Student`
navigation: on
pagegroup: 01-lab
---

# CSC216 Lab 01: Implement `Student`
{% include iconHeader.html type="implementation" %}
The `Student` class represents an individual student record.  The `Student` class is a "plain old java object" (POJO) consisting mostly of getters and setters.  The setters do have some complexity.  Note that some, but not all of the methods are provided to you.  You will need to create the other methods to satisfy the [design](01-lab-design) of the `StudentDirectory` functionality of `PackScheduler`.


## `Student` State
A `Student` knows her first name (`String`), last name (`String`), id (`String`), email (`String`), password (`String`), and max credits (`int`).  Create the fields for `Student`.  All fields should be `private`.

Additionally, `Student` has a constant `MAX_CREDITS` that represents the maximum possible credits *any* student can have.  Since the constant is useful in test cases, `MAX_CREDITS` is public and should be set to the value of 18.  The constant `MAX_CREDITS` represents the max number of credits that any student in the system may have.  The field `maxCredits` is the max credits that a specific student (e.g., `this`) may enroll in.

Note that the `Student` class does not hash the password.  We expect that the password is passed in as a hashed value.  The reason for this is that the password should be hashed as soon as possible after the user enters it.  That means the class right behind the GUI, `StudentDirectory` will handle the hashing.  You can assume that you will receive a hashed String for the password.


## `Student` Constructors
`Student` has two constructors; one that has parameters for all fields the other that has parameters for all fields but max credits.

  * `Student(String firstName, String lastName, String id, String email, String password, int maxCredits)`: calls the setters for each of the fields.  If the setters throw an `IllegalArgumentException` the exception should pass through the constructor to the client.  That means the constructor does NOT catch the exception.  Just call the setters!
  * `Student(String firstName, String lastName, String id, String email, String password)`: calls the other constructor with the default max credits value of 18.


## `Student` Getters
All getters for the `Student` fields are straight forward; they return the field.  Use [Source Code Generation](../../gp1/gp1-source-gen#generate-getters-and-setters) to help you create the getters.


## `Student` Setters
The setters are more complex because they check to make sure that the `Student` fields are not invalid as defined in [[UC1]](01-lab-requirements#uc1).  If a value is invalid an `IllegalArgumentException` is thrown.

  * `setFirstName(String firstName)`: throws an `IllegalArgumentException` if the parameter is null or an empty string.
  * `setLastName(String lastName)`: throws an `IllegalArgumentException` if the parameter is null or an empty string.
  * `setId(String id)`: throws an `IllegalArgumentException` if the parameter is null or an empty string.
  * `setEmail(String email)`: throws an `IllegalArgumentException` if:
     * the parameter is null or an empty string
     * email doesn't contain an '@' character
     * email doesn't contain a '.' character
     * the index of the last '.' character in the email string is earlier than the index of the first '@' character (e.g., first.last@address would be invalid)
  * `setPassword(String password)`: throws an `IllegalArgumentException` if the parameter is null or an empty string.
  * `setMaxCredits(int maxCredits)`: throws an `IllegalArgumentException` if the parameter is less than 3 or greater than 18.
  
Note that in the design, `setId()` is listed as a `private` method.  This is because a `Student`'s id shouldn't change after creation - it's the unique identifier in the `StudentDirectory`.  Don't forget to make `setId()` private to meet the design!


## `Student` `hashCode()` and `equals()`
[Generate `hashCode()` and `equals()`](../../gp1/gp1-source-gen#generate-equals-and-hashcode) on all of the `Student` fields.


## `Student` `toString()`
Override `toString()` by right clicking in the editor (inside the `Student` class definition) and selecting **Source > Override/Implement Methods**.  Select `toString()`.  

`toString()` should return a string containing the fields as a comma separated line as defined in [[UC1]](01-lab-requirements#uc1).


## Javadoc your Code
Make sure that you Javadoc the `Student` class, state, and methods.  For the overridden methods `equals()`, `hashCode()`, and `toString()`, remove the green comments and Javadoc them to describe how the methods work in `Student`.  Do NOT delete the `@Override` annotation.

Run [CheckStyle](../../gp1/gp1-static-analysis#checkstyle) to ensure that your Javadoc has all elements.


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


## Check Jenkins
At this point your project should build on Jenkins with a Yellow ball.  That is because there are failing tests in `StudentRecordIO` that we haven't gotten to yet.  When fixing test failures, focus on failures in `TS_StudentTest`.  Make sure that all `TS_StudentTest` methods are passing before moving on to `StudentRecordIO`.


{% capture callout_content %}
Check the following items on Jenkins for [your last build](../../jenkins/#build-summary-page) and use the results to [estimate your grade](../../jenkins/#grade-estimation-example):

  * [Test Results](../../jenkins/#test-results)
  * [FindBugs Report](../../jenkins/#findbugs-report)
  * [CheckStyle Report](../../jenkins/#checkstyle-report)
  * [PMD Report](../../jenkins/#pmd-report)
{% endcapture %}
{% include callout.html content=callout_content icon="ciTool" type="reminder" title="Reminder: Interpreting Jenkins" %}

