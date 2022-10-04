-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 23, 2021 at 04:28 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `medcare`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE IF NOT EXISTS `doctor` (
  `DoctorID` varchar(20) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Gender` varchar(50) DEFAULT NULL,
  `Relationship` varchar(10) DEFAULT NULL,
  `Ward` varchar(10) DEFAULT NULL,
  `DOB` varchar(20) DEFAULT NULL,
  `DOR` varchar(20) DEFAULT NULL,
  `Specialization` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`DoctorID`, `Name`, `Phone`, `Email`, `Address`, `Gender`, `Relationship`, `Ward`, `DOB`, `DOR`, `Specialization`) VALUES
('Pawan', 'Pawan', '236589', '', 'fgdhdthfgddgfhg', 'Male', 'Single', '01', 'MMM d, y', 'MMM d, y', 'Allergy and immunology'),
('fdafaf', 'fdafaf', '64645', 'safafaf', 'asfasfas', 'Female', 'Married', '05', 'MMM d, y', 'MMM d, y', 'Diagnostic radiology'),
('kelum', 'kelum', '212658', 'fdsafgasda@gmail.com', 'Colombo', 'Male', 'Single', '02', 'MMM d, y', 'MMM d, y', 'Internal medicine'),
('5698', 'Supun', '0327865', 'supun@gmail.com', 'Kandy', 'Male', 'Single', '08', 'MMM d, y', 'MMM d, y', 'Emergency medicine'),
('369', 'hfdf', '635334', 'fdfhdfh', 'fdhdfhdf', 'Male', 'Single', '01', 'MMM d, y', 'MMM d, y', 'Allergy and immunology'),
('225', 'Supun', '125687', '', '', 'Male', 'Single', '01', 'MMM d, y', 'MMM d, y', 'Diagnostic radiology'),
('258', 'Nveen', '07756956', 'nveen@gmail.com', 'Kuliyapitiya', 'Male', 'Married', '04', 'MMM d, y', 'MMM d, y', 'Psychiatry'),
('2369', 'Kasun', '07756235', '', 'Kandy', 'Male', 'Single', '08', 'MMM d, y', 'MMM d, y', 'Family medicine');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `PatientID` varchar(20) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  `Symptom` varchar(50) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Amount` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`PatientID`, `Name`, `Address`, `Phone`, `Symptom`, `Gender`, `Email`, `Amount`) VALUES
('1545454', 'huhuug', 'gugygygg', '54584545', 'Other', 'Male', 'ijhihuhuhuh', 'Rs.1000'),
('256984', 'Pawan', 'Colombo', '2365987', 'Other', 'Male', '', 'Rs.1000'),
('565212', 'Saman', 'Kurunegala', '077895662', 'Other', 'Male', '', 'Rs.5000'),
('2258', 'yrtyrt', 'rtyrty', '44654544', 'Leg pain', 'Female', '', 'Rs.2000'),
('23658', 'Kelum', 'Kurunegala', '264564654', 'Sore Throat', 'Male', '', 'Rs.1000'),
('25253', 'sdgsdg', 'sdgsdg', '5433', 'Back pain', 'Female', '', 'Rs.1000'),
('5656', 'Madush', 'Kurun', '5657758', 'Leg pain', 'Male', '', 'Rs.2000'),
('jhjfh', 'gfjfgjf', 'fgjfgj', '32658899', 'Sinusitis', 'Female', '', 'Rs.10000'),
('3462463', 'dfdfhdfh', 'dfhdfhdfhdfh', '46848458', 'Other', 'Male', '', 'Rs.1000'),
('2478', 'Kasun', 'N0.254 kuliyapitiya road,narammala', '0375689', 'Back pain', 'Male', '', 'Rs.2000'),
('2568', 'Madush', '', '', 'Other', 'Male', '', 'Rs.1000'),
('543634', 'gdgdg', 'cxvxc', '435636346', 'Fever', 'Female', '', 'Rs.2000'),
('2365', 'Max', 'Italy', '235987', 'Other', 'Male', '', 'Rs.1000');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `UserName` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `PetName` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserName`, `Password`, `PetName`) VALUES
(NULL, NULL, NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
