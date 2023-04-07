<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ClienteController extends Controller
{
    public function chamarCliente (){
        return view('clientes.cadastro-cliente');
    }//Fim Function

}//FIM CLASS ClienteController
