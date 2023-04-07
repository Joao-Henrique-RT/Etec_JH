<?php
    echo $texto = $_GET['texto'];
    require('connect.php');

     
    if(strlen($texto)>3){
    $contatos = mysqli_query($con, "Select * from `tb_contatos` where `nome` like '%$texto%'");
    
    while($contato = mysqli_fetch_array($contatos)){
        echo "<div class=box>";
        echo "<p>Nome: $contato[nome] </p>";
        echo "<p>Email: $contato[email] </p>";
        echo "<p>Telefone: $contato[telefone] </p>";
        echo "<p><img src=$contato[foto]></p>";
        echo "<p><a href=alterar.php?cod=$contato[codigo]>Alterar</a></p>";
        echo "<p><a href=javascript:confirmar($contato[codigo])>Excluir</a></p>";
        echo "</div>";
    }
    }







?>