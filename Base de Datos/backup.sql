-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bppnmatlccyo3zvyhusg-mysql.services.clever-cloud.com:3306
-- Generation Time: Jun 15, 2023 at 03:11 AM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bppnmatlccyo3zvyhusg`
--

-- --------------------------------------------------------

--
-- Table structure for table `contacto`
--

CREATE TABLE `contacto` (
  `id_contacto` bigint(20) NOT NULL,
  `nombre_contacto` varchar(255) DEFAULT NULL,
  `url_contacto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contacto`
--

INSERT INTO `contacto` (`id_contacto`, `nombre_contacto`, `url_contacto`) VALUES
(3, 'Github', 'https://github.com/Maunas'),
(4, 'Linkedin', 'https://www.linkedin.com/in/gonzalo-maunas-08a50b225/');

-- --------------------------------------------------------

--
-- Table structure for table `experiencia`
--

CREATE TABLE `experiencia` (
  `id_experiencia` bigint(20) NOT NULL,
  `fecha_desde` date DEFAULT NULL,
  `fecha_hasta` date DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `puesto` varchar(255) DEFAULT NULL,
  `url_imagen` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `formacion`
--

CREATE TABLE `formacion` (
  `id_formacion` bigint(20) NOT NULL,
  `carrera` varchar(255) DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `url_imagen` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `formacion`
--

INSERT INTO `formacion` (`id_formacion`, `carrera`, `fecha_fin`, `institucion`, `url_imagen`) VALUES
(25, 'Ingeniería en Sistemas de Información', NULL, 'Universidad Tecnológica Nacional Facultad Regional Mendoza', 'https://drive.google.com/uc?id=1iyhUZ1ZURSTN3ssIzp049B4kXVmLA0fZ'),
(26, 'Curso de Programación Web Full Stack', '2021-11-30', 'Egg Educación', 'https://drive.google.com/uc?id=1Ou4m5UgMgLPfTnS6DaNhcFLu1M6Vhw_7'),
(27, 'Técnico en Aeronáutica', '2018-12-07', 'Escuela Técnica 4-106 IV Brigada Aérea', 'https://drive.google.com/uc?id=1v8UEbCguV41cWpPk8E9vqRcfJj3J_q88');

-- --------------------------------------------------------

--
-- Table structure for table `habilidad`
--

CREATE TABLE `habilidad` (
  `id_habilidad` bigint(20) NOT NULL,
  `nivel_habilidad` int(11) NOT NULL,
  `nombre_habilidad` varchar(255) DEFAULT NULL,
  `tipo_skill` varchar(255) DEFAULT NULL,
  `valor_max` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `habilidad`
--

INSERT INTO `habilidad` (`id_habilidad`, `nivel_habilidad`, `nombre_habilidad`, `tipo_skill`, `valor_max`) VALUES
(8, 6, 'Java', 'Hard', 10),
(10, 7, 'HTML', 'Hard', 10),
(11, 7, 'MySQL', 'Hard', 10),
(12, 5, 'Angular', 'Hard', 10),
(13, 7, 'Trabajo en Equipo', 'Soft', 10),
(14, 8, 'Resolución de Problemas', 'Soft', 10),
(15, 6, 'Comunicación Efectiva', 'Soft', 10),
(16, 7, 'Adaptabilidad', 'Soft', 10),
(21, 5, 'Spring', 'Hard', 10);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(28),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `id_persona` bigint(20) NOT NULL,
  `descripcion` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `nacimiento` date DEFAULT NULL,
  `nombre_completo` varchar(255) DEFAULT NULL,
  `profesion` varchar(255) DEFAULT NULL,
  `url_banner` varchar(255) DEFAULT NULL,
  `url_foto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`id_persona`, `descripcion`, `nacimiento`, `nombre_completo`, `profesion`, `url_banner`, `url_foto`) VALUES
(2, 'Soy un alumno de Ingeniería en Sistemas de Información, actualmente en quinto año. \nSi bien no tengo experiencia laboral, he pasado los últimos años capacitandome, con el fin de desempeñarme en un futuro próximo como desarrollador.\nTengo bastante interés en capacitarme como desarrollador web, y aunque no tenga mucho para completar de mi portfolio, tengo deseos de seguir creciendo como profesional.', '1999-11-11', 'Gonzalo Maunás', 'Estudiante de Ingeniería en Sistemas de Información', 'https://drive.google.com/uc?id=149UcMB8hNd-bvk1Gy0igkX4YKaNrsl_k', 'https://drive.google.com/uc?id=10lQUs9b-rq0WtHv3bAEsfE0Jfzy5HrPD');

-- --------------------------------------------------------

--
-- Table structure for table `proyecto`
--

CREATE TABLE `proyecto` (
  `id_proyecto` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `titulo_proyecto` varchar(255) DEFAULT NULL,
  `url_proyecto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `password`, `username`) VALUES
(1, '{bcrypt}$2a$10$O9WQxUWtyPx4tjauJlJ.MerewHkR2zVU3OF8gPLXuk1UrVmvpcUGu', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contacto`
--
ALTER TABLE `contacto`
  ADD PRIMARY KEY (`id_contacto`);

--
-- Indexes for table `experiencia`
--
ALTER TABLE `experiencia`
  ADD PRIMARY KEY (`id_experiencia`);

--
-- Indexes for table `formacion`
--
ALTER TABLE `formacion`
  ADD PRIMARY KEY (`id_formacion`);

--
-- Indexes for table `habilidad`
--
ALTER TABLE `habilidad`
  ADD PRIMARY KEY (`id_habilidad`);

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id_persona`);

--
-- Indexes for table `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`id_proyecto`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
