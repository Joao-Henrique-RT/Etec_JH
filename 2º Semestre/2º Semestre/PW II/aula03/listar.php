<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listar registros</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    
    <?php
    require('connect.php');
    $contatos = mysqli_query($con, "Select * from `bd_contatos`");
    echo "<div class=\"box\">";
    while($contato = mysqli_fetch_array($contatos)){

        echo "<div><p>Nome: $contato[nome] </p>";
        echo "<p>Email: $contato[email] </p>";
        echo "<p>Telefone: $contato[telefone] </p></div>";
    }
    echo "</div>";
?>



</body>
</html>