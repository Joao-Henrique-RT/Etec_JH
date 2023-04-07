<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {//FUNÇÃO FALLBACK ESPERA ALGO PARA SER EXECUTADO
    return  'Bem vindo ao laravel!';
});

Route::get('/jogos',
 function(){
return view ('Sistema de gerenciamento de jogos');
});


route::get('/SGJ', function(){
    return view('index');
});


route::get('/produtos' ,function(){
    return view ('produtos');
});

route::get('/final',function(){
    return ('html sendo encaminhado para a tela');
});