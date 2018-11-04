
<?php
session_name("max");
session_start();

$titre = array(
	"Nom du fichier",
	"Date de modification",
	"taille"
);

$tab = array(
	array("date.php",
            "01-10-2018",
            "1856"),
	array("tableau.php",
            "01-10-2018",
            "1875")
);


function listeFichier(){
	$i = 0;
	$fichierPhp = glob("*.php");
	foreach ($fichierPhp as $fileName) {
		$tab[$i][0] ='<a href="http://localhost/tp2/'.$fileName.'">'.$fileName.'</a>';
		$tab[$i][1] = date("d-m-Y",filemtime($fileName));
		$tab[$i][2] = filesize($fileName);
		$i++;
	}
	if(isset($_GET['tri'])){
		if($_GET['tri'] == 'reverse'){
			rsort($tab);
		}
		else{
			sort($tab);
		}
	}
	return $tab;
}


/*print_r(var_dump($tab));
print_r(var_dump($titre));*/


function genereTableau($title,$body){
	$codeHtml =  '<table border = "1">
		<caption> nombre de ligne du tableau : '.count($body).'</caption>
		<thead>
			<tr>';
				for($i = 0; $i < count($title); $i++){
					$codeHtml .= "<td>".$title[$i]."</td>";
				}
			$codeHtml .= '</tr>
		</thead>
		<tbody>';
			for ($i=0; $i < count($body); $i++) { 

				$codeHtml .= '<tr>';
				for ($j=0; $j < count($body[$i]); $j++) { 

					$codeHtml .= '<td>'.$body[$i][$j].'</td>';
				}
				$codeHtml .= '</tr>';
			}
			$codeHtml .= 
		'</tbody>
	</table>';
	return $codeHtml;
}


?>




<!doctype html>

<html lang="fr">
	<?php
	include("entetes.php"); 
	echo head("tableau");
	?>
	<body>
		<?php
		echo genereTableau($titre,listeFichier());
		?>
	</body>
</html>