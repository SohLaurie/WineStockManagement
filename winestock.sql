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
(1,	'Chateau Margaux',	'Red',	'France',	2017,	50,	12000,	1),
(2,	'Penfolds Grange',	'Red',	'Australia',	2020,	30,	7500,	2),
(3,	'Tignanello',	'Red',	'Italy',	2019,	12,	15000,	3),
(4,	'Beringer Chardonnay',	'White',	'USA',	2019,	16,	30000,	4),
(5,	'CloudyBay Sauvignon Blanc',	'White',	'New Zealand',	2021,	45,	5500,	4),
(6,	'Vega Silica Unico',	'Red',	'Spain',	2010,	15,	60000,	5);

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
(1,	1,	5,	'2024-02-01 13:30:00',	6000,	2),
(2,	3,	2,	'2024-01-15 09:00:00',	22000,	3),
(3,	5,	3,	'2025-02-13 12:19:22',	55000,	4),
(4,	6,	1,	'2025-02-13 22:20:25',	100000,	4);

DROP TABLE IF EXISTS `suppliers`;
CREATE TABLE `suppliers` (
  `SupId` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`SupId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `suppliers` (`SupId`, `Name`, `Email`, `Phone`) VALUES
(1,	'French wines Ltd',	'jeandupont@fftx.com',	'+331 23 45 67 89'),
(2,	'Australian Wine imports',	'markthompson@awi.com',	'+61 2 7839 5432'),
(3,	'Italian wine masters ',	'luigirossi@iwm.it',	'+39 055 123 4567'),
(4,	'Napa Valley Distributors',	'emilycarter@nvd.com',	'+1 707 987 6543'),
(5,	'Spanish Vino Co',	'carlosfernandez@svc.com',	'+34 91 345 6789');

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
(1,	'Fomekong',	'237',	'admin'),
(2,	'Soh Laurie',	'123',	'admin'),
(3,	'Doloick',	'234',	'manager'),
(4,	'Malcom',	'456',	'saleperson');

-- 2025-02-13 22:58:42
