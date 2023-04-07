<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="styleheet" href="estilo-princiapl.css">
</head>
<body>

    <?php include('menu.php'); ?>

    <?php
    $codigo = $_GET['cod'];
    require('connect.php');
    $busca = mysqli_query($con, "Select * from `tb_contatos` where `codigo` ='$codigo'");
    $contato = mysqli_fetch_array($busca);
    echo $contato['nome'];
    ?>

<fieldset id="form-cad-contato">

            <legend>Cadastrar novo contato</legend>

            <form action="alterar.act.php" method="post" enctype="multipart/form-data">
                <input type="hidden" name="codigo" value="<?php echo $contato['codigo'] ?>">
                <input type="hidden" name="foto_anterior" value="<?php echo $contato['foto'] ?>">
                <p>Nome: <input type="text" name="nome" id="" value="<?php echo $contato['nome'] ?>" ></p>
                <p>Email: <input type="text" name="email" id="" value="<?php echo $contato['email'] ?>"></p>
                <p>Telefone: <input type="text" name="telefone" id="" class="Tel" value="<?php echo $contato['telefone'] ?>"></p>
                <p> <label for="fileFoto" id="lblFoto">Foto</label>
                <p><input type="file" name="foto" id="fileFoto"></p>

                <p> <input type="submit" value="Gravar"></p>
            </form>
    </fieldset>

    
</body>
</html>