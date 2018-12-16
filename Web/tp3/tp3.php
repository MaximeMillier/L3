<?php

$opts = array('http'=>array('header'=>"User-Agent: StevesCleverAddressScript 3.7.6\r\n"));
$context = stream_context_create($opts);

$url = "https://nominatim.openstreetmap.org/search?q=";
if (isset($_POST['num_rue'])) {
  $url .=$_POST['num_rue'];
}
if (isset($_POST['nom_rue'])) {
  $url .= ','.urlencode($_POST['nom_rue']);
}
$url .= ','.$_POST['ville']."&format=json";


$json = file_get_contents($url,false,$context);
$parsed_json = json_decode($json);






function createBbox($parsed_json){
  $opts = array('http'=>array('header'=>"User-Agent: StevesCleverAddressScript 3.7.6\r\n"));
  $context = stream_context_create($opts);

  for ($i=0; $i < sizeof($parsed_json); $i++) {
    $bbox = $parsed_json[$i]->{'boundingbox'};
    $HTMLbbox = '<iframe style="border: none;box-shadow: 1px 1px 3px black;float: left; margin: 0 2em 2em 0;width:600px; height:480px;" src=';
    $HTMLbbox .= "http://www.openstreetmap.org/export/embed.html?bbox=".$bbox[2].'%2C'.$bbox[0].'%2C'.$bbox[3].'%2C'.$bbox[1]."&amp;layer=mapnik";
    $HTMLbbox .= '></iframe>';
    echo $HTMLbbox;

    $lat = $parsed_json[$i]->{'lat'};
    $lon = $parsed_json[$i]->{'lon'};
    $urlMeteo = 'http://www.infoclimat.fr/public-api/gfs/json?_ll=' . $lat . ',' . $lon . '&_auth=AhhTRFQqBCZRfAcwD3kGL1Y%2BATRaLAIlC3dVNg5gUSwDZ1YyBGRcP1I%2BAH1Vegc0BShUNg43U20HZAtkWCoEeAJjUz5UPgRmUToHYQ8%2FBi1WegF8WmQCJQt3VToOYFEsA2FWMwRkXCBSPwBnVWEHLQU%2FVDQOLlN0B2ULaFg9BGcCaVMwV%20DIEZlE%2BB2UPIAYtVmABaVphAj4LbVVgDjVROgNpVjoEM1xsUjkAYVV7BzQFMVQzDjlTaQdjC25YNgR4An5TTlREBHtRfgcnD2oGdFZ4ATRaOwJu&_c=a4c69e2851123ac57a2cabb4a6ad2608';

    $date_heure = date('Y-m-d 13:00:00');
    $jsonMeteo = file_get_contents($urlMeteo,false,$context);
    $parsed_jsonMeteo = json_decode($jsonMeteo);

    $meteo = "Temperature :".$parsed_jsonMeteo->{$date_heure}->{'temperature'}->{'sol'}." ".
    "Pluie : ".$parsed_jsonMeteo->{$date_heure}->{'pluie'}." ".
    "Humidité : ".$parsed_jsonMeteo->{$date_heure}->{'humidite'}->{'2m'}." ".
    "Vent Moyen : ".$parsed_jsonMeteo->{$date_heure}->{'vent_moyen'}->{'10m'}." ".
    "Risque de neige : ".$parsed_jsonMeteo->{$date_heure}->{'risque_neige'}."</br>";

    echo $meteo;

  }
}

?>









<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>NTM</title>
</head>
<body>
  <form action="tp3.php" method="post">
    <p>
      <label>numéro de rue :</label>
      <input type="text" name="num_rue"
      placeholder="(optionnel)"
      />
    </p>
    <p>
      <label> nom de rue :</label>
      <input type="text" name="nom_rue"
      placeholder="(optionnel)"
      />
    </p>
    <p>
      <label>ville :</label>
      <input type="text" name="ville"/>
    </p>
    <p>
      <input type="submit" name="ok"/>
    </p>
  </form>
  <p>
  </p>
  <?php echo createBbox($parsed_json);
  ?>
</body>
</html>
