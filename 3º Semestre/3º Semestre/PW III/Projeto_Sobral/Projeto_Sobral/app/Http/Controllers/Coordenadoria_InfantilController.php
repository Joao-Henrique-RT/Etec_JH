<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class Coordenadoria_InfantilController extends Controller
{
    public function index(){
        return view('Ed_Infantil.Cood_Ed_Infantil');
    }
}
