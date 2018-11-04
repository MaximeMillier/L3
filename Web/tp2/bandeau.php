<!DOCTYPE>
<?php

class Bandeau {


public static $map = array(
	array("date.php", "Affichage de la date"),
	array("tableau.php", "Plan du site"),
	array("preference.php", "Choix du style")
);
	

	private function genererLien($href, $name){
		$lien = '<div class="lien"><a href='.$href.'>'.$name.'</a></div>';
		return $lien;
	}

	public function genererBarNav(){
		$i = 0;
		$codeHTML = "";
		foreach (Bandeau::$map as $fileName) {
			$codeHTML .= "<div id='barrenavigation'>".$this->genererLien(Bandeau::$map[$i][0],Bandeau::$map[$i][1]).'</div>';
			$i++;
		}
		$codeHTML .= '<link rel="stylesheet" type="text/css" href="style/nav.css">';
		return $codeHTML;
	}

}


?>

