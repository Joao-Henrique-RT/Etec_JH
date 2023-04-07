<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar contato</title>
    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:ital@1&display=swap" rel="stylesheet">
</head>
<body>

<?php
    session_start();
    if(isset($_SESSION['msg'])){
        echo $_SESSION['msg'];
        unset(($_SESSION)['msg']);
    }



?>


    
    <fieldset id="form-cad-contato">
    <legend>Cadastrar novo contato</legend>

    <form action="cad_contato.act.php" method="post"> 
    <p>Nome: <input type="text" name="nome" id="" placeholder="João Abravanel"></p>
    <p>Email: <input type="email" name="email" id="" placeholder="Abravanel@sbt.com"></p>
    <p>Telefone: <input type="text" name="telefone" id="" placeholder="20539635"></p>
    <p>Estado: <input type="text" name="estado" id="" placeholder="São Paulo"v></p>
    <p>RG: <input type="number" name="rg" id="" placeholder="123-456-78-0"></p>
    <p><input type="submit" value="Registrar"></p> 
    </form>
    </fieldset>

 








</body>
</html>