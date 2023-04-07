<?php
use App\Http\Controllers\ContatoController;
use App\Http\Controllers\SobreNosController;
use App\Http\Controllers\PrincipalController;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/



route::get('/',
[
    PrincipalController::class, 'principal'
]);


route::get('sistema/contato',
[
    ContatoController::class, 'contato'
]);



route::get('sistema/sobrenos',
[
    SobreNosController::class, 'sobreNos'
]);