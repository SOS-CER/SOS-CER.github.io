---
title: CSC 217 Lab 05 - Inspection & Debugging
tags: [software engineering, software lifecycle, CS2, CSC 217, Lab05]
description: CSC 217 Lab 05 - Inspection & Debugging
navigation: on
pagegroup: 05-lab 
---
# CSC 217 Lab 05: Inspection & Debugging
{% include iconHeader.html type="implementation" %}
There are three components to the [design](05-lab-design) of the `RegistrationManager` class that are new: use of the Singleton pattern, use of an inner class, and use of a properties file.  A colleague elsewhere in the organization has worked with these components before and has put together a quick `RegistrationManager` implementation.  However, while the colleague is an expert on the Singleton pattern, creating inner classes, and properties files, the colleague is not familiar with your project so the implementation may be buggy.

You will integrate, inspect, test, and debug the provided `RegistrationManager` class into the `PackScheduler` system.


## Create `RegistrationManager` 

  * Create a new package `edu.ncsu.csc216.pack_scheduler.manager` in the `src/` folder of `PackScheduler`.  
  * Create a new class `RegistrationManager` in the `*.manager` package in the `src/` folder of `PackScheduler`.
  * [Copy in the provided `RegistrationManager` code](files/RegistrationManager.java).

## Create `RegistrationManagerTest`

  * Create a new package `edu.ncsu.csc216.pack_scheduler.manager` in the `test/` folder of `PackScheduler`.  
  * Create a new class `RegistrationManagerTest` in the `*.manager` package in the `test/` folder of `PackScheduler`.
  * [Copy in the provided `RegistrationManagerTest` code](files/RegistrationManagerTest.java).


## Implement `StudentDirectory.getStudentById()`
`RegistrationManager` initially will not compile because `StudentDirectory` is missing the `getStudentById()` method.  Add that method to match the design and work with your colleague's provided `RegistrationManager`.  Add tests to `StudentDirectoryTest` to test the method `getStudentById()`.


## Overview of Singleton Pattern
The Singleton pattern consists of a class that has **one** and **only one** instance of itself.  The responsibilities of a Singleton class are to maintain 1) the singleton instance and 2) the responsibilities of the instance itself.  That means `RegistrationManager` manager keeps track of its own instance in the field `instance` and has the responsibilities related to getting the single instance, the catalog, directory, and the user authentication.  

By using the Singleton pattern, you can ensure that the GUI interacts with a single instance of the `RegistrationManager`, and through the `RegistrationManager`, a single instance of the `StudentDirectory` and `CourseCatalog` classes.

A Singleton class has a static instance of itself as a private field.  By making the instance static, the instance belongs to all instance of the class (but remember there is only have one!).  The constructor is then private.  That means the class itself controls creation of its own instance - no one else can construct the instance of the class!  

So if the constructor is private, how do you create the single instance?  You do that through the public static `getInstance()` method.  Since the method is static, it belongs to the class rather than an instance of the class.  A caller will always work with this method to get the single instance of the class to interact with in the standard OO manner.  The `getInstance()` method creates the single instance if one doesn't yet exist.  If it does, it returns that instance.

To work with the instance, a client typically uses the following call:

    ```java
	RegistrationManager manager = RegistrationManager.getInstance();
	```
    
This returns the single instance to a reference that the client can then interact with in a normal OO manner.  You can see the Singleton pattern in the `RegistrationManager` constructor, `getInstance()` method, and `instance` field.


## `Registrar` Inner Class
Now that you have a `User` class, you can work with the `Registrar` inner class.  An inner class is a class within a class.  The enclosing class encapsulates the inner class fully.  

In the `PackScheduler` program, the inner class represents a generic `Registrar` `User`.  You want to keep the idea of a registrar separate from the idea of a `Student`.  However, the `Registrar` doesn't need to exist outside of the `RegistrationManager`, so your colleague provided it as an inner class.  The inner class is private because the client of `RegistrationManager` does not need to work with the `Registrar` class.  It's static because we can share the instance with all instances of `RegistrationMangaer` (which in this case is only a single instance due to the Singleton pattern).  We'll create the `Registrar` `User` when we construct `RegistrationMangaer`.

```java
private static class Registrar extends User {
    /**
     * Create a registrar user.
     */
    public Registrar(String firstName, String lastName, String id, String email, String hashPW) {
        super(firstName, lastName, id, email, hashPW);
    }
}
```

Since the `Registrar` is a user, they must have a password and all of other fields that a `User` must have.  Instead of hard coding the `Registrar` information as constants in our program, we'll store the information in a `properties` file.

## `properties` File
Programs can store name-value pairs in a `properties` file, which is a regular text file that lives in a project.  A name-value pair is a descriptive name for something (like a variable) and the value is the contents of the variable.  We can use the name to get the value.  For the `Registrar` user, we can create a properties file `registrar.properties` that contains information about the `Registrar` user.  The Java libraries provide a class `Properties` that helps with reading name-value pairs from a given file. 

We'll set up our `registrar.properties` file and then walk through the code that uses it in the [provided `RegistrationManager`](files/RegistrationManager.java).

### Setting up `registrar.properties`
The `registrar.properties` file should live at the top level of your `PackScheduler` project (right under the `PackScheduler` folder).  Right click on `PackScheduler` and select **New > File**.  Name the file `registrar.properties`.  (Note you may get a message about installing an Eclipse plug-in to work with `*.properties` files.  You don't need to install this plug-in.  We'll work with `registrar.properties` as a plain text file.)

The template of the `registrar.properties` file is below.  Copy it into your `registrar.properties` file.

```
first=
last=
id=
email=
pw=
```

The template provides the names for the values that we're going to store in the `registrar.properties` file.  You can specify the values to be anything you want!  Note that the password must be in plain text.

