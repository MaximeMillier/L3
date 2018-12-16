<?php

$chemin = $_GET["chemin"];

if(is_dir($chemin)){
  if ($dir = opendir($chemin)) {
    $i = 0;
    while(($file = readdir($dir)) !== false) {
      $tabChemin[$i] = [$file, filetype($chemin . "/" . $file)];
      $i++;
    }
    header('Content-type: application/json');
    echo json_encode($tabChemin);
    closedir($dir);
  }
}
elseif (is_file($chemin)){
  $fileContent = file_get_contents($chemin);
  echo json_encode($fileContent);
}
else{
  echo "-1";
}

?>
