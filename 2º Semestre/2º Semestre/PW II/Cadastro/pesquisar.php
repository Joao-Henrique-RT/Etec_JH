<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
    <title>Pesquisar</title>
    <link rel="stylesheet" href="estilo-principal.css">


    <script>
        function pesquisa(texto){
            //console.log(texto);
            $.ajax({
                type: "method",
                url: "pesquisar.act.php?texto="+texto,
                success: function (response) //TUDO DE texto VAOI SER ARMAZENADO EM response
                 {
                 
                    $('#result').html(response);

                }
            });
        }
    </script>
</head>
<body>
    <input type="text"  id="txtPesquisa" onkeyup="pesquisa(this.value)">    
        <div id="result"></div>

</body>
</html>


<?php
    








?>