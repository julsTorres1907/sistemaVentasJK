-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 29-11-2022 a las 21:40:47
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemaVentasJK`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `CLIENTE`
--

CREATE TABLE `CLIENTE` (
  `idCliente` int(11) UNSIGNED NOT NULL,
  `cedCliente` varchar(55) NOT NULL,
  `nombCliente` varchar(55) NOT NULL,
  `direcCliente` varchar(55) DEFAULT NULL,
  `estadoCliente` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `CLIENTE`
--

INSERT INTO `CLIENTE` (`idCliente`, `cedCliente`, `nombCliente`, `direcCliente`, `estadoCliente`) VALUES
(1, '5892452', 'Bernardo Gomez', 'Crra 33B-No 97-28', '1'),
(2, '897568', 'Laura Rendon nn', 'Barrio Manzanares', '1'),
(3, '7549868', 'Pepito Gomez', 'Barrio Palermo', '1'),
(4, '6882567', 'Juan Gonzalez Mendieta', 'Barrio Varsovia', '1'),
(5, '678236', 'Juana rrsf', 'Barrio Apostolico', '1'),
(6, '773692', 'Juanito Maraña', 'Fabela 13 de julio', '1'),
(12, '34848', 'Densel Washinton', 'EEUU', '1'),
(13, '859392', 'Kelly Dahiana', 'Cable', '1'),
(15, '88382032', 'Maicol Mendoza', 'Cra 66 No 89-23', '1'),
(16, '523299', 'Gloria Amparo', 'Conjunto Residencial los Cedros', '1'),
(17, '1231231', 'Ian Ix', 'La enea Cra 77 no 1231', '1'),
(18, '123', 'Empleado de Prueba', 'UNAL', '1'),
(19, '75074591', 'Alejandro Castaño', 'Crra 9na #10-79 Barrio Chipre', '1'),
(20, '1193206011', 'Ian Ix Alarcon', 'Cra 36A #95-09', '1'),
(21, '1002608925', 'Leandro Garcia', 'Barrio Malabar', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EMPLEADO`
--

