<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario</title>
</head>
<style>
    .
    
</style>

<body>
<div class = "quadrado">
    <h1>Informando a área do Quadrado</h1>

     <form action="formulario.act.quadrado.php" method="post">

    <p>Base</p>
    <p><input type="number" name="base"></p>
    <p>Altura</p>
    <p><input type="number" name="altura"></p>
    <p><input type="submit" value="Enviar"></p>

     </form>
</div>

<div class = "triangulo">
     <h1>Informando a área do Triângulo</h1>

    <form action="formulario.act.triangulo.php" method="post">

    <p>Base</p>
    <p><input type="number" name="base"></p>
    <p>Altura</p>
    <p><input type="number" name="altura"></p>
    <p><input type="submit" value="Enviar"></p>

    </form>
</div>

<div class = "retangulo">
    <h1>Informando a área do Retângulo</h1>

    <form action="formulario.act.retangulo.php" method="post">

    <p>Base</p>
    <p><input type="number" name="base"></p>
    <p>Altura</p>
    <p><input type="number" name="altura"></p>
    <p><input type="submit" value="Enviar"></p>

    </form>
</div>

<div class = "circulos">
    <h1>Informando a área do Círculo</h1>

    <form action="formulario.act.circulo.php" method="post">

    <p>Raio</p>
    <p><input type="number" name="raio"></p>
    <p><input type="submit" value="Enviar"></p>
</div>

</body>
</html>