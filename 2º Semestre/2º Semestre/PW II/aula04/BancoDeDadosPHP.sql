-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 24-Set-2022 às 01:24
-- Versão do servidor: 8.0.27
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
) ENGINE=MyISAM AUTO_INCREMENT=96 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `tb_contatos`
--

INSERT INTO `tb_contatos` (`codigo`, `nome`, `email`, `telefone`, `estado`, `rg`, `foto`) VALUES
(74, 'João Henrique', 'joãohenrique@gmail.com', '11964673745', '', 0, 'imgs/29e4b3edbe5d1178100eb93726dde3b2.jpg'),
(77, 'Alisson Almeida', 'alissonalmeida@gmail.com', '11992625271', '', 0, 'imgs/d07baa00d636961e25d86d6c66e91920.jpg'),
(78, 'Gustav gomes', 'gotowow@gmail.com', '1196585858', '', 0, 'imgs/973e9ff2f630de8a0fdfe58704d5c829.jpg'),
(76, 'Eric Sanderson', 'ericsanderson@gmail.com', '11949064713', '', 0, 'imgs/21b5bfc7b82e242e70d6f8a1ac09206c.jpg'),
(79, 'carlos', 'Carlinhos@gmail.com', '11656565', '', 0, 'imgs/0a46840bc6a2e68cdacb83b078ea5ba8.jpg'),
(80, 'Trabalhador honesto', 'contato@gmail.com', '1136528566', '', 0, 'imgs/2e7161302649a5bb9a1e3f321b9f4804.jpg'),
(81, 'Japones', 'xingxong@china.com', '40028922', '', 0, 'imgs/0f3bce8eae902994821d18108082cd19.jpg'),
(82, 'Carlos', 'Carlitosteves@gmail.com', '242424', '', 0, 'imgs/35363bf55f2f95bc15f0748ec877f5dc.jpg'),
(84, 'Jair Adventure', 'jairadventure@gamil.com', '11649875236', '', 0, 'imgs/7f06bdfb694fbda477c3e828c063d4df.jpg'),
(85, 'Albert Valentine', 'albertovalentim@gmail.com', '11949263587', '', 0, 'imgs/a39deea777a0639a0fbe4994f4259a05.jpg'),
(86, 'Phillip Haum', 'finalista@gmail.com', '11949265876', '', 0, 'imgs/95fc65f4fdfa9d9bfd2ce0db42d4dbb6.jpg'),
(87, 'Hermano Menezes', 'internacional@gmail.com', '11658974231', '', 0, 'imgs/d843e22605b717da14166b561fcac6da.jpg'),
(88, 'Kari Lee', 'carille@gmail.com', '11499623587', '', 0, 'imgs/64ec7352f912ecb24dbee4138fde99b0.jpg'),
(89, 'Selç Ulhot', 'celsoroth@gmail.com', '11263598745', '', 0, 'imgs/05884df866270e1e173e21b7a8595948.jpg'),
(90, 'Osvalde Livera', 'oswald@gmail.com', '11949263587', '', 0, 'imgs/779ac4e4461621061392f8bed52d9f96.jpg'),
(91, 'Adyul Son Batysta', 'adilson@gmail.com', '11949568752', '', 0, 'imgs/5bae183b40990b5f04c9d792d4e9a1b7.jpg'),
(92, 'Jowell Saint-Anna', 'joelzao@gmail.com', '11959632587', '', 0, 'imgs/e4e85c9a8c783ec5fbf9a66d3a554005.jpg'),
(93, 'Cristo Van Borges', 'cristovao@gmail.com', '11949562356', '', 0, 'imgs/83912099f08baa7b129697abec2e1c03.jpg'),
(94, 'Al’Beel Brah-Ga', 'abelao@gmail.com', '11595632547', '', 0, 'imgs/b73572ae646ae988e492729caa5e264b.jpg'),
(95, 'Wagner Cleitin', 'wagnercleitin@gmail.com', '11949264875', '', 0, 'imgs/47098448a53b6541edf7cbbbfb428f5f.jpg');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
