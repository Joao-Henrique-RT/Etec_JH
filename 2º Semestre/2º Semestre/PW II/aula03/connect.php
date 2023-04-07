<?php
    if(!$con = mysqli_connect('localhost','root','','bd_contato')){
        echo "Erro ao acessar Banco de dados!!!";
    }
    //Armezenamos em uma variável para armazenar uma "chave"
    //Função para conectar ao bando de dados do PHPMyADMIN

    mysqli_query($con,"SET NAMES utf8");
    //Variável $con está sendo uma uma chave para a manipulação de dados
    //Função para manipular banco de dados






?>