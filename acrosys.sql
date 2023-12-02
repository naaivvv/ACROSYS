-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2023 at 05:13 AM
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
  `qr_name` text DEFAULT NULL,
  `qr_path` text DEFAULT NULL,
  `qr_imagefile` blob DEFAULT NULL,
  `isChecked_in` tinyint(1) NOT NULL DEFAULT 0,
  `checkIn_time` timestamp NULL DEFAULT NULL,
  `checkedOut_time` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_attendees`
--

INSERT INTO `tbl_attendees` (`id`, `event_code`, `client_name`, `client_age`, `client_gender`, `control_number`, `qr_name`, `qr_path`, `qr_imagefile`, `isChecked_in`, `checkIn_time`, `checkedOut_time`, `created_at`, `updated_at`) VALUES
(1, 'DEV', 'KARLRYLE', 19, 'FEMALE', 'DEV0000000001', '', '', '', 0, NULL, NULL, '2023-11-23 06:38:17', '2023-11-23 06:38:17'),
(2, 'GIE', 'GEANNE', 19, 'FEMALE', 'GIE0000000002', '', '', '', 0, NULL, NULL, '2023-11-23 06:47:17', '2023-11-23 06:47:17'),
(3, 'GIE', 'ANGEL', 19, 'FEMALE', 'GIE0000000003', '', '', '', 0, NULL, NULL, '2023-11-23 08:43:14', '2023-11-23 08:43:14'),
(4, 'DEV', 'ANGEL', 19, 'FEMALE', 'DEV0000000004', '', '', '', 0, NULL, NULL, '2023-11-23 08:43:38', '2023-11-23 08:43:38'),
(5, 'DEV', 'HANS', 19, 'MALE', 'DEV0000000005', '', '', '', 0, NULL, NULL, '2023-11-23 08:43:52', '2023-11-24 04:32:13'),
(6, 'DEV', 'EDWIN', 19, 'MALE', 'DEV0000000006', '', '', '', 0, NULL, NULL, '2023-11-23 08:44:09', '2023-11-23 08:44:09'),
(8, 'DEV', 'Jay', 21, 'Male', 'DEV0000000033', NULL, NULL, NULL, 0, NULL, NULL, '2023-12-02 03:09:14', '2023-12-02 03:09:14'),
(9, 'DEV', 'JAY', 21, 'Male', 'DEV0000000034', NULL, NULL, NULL, 0, NULL, NULL, '2023-12-02 03:49:00', '2023-12-02 03:49:00'),
(10, 'DEV', 'Jayz', 21, 'Male', 'DEV0000000035', NULL, NULL, NULL, 0, NULL, NULL, '2023-12-02 03:52:48', '2023-12-02 03:52:48'),
(11, 'DEV', 'Try', 21, 'Male', 'DEV0000000036', NULL, NULL, NULL, 0, NULL, NULL, '2023-12-02 03:54:15', '2023-12-02 03:54:15'),
(12, 'DEV', 'TRY2', 21, 'Female', 'DEV0000000037', NULL, NULL, NULL, 0, NULL, NULL, '2023-12-02 04:07:10', '2023-12-02 04:07:10'),
(13, 'DEV', 'FINAL', 21, 'Male', 'DEV0000000038', 'DEV0000000038.PNG', 'C:\\Users\\Batch 4\\Documents\\GitHub\\ACROSYS\\src\\com\\acrosys\\qrcodes\\DEV0000000038.PNG', 0x89504e470d0a1a0a0000000d494844520000007d0000007d08060000008f806c250000053349444154785eed91418e23490c03fdff4fefc2d73838a04ed23dd5ca0078312996d27afd7759c78b3f5cfe3ef7e80bb9475fc83dfa42eed117728fbe907bf485dca32fe41e7d21f7e80bb9475fc83dfa42eed117728fbe907bf485dca32fe41e7d21f7e80bb9475f48fce8afd7ebab22f429c3f2f4db6a106fe5d26d11fa946179fa6d3588b772e9b6087dcab03cfdb61ac45bb9745b843e65589e7e5b0de2adeda5a7fde9bcf9a7b4fbdfc45bdb4b4ffbd379f34f69f7bf89b7b6979ef6a7f3e69fd2ee7f136f6d2f3ded4fe7cd3fa5ddff26de6a4bd33791a7f926627e8278ab2d4ddf449ee69b88f909e2adb6347d13799a6f22e62788b7dad2f44de469be89989f20de6a4bd33791539fa4f3f44dc4fc04f1565b9abe899cfa249da76f22e62788b7dad2f44de4d427e93c7d13313f41bcd596a66f22a73e49e7e99b88f909e2adb6347d1399faa629364fdf44cc4f106fb5a5e99bc8d4374db179fa26627e8278ab2d4ddf44a6be698acdd33711f313c45b6d69fa2632f54d536c9ebe89989f20deda5ebadd6fb4bfdfee7f136f6d2fddee37dadf6ff7bf89b7b6976ef71bedefb7fbdfc45bdb4bb7fb8df6f7dbfd6fe2ad5cba2df26dbfad06f1562edd16f9b6df5683782b976e8b7cdb6fab41bc954bb745beedb7d5a0d3fa0fc13f91dac89f7f358f4c6de4cfbf9a47a636f2e75fcd23531b89bf9a7fea5486e54f7d729a3711f313c45bb9f45486e54f7d729a3711f313c45bb9f45486e54f7d729a3711f313c45bb9f45486e54f7d729a3711f313c45b4f977edafc344f384f3588b79e2efdb4f9699e709e6a106f3d5dfa69f3d33ce13cd520de7abaf4d3e6a779c279aa41a7f5037c9489984fd279f309f35335e8b47e808f3211f3493a6f3e617eaa069dd60ff05126623e49e7cd27cc4fd5a0d3fa013eca44cc27e9bcf984f9a91ac45b6de9a94f19d33c49cf9b7e83f857ed51539f32a679929e37fd06f1afdaa3a63e654cf3243d6ffa0de25fb5474d7dca98e6497adef41bd4bfca479a0ce62972ea13e6a929a7f33fa1fe153eca64304f91539f304f4d399dff09f5aff0512683798a9cfa84796acae9fc4fa87f858f3219cc53e4d427cc53534ee77fc277bef245f8275253384f3d91676efd011e859ac279ea893c73eb0ff028d414ce534fe4995b7f8047a1a6709e7a22f1adf9a7b465304f19e93c7d5383782b976ecb609e32d279faa606f1562edd96c13c65a4f3f44d0de2ad5cba2d8379ca48e7e99b1ac45bdb4b4ffb999fca48e7cd4f106f6d2f3ded677e2a239d373f41bcb5bdf4b49ff9a98c74defc04f1d6f6d2d37ee6a732d279f313c45b6d69fa2662fe94695f3a4f9f6a106fb5a5e99b88f953a67de93c7daa41bcd596a66f22e64f99f6a5f3f4a906f1565b9abe89983f65da97ced3a71ac45b6d69fa2632f5a929d3f9763e41fc2bf608fa2632f5a929d3f9763e41fc2bf608fa2632f5a929d3f9763e41fc2bf608fa2632f5a929d3f9763e41fc2bf608fa2672ea93699e4ce7a7f906f1afdaa3e89bc8a94fa679329d9fe61bc4bf6a8fa26f22a73e99e6c9747e9a6f10ffaa3d8abe899cfa649a27d3f969be41fcabed4759bff984798a984fa6f96f10dfa2fd48eb379f304f11f3c934ff0de25bb41f69fde613e629623e99e6bf417c8bf623addf7cc23c45cc27d3fc37886fc147b645e85384bec968e713c4bfc247b445e85384bec968e713c4bfc247b445e85384bec968e713c4bfc247b445e85384bec968e7137ce72b977f8a7bf485dca32fe41e7d21f7e80bb9475fc83dfa42eed117728fbe907bf485dca32fe41e7d21f7e80bb9475fc83dfa42eed117728fbe907bf485dca32fe41e7d21f7e80bf91fa733033169a66a470000000049454e44ae426082, 0, NULL, NULL, '2023-12-02 04:10:54', '2023-12-02 04:10:58');

--
-- Triggers `tbl_attendees`
--
DELIMITER $$
CREATE TRIGGER `count_checked` AFTER UPDATE ON `tbl_attendees` FOR EACH ROW BEGIN
	IF NEW.isChecked_in THEN
    	UPDATE tbl_event SET checked_in = checked_in + 1 WHERE event_code = NEW.event_code;
    END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `count_total` AFTER INSERT ON `tbl_attendees` FOR EACH ROW BEGIN
	UPDATE tbl_event SET total_attendees = total_attendees + 1 WHERE event_code = NEW.event_code;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `getID` BEFORE INSERT ON `tbl_attendees` FOR EACH ROW BEGIN
	INSERT INTO tbl_ctrln VALUES (NULL);
    SET NEW.control_number = CONCAT(NEW.event_code, 
LPAD(LAST_INSERT_ID(), 10, "0"));
	END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `update_total` AFTER DELETE ON `tbl_attendees` FOR EACH ROW BEGIN
	UPDATE tbl_event SET total_attendees = total_attendees - 1 WHERE OLD.event_code = event_code;
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
(2),
(3),
(4),
(5),
(6),
(7),
(33),
(34),
(35),
(36),
(37),
(38);

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
  `total_attendees` int(11) NOT NULL DEFAULT 0,
  `checked_in` int(11) NOT NULL DEFAULT 0,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_event`
--

INSERT INTO `tbl_event` (`id`, `name`, `event_code`, `description`, `date`, `total_attendees`, `checked_in`, `created_at`, `updated_at`) VALUES
(1, 'DEVFEST 2023', 'DEV', '...', '2023-11-23 07:37:43', 10, 0, '2023-11-23 06:37:57', '2023-12-02 04:10:54'),
(2, 'Birthday ni Giezhia', 'GIE', '...', '2003-08-19 13:00:00', 2, 0, '2023-11-23 06:46:46', '2023-11-23 09:00:40');

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
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`id`, `username`, `password`, `permission`, `created_at`, `updated_at`) VALUES
(1, 'admin', 'password', 'Admin', '2023-11-22 23:11:21', '2023-11-23 06:32:49'),
(2, 'angel', '12345', 'Staff', '2023-11-23 08:49:24', '2023-11-23 08:49:24');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `tbl_ctrln`
--
ALTER TABLE `tbl_ctrln`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `tbl_event`
--
ALTER TABLE `tbl_event`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
