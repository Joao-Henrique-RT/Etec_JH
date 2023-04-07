<?php

extract($_POST);
$senha = md5($senha);
require('connect.php');
@session_start();
$busca = mysqli_query($con, "SELECT * FROM `tb_contatos` where `email` = '$email'");
if($busca->num_rows == 1){
    //caso 1 email encontrado
    $contato = mysqli_fetch_array($busca);
    if($senha === $contato['senha']){
        //caso senha correta
        $_SESSION['login'] = true;
        $_SESSION['nome'] = $contato['nome'];
        $target = "location:listar.php";
    }else{
        //caso email não exista
        $target = "location:login.php";
        $msg = "Email ou senha Invalido";
    }
}else{
    //caso e-mail não exista
    $target = "location:login.php";
    $msg = "Email ou senha inválido";
}
echo $email;
echo $senha;

$_SESSION['msg'] = $msg;
header($target);