
<?php
    $texto = $_GET['texto'];
    require('connect.php');
    $contatos = mysqli_query($con, "Select * from `tb_contatos` where `nome` like '%$texto%' ");
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