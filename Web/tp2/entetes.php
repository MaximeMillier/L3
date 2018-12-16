<?php 
include("bandeau.php");



function head($title){
    $bandeau = new Bandeau();
    $codeHTML = 
    '<head>
        <title>'.$title.'</title>
        <meta charset="utf-8">';
    if (isset($_SESSION['css'])) {
        echo '<link rel="stylesheet" type="text/css" href="./'.$_SESSION['css'].'">';
    }
    $codeHTML .= $bandeau->genererBarNav();
    $codeHTML .= '</head>';
    return $codeHTML;
}


?>