CREATE TABLE `EMPLEADO` (
  `IdEmple` int(11) UNSIGNED NOT NULL,
  `cedEmple` varchar(20) DEFAULT NULL,
  `nombEmple` varchar(20) DEFAULT NULL,
  `telEmple` varchar(20) DEFAULT NULL,
  `estadoEmple` varchar(1) DEFAULT NULL,
  `userEmple` varchar(20) NOT NULL,
  `passEmple` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `EMPLEADO`
--

INSERT INTO `EMPLEADO` (`IdEmple`, `cedEmple`, `nombEmple`, `telEmple`, `estadoEmple`, `userEmple`, `passEmple`) VALUES
(1, '1110599607', 'Julio Mario', '3203576262', '1', 'emple1', '1234'),
(2, '589453', 'Ix Mendieta', '3006534194', '1', 'emple2', '999'),
(3, '77929', 'Manuela', '3209345533', '1', 'emple001', '001'),
(5, '1110599607', 'Nelson Bonilla', '3177405051', '1', 'nelson01', '1234'),
(7, '30333990', 'Leonora Jaramillo', '3204726396', '1', 'leonor123', 'fabiolo123'),
(8, '30333990', 'Leonora Jaramillo', '3203564178', '1', 'leonor123', 'fabiolo123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `FACTURA`
--

CREATE TABLE `FACTURA` (
  `idFactura` int(11) UNSIGNED NOT NULL,
  `idVenta` int(11) UNSIGNED NOT NULL,
  `idProduct` int(11) UNSIGNED NOT NULL,
  `cantProductos` int(11) NOT NULL,
  `precioVenta` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `FACTURA`
--

INSERT INTO `FACTURA` (`idFactura`, `idVenta`, `idProduct`, `cantProductos`, `precioVenta`) VALUES
(17, 5, 4, 3, 200),
(18, 7, 1, 2, 4200),
(19, 7, 5, 4, 2000),
(20, 7, 3, 2, 4200),
(21, 8, 6, 2, 3200),
(22, 8, 7, 4, 3800),
(23, 9, 1, 6, 4200),
(24, 10, 1, 6, 4200),
(25, 11, 5, 4, 2000),
(26, 11, 6, 3, 3200),
(27, 11, 3, 6, 4200),
(28, 12, 1, 2, 4200);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `PRODUCTO`
--

CREATE TABLE `PRODUCTO` (
  `idProduct` int(11) UNSIGNED NOT NULL,
  `nombProduct` varchar(40) NOT NULL,
  `precioProduct` double NOT NULL,
  `stockProduct` int(11) NOT NULL,
  `estadoProduct` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `PRODUCTO`
--

INSERT INTO `PRODUCTO` (`idProduct`, `nombProduct`, `precioProduct`, `stockProduct`, `estadoProduct`) VALUES
(1, 'Leche COLANTA', 4200, 72, '1'),
(2, 'Speed Max 269ml', 1300, 200, '1'),
(3, 'Leche Alpina MAXILITRO', 4200, 94, '1'),
(4, 'Bianchi', 200, 66, '1'),
(5, 'Chocorramo', 2000, 96, '1'),
(6, 'Azucar UNAL 500g', 3200, 97, '1'),
(7, 'Arroz UNAL 250g', 3800, 100, '1'),
(8, 'Cigarrillos Lucky (1/2)', 4500, 90, '1'),
(9, 'Cubeta Huevos x24', 15000, 30, '1'),
(10, 'Harina UNAL 250g', 1800, 40, '1'),
(11, 'Aceite UNAL 500ml', 7800, 43, '1'),
(3982, 'Festival paq(x12)', 1000, 30, '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `VENTA`
--

CREATE TABLE `VENTA` (
  `idVenta` int(11) UNSIGNED NOT NULL,
  `idCliente` int(11) UNSIGNED NOT NULL,
  `idEmple` int(11) UNSIGNED NOT NULL,
  `numSerie` varchar(20) NOT NULL,
  `montoVenta` double NOT NULL,
  `fechaVenta` varchar(55) NOT NULL,
  `estadoVenta` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `VENTA`
--

INSERT INTO `VENTA` (`idVenta`, `idCliente`, `idEmple`, `numSerie`, `montoVenta`, `fechaVenta`, `estadoVenta`) VALUES
(5, 18, 1, '00000001', 600, '2022/10/27', '1'),
(6, 18, 1, '00000002', 3600, '2022/10/27', '1'),
(7, 12, 1, '00000003', 24800, '2022/10/28', '1'),
(8, 18, 1, '00000004', 21600, '2022/10/29', '1'),
(9, 18, 1, '00000005', 25200, '2022/10/29', '1'),
(10, 21, 1, '00000006', 25200, '2022/10/29', '1'),
(11, 18, 1, '00000007', 42800, '2022/10/29', '1'),
(12, 18, 1, '00000008', 8400, '2022/10/29', '1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `CLIENTE`
--
ALTER TABLE `CLIENTE`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `EMPLEADO`
--
ALTER TABLE `EMPLEADO`
  ADD PRIMARY KEY (`IdEmple`);

--
-- Indices de la tabla `FACTURA`
--
ALTER TABLE `FACTURA`
  ADD PRIMARY KEY (`idFactura`),
  ADD KEY `fk_factura_venta` (`idVenta`),
  ADD KEY `fk_factura_producto` (`idProduct`);

--
-- Indices de la tabla `PRODUCTO`
--
ALTER TABLE `PRODUCTO`
  ADD PRIMARY KEY (`idProduct`);

--
-- Indices de la tabla `VENTA`
--
ALTER TABLE `VENTA`
  ADD PRIMARY KEY (`idVenta`),
  ADD KEY `fk_venta_cliente` (`idCliente`),
  ADD KEY `fk_venta_empleado` (`idEmple`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `CLIENTE`
--
ALTER TABLE `CLIENTE`
  MODIFY `idCliente` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `EMPLEADO`
--
ALTER TABLE `EMPLEADO`
  MODIFY `IdEmple` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `FACTURA`
--
ALTER TABLE `FACTURA`
  MODIFY `idFactura` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `VENTA`
--
ALTER TABLE `VENTA`
  MODIFY `idVenta` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `FACTURA`
--
ALTER TABLE `FACTURA`
  ADD CONSTRAINT `fk_factura_producto` FOREIGN KEY (`idProduct`) REFERENCES `PRODUCTO` (`idProduct`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_factura_venta` FOREIGN KEY (`idVenta`) REFERENCES `VENTA` (`idVenta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `VENTA`
--
ALTER TABLE `VENTA`
  ADD CONSTRAINT `fk_venta_cliente` FOREIGN KEY (`idCliente`) REFERENCES `CLIENTE` (`idCliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_venta_empleado` FOREIGN KEY (`idEmple`) REFERENCES `EMPLEADO` (`IdEmple`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
