-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-10-2020 a las 02:59:36
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectoaguadb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `fechaCreacion` date NOT NULL,
  `numeromedidor` varchar(25) NOT NULL,
  `idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idcliente`, `fechaCreacion`, `numeromedidor`, `idUsuario`) VALUES
(8, '2020-09-30', '4444444', 6),
(9, '2020-10-01', '2000000', 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `idempleado` int(11) NOT NULL,
  `cargo` varchar(100) NOT NULL,
  `clave` varchar(100) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `fechaCreacion` date NOT NULL,
  `idusuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`idempleado`, `cargo`, `clave`, `usuario`, `fechaCreacion`, `idusuario`) VALUES
(1, 'Tesorero', '12345', 'migue20', '2020-10-08', 7),
(2, 'Tesorero', 'isabel', 'ISA', '2020-10-02', 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lectura`
--

CREATE TABLE `lectura` (
  `idlectura` int(10) NOT NULL,
  `lecturaanterior` varchar(255) DEFAULT NULL,
  `lectura` varchar(15) NOT NULL,
  `fechaLecturaAnterior` date DEFAULT NULL,
  `fechaLectura` date NOT NULL,
  `consumo` int(11) NOT NULL,
  `estado` varchar(10) NOT NULL,
  `idcliente` int(10) NOT NULL,
  `fechapago` date DEFAULT NULL,
  `valorpago` double(255,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `lectura`
--

INSERT INTO `lectura` (`idlectura`, `lecturaanterior`, `lectura`, `fechaLecturaAnterior`, `fechaLectura`, `consumo`, `estado`, `idcliente`, `fechapago`, `valorpago`) VALUES
(26, '1000', '1070', '2020-10-04', '2020-11-04', 70, 'pagado', 8, '2020-10-04', 285),
(27, '1070', '1100', '2020-11-04', '2020-12-04', 30, 'pagado', 8, '2020-10-04', 85),
(28, '1100', '1120', '2020-12-04', '2021-01-05', 20, 'pagado', 8, '2020-10-04', 35);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planilla`
--

CREATE TABLE `planilla` (
  `idplanilla` int(11) NOT NULL,
  `fechaplanilla` date DEFAULT NULL,
  `valorsinexceso` double(255,0) DEFAULT NULL,
  `valorexceso` double(255,0) DEFAULT NULL,
  `total` double NOT NULL,
  `idlectura` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `planilla`
--

INSERT INTO `planilla` (`idplanilla`, `fechaplanilla`, `valorsinexceso`, `valorexceso`, `total`, `idlectura`) VALUES
(11, '2020-10-04', 260, 25, 286, 26),
(15, '2020-10-04', 60, 25, 86, 27),
(17, '2020-10-04', 10, 25, 36, 28);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(10) NOT NULL,
  `cedula` varchar(15) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `direccion` varchar(300) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `correo` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `cedula`, `nombre`, `apellido`, `fechaNacimiento`, `direccion`, `telefono`, `correo`) VALUES
(6, '0107355521', 'Diego', 'Farez', '1998-09-20', 'Pichincha', '4209444', 'farez@gmail.com'),
(7, '0111111', 'Miguel', 'Perez', '1980-07-20', 'Cañar', '3333333', 'migue@gmail.com'),
(8, '0105530968', 'Maria', 'Cisneros', '2000-10-19', 'Cuenca-Sayausi', '654654', 'mafercis2000@gmail.com'),
(11, '1111111', 'Isabel', 'Faican', '1991-10-19', 'Turi', '1236444', 'paul@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`),
  ADD KEY `fk_usuario` (`idUsuario`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`idempleado`),
  ADD KEY `fk_usuario_emp` (`idusuario`);

--
-- Indices de la tabla `lectura`
--
ALTER TABLE `lectura`
  ADD PRIMARY KEY (`idlectura`),
  ADD KEY `fk_cliente` (`idcliente`);

--
-- Indices de la tabla `planilla`
--
ALTER TABLE `planilla`
  ADD PRIMARY KEY (`idplanilla`),
  ADD KEY `fk_lectura` (`idlectura`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `idempleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `lectura`
--
ALTER TABLE `lectura`
  MODIFY `idlectura` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `planilla`
--
ALTER TABLE `planilla`
  MODIFY `idplanilla` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `fk_usuario` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idusuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `fk_usuario_emp` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `lectura`
--
ALTER TABLE `lectura`
  ADD CONSTRAINT `fk_cliente` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `planilla`
--
ALTER TABLE `planilla`
  ADD CONSTRAINT `fk_lectura` FOREIGN KEY (`idlectura`) REFERENCES `lectura` (`idlectura`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
