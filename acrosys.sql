-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2023 at 10:29 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `acrosys`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_attendees`
--

CREATE TABLE `tbl_attendees` (
  `id` int(11) NOT NULL,
  `event_code` varchar(5) NOT NULL,
  `client_name` varchar(50) NOT NULL,
  `client_age` int(3) NOT NULL,
  `client_gender` varchar(6) NOT NULL,
  `control_number` varchar(20) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_attendees`
--

INSERT INTO `tbl_attendees` (`id`, `event_code`, `client_name`, `client_age`, `client_gender`, `control_number`, `created_at`, `updated_at`) VALUES
(1, 'DEV12', 'ANGEL', 19, 'Female', 'ACROSYS0000000001', '2023-11-22 09:09:34', '2023-11-22 09:09:34'),
(2, 'DEV12', 'RYLE', 19, 'Female', 'ACROSYS0000000002', '2023-11-22 09:18:09', '2023-11-22 09:18:09');

--
-- Triggers `tbl_attendees`
--
DELIMITER $$
CREATE TRIGGER `getID` BEFORE INSERT ON `tbl_attendees` FOR EACH ROW BEGIN
	INSERT INTO tbl_ctrln VALUES (NULL);
    SET NEW.control_number = CONCAT("ACROSYS", 
LPAD(LAST_INSERT_ID(), 10, "0"));
	END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_ctrln`
--

CREATE TABLE `tbl_ctrln` (
  `id` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_ctrln`
--

INSERT INTO `tbl_ctrln` (`id`) VALUES
(1),
(2);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_event`
--

CREATE TABLE `tbl_event` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `event_code` varchar(5) NOT NULL,
  `description` varchar(300) NOT NULL,
  `date` datetime NOT NULL,
  `total_attendees` int(11) NOT NULL,
  `checked_in` int(11) NOT NULL,
  `pending` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `permission` varchar(10) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_attendees`
--
ALTER TABLE `tbl_attendees`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_ctrln`
--
ALTER TABLE `tbl_ctrln`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_event`
--
ALTER TABLE `tbl_event`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_attendees`
--
ALTER TABLE `tbl_attendees`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_ctrln`
--
ALTER TABLE `tbl_ctrln`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_event`
--
ALTER TABLE `tbl_event`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
