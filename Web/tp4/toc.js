window.onload = toc;

function toc(){
  let a,tr,li,ul2;
  var table = document.createElement('table');
  var tag = document.body.firstChild;
  var ul = document.createElement('ul');


  while(tag){
    if (tag.tagName === 'H1' || tag.tagName === 'H2') {
      tr = document.createElement('tr');
      a = document.createElement('a');
      li = document.createElement('li');

      if(tag.id === ""){
        tag.setAttribute("id",tag.innerHTML);
      }

      a.innerHTML = tag.innerHTML;
      a.setAttribute("href","#" + tag.id);
      eventListener(a,tag.tagName);

      if (tag.tagName === 'H2'){
        ul2 = document.createElement('ul');

        li.appendChild(a);
        ul2.appendChild(li);
        tr.appendChild(ul2);
        ul.appendChild(tr);
        table.appendChild(ul);
      }
      else {
          li.appendChild(a);
          tr.appendChild(li);
          ul.appendChild(tr);
          table.appendChild(ul);
      }
    }
    tag = tag.nextSibling;
  }
  document.body.insertBefore(table,document.body.firstChild);
}


function eventListener(node,tagName){
  var background;
  if (tagName === "H1") {
    background = "background-color:red;"
  }
  else {
    background = "background-color:blue;"

  }
  node.addEventListener('mouseover',function(){
    document.getElementById(node.getAttribute("href").slice(1)).setAttribute("style",background);});
  node.addEventListener('mouseleave',function(){
    document.getElementById(node.getAttribute("href").slice(1)).removeAttribute("style",background);})
}
