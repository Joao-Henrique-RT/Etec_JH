<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class MonitoramentoPedagogico extends Controller
{
    public function index(){
        return view('Cood_Gest_Pedagogica.Monit_Pedagogico');
    }
}