### Protecting Secrets
Passwords are secrets that should be protected.  As a student at NC State, you're expected to keep your password a secret and not share it with significant others, friends, or family.  That means that files that may contain passwords, like `registrar.properties`, should remain secret on your computer and not be shared.  As a software engineer, we have a responsibility to be careful with our user and system secrets.  For example, we should not expose passwords or other secrets on public source code repositories!  ([Pushing secrets to public source code repositories](https://github.com/blog/1390-secrets-in-the-code) is a frequent mistake of developers and they can [be easily mined](https://github.com/anshumanbh/git-all-secrets). Once secrets are out, they are compromised and should be changed.)

One way to prevent the compromise of secrets is to not push files that contain secrets to ANY repositories (public/private) in the first place.  This shows the value of the `.gitignore` file.  We can add our `registrar.properties` file to `.gitignore`.  Then `registrar.properties` will be ignored when it is time to commit and push changes to the remote GitHub.  Your `registrar.properties` secrets are safe!

To ignore `registrar.properties`, right click on the file in your **Package Explorer** and select **Team > Ignore**.  

You can view your `.gitignore` file in Eclipse by opening the **Navigator View** by selecting **Window > Show View > Navigator**.  Your `.gitignore` file should be in the `PackScheduler` folder and should contain:

```
/bin/
/registrar.properties
```

If you have other `.gitignore` files in your project structure or additional files in your `.gitignore` file you can update your `gitignore` to match what we have here, which is ignoring generated `*.class` files in the `/bin/` directory and your `registrar.properties` secrets.

Note that you should not include secrets in other files, like system test plans!

### Using `properties` Files
Let's walk through the code that works with `registrar.properties`.  We maintain the name of the `properties` file as a constant of the class (`PROP_FILE`).  The `RegistrationManager` constructor calls the `createRegistrar()` method which reads from the `registrar.properties` file using the `Properties` class from the Java API.  The `Properties` class understands how to parse name-value pairs as stored in our `registrar.properties` file.  We can then get the value associated with a name using the `Properties.getProperty(String name)` method call.  

We first get the `pw` property so we can hash the password using the `hashPW()` method.  Then we get the rest of the properties as parameters for the `Registrar` constructor.

Since we are reading from a file, there is a chance for an `IOException`.  For example, if you don't have a local copy of the `registrar.properties` file, there will be an `IOException`, which we catch and then throw an `IllegalArgumentException`.  You can use that exception information to remind you to create the `registrar.properties` file.

```java
private static final String PROP_FILE = "registrar.properties";

private RegistrationManager() { //Private b/c used to construct single instance  
    createRegistrar();
}

private void createRegistrar() {
    Properties prop = new Properties();
    
    try (InputStream input = new FileInputStream(PROP_FILE)) {
        prop.load(input);
        
        String hashPW = hashPW(prop.getProperty("pw"));
        
        registrar = new Registrar(prop.getProperty("first"), prop.getProperty("last"), prop.getProperty("id"), prop.getProperty("email"), hashPW);
    } catch (IOException e) {
        throw new IllegalArgumentException("Cannot create registrar.");
    }
}

private String hashPW(String pw) {
    try {
        MessageDigest digest1 = MessageDigest.getInstance(HASH_ALGORITHM);
        digest1.update(pw.getBytes());
        return new String(digest1.digest());
    } catch (NoSuchAlgorithmException e) {
        throw new IllegalArgumentException("Cannot hash password");
    }
}
```


### Testing with `properties` Files
When testing, you should NOT hard code your `Registrar` user name and password in your tests (remember the discussion on secrets)!  Instead, you should use the `registrar.properties` file to get the appropriate information for testing.  For example, if you're testing authentication, you will need to work with the `id` and `pw` properties.  You will use code similar to that in `RegistrationManager.createRegistrar()` for working with the `registrar.properties` file in your tests.

### Running on Jenkins 
So how do we run on Jenkins?  Each Jenkins server has it's own secret copy of `registrar.properties` that the teaching staff test cases are configured to work with.  During the Jenkins build we will copy the Jenkins `registrar.properties` into your project, which will set everything up for execution.

That means that YOUR tests cannot be specific to YOUR `registrar.properties`.  You MUST work with the `Properties` class to read from the `registrar.properties` file for getting things like the `id` and `pw` for the `Registrar` user for testing.  That way your tests will be able to work with the Jenkins' version of `registrar.properties`.

## Inspect `RegistrationManager`
Using the [requirements](05-lab-requirements), inspect `RegistrationManager` for bugs.  Note any you find and continue with the inspection.  The teaching staff recommends creating a text file in your `PackScheduler` project to note any problems that you find.

## Test `RegistrationManager`
Complete the unit tests for `RegistrationManager` by completing the provided `RegistrationManagerTest` class.  Writing unit tests will help you identify other bugs in `RegistrationManager`.

## Fixing Bugs
Start fixing any problems that you found in `RegistrationManager`.  You may not be able to fix them all at this point, but the system tests in the next step will help you find the rest!


## Push to GitHub
Push your `PackScheduler` project to [GitHub](https://github.ncsu.edu)

  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  
  
Check your results on Jenkins!


{% capture callout_content %}
To generate Javadoc, you need to [configure and run the Javadoc tool](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-javadoc#configure-and-run-javadoc-for-your-project), [fix Javadoc errors and warnings](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-javadoc#fix-javadoc-errors-and-warnings), and [check the generated Javadoc pages](https://pages.github.ncsu.edu/engr-csc216/guided-projects/gp1/gp1-javadoc#check-generated-javadoc-pages).  Make sure you push your changes to GitHub!
{% endcapture %}
{% include callout.html content=callout_content icon="dtTool" type="reminder" title="Reminder: Generating Javadoc" %}