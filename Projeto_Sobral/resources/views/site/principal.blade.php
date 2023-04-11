<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="{{asset ('css/app.css')}}">
    <title>Sobral</title>

</head>

<body> 
    <h1 class="Principal">PÁGINA PRINCIPAL</h1>

    <a href=" {{ route('Ed_Infantil.Cood_Ed_Infantil') }}">COORDENADORIA DA EDUCAÇÃO INFANTIL</a>
    <hr>
    <br><br><br>
    
    <a href=" {{ route('Cood_Fund_I.Cood_Fund_I') }}">COORDENADORIA DE ENSINO FUNDAMENTAL I</a>
    <hr>
    <br><br><br>

    <a href=" {{ route('Cood_Fund_II.Cood_Fund_II') }}">COORDENADORIA DE ENSINO FUNDAMENTAL II</a>
    <hr>
    
    <br>
    
    <a href=" {{ route('Cood_Gest_Pedagogica.Cood_Gest_Pedagogica') }}">COORDENADORIA DE DESENVOLVIMENTO DA APRENDIZAGEM E DA GESTÃO PEDAGÓGICA  </a>
    
  
  



</body>

</html>