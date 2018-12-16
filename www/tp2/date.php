
<?php


session_name("max");
session_start();

include("entetes.php");

$date_heure = date('d/m/Y h:i:s');

function day_date($temps_total){
    $j = floor($temps_total / 86400);
    $s = $temps_total % 86400;
    echo " $j jours et $s secondes";
}


function compare_date(){
    if(strtotime($_POST["date"]) > strtotime("now")){
        return day_date(strtotime($_POST["date"]) - strtotime("now"));
    }
    return day_date(strtotime("now") - strtotime($_POST["date"]));
}


function date_en_fr($date_en){
    $date = explode("-", $date_en);
    $mois_fr = array('janvier','fevrier','mars','avril','mai','juin','juillet','aout','septembre','octobre','novembre','decembre');
    echo $date[2]," ",$mois_fr[$date[1] - 1]," ",$date[0];
}
?>






<!DOCTYPE html>

<html>
    <?php 
    echo head('date');
    ?>
    <body>
        <h1>La Date</h1>
        <p>La date d'aujourd'hui est <?php echo $date_heure; ?></p>
        <p>Temps restant avant le 01/11/18 : 
            <?php day_date(strtotime("01 november 2018") - strtotime("now"))?></p>
        <form action="date.php" method="post">
            <p>
                <input type="date" name="date">
                <input type="submit" value="ok">
            </p>
        </form>
        <?php
        if (isset($_POST["date"])) {
            date_en_fr($_POST["date"]);
            compare_date();
        }?>
    </body>
</html>