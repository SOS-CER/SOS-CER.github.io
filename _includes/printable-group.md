{% assign thisGroup = site.data.pagegroups[page.pagegroup] %}

{% assign directory = thisGroup.directory %}

{% capture final %}
{% endcapture %}
<div id="printable">
{% for aPage in thisGroup.order %}
{% capture full %}
{% include_relative {{aPage}}.md %}
{% endcapture %}
{% assign full = full | replace: '[Printable version]','<!-- [Printable version]' %} 
{% assign full = full | remove: '## References' %} 
{% assign full = full | remove: '## Footnotes' %} 
{% assign raw = full | replace_first: '---','<!--' | replace_first: '---','-->' %} 
{% assign final = final | append: raw %}
{% endfor %}
{{ final | markdownify }}
</div>