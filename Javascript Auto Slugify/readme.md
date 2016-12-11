* **Requirement:** Jquery, eg: https://code.jquery.com/jquery-1.11.0.min.js
* **Demo:** https://jsfiddle.net/agaust/xht31h97/

```js
<input type="text" class="title" placeholder="Type anything..">
<input type="text" class="slug">

function slugify(text) {
    // https://gist.github.com/mathewbyrne/1280286
    return text.toString().toLowerCase()
      .replace(/\s+/g, '-')           // Replace spaces with -
      .replace(/[^\w\-]+/g, '')       // Remove all non-word chars
      .replace(/\-\-+/g, '-')         // Replace multiple - with single -
      .replace(/^-+/, '')             // Trim - from start of text
      .replace(/-+$/, '')             // Trim - from end of text
      .replace(/[\s_-]+/g, '-');      // swap any length of whitespace, underscore, hyphen characters with a single -
}

$('.title').keyup(function(){
    //console.log($(this).val());
    $slug = slugify($(this).val());
    $('.slug').val($slug);
})
```
