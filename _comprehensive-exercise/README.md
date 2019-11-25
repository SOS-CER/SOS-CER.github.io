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
      layout: CE-page
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
     - project-selection
     - team-repo
     - team-documentation
     - software-life-cycle
     - requirements
     - black-box-testing
     - design
     - implementation
     - testing
     - presentation
     - grading-rubric
```

### _data/comprehensive-exercise.yml

Complete with appropriate information, which will be used to generate the comprehensive exercise pages. 

* `course`: name of course
* `course-short`: course identifier
* `github`: location of repos (e.g, https://github.com/ or https://github.ncsu.edu)
* `git-guide`: link to guide for github (e.g., https://sos-cer.github.io/projects/git-guide/)
* `ce-report`: link to starter report document (e.g., https://docs.google.com/document/d/1nVE-EcJSmRHaTuUsOESkdyV_5EyH-Spjiad-sQilVvc/edit#)
* `re-reflection`: link for requirements reflection
* `re-resources`: requirements resources (such as links to slides, videos, or readings). Each resource has title and url along with optional note.
* `bbt-reflection`: link for black box testing reflection 
* `testing-resources`: testing resources (such as links to slides, videos, or readings). Each resource has title and url along with optional note.
* `design-reflection`: link for design reflection
* `design-resources`: design resources (such as links to slides, videos, or readings). Each resource has title and url along with optional note.
* `imp-test-reflection`: link for implementation and testing reflection 
* `imp-resources`: implementation resources (such as links to slides, videos, or readings). Each resource has title and url along with optional note.

### _includes

* breadcrumb.html* callout.html* iconHeader.html* navigation.html* printable-group.md* tableOfContents.html* topButton.html

### _layouts

* CE-page.html

### assets
* css    * algorithm.scss    * breadcrumb_styles.scss    * calendar.scss    * callout_styles.scss    * csc_styles.css    * expand.scss    * github-light.css    * java.scss    * jump_styles.scss    * mention_styles.scss    * sidebar.scss    * stylesheet.scss    * syntax.css    * table_styles.scss    * terminal.scss    * text.scss* images
    * bg_hr.png

### _comprehensive-exercise

You will need to update the following files:

- index.md
	- Mentions CSC116 - would need to update with correct course and any changes to policy (such as attendance)
	- Updates to schedule if changing number of days 
	- Update due dates and source sections
- project-selection.md 
    - Add or remove project ideas
    - We have only included the project descriptions written by our teaching staff. We typically also include a couple non-game project descriptions that come from various textbooks.
- team-repo.md 
    -  Update repo naming, which currently includes csc116
- presentation.md
    - Update if different schedule and presentation is not on Day 4. 
    - Update "Recommendation" callout box with appropriate information

The client-ideas directory is not visible through the website. These markdown files are copied into team repos when projects are selected and updates are given.


## Instructor TODOs

- Set up website as described above.
- Create starter report document. We provide our starter document [here](https://docs.google.com/document/d/1nVE-EcJSmRHaTuUsOESkdyV_5EyH-Spjiad-sQilVvc/edit#).
- Assign teams and repos.
- Set up reflection forms (and include links in _data/comprehensive-exercise.yml).
- Set up presentation peer review form.
- Set up Peer Evaluation for teams.
- After a team selects project based on short descriptions in (project-selection), push full client idea (from client-ideas directory) to team repo.
- After Design in journal and before formal design, each team should discuss their design with teaching staff. After discussion, push updated client idea (from client-ideas directory) to team repo.
