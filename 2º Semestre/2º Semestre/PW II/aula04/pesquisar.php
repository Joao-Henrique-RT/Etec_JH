<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estilo-principal.css">;
    <title>Pesquisar</title>
   <script>
        function pesquisa(texto){
            $.ajax({
                type: "post",
                url: "pesquisa.act.php?texto="+texto,
                success: function(response){
                    $('#result').html(response);
                }
            });
        };
    </script>
</head>
<body>
    <?php include('menu.php'); ?>
    <div class="pesquisar">
        <p>Pesquisar <input type="text"  onKeyup="pesquisa(this.value)"></p>
            <div id="result"></div>
    </div>
</body>
</html>