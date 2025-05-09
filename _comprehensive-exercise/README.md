# Comprehensive Exercise

The generated website can be viewed at <https://sos-cer.github.io/comprehensive-exercise/>. The website was created for use with GH-pages using Jekyll static website generator.

## Posting Comprehensive Exercise

To post the Comprehensive Exercise for your students on your own [GH-Pages](https://pages.github.com/) site, you will need the following directories and files in your repo:

### _config.yml

Configuration for the site must include the following:

```
  -
    scope:
      path: ""
      type: "comprehensive-exercise"
    values:
      layout: side
```
 
```
     comprehensive-exercise:
        output: true 
```


### _data/pagegroups.yml

Must include the following for the comprehensive exercise

```
comprehensive-exercise:
    directory: _comprehensive-exercise/
    order:
     - index
```

### _data/comprehensive-exercise.yml

Complete with appropriate information, which will be used to generate the comprehensive exercise pages. 

* `course`: name of course
* `course-short`: course identifier
* `github`: location of repos (e.g, https://github.com/ or https://github.ncsu.edu)
* `git-guide`: link to guide for github (e.g., https://sos-cer.github.io/projects/git-guide/)
* `ce-report`: link to starter report document (e.g., http://go.ncsu.edu/csc116-ce-report)
* `project-selection-form`: link to form for selecting project
* `re-reflection`: link for requirements reflection
* `re-resources`: requirements resources (such as links to slides, videos, or readings). Each resource has title and url along with optional note.
* `bbt-reflection`: link for black box testing reflection 
* `testing-resources`: testing resources (such as links to slides, videos, or readings). Each resource has title and url along with optional note.
* `design-reflection`: link for design reflection
* `design-resources`: design resources (such as links to slides, videos, or readings). Each resource has title and url along with optional note.
* `imp-test-reflection`: link for implementation and testing reflection 
* `imp-resources`: implementation resources (such as links to slides, videos, or readings). Each resource has title and url along with optional note.
* `in-class-demo`: whether the exercise includes an in-class demo
* `assign-report`: whether teaching staff will assign report document to team
* `section`: section of the course
* `day1`: date of Day 1 of exercise
* `day2`: date of Day 2 of exercise
* `day3`: date of Day 3 of exercise
* `day4`: date of Day 4 of exercise
* `deadline`: deadline for assignment
* `support-list`: support email address

### _includes

* breadcrumb.html* callout.html
* expand.html
* footer.html
* head.html
* header.html* iconHeader.html* navigation.html* printable-group.md* tableOfContents.html
* toc.html* topButton.html

### _layouts

* side.html

### assets
* css    * algorithm.scss    * breadcrumb_styles.scss    * calendar.scss    * callout_styles.scss    * csc_styles.css    * expand.scss    * github-light.css    * java.scss    * jump_styles.scss    * mention_styles.scss    * sidebar.scss    * stylesheet.scss    * syntax.css    * table_styles.scss    * terminal.scss    * text.scss* images
    * bg_hr.png
    * file
    * icons
    * phases

### _comprehensive-exercise

You will need to update the following files:

- index.md
	- Updates to policy (such as attendance)
	- Updates to schedule if changing number of days 
	- Update due dates and source sections
- project-selection.md 
    - Add or remove project ideas
    - We have only included the project descriptions written by our teaching staff. We typically also include a couple non-game project descriptions that come from various textbooks.
- CE-team-repo.md and CE-submitting.md
    -  Update repo naming, which currently includes csc116
- presentation.md
    - Update if different schedule and presentation is not on Day 4. 
    - Update "Recommendation" callout box with appropriate information

The client-ideas directory is not visible through the website. These markdown files are copied into team repos when projects are selected and updates are given.


## Instructor TODOs

- Set up website as described above.
- Create starter report document. We provide our starter document [here](http://go.ncsu.edu/csc116-ce-report).
- Assign teams and repos.
- Set up reflection forms (and include links in _data/comprehensive-exercise.yml).
- Set up presentation peer review form.
- Set up Peer Evaluation for teams.
- After a team selects project based on short descriptions in (project-selection), push full client idea (from client-ideas directory) to team repo.
- After Design in journal and before formal design, each team should discuss their design with teaching staff. After discussion, push updated client idea (from client-ideas directory) to team repo.
