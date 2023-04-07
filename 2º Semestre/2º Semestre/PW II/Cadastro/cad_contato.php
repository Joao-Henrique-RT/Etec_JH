<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilo-principal.css">
    <title>Cadastrar Contato</title>
</head>
<body>
    
<?php
    session_start();
    if(isset($_SESSION['msg'])){
        echo $_SESSION['msg'];
        unset($_SESSION['msg']);
    }
    ?>


    <fieldset id="form-cad-contato">
            <legend>Cadastrar novo contato</legend>

            <form action="cad_contato.act.php" method="post" enctype="multipart/form-data">
                <p>Nome: <input type="text" name="nome" id="" placeholder=" Nome Sobrenome" ></p>
                <p>Email: <input type="text" name="email" id="" placeholder="email@gmail.com"></p>
                <p>Telefone: <input type="text" name="telefone" id="" class="Tel" placeholder="(00) 0000-0000"></p>
                <p> <label for="fileFoto" id="lblFoto">Foto</label>
                <p><input type="file" name="foto" id="fileFoto"></p>
                <p> <input type="submit" value="Gravar"></p>
            </form>
    </fieldset>


</body>
</html>