<?php
$x = "PHP5";
echo $x."</br>";
$a[] = &$x;
print_r(var_dump($a));
$y = " 6 eme version de PHP";
echo $y."</br>";
$z = $y*10;
echo $z."</br>";
$x .=$y;
echo $x."</br>";
$y *= $z;
echo $y."</br>";
$a[0]= "MySQL";
print_r(var_dump($a));
?>