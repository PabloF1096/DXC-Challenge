-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 05-08-2018 a las 03:52:44
-- Versión del servidor: 5.7.19
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dxc`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `people`
--

DROP TABLE IF EXISTS `people`;
CREATE TABLE IF NOT EXISTS `people` (
  `id` int(11) NOT NULL,
  `name` varchar(32) NOT NULL,
  `lastname` varchar(32) NOT NULL,
  `ssn` varchar(32) NOT NULL,
  `birthdate` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `people`
--

INSERT INTO `people` (`id`, `name`, `lastname`, `ssn`, `birthdate`) VALUES
(1, 'Juan', 'Romero', 'JR', '10/12/1992'),
(2, 'Eliezer', 'Cartin', 'EC', '08/10/1994'),
(3, 'Eli', 'Salazr', 'ES', '01/10/1995'),
(4, 'Mauricio', 'Salas', 'MS', '15/03/1990'),
(5, 'Luis', 'Alpizar', 'LA', '25/03/1998'),
(6, 'Pedro', 'Romero', 'PR', '10/12/1993');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
