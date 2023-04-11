<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="{{asset ('css\app.css')}}">
    <title>Cood Fund I</title>
</head>
<body>
    <h1 class="Laranja">BEM VINDO A PÁGINA DA COORDENADORIA DE ENSINO FUNDAMENTAL I</h1>

    <a href=" {{ route('Cood_Fund_I.Ensino_Fund_I') }}">Ir a Ensino Fundamental I</a>
    <br>
    <a href=" {{ route('Cood_Fund_I.Educacao_Especial') }}">Ir a Educação especial</a>
    <br>
    <a href=" {{ route('Cood_Fund_I.Diversidade') }}">Ir a Célula de educação de jovens e adultos da diversidade</a>
    <br><hr>
    <a href=" {{ route('site.principal') }}">RETORNAR A PÁGINA PRINCIPAL</a>



</body>
</html>