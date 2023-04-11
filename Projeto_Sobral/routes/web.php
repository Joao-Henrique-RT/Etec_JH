<?php

use App\Http\Controllers\AcompanhamentoController;
use App\Http\Controllers\Avaliacao_Externa_Educacional;
use App\Http\Controllers\Coordenadoria_Fund_IController;
use App\Http\Controllers\Coordenadoria_Fund_IIController;
use App\Http\Controllers\Coordenadoria_InfantilController;
use App\Http\Controllers\CoordenadoriaGestPedagogica;
use App\Http\Controllers\PrincipalController;
use App\Http\Controllers\DiversidadeController;
use App\Http\Controllers\EducacaoController;
use App\Http\Controllers\EspecialController;
use App\Http\Controllers\Fundamental_IController;
use App\Http\Controllers\MediacaosocialController;
use App\Http\Controllers\MonitoramentoPedagogico;
use App\Http\Controllers\ProjetoDeVidaController;
use App\Http\Controllers\TempoIntegralController;
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

route::get(
    '/',
    [
        PrincipalController::class, 'index'
    ]
)->name('site.principal');

route::get(
    '/Ed_Infantil',
    [
        EducacaoController::class, 'index'
    ]
)->name('Ed_Infantil.EducacaoInfantil');

route::get(
    '/Acompanhamento',
    [
        AcompanhamentoController::class, 'index'
    ]
)->name('Ed_Infantil.Acompanhamento');

route::get(
    '/Fundamental_I',
    [
        Fundamental_IController::class, 'index'
    ]
)->name('Cood_Fund_I.Ensino_Fund_I');

route::get(
    '/especial',
    [
        EspecialController::class, 'index'
    ]
)->name('Cood_Fund_I.Educacao_Especial');


route::get(
    '/diversidade',
    [
        DiversidadeController::class, 'index'
    ]
)->name('Cood_Fund_I.Diversidade');

route::get(
    '/Projeto_Vida',
    [
        ProjetoDeVidaController::class, 'index'
    ]
)->name('Cood_Fund_II.Proj_vida');

route::get(
    '/Cood_Ed_Infantil',
    [
        Coordenadoria_InfantilController::class, 'index'
    ]
)->name('Ed_Infantil.Cood_Ed_Infantil');

route::get(
    '/Cood_Fund_I',
    [
        Coordenadoria_Fund_IController::class, 'index'
    ]
)->name('Cood_Fund_I.Cood_Fund_I');

route::get(
    '/Cood_Fund_II',
    [
        Coordenadoria_Fund_IIController::class, 'index'
    ]
)->name('Cood_Fund_II.Cood_Fund_II');



route::get(
    '/Tempo_Integral',
    [
        TempoIntegralController::class, 'index'
    ]
)->name('Cood_Fund_II.Tempo_Integral');



route::get(
    '/Cood_Gest_Pedagogica',
    [
        CoordenadoriaGestPedagogica::class, 'index'
    ]
)->name('Cood_Gest_Pedagogica.Cood_Gest_Pedagogica');


route::get(
    '/Monit_pedagogico',
    [
        MonitoramentoPedagogico::class, 'index'
    ]
)->name('Cood_Gest_Pedagogica.Monit_Pedagogico');


route::get(
    '/Avaliacao_Externa_Educacional',
    [
        Avaliacao_Externa_Educacional::class, 'index'
    ]
)->name('Cood_Gest_Pedagogica.Avaliacao_Externa_Educacional');


route::get(
    '/Mediacao_Social',
    [
        MediacaosocialController::class, 'index'
    ]
)->name('Cood_Gest_Pedagogica.Mediacao_Social');