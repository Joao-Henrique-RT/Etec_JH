<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class EducacaoController extends Controller
{
    public function index(){
        return view('Ed_Infantil.EducacaoInfantil');
    }
}
