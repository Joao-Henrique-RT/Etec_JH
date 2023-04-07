<?php

if(!$con = mysqli_connect('localhost','root','','bd_livraria')){
    echo "Erro ao acessar a Base de dados!";
}else{
    header("location:menu.php");
}
//Banco de dados já conectado!

?>