-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 20-Ago-2022 às 01:38
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

-- --------------------------------------------------------

--
-- Estrutura da tabela `bd_contatos`
--

DROP TABLE IF EXISTS `bd_contatos`;
CREATE TABLE IF NOT EXISTS `bd_contatos` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `telefone` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Estado` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `rg` int NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `bd_contatos`
--

INSERT INTO `bd_contatos` (`codigo`, `nome`, `email`, `telefone`, `Estado`, `rg`) VALUES
(1, '$nome', '$email', '$telefone', '', 0),
(2, 'João', 'joao@caracamalucobonito@auladojao.com', '90028922', '', 0),
(3, '$nome', '$email', '$telefone', '$estado', 0),
(4, 'Renatão Lanches', 'Ratatuí@nemo.toystoy', '123456789', 'Sampa', 0),
(5, 'Renatão Lanches', 'Ratatuí@nemo.toystoy', '123456789', 'Sampa', 0),
(51, '', '', '', '', 0),
(45, 'João', 'donoDoAP251@outlook.com', '90028922', 'São Paulo', 555),
(44, 'João', 'joao@joao.com', '90028922', 'São Paulo', 555),
(31, 'João', 'donoDoAP250@outlook.com', '90028922', 'Sampa', 555);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
