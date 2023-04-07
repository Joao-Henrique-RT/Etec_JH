<?php
    if(!$con = mysqli_connect('localhost','root','','bd_contatos')){
        echo "Erro ao acessar a Base de dados!";
    };

    mysqli_query($con, "SET NAMES utf8");
?>