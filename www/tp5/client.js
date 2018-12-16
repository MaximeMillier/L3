
function ask(str) {
    xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function() {
        if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
            var tabChemin = JSON.parse(xmlhttp.responseText);
            if(document.getElementById("tab") != null)
              document.getElementById("tab").remove();
            var table = document.createElement("TABLE");
            table.setAttribute("id", "tab");
            table.style = "border : black solid thin"

            //parcours tout les elements de file[item, type(file,dir...)]
            tabChemin.forEach((file) => {
              var tr = document.createElement("TR");
              var td1 = document.createElement("TD");
              var td2 = document.createElement("TD");
              td2.innerHTML = "helloWorld";
              if(file[1] === "dir"){
                 td1.style.color = "green";
                 td1.onclick = (
                   (function(td1){
                     return function(){
                       ask(str + '/' + td1.innerHTML);
                     }
                   })
                 (td1));
              }
              else if(file[1] === "file"){
                td1.onclick = (
                  (function (td1) {
                      return function () {
                          if (event.button <= 1) {
                              try {
                                  fileContent(str + '/' + td1.innerText);

                              } finally {
                                  event.stopPropagation();
                                  event.preventDefault();
                              }
                          }

                      };
                  })
                      (td1));
              }
              td1.innerHTML = file[0];
              tr.appendChild(td1);
              tr.appendChild(td2);
              table.appendChild(tr);
            });

            //on colle l'element table au body
            document.body.appendChild(table);
        }
    };
    xmlhttp.open("GET","serveur.php?chemin=" + str,true);
    xmlhttp.send();
}


function fileContent(str) {
  xmlhttp=new XMLHttpRequest();      
  xmlhttp.onreadystatechange=function() {
     if (xmlhttp.readyState==4 && xmlhttp.status==200) {
      if(document.getElementById("contentFile") != null)
        document.getElementById("contentFile").remove();
     }
     var table = document.createElement("TABLE");
     var td = document.createElement("TD");
     if (str.endWith(".png") || str.endWith(".jpg") || str.endWith(".gif")){
       var img = document.createElement("IMG");
       img.src = str;
       td.appendChild(img);
     }
     else if(str.endWith(".mp3") || str.endWith(".wav")){
       var audio = document.createElement("AUDIO");
       audio.src = str;
       audio.conrols = true;
       td.appendChild(audio);
     }
     else{
       td.innerHTML = JSON.parse(xmlhttp.responseText);
     }
     table.appendChild(td);
  }
  xmlhttp.open("GET","serveur.php?q="+str,true);
  xmlhttp.send();
}

