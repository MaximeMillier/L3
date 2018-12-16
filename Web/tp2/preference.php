
<?php 

session_name("max");
session_start();


include("entetes.php");

if (isset($_POST['styleSheet'])) {
		$_SESSION['css'] = $_POST['styleSheet'];
	}


function select(){
	$nbCSS = glob("*.css");
	$codeHtml = '<select name="styleSheet">';
	foreach ($nbCSS as $fileName) {
		if (isset($_POST['styleSheet']) && $_POST['styleSheet'] == './'.$fileName){
			$codeHtml .= '<option value='.'./'.$fileName.' selected>'.$fileName.'</option>';
		}
		else{
			$codeHtml .= '<option value='.'./'.$fileName.'>'.$fileName.'</option>';
		}
	}
	$codeHtml .= '</select>
	<input type="submit" name="submit">';
	return $codeHtml;
}

?>

<!doctype html>
<html>
    <?php 
    echo head("preference");
    ?>
    <link rel="stylesheet" type="text/css" href=".\nav\nav.css">
    <body>
    	<form action="preference.php" method="post">
    		<p>
    			<?php echo select()?>
    		</p>
    	</form>
    </body>
</html>