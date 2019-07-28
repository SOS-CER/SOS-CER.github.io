---
title: Guided Project 1 WolfScheduler - Course and Schedule
tags: [software engineering, software lifecycle, CS2, CSC216, GP1]
description: Guided Task - Working with the Java Libraries
navigation: on
pagegroup: gp1
---
 
# Guided Task: Working with the Java Libraries
Your skeleton of `CourseRecordIO` uses classes and interfaces from the [`java.io` package](https://docs.oracle.com/javase/8/docs/api/java/io/package-summary.html) and the [Java Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html).   

{% capture callout_content %}
  * Implement code using [`List`](https://docs.oracle.com/javase/8/docs/api/java/util/List.html) and [`ArrayList`](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html).
  * Review file I/O implementation.
{% endcapture %}
{% include callout.html content=callout_content type="learningOutcomes" title="Learning Outcomes" %}
  
{% capture callout_content %}
When programming complex systems, most software engineers don't start from scratch.  Instead, they take advantage of existing libraries of common functionalities when writing their programs.  You work with libraries that are part of the Java Development Kit (JDK) all the time when writing programs.  For example, any time you print to the console using `System.out.println()`, you are working with the `System` class' object `PrintStream` object named `out`, which has a method `println()` that provides the functionality for writing to standard output stream (or the console).  

You will be working with two portions of the JDK when implementing `CourseRecordIO`: the [`java.io` package](https://docs.oracle.com/javase/8/docs/api/java/io/package-summary.html) and the [Java Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html).
{% endcapture %}
{% include callout.html content=callout_content icon="plTool" type="bestPractices" title="Best Practice: Working with Libraries" %}
 
## File Input
When reading from files, you use the [`Scanner`](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html) class (which is actually in the `java.util` package because `Scanner` can scan other things than files).  The `CourseRecordIO.readCourseRecords()` method will use the `Scanner` class to read the file.  `readCourseRecords()` receives a parameter specifying the name of the file that will be read. 

`Scanner` has several constructors that accept parameters specifying different resources that `Scanner` can parse.  When working with `File`s, `Scanner` requires a parameter of type `File` or `FileInputStream`.  For `CourseRecordIO` we will use `FileInputStream` so that the files are processed as bytes rather than characters.  You will use the `Scanner` as you normally would.  Passing in a `String` type will lead to a logic error because `Scanner`s can also be used to parse `String`s!

```java
Scanner fileReader = new Scanner(new FileInputStream(fileName));

fileReader.close();
return null;
```

{% capture callout_content %}
When passed a `File` as a parameter, a `Scanner` is a wrapper for an operating system resource called a *file handle*.  Every time you create a `File` `Scanner`, you use one of the OS's file handles.  File handles are a limited resource, so when you use a file handle, you should make sure it's released when you're done.  This is done through the `Scanner.close()` method.
{% endcapture %}
{% include callout.html content=callout_content icon="plTool" type="conceptualKnowledge" title="Conceptual Knowledge: File Resources" %}

The `Scanner(File)` constructor may throw a *checked* `FileNotFoundException` if there is a problem reading the file.  One way to handle is that to surround the code with a `try/catch` block.  However, that would hide the error within the `CourseRecordIO` class.  Instead, the `CourseRecordIO.readCourseRecords()` throws a `FileNotFoundException` out to the client.  That means you do not need to check for the `FileNotFoundException` in `CourseRecordIO`.

 
## File Processing
`Scanner` has a set of `hasNext*()` methods that let you check to see if the next value is of the type that you want.  Once you know that the next token is the value you want, you can use a `next*()` method to get the value of the given type.  From the requirements for [UC1, S1](../wolf-scheduler/ws-requirements#uc1-s1), you know that the `Course` records are stored in a text file with one `Course` record per line.  You will want to get each line from the file and then create a `Course` or skip that line if the record is not a valid `Course`.

The following code sets up the loop for processing each line.  You will use a `private` helper method, `readCourse()`, to process each `Course`.  You can use Eclipse's Quick Fix to create the `readCourse()` helper method.

```java
Scanner fileReader = new Scanner(new FileInputStream(fileName));
while (fileReader.hasNextLine()) {
    Course c = readCourse(fileReader.nextLine());
}
fileReader.close();
return null;
```

{% capture callout_content %}
When writing object-oriented code, you may find that public methods (those that a client may want to use) can quickly grow complex.  When that happens, it is useful to put some of the functionality in a `private` method.  By creating smaller methods, the code is easier to maintain.  The cost of calling another method is very small compared to readable code in large systems.
{% endcapture %}
{% include callout.html content=callout_content icon="plTool" type="conceptualKnowledge" title="Conceptual Knowledge: `private` Helper Methods" %}

{% capture callout_content %}
If you need help using Eclipse's Quick Fix to create a method, see [Guided Task: Eclipse Quick Fix - Create `CourseRecordIO` Methods](gp1-quick-fix#create-courserecordio-methods).
{% endcapture %}
{% include callout.html content=callout_content icon="ideTool" type="reminder" title="Reminder: Eclipse Quick Fix" %}

 
## File Output
You can use the `PrintStream` class (the same type as `System.out`) to write to a `File` by providing a `File` object as an actual parameter.  `CourseRecordIO.writeCourseRecords()` writes information about each `Course` to the file using a `PrintStream` as shown below.

```java
PrintStream fileWriter = new PrintStream(new File(fileName));

for (int i = 0; i < courses.size(); i++) {
    fileWriter.println(courses.get(i).toString());
}

fileWriter.close();
```
    
Like `Scanner`, `PrintStream`s should also be closed when they are done.  Note that you are also using the `Course.toString()` method to create the comma-separated output in the same format as the input!

 
## Java Collections Framework
The Java Collections Framework (JCF) provides functionality for working with collections of objects.  In CSC216, you will focus on the [`List`](https://docs.oracle.com/javase/8/docs/api/java/util/List.html) collection type. 

{% capture callout_content %}
`ArrayList` provides `List` functionality using the underlying storage of an array.  That means `ArrayList` is a class that wraps additional functionality around an array so that it is easier for clients (like us) to work with it.  

Like an array, `ArrayList` provides functionality for adding elements, removing elements, getting elements, finding the size, and several other useful methods.  The table below shows the relationship between arrays and `ArrayList`.

| Function | Array | `ArrayList` |
|-------------|-----------------------------------|-----------------------------------|
| Constructing | `String [] array = new String[size]` | `ArrayList<String> array = new ArrayList<String>()` |
| Adding an element | `array[0] = "apple";` | `array.add(0, "apple");` |
| Removing an element | `array[0] = null;` | `array.remove("apple");` |
| Getting an element | `return array[0];` | `return array.get(0);` |
| Size | `array.length` | `array.size()` |
{% endcapture %}
{% include callout.html content=callout_content icon="plTool" type="conceptualKnowledge" title="Conceptual Knowledge: `ArrayList` and `Arrays`" %}

`CourseRecordIO.readCourseRecords()` returns an `ArrayList` of `Course`s.  That means the method should construct an empty `ArrayList` and add each `Course` to the `ArrayList`.  You can also plan for the error handling that needs to occur when there's an invalid `Course` record.  If there's a problem when constructing a `Course` object, an `IllegalArgumentException` is thrown.  You can catch the exception and skip adding that line to the `courses` `ArrayList`.  Additionally, you need to handle the requirement in [[UC1, S1]](../wolf-scheduler/ws-requirements#uc1-s1) where a course record is invalid if the name, title, and section is the same as another course in the list.  That means only the first course with a given name, title, and section is added to the list.  Others are ignored.  To do this 

```java
public static ArrayList<Course> readCourseRecords(String fileName) throws FileNotFoundException {
    Scanner fileReader = new Scanner(new FileInputStream(fileName));
    ArrayList<Course> courses = new ArrayList<Course>();
    while (fileReader.hasNextLine()) {
        try {
            Course course = readCourse(fileReader.nextLine());
            boolean duplicate = false;
            for (int i = 0; i < courses.size(); i++) {
                Course c = courses.get(i);
                if (course.getName().equals(c.getName()) &&
                        course.getSection().equals(c.getSection())) {
                    //it's a duplicate
                    duplicate = true;
                }
            }
            if (!duplicate) {
                courses.add(course);
            }
        } catch (IllegalArgumentException e) {
            //skip the line
        }
    }
    fileReader.close();
    return courses;
}
```

Note that in the `CourseRecordIO.writeCourseRecords()` code in the last section, you already used your `ArrayList`.  `for` loops are an excellent tool for working with the elements of an `ArrayList`.  Instead of using the array's length, you get the `ArrayList`'s `size()`.  You can use the `get()` method to get the element at index `i`.

 
## Push to GitHub
You've added functionality to `CourseRecordIO`, but it's not yet complete. Before moving on to the next portion of the Guided Project, complete the following tasks:

  * Javadoc `CourseRecordIO`
  * Add the unstaged changes to the index.
  * Commit and push changes.  Remember to use a meaningful commit message describing how you have changed the code.  Try writing your own commit message for this push!
  
{% capture callout_content %}
GitHub Resources:

  * [Staging Files](../git-tutorial/git-staging)
  * [Committing Files](../git-tutorial/git-commit)
  * [Pushing Files](../git-tutorial/git-push)
{% endcapture %}
{% include callout.html content=callout_content icon="vcTool" type="reminder" title="Reminder: Staging and Pushing to GitHub" %}