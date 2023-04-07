<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ProdutoController extends Controller
{
    public function chamarProduto(){
        return view ('produtos.cad-produtos');
    }
}
