<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Área círculo</title>
</head>
<body>
    
    <?php
    extract($_POST);
    echo "<p> Valor de PI: 3,14</p>";
    echo "<p> O raio do circulo é: $raio";

    $area = 3.14* ($raio* $raio);
    echo "<p> A área do Círculo é: $area</p>";

    ?>

</body>
</html>