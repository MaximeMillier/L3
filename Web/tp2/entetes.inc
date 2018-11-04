<?php 

include("bandeau.php");
$bandeau = new Bandeau();

function head($title){
    $codeHTML = 
    '<head>
        <title>'.$title.'</title>
        <meta charset="utf-8">';
    if (isset($_SESSION['css'])) {
        echo '<link rel="stylesheet" type="text/css" href="./'.$_SESSION['css'].'">';
        }
    $codeHTML .= 
    '</head>';
}

?>









