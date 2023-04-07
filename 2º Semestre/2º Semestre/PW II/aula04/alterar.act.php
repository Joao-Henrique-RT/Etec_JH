<?php
require('connect.php');
extract($_POST);
extract($_FILES);

if($foto['size'] > 0){
    if($foto_anterior == ""){
        $endereco = "imgs/".md5(time()).".jpg";
    }else{
        $endereco = $foto_anterior;
    }
    move_uploaded_file($foto['tmp_name'],$endereco);
}else{
    $endereco = $foto_anterior;
}


if(mysqli_query($con, "UPDATE `tb_contatos` SET
                                `nome`= '$nome',
                                `email`= '$email',
                                `telefone`= '$telefone'
                                 WHERE
                                `tb_contatos` . `codigo` = '$codigo';")){
                                    $msg = "Alterado com sucesso!";
                                }else{
                                    $msg = "Erro ao alterar!";
                                }

                                session_start();
                                $_SESSION['msg'] = $msg;
                               header("location:listar.php");
?>