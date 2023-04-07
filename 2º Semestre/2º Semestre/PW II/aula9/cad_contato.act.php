<?php
 
    require('connect.php');
    extract($_FILES);
    extract($_POST);
    $senha = md5($senha);
    $endereco = "imgs/".md5(time()).".jpg";
    move_uploaded_file($foto['tmp_name'],$endereco);
    if(mysqli_query($con, "INSERT INTO `tb_contatos` (`codigo`, `nome`, `email`, `telefone`, `estado`, `rg`, `foto`, `senha`)
     VALUES (NULL, '$nome', '$email', '$telefone', '$estado', '$rg', '$endereco', '$senha');")){
        $msg = "<p class=sucesso>Registro gravado com Sucesso</p>";
     }else{
        $msg = "<p class=erro>Erro ao criar registro</p>";
     }
     session_start();
     $_SESSION['msg'] = $msg;
    header("location:cad_contato.php");
