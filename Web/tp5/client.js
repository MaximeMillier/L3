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
            var td = document.createElement("TD");
            if(file[1] === "dir"){
               td.style.color = "green";
               td.onclick = (
                 (function(td){
                   return function(){
                     ask(str + '/' + td.innerText);
                   }
                 })
               (td));
            }
            else if(file[1] === "file"){
              td.onclick = (
                (function (td) {
                    return function () {
                        if (event.button <= 1) {
                            try {
                                fileContent(str + '/' + td.innerText);

                            } finally {
                                event.stopPropagation();
                                event.preventDefault();
                            }
                        }

                    };
                })
                    (td));
            }
            td.innerText = file[0];
            tr.appendChild(td);
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
    if(document.getElementById("contentFile") != null){
      document.getElementById("contentFile").remove();
    }
    var table = document.getElementById("tab");
   var cpt = document.getElementsByTagName("TR").length;
   var td = document.createElement("TD");
   if (str.endsWith(".png") || str.endsWith(".jpg") || str.endsWith(".gif")){
     var img = document.createElement("IMG");
     img.src = str;
     td.appendChild(img);
   }
   else if(str.endsWith(".mp3") || str.endsWith(".wav")){
     var audio = document.createElement("AUDIO");
     audio.src = str;
     audio.conrols = true;
     td.appendChild(audio);
   }
   else{
     td.innerText = JSON.parse(xmlhttp.responseText);
   }
   td.setAttribute("id","contentFile");
   td.setAttribute("rowspan","cpt");
   table.firstChild.appendChild(td);
 }
}
xmlhttp.open("GET","serveur.php?chemin="+str,true);
xmlhttp.send();
}