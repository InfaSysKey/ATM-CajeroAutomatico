-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bancacajero
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `movimientos`
--

DROP TABLE IF EXISTS `movimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movimientos` (
  `ID_MOVIMIENTO` int(11) NOT NULL AUTO_INCREMENT,
  `ID_CUENTA` int(11) DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `CONCEPTO` varchar(45) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  PRIMARY KEY (`ID_MOVIMIENTO`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientos`
--

LOCK TABLES `movimientos` WRITE;
/*!40000 ALTER TABLE `movimientos` DISABLE KEYS */;
INSERT INTO `movimientos` VALUES (87,1,2000,'Retirada','2018-06-10'),(88,2,1100,'Ingreso','2018-06-10'),(89,2,300,'Retirada','2018-06-10'),(90,1,6000,'Ingreso','2018-06-10'),(91,1,5000,'Ingreso','2018-06-10'),(92,1,1,'Ingreso','2018-06-10'),(93,1,3,'Retirada','2018-06-10'),(94,1,4000,'Retirada','2018-06-10'),(95,1,1000,'Retirada','2018-06-10'),(96,1,3000,'Retirada','2018-06-10'),(97,1,2999,'Retirada','2018-06-10'),(98,1,300,'Ingreso','2018-06-10'),(99,1,6000,'Ingreso','2018-06-10'),(100,1,6003,'Retirada','2018-06-10'),(101,1,30000,'Ingreso','2018-06-10'),(102,1,3000,'Retirada','2018-06-10'),(103,3,999,'Retirada','2018-06-10'),(104,3,1100,'Ingreso','2018-06-10'),(105,3,3,'Ingreso','2018-06-10'),(106,3,1123,'Ingreso','2018-06-10');
/*!40000 ALTER TABLE `movimientos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-10 21:27:46