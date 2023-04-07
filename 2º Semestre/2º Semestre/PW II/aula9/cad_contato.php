<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilo-principal.css">
    <title>Cadastrar Contato</title>
</head>
<body>
    <?php include('menu.php'); ?>
    <?php
        @session_start();
        if(isset($_SESSION['msg'])){
            echo "<p class=alert>$_SESSION[msg]</p>";
            unset( $_SESSION['msg']);
        }
    ?>
    <fieldset id="form-cad-contato">
        <legend>Cadastrar Novo Contato</legend>
    <form action="cad_contato.act.php" method="post" id="" enctype="multipart/form-data" >
        <p><label for="fileFoto" id="lblFoto">Foto</label> </p>
        <p> <input type="file" name="foto" id="fileFoto"> </p>
        <p>Nome:  <input type="text" name="nome" id=""></p>
        <p>Email:  <input type="text" name="email" id=""></p>
        <p>Telefone:<input type="text" name="telefone" id=""> </p> 
        <p>Estado:<input type="text" name="estado" id=""> </p> 
        <p>RG: :<input type="text" name="rg" id=""> </p> 
        <p>Senha:<input type="password" name="senha" id=""> </p> 
        <p> <input type="submit" value="Gravar"></p>
    </form>
    </fieldset>
        <div id="app">
        <?php
                    require('connect.php');
                    $contatos = mysqli_query($con, "Select * from `tb_contatos`ORDER BY `nome`");
                    echo "<table> <h1>Consulta de contatos</h1> ";
                    echo "<tr class='titulo'>";
                    echo    "<td>Nome</td>";
                    echo    "<td>Email</td>";
                    echo    "<td>Telefone</td>";
                    echo    "<td>Estado</td>";
                    echo    "<td>RG</td>";
                    echo "</tr>";
                    echo "</table>";
                    while($contato = mysqli_fetch_array($contatos)){
                    echo "<table >";
                    echo "<tr>";
                    echo    "<td>$contato[nome]</td>";
                    echo    "<td>$contato[email]</td>";
                    echo    "<td>$contato[telefone]</td>";
                    echo    "<td>$contato[estado]</td>";
                    echo    "<td>$contato[rg]</td>";
                    echo "</tr>";
                    echo "</table>";
                    }
                ?>
        </div>
        
<script>
    function listar(){
        console.log("teste");
    }

</script>
</body>
</html>