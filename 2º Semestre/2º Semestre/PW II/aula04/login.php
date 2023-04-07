<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
</head>
<body>
    <?php include('menu.php'); ?>
    <?php
        @session_start();
        if(isset($_SESSION['msg'])){
            echo "<p class=alert>$_SESSION[msg]</p>";
            unset($_SESSION['msg']);
        }
    ?>
    <fieldset id="form-cad-contato">
        <legend>Login</legend>
    <form action="login.act.php" method="post" id="" enctype="multipart/form-data" >
        <p>Email:  <input type="text" name="email" id=""></p>
        <p>Senha:<input type="password" name="senha" id=""> </p> 
        <p> <input type="submit" value="Entrar"></p>
    </form>
    </fieldset>



    <footer>By: Alisson Almeida</footer>
</body>
</html>