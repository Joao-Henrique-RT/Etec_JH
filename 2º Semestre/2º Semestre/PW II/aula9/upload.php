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
       <p> <input type="file" name="foto" value="Escolher arquivo"></p>
       <p> <input type="submit" name="bt-enviar" value="Enviar" ></p>
    </form>
    <?php
        if(isset($_POST['bt-enviar'])){
            $destino = "imgs/".md5(time()).".jpg";
            extract($_FILES);
            move_uploaded_file($foto['tmp_name'],$destino);
        }
    ?>
</body>
</html>