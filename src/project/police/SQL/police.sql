-- MySQL dump 10.16  Distrib 10.1.21-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: localhost
-- ------------------------------------------------------
-- Server version	10.1.21-MariaDB

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Erick','Gichuhi','admin','admin');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cases`
--

DROP TABLE IF EXISTS `cases`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cases` (
  `case_id` int(11) NOT NULL AUTO_INCREMENT,
  `case_name` varchar(50) NOT NULL,
  `case_type` varchar(50) NOT NULL,
  PRIMARY KEY (`case_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cases`
--

LOCK TABLES `cases` WRITE;
/*!40000 ALTER TABLE `cases` DISABLE KEYS */;
INSERT INTO `cases` VALUES (4,'Robbery at Madaraka','Robbery with Violence');
/*!40000 ALTER TABLE `cases` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complainant`
--

DROP TABLE IF EXISTS `complainant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `complainant` (
  `complainant_id` int(11) NOT NULL AUTO_INCREMENT,
  `case_id` int(11) NOT NULL,
  `complainant_firstname` varchar(50) NOT NULL,
  `complainant_lastname` varchar(50) NOT NULL,
  `complainant_phone_number` int(11) NOT NULL,
  `nationalid` varchar(50) NOT NULL,
  PRIMARY KEY (`complainant_id`),
  KEY `case_id` (`case_id`),
  CONSTRAINT `complainant_ibfk_1` FOREIGN KEY (`case_id`) REFERENCES `cases` (`case_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complainant`
--

LOCK TABLES `complainant` WRITE;
/*!40000 ALTER TABLE `complainant` DISABLE KEYS */;
/*!40000 ALTER TABLE `complainant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `police`
--

DROP TABLE IF EXISTS `police`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `police` (
  `police_id` int(11) NOT NULL AUTO_INCREMENT,
  `police_firstname` varchar(50) NOT NULL,
  `police_lastname` varchar(50) NOT NULL,
  `police_phone_number` int(11) NOT NULL,
  `nationalid` varchar(50) NOT NULL,
  `rank` varchar(50) NOT NULL,
  `badge_number` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`police_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `police`
--

LOCK TABLES `police` WRITE;
/*!40000 ALTER TABLE `police` DISABLE KEYS */;
INSERT INTO `police` VALUES (1,'Erick','Gichuhi',787655561,'123456789','Sergeant','B001','Eagle007');
/*!40000 ALTER TABLE `police` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reporter`
--

DROP TABLE IF EXISTS `reporter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reporter` (
  `reporter_id` int(11) NOT NULL AUTO_INCREMENT,
  `case_id` int(11) NOT NULL,
  `reporter_firstname` varchar(50) NOT NULL,
  `reporter_lastname` varchar(50) NOT NULL,
  `reporter_phone_number` int(11) NOT NULL,
  `nationalid` varchar(50) NOT NULL,
  PRIMARY KEY (`reporter_id`),
  KEY `case_id` (`case_id`),
  CONSTRAINT `reporter_ibfk_1` FOREIGN KEY (`case_id`) REFERENCES `cases` (`case_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reporter`
--

LOCK TABLES `reporter` WRITE;
/*!40000 ALTER TABLE `reporter` DISABLE KEYS */;
/*!40000 ALTER TABLE `reporter` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-03  2:21:09
