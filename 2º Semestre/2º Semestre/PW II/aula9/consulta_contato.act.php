<?php
    extract($_GET);

    require('connect.php');

    mysqli_query($consulta, "SELECT * FROM `tb_contatos`;");

    header("location:cad_contato.php");
