-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 24-Set-2022 às 01:13
-- Versão do servidor: 8.0.27
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_contatos`
--
CREATE DATABASE IF NOT EXISTS `bd_contatos` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `bd_contatos`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_contatos`
--

DROP TABLE IF EXISTS `tb_contatos`;
CREATE TABLE IF NOT EXISTS `tb_contatos` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `telefone` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `estado` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `rg` int NOT NULL,
  `foto` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM AUTO_INCREMENT=76 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `tb_contatos`
--

INSERT INTO `tb_contatos` (`codigo`, `nome`, `email`, `telefone`, `estado`, `rg`, `foto`) VALUES
(55, 'Vagner Cleitin da silva', 'cleitin@email.com', '1125262541', 'Bahia', 101010, 'imgs/foto.jpeg'),
(62, 'josé Ricardo', 'joser@email.com', '11225544', 'Paraiba', 559988, 'imgs/foto3'),
(53, 'Genival Santos', 'genival@email', '1199885855', 'Rio de Janeiro', 5525414, 'imgs/foto2'),
(54, 'Maria Silva', 'maria@email', '1123425637', 'São Paulo', 5521122, 'imgs/c6ad8080b7c9a4f0e8801075451c272d.jpg'),
(44, 'João', 'joao@joao.com', '90028922', 'São Paulo', 555, 'imgs/3f39d697e2d62b19af141fd469641bd1.jpg'),
(57, 'Cibele', 'cibele@email.com', '1125252525', 'Brasilia', 101010, 'imgs/86539551e0730389db77da7a63c28b37.jpg'),
(65, 'Ronaldo Rodrigues', 'ronaldinho@email.com', '99885566', 'São Paulo', 11223344, 'foto7.jpg'),
(74, 'Maria Joaquina', 'joaquina@gmail.com', '11225544', 'Minas Gerais', 22993873, 'imgs/876debafc896e9f104bacc7f7e7a6938.jpg');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
