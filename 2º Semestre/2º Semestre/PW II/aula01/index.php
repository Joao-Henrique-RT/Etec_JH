<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página PHP</title>
</head>
<body>
    <?php

    $nome = "Eric Fofon";
    
    echo "<p>Vai rodando e vai ganhando</p>";

    $x = rand(0,60);
    $y = rand(0,60);
    $a = rand(0,60);
    $b = rand(0,60);
    $c = rand(0,60);
    $d = rand(0,60);    

while($x != $y && $x != $a && $x != $b && $x != $c && $x != $d && 
      $y != $a && $y != $b && $y != $c && $y != $d &&
      $a != $b && $a != $c && $a != $d &&
      $b != $c && $b != $d &&
      $c != $d){
     
    echo "<p> $x - $y - $a - $b - $c - $d </p>";
    break;
}

    /*
    $x = manhã;
    $y = 5;    
    $soma = $x + $y;
    
    echo "A soma é $soma";
    */

   /* $fixa = 11;*/

     /* while(!$x === $y){
        echo "$x $y";
        break;
    $d = rand(0,10);    } ?>*/
?>


</body>
</html>