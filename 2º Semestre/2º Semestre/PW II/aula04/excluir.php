<?php
$codigo = $_GET['cod'] ;
require('connect.php');
extract($_POST);
    if(mysqli_query($con, "DELETE FROM `tb_contatos`
                           WHERE `tb_contatos`.`codigo` ='$codigo';")){
        header("location:listar.php");                        
    }else{
         echo "Erro ao excluir!";
    }

