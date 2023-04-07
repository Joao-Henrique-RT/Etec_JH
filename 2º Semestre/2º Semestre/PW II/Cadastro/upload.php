<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
<form method="post" enctype="multipart/form-data">
    <p><input type="file" name="foto" id=""></p>
    <p><input type="submit" value="Enviar" name="bt-enviar"></p>
</form>

<?php
if(isset($_POST['bt-enviar'])){
    extract($_FILES);
    var_dump($foto);
    $destino = "teste/".md5(time().$foto['size'])".jpg";
    move_upload_file($foto['tpm_name'],$destino);
}
    ?>

</body>
</html>