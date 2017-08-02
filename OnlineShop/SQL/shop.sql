-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.1.41-community - MySQL Community Server (GPL)
-- Операционная система:         Win32
-- HeidiSQL Версия:              9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Дамп структуры базы данных onlineshop
CREATE DATABASE IF NOT EXISTS `onlineshop` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `onlineshop`;

-- Дамп структуры для таблица onlineshop.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) DEFAULT '0',
  `password` varchar(50) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы onlineshop.admin: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

-- Дамп структуры для таблица onlineshop.category
CREATE TABLE IF NOT EXISTS `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nameCategory` varchar(50) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `imageCategory` mediumblob,
  `availability` varchar(50) DEFAULT NULL,
  `language_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_category_language` (`language_id`),
  CONSTRAINT `FK_category_language` FOREIGN KEY (`language_id`) REFERENCES `language` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы onlineshop.category: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;

-- Дамп структуры для таблица onlineshop.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) DEFAULT '0',
  `password` varchar(50) DEFAULT '0',
  `contacts` varchar(100) DEFAULT '0',
  `status` varchar(100) DEFAULT '0',
  `language_id` bigint(20) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK_customer_language` (`language_id`),
  CONSTRAINT `FK_customer_language` FOREIGN KEY (`language_id`) REFERENCES `language` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы onlineshop.customer: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

-- Дамп структуры для таблица onlineshop.image
CREATE TABLE IF NOT EXISTS `image` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` mediumblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы onlineshop.image: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
/*!40000 ALTER TABLE `image` ENABLE KEYS */;

-- Дамп структуры для таблица onlineshop.language
CREATE TABLE IF NOT EXISTS `language` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `russian` varchar(50) DEFAULT '0',
  `english` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы onlineshop.language: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `language` DISABLE KEYS */;
/*!40000 ALTER TABLE `language` ENABLE KEYS */;

-- Дамп структуры для таблица onlineshop.manufacturer
CREATE TABLE IF NOT EXISTS `manufacturer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nameFactory` varchar(50) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы onlineshop.manufacturer: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `manufacturer` DISABLE KEYS */;
/*!40000 ALTER TABLE `manufacturer` ENABLE KEYS */;

-- Дамп структуры для таблица onlineshop.option
CREATE TABLE IF NOT EXISTS `option` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `color` varchar(50) NOT NULL DEFAULT '0',
  `weight` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы onlineshop.option: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `option` DISABLE KEYS */;
/*!40000 ALTER TABLE `option` ENABLE KEYS */;

-- Дамп структуры для таблица onlineshop.order
CREATE TABLE IF NOT EXISTS `order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `amountOrder` int(11) DEFAULT NULL,
  `priceOrder` double DEFAULT NULL,
  `totalPrice` double DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_order_customer` (`customer_id`),
  KEY `FK_order_product` (`product_id`),
  CONSTRAINT `FK_order_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `FK_order_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы onlineshop.order: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;

-- Дамп структуры для таблица onlineshop.product
CREATE TABLE IF NOT EXISTS `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) DEFAULT '0',
  `manufacturer_id` bigint(20) DEFAULT '0',
  `nameProduct` varchar(100) DEFAULT '0',
  `description` varchar(1000) DEFAULT '0',
  `image_id` bigint(20) DEFAULT '0',
  `price` double DEFAULT '0',
  `availability` varchar(50) DEFAULT '0',
  `amount` int(11) DEFAULT '0',
  `option_id` bigint(20) DEFAULT '0',
  `language_id` bigint(20) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK_product_manufacturer` (`manufacturer_id`),
  KEY `FK_product_category` (`category_id`),
  KEY `FK_product_language` (`language_id`),
  KEY `FK_product_image` (`image_id`),
  KEY `FK_product_option` (`option_id`),
  CONSTRAINT `FK_product_category` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`),
  CONSTRAINT `FK_product_image` FOREIGN KEY (`image_id`) REFERENCES `image` (`id`),
  CONSTRAINT `FK_product_language` FOREIGN KEY (`language_id`) REFERENCES `language` (`id`),
  CONSTRAINT `FK_product_manufacturer` FOREIGN KEY (`manufacturer_id`) REFERENCES `manufacturer` (`id`),
  CONSTRAINT `FK_product_option` FOREIGN KEY (`option_id`) REFERENCES `option` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы onlineshop.product: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
