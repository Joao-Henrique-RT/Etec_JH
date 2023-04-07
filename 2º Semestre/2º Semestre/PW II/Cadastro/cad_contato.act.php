<?php
    
    require('connect.php');
    extract($_FILES);
    extract($_POST);
    $endereco = "imgs/".md5(time()).".jpg";
    move_uploaded_file($foto['tmp_name'],$endereco);
    
    if(mysqli_query($con, "INSERT INTO `tb_contatos` (`codigo`, `nome`, `email`, `telefone`, `foto`) 
    VALUES (NULL, '$nome', '$email', '$telefone','$endereco');")){
        $msg = "Registro criado com sucesso!";
        }else{
            $msg = "Erro ao criar registro!";
        }

        session_start();
        $_SESSION['msg'] = $msg;
        header("location:listar.php");
?>
    

