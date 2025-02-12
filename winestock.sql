-- Adminer 4.8.1 MySQL 8.0.30 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `Type` varchar(50) DEFAULT NULL,
  `Country` varchar(50) DEFAULT NULL,
  `Year` int DEFAULT NULL,
  `Quantity` int NOT NULL,
  `Price` int DEFAULT NULL,
  `supID` int DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `fk_supID` (`supID`),
  CONSTRAINT `fk_supID` FOREIGN KEY (`supID`) REFERENCES `suppliers` (`SupId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `item` (`Id`, `Name`, `Type`, `Country`, `Year`, `Quantity`, `Price`, `supID`) VALUES
(2,	'hdjjsjdh',	'sndns',	'kksjd',	2018,	23,	2100,	3),
(6,	'MOULIN DE FRANCE',	'RED',	'FRANCE',	200,	12,	10050,	3);

DROP TABLE IF EXISTS `notifications`;
CREATE TABLE `notifications` (
  `NoteId` int NOT NULL AUTO_INCREMENT,
  `userID` int NOT NULL,
  `Message` varchar(255) NOT NULL,
  `Date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `IsRead` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`NoteId`),
  KEY `userID` (`userID`),
  CONSTRAINT `notifications_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `users` (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `sales`;
CREATE TABLE `sales` (
  `SalesId` int NOT NULL AUTO_INCREMENT,
  `Wine_id` int DEFAULT NULL,
  `Quantity_sold` int NOT NULL,
  `Sale_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `Total_price` int DEFAULT NULL,
  `StaffId` int DEFAULT NULL,
  PRIMARY KEY (`SalesId`),
  KEY `Wine_id` (`Wine_id`),
  KEY `StaffId` (`StaffId`),
  CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`Wine_id`) REFERENCES `item` (`Id`) ON DELETE CASCADE,
  CONSTRAINT `sales_ibfk_2` FOREIGN KEY (`StaffId`) REFERENCES `users` (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `sales` (`SalesId`, `Wine_id`, `Quantity_sold`, `Sale_date`, `Total_price`, `StaffId`) VALUES
(1,	2,	101,	'2000-10-19 23:00:00',	200,	2),
(10,	2,	19,	'2000-12-01 23:00:00',	100,	2);

DROP TABLE IF EXISTS `suppliers`;
CREATE TABLE `suppliers` (
  `SupId` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`SupId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `suppliers` (`SupId`, `Name`, `Email`, `Phone`) VALUES
(3,	'sqSS',	'abbb',	'QSSDSJOoz');

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `UserId` int NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Role` enum('admin','manager','saleperson') DEFAULT 'manager',
  PRIMARY KEY (`UserId`),
  UNIQUE KEY `Username` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `users` (`UserId`, `Username`, `Password`, `Role`) VALUES
(2,	'LOLO',	'123',	'admin'),
(3,	'Doo',	'234',	'manager');

-- 2025-02-12 10:48:14
