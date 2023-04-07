-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 22-Out-2022 às 00:50
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
-- Banco de dados: `bd_livraria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_livraria`
--

DROP TABLE IF EXISTS `tb_livraria`;
CREATE TABLE IF NOT EXISTS `tb_livraria` (
  `Codigo` int NOT NULL AUTO_INCREMENT,
  `Nome_Usuario` varchar(75) COLLATE utf8_unicode_ci NOT NULL,
  `Email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Senha` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Nome_Livro` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Autor_Livro` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Preco` int NOT NULL,
  `foto` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`Codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `tb_livraria`
--

INSERT INTO `tb_livraria` (`Codigo`, `Nome_Usuario`, `Email`, `Senha`, `Nome_Livro`, `Autor_Livro`, `Preco`, `foto`) VALUES
(0, '$nome_usurio', '$email', '$senha', '$nome_livro', '$autor_livro', 0, '$foto');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
