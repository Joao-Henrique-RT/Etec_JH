<?php require('sec.php') ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alterar</title>
    
</head>
<body>
<?php include('menu.php'); ?>

<?php
        @session_start();
        if(isset($_SESSION['msg'])){
            echo "<p class=alert>$_SESSION[msg] </p>";
            unset($_SESSION['msg']);
        }
    ?>

    <?php
        $codigo = $_GET['cod'];
        require('connect.php');
        $busca = mysqli_query($con, "Select * from `tb_contatos` where `codigo` = '$codigo'");
        $contato = mysqli_fetch_array($busca);
    ?>
<fieldset id="form-cad-contato">
        <legend>Cadastrar Novo Contato</legend>
    <form action="alterar.act.php" method="post" id="" enctype="multipart/form-data">
        <input type="hidden" name="foto_anterior" value="<?php echo $contato['foto']?>" >
        <input type="hidden" name="codigo" value="<?php echo $contato['codigo']?>" >
        <?php echo "<p class='imgalterar'><img src=$contato[foto]></p>"; ?>
        <p> <input type="file" name="foto" id="fileFoto"> </p>
        <p> Codigo Contato <?php echo $contato['codigo']; ?> </p>
        <p>Nome:  <input type="text" name="nome" id="" value="<?php echo $contato['nome']?>"></p>
        <p>Email:  <input type="text" name="email" id="" value="<?php echo $contato['email']?>"></p>
        <p>Telefone:<input type="text" name="telefone" id="" value="<?php echo $contato['telefone']?>"> </p> 
        <p>Estado:<input type="text" name="estado" id="" value="<?php echo $contato['estado']?>"> </p> 
        <p>RG:<input type="text" name="rg" id="" value="<?php echo $contato['rg']?>"> </p> 
        <p> <input type="submit" value="Gravar"> </p>
    </form>
    </fieldset>
</body>
</html>