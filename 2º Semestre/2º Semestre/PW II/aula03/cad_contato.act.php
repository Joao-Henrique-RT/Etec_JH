<?php

    extract($_POST);
    //Função pega os valores do formulário, e cria variáveis utilizando os Names dos inputs


    //include 
    //Comando pega os dados porém não deixa eles como obrigatórios

    //Deixa os campos como obrigatórios
    require('connect.php');

    if(mysqli_query($con,"INSERT INTO `bd_contatos` (`codigo`, `nome`, `email`, `telefone`, `Estado`, `rg`) VALUES (NULL, '$nome', '$email', '$telefone', '$estado', '$rg');")){
        $msg = "<p class=sucesso> Registro criado com sucesso!</p>";
    }else{
        $msg = "<p class=erro> Erro ao criar registro!</p>";
    }
    session_start();
    $_SESSION['msg'] = $msg;

        header("location:cad_contato");








?>