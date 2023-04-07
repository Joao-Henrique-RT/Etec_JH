<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Dados</title>
    <link rel="stylesheet" href="estilo-principal.css">
</head>
<body>

<?php include('menu.php'); ?>

                <?php
                session_start();
                if(isset($_SESSION['msg'])){
                    echo "<p class=alert>$_SESSION[msg]</p>";
                    unset($_SESSION['msg']);
                }

                    require('connect.php');
                    $contatos = mysqli_query($con, "Select * from `tb_contatos`");
                   
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
                ?>


<script>

    function confirmar (codigo){
        resposta = confirm("Deseja excluir o registro "+codigo+"?");
     
        if(resposta == true){
        window.location = "excluir.php?cod="+codigo;
        }
    }

</script>
</body>
</html>