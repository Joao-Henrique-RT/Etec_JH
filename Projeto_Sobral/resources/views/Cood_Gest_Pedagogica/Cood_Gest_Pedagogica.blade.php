<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="{{asset ('css\app.css')}}">
    <title>Gestão pedagógica</title>
</head>
<body>
    
<h1 class="Laranja">COORDENADORIA DE DESENVOLVIMENTO DA APRENDIZAGEM E DA GESTÃO PEDAGÓGICA</h1>

<a href=" {{ route('Cood_Gest_Pedagogica.Monit_Pedagogico') }}">MONITORAMENTO PEDAGÓGICO</a>
<br>

<a href=" {{ route('Cood_Gest_Pedagogica.Avaliacao_Externa_Educacional') }}">AVALIAÇÃO EXTERNA E EDUCACIONAL</a>
<br>

<a href=" {{ route('Cood_Gest_Pedagogica.Mediacao_Social') }}">MEDIAÇÃO SOCIAL</a>
<br>


<hr>
<br>
<a href=" {{ route('site.principal') }}"> PÁGINA PRINCIPAL  </a>




</body>
</html>