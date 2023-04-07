<?php
    @session_start();
?>

<link rel="stylesheet" href="estilo-principal.css">

<div class="menu">
    <ul>
        <a href="listar.php"><li>Listar</li></a>
        <a href="cad_contato.php"><li>Incluir</li></a>
        <a href="pesquisar.php"><li>Pesquisa</li></a>
        <?php
            if(isset($_SESSION['login']) && $_SESSION['login']==true){
                echo "<li class=nomeUsuario>Olá, $_SESSION[nome] </li>";
                echo "<a href=logoff.php><li>Sair</li></a>";
            }else{
                echo "<a href=login.php><li>Entrar</li></a>";
            };
        ?>
    </ul>
</div>