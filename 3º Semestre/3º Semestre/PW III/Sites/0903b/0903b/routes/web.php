<?php

use App\Http\Controllers\ClienteController;
use App\Http\Controllers\ProdutoController;
use Illuminate\Support\Facades\Route;
use Symfony\Component\ErrorHandler\ErrorRenderer\CliErrorRenderer;

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

Route::get('/', function () {
    return view('welcome');
});

route::get('/sistema/cadclientes', 
[ClienteController::class, 'chamarCliente']);

route::get('sistema/produtos',
[
    ProdutoController::class, 'chamarProduto'
]);