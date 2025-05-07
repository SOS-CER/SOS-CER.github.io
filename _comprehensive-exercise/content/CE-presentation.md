# Presentation

{% if site.data.comprehensive-exercise.in-class-demo %}
On Day 4, you will present your exercise to the class. You will have four minutes to present your work.

You are expected to be a respectful audience member for all presentations for your given section. During presentations, your computer monitor should be turned off and you should not be using your phone, tablet, etc.
{% endif %}

{% if site.data.comprehensive-exercise.in-class-presentation %}
On Day 4, you will present your completed exercise to the class. Each group will have ten minutes to present their work; minimum length of group presentation is seven minutes. Each student must present for at least two minutes of the presentation.

You are expected to attend all presentations for your given section. During presentations, your computer monitor should be turned off and you should not be using your phone, tablet, etc. Along with being a respectful audience member, you will provide a peer review to each fellow group about their presentation.
{% endif %}

{% if site.data.comprehensive-exercise.video-presentation %}

With your final submission, you will submit a video presentation. Each group's video should be between five minutes and seven minutes. Each student must present for a least one minute of the presentation. For the video, please include video of speaker and state who is speaking.

{% endif %}


{% if site.data.comprehensive-exercise.in-class-demo %}

For the presentation, you should discuss (1) lessons learned, (2) requirements of your project, and (3) design decisions.

{% else %}

For the presentation, you should have slides that describe the basics of what the software does (requirements/analysis phase), the basics of your groups’ design options and decisions (design phase), and the basics of the testing of your software. You should also complete a live demo of your software.

{% endif %}


## TASK: Presentation Preparation
{% include iconHeader.html type="teamTask" %}


In the journal portion of the comprehensive exercise report, we have provided you with prompts that can help as you plan your presentation.

{% if site.data.comprehensive-exercise.in-class-demo %}

### Tips for Presenting

* Introduce your group and group members to the class.
* Overall description of the final project.
* Demo your software's functionality.
* Have a scripted demo.
* Have a backup (screenshots) if your live demo does not work!
* Lessons learned (i.e., programming concepts, software process).
* Run through your demo multiple times for practice!
* Someone else should be driving the demo on the computer while other group member(s) describe the demo.
* Answer technical questions from the audience.
* **Practice your presentation!**
* Make sure you know what you want to say for each portion of the presentation.
* Make sure you are within the time limit.

### Tips for Slides

* Make sure that slides are easy to read.
* Choose simple backgrounds.
* Do not use crazy colors.
* Use minimal words.
* Lots of pictures and screenshots.
* Talk to the audience about images on screen.


{% else %}

### Tips for Slides

* Make sure that slides are easy to read.
* Choose simple backgrounds.
* Do not use crazy colors.
* Use minimal words.
* Lots of pictures and screenshots.
* Talk to the audience about images on screen.

### Tips for Presenting

* Introduce your group and group members to the class.
* Overall description of the final project.
* Describe your process.
* Requirement assumptions/additions.
* Design options and decision.
* Tests (e.g., what you tested, equivalence classes).
* Lessons learned (i.e., programming concepts, software process).
* Demo your software's functionality..
* Have a backup (screenshots) if your live demo does not work!
* Run through your demo multiple times for practice!
* Have a scripted demo.
* Someone else should be driving the demo on the computer while other group member(s) describe the demo.
* Answer technical questions from the audience.
* **Practice your presentation!**
* Make sure you know what you want to say for each slide.
* Make sure you are within the time limit.

{% endif %}

{% if site.data.comprehensive-exercise.in-class-presentation %}

{% capture presenting %}
It is recommended that you connect your laptop to the projector with the HDMI cable. 

If you are not using a laptop, please have everything prepped in your afs space so that you can log into the instructor machine in the classroom. 
{% endcapture %}
{% include callout.html type="reminder" title="Presenting Recommendation" content=presenting %}


{% endif %}


{% if site.data.comprehensive-exercise.video-presentation %}

## TASK: Recording Video
{% include iconHeader.html type="teamTask" %}

* Videos can be recorded and shared via [Zoom cloud recording](https://support.zoom.us/hc/en-us/articles/203741855-Cloud-recording){:target="_blank"}
* Once video is recorded, include a link to video in your repo's README.md. Make sure teaching staff will be able to access the video.

{% endif %}