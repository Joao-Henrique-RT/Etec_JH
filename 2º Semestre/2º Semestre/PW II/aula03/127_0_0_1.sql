-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 27-Ago-2022 às 01:41
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
-- Banco de dados: `bd_contato`
--
CREATE DATABASE IF NOT EXISTS `bd_contato` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `bd_contato`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `bd_contatos`
--

DROP TABLE IF EXISTS `bd_contatos`;
CREATE TABLE IF NOT EXISTS `bd_contatos` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `telefone` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Estado` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `rg` int NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `bd_contatos`
--

INSERT INTO `bd_contatos` (`codigo`, `nome`, `email`, `telefone`, `Estado`, `rg`) VALUES
(66, 'João Henrique ', 'Joaohenrique@email.com', '011 9876532', 'Sâo Paul', 12356879),
(64, 'Bianca magalhães', 'Bianca254@outlook.com', '11 967358248', 'Alcólico', 328756325);
--
-- Banco de dados: `bd_contatos`
--
CREATE DATABASE IF NOT EXISTS `bd_contatos` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `bd_contatos`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `db_contatos`
--

DROP TABLE IF EXISTS `db_contatos`;
CREATE TABLE IF NOT EXISTS `db_contatos` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `telefone` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `db_contatos`
--

INSERT INTO `db_contatos` (`codigo`, `nome`, `email`, `telefone`) VALUES
(1, '$nome', '$email', '$telefone'),
(2, '$nome', '$email', '$telefone'),
(3, 'Hiury', 'fofinho@gmail.com', '1129192362'),
(4, '$nome', '$email', '$telefone'),
(5, 'JOão Henrique', 'mameiukpt@gmail.com', '2053855555'),
(6, 'JOão Henrique', 'mameiukpt@gmail.com', '2053855555'),
(7, 'Melância', 'NarguileVermei@gmail.com', '11666666');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
