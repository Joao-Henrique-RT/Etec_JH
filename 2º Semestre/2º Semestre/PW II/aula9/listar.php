<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilo-principal.css">
    <script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
    <title>Listar Contato</title>
    <script>
        function pesquisa(texto){
            $.ajax({
                type: "post",
                url: "pesquisa.act.php?texto="+texto,
                success: function(response){
                    $('#result').html(response);
                }
            });
        };
    </script>
</head>
<body>
<?php include('menu.php'); ?>

    <div class="pesquisar">
        <p>Pesquisar <input type="text" onKeyup="pesquisa(this.value)"></p>
        <div id="result"></div>
    </div>

<?php
    @session_start();
    if(isset($_SESSION['msg'])){
        echo "<p class=alert> $_SESSION[msg]</p>";
        unset($_SESSION['msg']);
    }

    require('connect.php');
    $contatos = mysqli_query($con, "Select * from `tb_contatos`");
    while($contato = mysqli_fetch_array($contatos)){
        echo "<div class=box>";
        echo "<p><img src=$contato[foto]></p>";
        echo "<p> Código: $contato[codigo]</p>";
        echo "<p> Nome: $contato[nome]</p>";
        echo "<p> E-mail: $contato[email]</p>";
        echo "<p> Telefone: $contato[telefone]</p>";
        echo "<p> Estado: $contato[estado]</p>";
        echo "<p> RG: $contato[rg]</p>";
        echo "<div class=alterarExcluir>";
        echo "<p> <a href =alterar.php?cod=$contato[codigo]>Alterar</a></p>";
        echo "<p> <a href =javascript:confirmar($contato[codigo])>Excluir</a></p>";
        echo "</div>";
        echo "</div>";
    }
?>
<script>
    function confirmar(codigo) {
        resposta = confirm("Deseja excluir o registro "+codigo+"?");
        if(resposta == true){
            window.location = "excluir.php?cod="+codigo;
        }
    }
</script>
</body>
</html>