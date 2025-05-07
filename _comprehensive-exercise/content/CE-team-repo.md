# Submitting Exercise

You should push all code and slides (pptx or pdf) to GitHub prior to the submission deadline. Note that you will *not* be able to submit after the deadline as the GitHub repo permissions will be changed to read only. You will submit the final version of your report to Gradescope.

You will have a link to your [report](#team-documentation) within team repo's README.md. You will share your planning document with the teaching staff via Google Drive. For the final version of your report, you will submit a PDF of the report via Gradescope.

{% if site.data.comprehensive-exercise.video-presentation %}
You will have a link to your presentation video within team repo's README.md.
{% endif %}

## Team GitHub Repository

Each team has been assigned a [GitHub Repository]({{site.data.comprehensive-exercise.github}}){:target="_blank"} for the Comprehensive Exercise. Everything for the exercise will be submitted via GitHub and Gradescope. The repositories are named `csc116-AAA-CE-BB`, where `AAA` is your section number and `BB` is your team number.

You should refer to the [Git Guide]({{site.data.comprehensive-exercise.git-guide}}){:target="_blank"} for the use of GitHub.

At a **minimum**, you should push your work to GitHub at the end of each class period (though you should be pushing *much* more frequently<!--- -- as a rule of thumb, you should only push code that compiles successfully--->).

Push your `CE` project directory:

```
Repo (e.g., csc116-001-CE-73)
 -> README.md
 -> CE
    -> src 
        -> (source code)
    -> test
        -> (JUnit tests)
    -> lib 
        -> junit jar file
    -> bin
    -> project_docs
        -> (Slides - pptx or pdf)
    -> test-files
        -> (Any test files that are needed)
``` 

Within README.md, the team should log the tasks for each team member.

{% capture GitHubHints %}

GitHub has features that may help you as you work in teams:

* [Project boards](https://docs.github.com/en/free-pro-team@latest/github/managing-your-work-on-github/about-project-boards){:target="_blank"} for noting and assigning tasks.
* [Wikis](https://docs.github.com/en/free-pro-team@latest/github/building-a-strong-community/about-wikis){:target="_blank"} for documenting your work or planning how to split tasks between team members.
* [Issues](https://docs.github.com/en/free-pro-team@latest/github/managing-your-work-on-github/about-issues){:target="_blank"} for tracking tasks and bugs.

You are not required to use any of these features, but the features are available in each of your assigned repos if you would like to use them.

{% endcapture %}
{% include expand.html title="Expand for Helpful GitHub Features" content=GitHubHints %}