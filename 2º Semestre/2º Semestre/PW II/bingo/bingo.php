
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        p{
            float:left;
            border:double 4px black;
            padding:15px;
            margin:10px;
        }
    </style>
</head>
<body>
<form method="post">
    <input type="submit" value="Sortear" name="bt-sortear">
    <input type="submit" value="Limpar" name="bt-limpar">
</form>
<?php
    session_start();
        if(isset($_POST['bt-limpar'])){
            $_SESSION['numeros'] = array();    
        }
    if(!isset($_SESSION['numeros'])){
        $_SESSION['numeros'] = array();
    }
    if(isset($_POST['bt-sortear'])){
        $tamanho = sizeof($_SESSION['numeros']);
        $sorteado = rand(1,10);
        if(in_array($sorteado,$_SESSION['numeros'])){
            echo "<p>Número repetido $sorteado </p>";
        }
        $_SESSION['numeros'][$tamanho] = $sorteado;
        sort($_SESSION['numeros']);
        
        foreach($_SESSION['numeros'] as $num){
            echo "<p>$num</p>";
        }   
    }
?>

</body>
</html>