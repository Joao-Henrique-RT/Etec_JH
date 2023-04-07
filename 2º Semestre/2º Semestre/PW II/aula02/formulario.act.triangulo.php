<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Área do Triângulo</title>
</head>
<body>
    
<?php
    
/*$_POST['base'];
$_POST['altura'];
var_dump($_POST);*/

extract($_POST);
echo "<p>Base é: $base</p>";
echo "<p>Altura é: $altura</p>";

$area = $base * $altura / 2;

echo "<p>A área do Triângulo é: $area</p>";

?>

</body>
</html>