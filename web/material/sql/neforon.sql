-- MySQL dump 10.13  Distrib 5.6.19, for osx10.7 (i386)
--
-- Host: 127.0.0.1    Database: neforon
-- ------------------------------------------------------
-- Server version	5.6.23

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
-- Table structure for table `avgprice`
--

DROP TABLE IF EXISTS `avgprice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `avgprice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` varchar(45) NOT NULL,
  `company_name` varchar(45) NOT NULL,
  `avg_price` int(11) NOT NULL,
  `activity_state` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avgprice`
--

LOCK TABLES `avgprice` WRITE;
/*!40000 ALTER TABLE `avgprice` DISABLE KEYS */;
INSERT INTO `avgprice` VALUES (15,'neforon_wxolew88','万科·新都会',21000,'开盘热销中'),(16,'neforon_lfflev31','万科·新都会',21000,'开盘热销中'),(17,'neforon_foevew16','万科·新都会',21000,'开盘热销中'),(18,'neforon_eilyvi63','万科·新都会',21000,'开盘热销中'),(19,'neforon_loelyf72','万科·新都会',21000,'开盘热销中'),(20,'neforon_xlreif6','万科·新都会',21000,'开盘热销中');
/*!40000 ALTER TABLE `avgprice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coupon`
--

DROP TABLE IF EXISTS `coupon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coupon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` varchar(45) NOT NULL,
  `coupon_detail` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coupon`
--

LOCK TABLES `coupon` WRITE;
/*!40000 ALTER TABLE `coupon` DISABLE KEYS */;
INSERT INTO `coupon` VALUES (14,'neforon_wxolew88','付1万元，总房款立减3万元'),(15,'neforon_lfflev31','付1万元，总房款立减3万元'),(16,'neforon_foevew16','付1万元，总房款立减3万元'),(17,'neforon_eilyvi63','付1万元，总房款立减3万元'),(18,'neforon_loelyf72','付1万元，总房款立减3万元'),(19,'neforon_xlreif6','付1万元，总房款立减3万元');
/*!40000 ALTER TABLE `coupon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `earn`
--

DROP TABLE IF EXISTS `earn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `earn` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` varchar(45) NOT NULL,
  `slogan_path` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `earn`
--

LOCK TABLES `earn` WRITE;
/*!40000 ALTER TABLE `earn` DISABLE KEYS */;
INSERT INTO `earn` VALUES (51,'neforon_wxolew88','/material/slogan/741131c3-f515-4322-a34a-a8224483c8f2.png'),(52,'neforon_lfflev31','/material/slogan/a4f013f3-44f5-47d4-b900-75b9326034b3.png'),(53,'neforon_foevew16','/material/slogan/a96a0ad2-7b54-469e-a37f-a78ea277aca2.png'),(54,'neforon_eilyvi63','/material/slogan/abe4c63c-0301-4dc9-ba37-cabd74967ec5.png'),(55,'neforon_loelyf72','/material/slogan/581494c3-50c9-453f-8418-f686a8bbdb45.png'),(56,'neforon_xlreif6','/material/slogan/4d83b70f-57d1-4514-8811-18aa8639e649.png');
/*!40000 ALTER TABLE `earn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guidance`
--

DROP TABLE IF EXISTS `guidance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guidance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` varchar(45) DEFAULT NULL,
  `guidance_title` varchar(45) NOT NULL,
  `guidance_detail` varchar(100) NOT NULL,
  `step` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guidance`
--

LOCK TABLES `guidance` WRITE;
/*!40000 ALTER TABLE `guidance` DISABLE KEYS */;
INSERT INTO `guidance` VALUES (53,'neforon_wxolew88','内扫二维码加入万科粉丝团','截屏二维码并保存至手机相册。',1),(54,'neforon_wxolew88','内扫二维码加入万科粉丝团','打开您的微信，点击右上角&quot;+&quot;，点击&quot;扫一扫&quot;。',2),(55,'neforon_wxolew88','内扫二维码加入万科粉丝团','进入&quot;扫一扫界面&quot;，点击右上角&quot;相册&quot;，选中刚保存的二维码图片。',3),(56,'neforon_wxolew88','内扫二维码加入万科粉丝团','点击&quot;关注&quot;。',4),(57,'neforon_lfflev31','内扫二维码加入万科粉丝团','截屏二维码并保存至手机相册。',1),(58,'neforon_lfflev31','内扫二维码加入万科粉丝团','打开您的微信，点击右上角&quot;+&quot;，点击&quot;扫一扫&quot;。',2),(59,'neforon_lfflev31','内扫二维码加入万科粉丝团','进入&quot;扫一扫界面&quot;，点击右上角&quot;相册&quot;，选中刚保存的二维码图片。',3),(60,'neforon_lfflev31','内扫二维码加入万科粉丝团','点击&quot;关注&quot;。',4),(61,'neforon_foevew16','初次见面吗？内扫二维码关注我哦','截屏二维码并保存至手机相册。',1),(62,'neforon_foevew16','初次见面吗？内扫二维码关注我哦','打开您的微信，点击右上角&quot;+&quot;，点击&quot;扫一扫&quot;。',2),(63,'neforon_foevew16','初次见面吗？内扫二维码关注我哦','进入&quot;扫一扫界面&quot;，点击右上角&quot;相册&quot;，选中刚保存的二维码图片。',3),(64,'neforon_foevew16','初次见面吗？内扫二维码关注我哦','点击&quot;关注&quot;。',4),(65,'neforon_eilyvi63','初次见面吗？内扫二维码关注我哦','截屏二维码并保存至手机相册。',1),(66,'neforon_eilyvi63','初次见面吗？内扫二维码关注我哦','打开您的微信，点击右上角&quot;+&quot;，点击&quot;扫一扫&quot;。',2),(67,'neforon_eilyvi63','初次见面吗？内扫二维码关注我哦','进入&quot;扫一扫界面&quot;，点击右上角&quot;相册&quot;，选中刚保存的二维码图片。',3),(68,'neforon_eilyvi63','初次见面吗？内扫二维码关注我哦','点击&quot;关注&quot;。',4),(69,'neforon_loelyf72','内扫二维码加入万科粉丝团','截屏二维码并保存至手机相册。',1),(70,'neforon_loelyf72','内扫二维码加入万科粉丝团','打开您的微信，点击右上角&quot;+&quot;，点击&quot;扫一扫&quot;。',2),(71,'neforon_loelyf72','内扫二维码加入万科粉丝团','进入&quot;扫一扫界面&quot;，点击右上角&quot;相册&quot;，选中刚保存的二维码图片。',3),(72,'neforon_loelyf72','内扫二维码加入万科粉丝团','点击&quot;关注&quot;。',4),(73,'neforon_xlreif6','内扫二维码加入万科粉丝团','截屏二维码并保存至手机相册。',1),(74,'neforon_xlreif6','内扫二维码加入万科粉丝团','打开您的微信，点击右上角&quot;+&quot;，点击&quot;扫一扫&quot;。',2),(75,'neforon_xlreif6','内扫二维码加入万科粉丝团','进入&quot;扫一扫界面&quot;，点击右上角&quot;相册&quot;，选中刚保存的二维码图片。',3),(76,'neforon_xlreif6','内扫二维码加入万科粉丝团','点击&quot;关注&quot;。',4);
/*!40000 ALTER TABLE `guidance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `housetype`
--

DROP TABLE IF EXISTS `housetype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `housetype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` varchar(45) NOT NULL,
  `house_pic_path` varchar(200) NOT NULL,
  `address` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `housetype`
--

LOCK TABLES `housetype` WRITE;
/*!40000 ALTER TABLE `housetype` DISABLE KEYS */;
INSERT INTO `housetype` VALUES (14,'neforon_wxolew88','/material/type/49547708-c846-42f2-ba84-00fad68dddc7.png','金阳西街（南京南站南侧梅香路以西）'),(15,'neforon_lfflev31','/material/type/591c25c7-bdab-4b6a-a8c1-fc06f8981bef.png','金阳西街（南京南站南侧梅香路以西）'),(16,'neforon_foevew16','/material/type/fc923f73-3182-44f7-914b-f448547ed71f.png','金阳西街（南京南站南侧梅香路以西）'),(17,'neforon_eilyvi63','/material/type/8378a296-dd84-41ec-a2b5-de7a214854e9.png','金阳西街（南京南站南侧梅香路以西）'),(18,'neforon_loelyf72','/material/type/2dfbbd9c-4648-4b2e-be0c-cb43f892a882.png','金阳西街（南京南站南侧梅香路以西）'),(19,'neforon_xlreif6','/material/type/10281d66-70cc-4e97-b355-4afffcf6e995.png','金阳西街（南京南站南侧梅香路以西）');
/*!40000 ALTER TABLE `housetype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manager`
--

DROP TABLE IF EXISTS `manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(200) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manager`
--

LOCK TABLES `manager` WRITE;
/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
INSERT INTO `manager` VALUES (1,'admin','BA0F58EA98E159854D3434CE2B6B04E1');
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `premise_advantage`
--

DROP TABLE IF EXISTS `premise_advantage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `premise_advantage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` varchar(45) NOT NULL,
  `advantage` varchar(200) NOT NULL,
  `step` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `premise_advantage`
--

LOCK TABLES `premise_advantage` WRITE;
/*!40000 ALTER TABLE `premise_advantage` DISABLE KEYS */;
INSERT INTO `premise_advantage` VALUES (53,'neforon_wxolew88','区位优势：南京南站为核心的宁南地区，将成为未来发展空间最大，势头最猛的地区。',1),(54,'neforon_wxolew88','配套优势：10分钟成熟生活圈，汇聚永辉超市、商场、特色餐饮、KTV、中影国际影城等。',2),(55,'neforon_wxolew88','景观优势：一条\"时光漫步道\"连贯多个主题景观团。成长乐园、醒晨吧，给孩子和老人预留的不同主题户外活动空间，享更多鲜氧运动。',3),(56,'neforon_wxolew88','交通优势：南京南站，汇聚4条地铁线（1、3号线运行中）、6条城市快速通道、25条公交线。',4),(57,'neforon_lfflev31','区位优势：南京南站为核心的宁南地区，将成为未来发展空间最大，势头最猛的地区。',1),(58,'neforon_lfflev31','配套优势：10分钟成熟生活圈，汇聚永辉超市、商场、特色餐饮、KTV、中影国际影城等。',2),(59,'neforon_lfflev31','景观优势：一条\"时光漫步道\"连贯多个主题景观团。成长乐园、醒晨吧，给孩子和老人预留的不同主题户外活动空间，享更多鲜氧运动。',3),(60,'neforon_lfflev31','交通优势：南京南站，汇聚4条地铁线（1、3号线运行中）、6条城市快速通道、25条公交线。',4),(61,'neforon_foevew16','区位优势：南京南站为核心的宁南地区，将成为未来发展空间最大，势头最猛的地区。',1),(62,'neforon_foevew16','配套优势：10分钟成熟生活圈，汇聚永辉超市、商场、特色餐饮、KTV、中影国际影城等。',2),(63,'neforon_foevew16','景观优势：一条“时光漫步道”连贯多个主题景观组团。成长乐园、醒晨吧，給孩子与老人预留的不同主题户外活动空间，享更多鲜痒运动。',3),(64,'neforon_foevew16','交通优势：南京南站，汇聚4条地铁（1、3号线运行中）、6条城市快速通道、25条公交线。',4),(65,'neforon_eilyvi63','区位优势：南京南站为核心的宁南地区，将成为未来发展空间最大，势头最猛的地区。',1),(66,'neforon_eilyvi63','配套优势：10分钟成熟生活圈，汇聚永辉超市、商场、特色餐饮、KTV、中影国际影城等。',2),(67,'neforon_eilyvi63','景观优势：一条“时光漫步道”连贯多个主题景观组团。成长乐园、醒晨吧，給孩子与老人预留的不同主题户外活动空间，享更多鲜痒运动。',3),(68,'neforon_eilyvi63','交通优势：南京南站，汇聚4条地铁（1、3号线运行中）、6条城市快速通道、25条公交线。',4),(69,'neforon_loelyf72','区位优势：南京南站为核心的宁南地区，将成为未来发展空间最大，势头最猛的地区。',1),(70,'neforon_loelyf72','配套优势：10分钟成熟生活圈，汇聚永辉超市、商场、特色餐饮、KTV、中影国际影城等。',2),(71,'neforon_loelyf72','景观优势：一条\"时光漫步道\"连贯多个主题景观团。成长乐园、醒晨吧，给孩子和老人预留的不同主题户外活动空间，享更多鲜氧运动。',3),(72,'neforon_loelyf72','交通优势：南京南站，汇聚4条地铁线（1、3号线运行中）、6条城市快速通道、25条公交线。',4),(73,'neforon_xlreif6','区位优势：南京南站为核心的宁南地区，将成为未来发展空间最大，势头最猛的地区。',1),(74,'neforon_xlreif6','配套优势：10分钟成熟生活圈，汇聚永辉超市、商场、特色餐饮、KTV、中影国际影城等。',2),(75,'neforon_xlreif6','景观优势：一条\"时光漫步道\"连贯多个主题景观团。成长乐园、醒晨吧，给孩子和老人预留的不同主题户外活动空间，享更多鲜氧运动。',3),(76,'neforon_xlreif6','交通优势：南京南站，汇聚4条地铁线（1、3号线运行中）、6条城市快速通道、25条公交线。',4);
/*!40000 ALTER TABLE `premise_advantage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `premiseview`
--

DROP TABLE IF EXISTS `premiseview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `premiseview` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` varchar(45) NOT NULL,
  `preview_view_path` varchar(200) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `premiseview`
--

LOCK TABLES `premiseview` WRITE;
/*!40000 ALTER TABLE `premiseview` DISABLE KEYS */;
INSERT INTO `premiseview` VALUES (15,'neforon_wxolew88','/material/buildview/14a4fd02-15b9-474c-85cf-b92eb2c6d40d.png'),(16,'neforon_lfflev31','/material/buildview/c1065e2c-0bc5-47ee-9e66-59f98f5141c0.png'),(17,'neforon_foevew16','/material/buildview/03759058-8aff-402a-ba78-d0f961e84ba6.png'),(18,'neforon_eilyvi63','/material/buildview/644e2e89-4538-48f4-aec4-88ab77c009e3.png'),(19,'neforon_loelyf72','/material/buildview/44923707-367d-493d-97da-1b71a1a08153.png'),(20,'neforon_xlreif6','/material/buildview/ed3372a7-4f81-43d4-bf8c-06f26ae4f849.png');
/*!40000 ALTER TABLE `premiseview` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '楼盘项目在数据库中的id，为数据库使用，自增长',
  `project_id` varchar(45) NOT NULL COMMENT '项目的id，由后台系统生成',
  `project_name` varchar(50) NOT NULL COMMENT '项目的名字',
  `status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `project_id_UNIQUE` (`project_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (9,'neforon_wxolew88','万科·新都会',1),(10,'neforon_yeelel62','万科·新都会',0),(11,'neforon_lfflev31','万科·新都会',0),(12,'neforon_foevew16','万科·新都会',1),(13,'neforon_eilyvi63','万科·新都会',1),(14,'neforon_loelyf72','万科·新都会',1),(15,'neforon_xlreif6','万科·新都会',1);
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qrcode`
--

DROP TABLE IF EXISTS `qrcode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qrcode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` varchar(45) NOT NULL,
  `qr_path` varchar(200) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `project_id_UNIQUE` (`project_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qrcode`
--

LOCK TABLES `qrcode` WRITE;
/*!40000 ALTER TABLE `qrcode` DISABLE KEYS */;
INSERT INTO `qrcode` VALUES (14,'neforon_wxolew88','/material/qrcode/371d6016-6ceb-401f-89ec-7e020dc3aa1b.png'),(15,'neforon_lfflev31','/material/qrcode/4f706c57-e230-4273-9a75-2ff8e3bf9508.png'),(16,'neforon_foevew16','/material/qrcode/4cf1172f-943a-4cb7-8787-70f07456027a.png'),(17,'neforon_eilyvi63','/material/qrcode/1f5483ae-8d86-4cdf-91d5-97769abc0c7a.png'),(18,'neforon_loelyf72','/material/qrcode/e2dc3b0e-9b8e-4fc3-94fd-3bbabf550e7d.png'),(19,'neforon_xlreif6','/material/qrcode/362f5efb-c563-4101-bc35-b48b78c5c5f8.png');
/*!40000 ALTER TABLE `qrcode` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-07 21:59:13
