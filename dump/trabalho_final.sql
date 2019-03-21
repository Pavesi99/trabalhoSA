CREATE DATABASE  IF NOT EXISTS `trabalho_final` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `trabalho_final`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: trabalho_final
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.28-MariaDB

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
-- Table structure for table `agenda`
--

DROP TABLE IF EXISTS `agenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agenda` (
  `criAge` date DEFAULT NULL,
  `comAge` date DEFAULT NULL,
  `codCol` int(3) DEFAULT NULL,
  `codEqu` int(3) DEFAULT NULL,
  `titAge` varchar(30) DEFAULT NULL,
  `desAge` varchar(50) DEFAULT NULL,
  KEY `agendaEquipePK_idx` (`codEqu`),
  KEY `agendaColaboradorPK_idx` (`codCol`),
  CONSTRAINT `agendaColaboradorPK` FOREIGN KEY (`codCol`) REFERENCES `colaborador` (`codCol`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `agendaEquipePK` FOREIGN KEY (`codEqu`) REFERENCES `equipe` (`codEqu`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agenda`
--

LOCK TABLES `agenda` WRITE;
/*!40000 ALTER TABLE `agenda` DISABLE KEYS */;
INSERT INTO `agenda` VALUES ('0000-00-00','0000-00-00',1,2,'produzir/Vender','Voce deve produzir ou vender camisas'),('0000-00-00','0000-00-00',2,1,'Vender','Voce deve vender camisas'),('0000-00-00','0000-00-00',1,2,'produzir','Voce deve produzir camisas'),('2019-03-05','0000-00-00',1,2,'qualquer coisa','Voce deve fazer qualquer coisa');
/*!40000 ALTER TABLE `agenda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `colaborador`
--

DROP TABLE IF EXISTS `colaborador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `colaborador` (
  `codCol` int(5) NOT NULL AUTO_INCREMENT,
  `nomCol` varchar(45) DEFAULT NULL,
  `ruaCol` varchar(45) DEFAULT NULL,
  `baiCol` varchar(45) DEFAULT NULL,
  `numCol` int(5) DEFAULT NULL,
  `cepCol` int(9) DEFAULT NULL,
  `cidCol` varchar(45) DEFAULT NULL,
  `celCol` int(11) DEFAULT NULL,
  `dddCol` int(4) DEFAULT NULL,
  `tipCol` int(4) DEFAULT NULL,
  `usuCol` varchar(30) DEFAULT NULL,
  `senCol` varchar(45) DEFAULT NULL,
  `emaCol` varchar(120) DEFAULT NULL,
  `utiCol` date DEFAULT NULL,
  `datCol` date DEFAULT NULL,
  `estCol` int(3) DEFAULT NULL,
  `equCol` int(5) NOT NULL,
  PRIMARY KEY (`codCol`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colaborador`
--

LOCK TABLES `colaborador` WRITE;
/*!40000 ALTER TABLE `colaborador` DISABLE KEYS */;
INSERT INTO `colaborador` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(2,'Vilmar Pavesi Junior','Arnoldo Ristow','Zantão',593,88357200,'Brusque',999117121,47,1,'vilmar','202cb962ac59075b964b07152d234b70','vilmarjunior@gmail.voce',NULL,'0000-00-00',1,1),(3,'Ana','Arnoldo Cedrinho','Cedrinho',593,88357200,'Brusque',2147483647,47,2,'colaborador','202cb962ac59075b964b07152d234b70','vilmarjunior@gmail.voce',NULL,'0000-00-00',1,1),(4,'Gestor Teste','Arnoldo Ristow','Zantão',593,88357200,'Brusque',999117121,47,1,'gestor','202cb962ac59075b964b07152d234b70','vTeste@gmail.voce',NULL,'2000-10-00',1,2),(5,'Joao o INATIVO','Arnoldo Ristow','Centro',593,88357200,'Brusque',999117121,47,2,'inativo','202cb962ac59075b964b07152d234b70','vilmarjunior@gmail.voce',NULL,'0000-00-00',2,1);
/*!40000 ALTER TABLE `colaborador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipe`
--

DROP TABLE IF EXISTS `equipe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipe` (
  `codEqu` int(4) NOT NULL AUTO_INCREMENT,
  `nomEqu` varchar(20) DEFAULT NULL,
  `desEqu` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codEqu`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipe`
--

LOCK TABLES `equipe` WRITE;
/*!40000 ALTER TABLE `equipe` DISABLE KEYS */;
INSERT INTO `equipe` VALUES (1,'Vendas','Vendedores'),(2,'Confecção','Equipe destinada a produção em massa dos produtos'),(3,'Confecção','Equipe destinada a produção em massa dos produtos');
/*!40000 ALTER TABLE `equipe` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-21 16:52:47
