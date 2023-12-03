-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2023 at 06:23 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

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
(3, 'GIE', 'ANGEL', 19, 'FEMALE', 'GIE0000000003', '', '', '', 0, '2023-12-02 12:08:17', '2023-12-02 12:08:50', '2023-11-23 08:43:14', '2023-12-02 12:08:50'),
(4, 'DEV', 'ANGEL', 19, 'FEMALE', 'DEV0000000004', '', '', '', 0, NULL, NULL, '2023-11-23 08:43:38', '2023-11-23 08:43:38'),
(5, 'DEV', 'HANS', 19, 'MALE', 'DEV0000000005', '', '', '', 0, NULL, NULL, '2023-11-23 08:43:52', '2023-11-24 04:32:13'),
(6, 'DEV', 'EDWIN', 19, 'MALE', 'DEV0000000006', '', '', '', 0, NULL, NULL, '2023-11-23 08:44:09', '2023-11-23 08:44:09'),
(8, 'DEV', 'Jay', 21, 'Male', 'DEV0000000033', NULL, NULL, NULL, 0, NULL, NULL, '2023-12-02 03:09:14', '2023-12-02 03:09:14'),
(9, 'DEV', 'JAY', 21, 'Male', 'DEV0000000034', NULL, NULL, NULL, 0, NULL, NULL, '2023-12-02 03:49:00', '2023-12-02 03:49:00'),
(10, 'DEV', 'Jayz', 21, 'Male', 'DEV0000000035', NULL, NULL, NULL, 0, NULL, NULL, '2023-12-02 03:52:48', '2023-12-02 03:52:48'),
(11, 'DEV', 'Try', 21, 'Male', 'DEV0000000036', NULL, NULL, NULL, 0, NULL, NULL, '2023-12-02 03:54:15', '2023-12-02 09:55:19'),
(12, 'DEV', 'TRY2', 21, 'Female', 'DEV0000000037', NULL, NULL, NULL, 0, NULL, NULL, '2023-12-02 04:07:10', '2023-12-02 09:55:56'),
(13, 'DEV', 'FINAL', 21, 'Male', 'DEV0000000038', 'DEV0000000038.PNG', 'C:\\Users\\Batch 4\\Documents\\GitHub\\ACROSYS\\src\\com\\acrosys\\qrcodes\\DEV0000000038.PNG', 0x89504e470d0a1a0a0000000d494844520000007d0000007d08060000008f806c250000053349444154785eed91418e23490c03fdff4fefc2d73838a04ed23dd5ca0078312996d27afd7759c78b3f5cfe3ef7e80bb9475fc83dfa42eed117728fbe907bf485dca32fe41e7d21f7e80bb9475fc83dfa42eed117728fbe907bf485dca32fe41e7d21f7e80bb9475f48fce8afd7ebab22f429c3f2f4db6a106fe5d26d11fa946179fa6d3588b772e9b6087dcab03cfdb61ac45bb9745b843e65589e7e5b0de2adeda5a7fde9bcf9a7b4fbdfc45bdb4b4ffbd379f34f69f7bf89b7b6979ef6a7f3e69fd2ee7f136f6d2f3ded4fe7cd3fa5ddff26de6a4bd33791a7f926627e8278ab2d4ddf449ee69b88f909e2adb6347d13799a6f22e62788b7dad2f44de469be89989f20de6a4bd33791539fa4f3f44dc4fc04f1565b9abe899cfa249da76f22e62788b7dad2f44de4d427e93c7d13313f41bcd596a66f22a73e49e7e99b88f909e2adb6347d1399faa629364fdf44cc4f106fb5a5e99bc8d4374db179fa26627e8278ab2d4ddf44a6be698acdd33711f313c45b6d69fa2632f54d536c9ebe89989f20deda5ebadd6fb4bfdfee7f136f6d2fddee37dadf6ff7bf89b7b6976ef71bedefb7fbdfc45bdb4bb7fb8df6f7dbfd6fe2ad5cba2df26dbfad06f1562edd16f9b6df5683782b976e8b7cdb6fab41bc954bb745beedb7d5a0d3fa0fc13f91dac89f7f358f4c6de4cfbf9a47a636f2e75fcd23531b89bf9a7fea5486e54f7d729a3711f313c45bb9f45486e54f7d729a3711f313c45bb9f45486e54f7d729a3711f313c45bb9f45486e54f7d729a3711f313c45b4f977edafc344f384f3588b79e2efdb4f9699e709e6a106f3d5dfa69f3d33ce13cd520de7abaf4d3e6a779c279aa41a7f5037c9489984fd279f309f35335e8b47e808f3211f3493a6f3e617eaa069dd60ff05126623e49e7cd27cc4fd5a0d3fa013eca44cc27e9bcf984f9a91ac45b6de9a94f19d33c49cf9b7e83f857ed51539f32a679929e37fd06f1afdaa3a63e654cf3243d6ffa0de25fb5474d7dca98e6497adef41bd4bfca479a0ce62972ea13e6a929a7f33fa1fe153eca64304f91539f304f4d399dff09f5aff0512683798a9cfa84796acae9fc4fa87f858f3219cc53e4d427cc53534ee77fc277bef245f8275253384f3d91676efd011e859ac279ea893c73eb0ff028d414ce534fe4995b7f8047a1a6709e7a22f1adf9a7b465304f19e93c7d5383782b976ecb609e32d279faa606f1562edd96c13c65a4f3f44d0de2ad5cba2d8379ca48e7e99b1ac45bdb4b4ffb999fca48e7cd4f106f6d2f3ded677e2a239d373f41bcb5bdf4b49ff9a98c74defc04f1d6f6d2d37ee6a732d279f313c45b6d69fa2662fe94695f3a4f9f6a106fb5a5e99b88f953a67de93c7daa41bcd596a66f22e64f99f6a5f3f4a906f1565b9abe89983f65da97ced3a71ac45b6d69fa2632f5a929d3f9763e41fc2bf608fa2632f5a929d3f9763e41fc2bf608fa2632f5a929d3f9763e41fc2bf608fa2632f5a929d3f9763e41fc2bf608fa2672ea93699e4ce7a7f906f1afdaa3e89bc8a94fa679329d9fe61bc4bf6a8fa26f22a73e99e6c9747e9a6f10ffaa3d8abe899cfa649a27d3f969be41fcabed4759bff984798a984fa6f96f10dfa2fd48eb379f304f11f3c934ff0de25bb41f69fde613e629623e99e6bf417c8bf623addf7cc23c45cc27d3fc37886fc147b645e85384bec968e713c4bfc247b445e85384bec968e713c4bfc247b445e85384bec968e713c4bfc247b445e85384bec968e7137ce72b977f8a7bf485dca32fe41e7d21f7e80bb9475fc83dfa42eed117728fbe907bf485dca32fe41e7d21f7e80bb9475fc83dfa42eed117728fbe907bf485dca32fe41e7d21f7e80bf91fa733033169a66a470000000049454e44ae426082, 0, NULL, NULL, '2023-12-02 04:10:54', '2023-12-02 04:10:58'),
(14, 'DEV', 'Lee', 19, 'Female', 'DEV0000000039', 'DEV0000000039.PNG', 'src\\com\\acrosys\\qrcodes\\DEV0000000039.PNG', 0x89504e470d0a1a0a0000000d494844520000007d0000007d08060000008f806c250000052549444154785eed9141ae63310cc37aff4bcfa0bb821bc288f45a7c878036a5a3e734af7f9775bcf8c3e5ef731f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117127ff4d7ebf568a6d8f9a96fa741bc954bb733c5ce4f7d3b0de2ad5cba9d29767eeadb69106fe5d2ed4cb1f353df4e83786b7be96ff79b3fa5ddff26deda5efadbfde64f69f7bf89b7b697fe76bff953dafd6fe2adeda5bfdd6ffe9476ff9b78ab2d4d6f216d6fd8797a0b319f20de6a4bd35b48db1b769ede42cc2788b7dad2f416d2f6869da7b710f309e2adb634bd85b4bd61e7e92dc47c8278ab2d4d6f21e64fb1fea9b710f309e2adb634bd85983fc5faa7de42cc2788b7dad2f41662fe14eb9f7a0b319f20de6a4bd35b88f953ac7fea2dc47c8278ab2d4d6f21e689cdd33364ea2dc47c8278ab2d4d6f21e689cdd33364ea2dc47c8278ab2d4d6f21e689cdd33364ea2dc47c8278ab2d4d6f21e689cdd33364ea2dc47c82786b7be9693fe72dc6747e4abbff4dbcb5bdf4b49ff316633a3fa5ddff26deda5e7adacf798b319d9fd2ee7f136f6d2f3dede7bcc598ce4f69f7bf89b772e976c8d3be9d06f1562edd0e79dab7d320decaa5db214ffb761ac45bb9743be469df4e834eeb17b13fcdfc06fedcaded51cd6fe0cfddda1ed5fc06fedcaded51cd6f207e6bfea916427f1a32f59629a7e713c4bfca4b5908fd69c8d45ba69c9e4f10ff2a2f6521f4a721536f99727a3e41fcabbc9485d09f864cbd65cae9f904f1aff2528cd19e27763eed19623e41bc954b33467b9ed8f9b46788f904f1562ecd18ed7962e7d39e21e613c45bb93463b4e7899d4f7b86984f106fe5d20c314f4ee72d86cd9b279c671ac45bb93443cc93d3798b61f3e609e79906f1562ecd10f3e474de62d8bc79c279a641bc954b33c43c399db718366f9e709e69d069fd8097b04cb1f3f4d318edf906f5aff2929629769e7e1aa33ddfa0fe555ed232c5ced34f63b4e71bd4bfca4b5aa6d879fa698cf67c83f85779290b497b86989f32ede33cd320decaa52d24ed19627ecab48ff34c83782b97b690b46788f929d33ece330de2ad5cda42d29e21e6a74cfb38cf34e8b47e9127feb44f4ebfc7f34c834eeb1779e24ffbe4f47b3ccf34e8b47e9127feb44f4ebfc7f34c834eeb1779e24ffbe4f47b3ccf3488b772e976083d63d8fca9ff05e25bf1d2ed107ac6b0f953ff0bc4b7e2a5db21f48c61f3a7fe17886fc54bb743e819c3e64ffd2f10dfaa7d69eb3ff584f31632f54c83786b7b69eb3ff584f31632f54c83786b7b69eb3ff584f31632f54c83786b7b69eb3ff584f31632f54c8378ab2d4d6f21536f214f7b4b8378ab2d4d6f21536f214f7b4b8378ab2d4d6f21536f214f7b4b8378ab2d4d6f21536f214f7b4b8378ab2d4d6f21e689cdffba6f10ff8a5d82de42cc139bff75df20fe15bb04bd85982736ffebbe41fc2b76097a0b314f6cfed77d83f857ec12f41692f68c61f36d9f20de6a4bd35b48da3386cdb77d8278ab2d4d6f2169cf1836dff609e2adb634bd85a43d63d87cdb2788b7b697b67ef384f31692f64c83786b7b69eb374f386f2169cf3488b7b697b67ef384f31692f64c83786b7b69eb374f386f2169cf3488b772e9768879929e6ffb04f1562edd0e314fd2f36d9f20decaa5db21e6497abeed13c45bb9743bc43c49cfb77d824eebe5a7b98fbe90fbe80bb98fbe90fbe80bb98fbe90fbe80bb98fbe90fbe80bb98fbe90fbe80bb98fbe90fbe80bb98fbe90fbe80bb98fbe90fbe80bb98fbe90fbe80bb98fbe90fbe80bf90f552965a44973284d0000000049454e44ae426082, 0, NULL, NULL, '2023-12-02 11:19:44', '2023-12-02 11:19:46'),
(15, 'DEV', 'Giezhia', 21, 'Female', 'DEV0000000040', 'DEV0000000040.PNG', 'src\\com\\acrosys\\qrcodes\\DEV0000000040.PNG', 0x89504e470d0a1a0a0000000d494844520000007d0000007d08060000008f806c250000052849444154785eed91416e6b390c0473ff4bcfc0bba016bfc0a8fb390e55406ddc7c2dcafafaefb28e2ffe70f9fbdc475fc87df485dc475fc87df485dc475fc87df485dc475fc87df485dc475fc87df485dc475fc87df485dc475fc87df485dc475fc87df485dc475fc87df485c41ffdebebeb5109736ad83cf3b60de2ad5cba2d614e0d9b67deb641bc954bb725cca961f3ccdb3688b772e9b68439356c9e79db06f1d6f6d2d3fef4bce5a7b4fb5fc45bdb4b4ffbd3f3969fd2ee7f116f6d2f3ded4fcf5b7e4abbff45bcb5bdf4b43f3d6ff929edfe17f1565b9ab9493e2d3789e509e2adb63473937c5a6e12cb13c45b6d69e626f9b4dc24962788b7dad2cc4df269b9492c4f106fb5a5999be43427e979e626b13c41bcd596666e92d39ca4e7999bc4f204f1565b9ab9494e73929e676e12cb13c45b6d69e62639cd497a9eb9492c4f106fb5a5999b649a9b53ec7be626b13c41bcd596666e92696e4eb1ef999bc4f204f1565b9ab949a6b939c5be676e12cb13c45b6d69e62699e6e614fb9eb9492c4f106f6d2fddee37dae7b7fb5fc45bdb4bb7fb8df6f9edfe17f1d6f6d2ed7ea37d7ebbff45bcb5bd74bbdf689fdfee7f116fe5d26dc9d379db06f1562edd963c9db76d106fe5d26dc9d379db06f1562edd963c9db76dd069fd45f04fa41bf9f3b7e623d38dfcf95bf391e946fefcadf9c87423f15bf34f9d6ad8fc694e4ee74d627982782b979e6ad8fc694e4ee74d627982782b979e6ad8fc694e4ee74d627982782b979e6ad8fc694e4ee74d6279824eeb37ec124fe794584ea6f384dfd3069dd66fd8259ece29b19c4ce709bfa70d3aaddfb04b3c9d53623999ce137e4f1b745abf6197783aa7c472329d27fc9e3688b77269939ce6243d6f39e1fcd406f1562e6d92d39ca4e72d279c9fda20decaa54d729a93f4bce584f3531bc45bb9b4494e73929eb79c707e6a834eeb3778094a9853c2dc34386f12e6e63ba89fca4b52c29c12e6a6c179933037df41fd545e9212e69430370dce9b84b9f90eeaa7f2929430a784b96970de24cccd77103fd52ec53cadc1793ae5dddfff84f8297609e6690dced329effefe27c44fb14b304f6b709e4e79f7f73f217e8a5d82795a83f374cabbbfff09cf9cf220fc13e929e9be77f0995bff033e0a3d25ddf70e3e73eb7fc047a1a7a4fbdec1676efd0ff828f49474df3b886fcd3fa5ed94e9f7e979e66683782b976e3b65fa7d7a9eb9d920decaa5db4e997e9f9e676e3688b772e9b653a6dfa7e7999b0de2adeda5a7fd9c9f6aa4e72d4f106f6d2f3dede7fc54233d6f7982786b7be9693fe7a71ae979cb13c45bdb4b4ffb393fd548cf5b9e20de6a4b333789e506bfa7467a9e396d106fb5a5999bc47283df53233dcf9c3688b7dad2cc4d62b9c1efa9919e674e1bc45b6d69e626b1dce0f7d448cf33a70de2adb63473934c73d3f86df309e2a7d825989b649a9bc66f9b4f103fc52ec1dc24d3dc347edb7c82f8297609e62699e6a6f1dbe613c44fb14b3037c9349f3a65fafd74be41fc54bb1473934cf3a953a6df4fe71bc44fb54b3137c9349f3a65fafd74be41fc54bb1473934cf3a953a6df4fe71bc44f6d5fcafa999f4a2c27d3f927886fd1bea4f5333f95584ea6f34f10dfa27d49eb677e2ab19c4ce79f20be45fb92d6cffc54623999ce3f417c0b5eb22d619ed668cf27889fc24bb425ccd31aedf904f1537889b684795aa33d9f207e0a2fd196304f6bb4e7133c73cae557711f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117721f7d21f7d117f23fdd5265a4c1e0790c0000000049454e44ae426082, 0, '2023-12-02 11:42:24', '2023-12-02 11:43:11', '2023-12-02 11:34:29', '2023-12-02 11:43:11');

--
-- Triggers `tbl_attendees`
--
DELIMITER $$
CREATE TRIGGER `count_checked` AFTER UPDATE ON `tbl_attendees` FOR EACH ROW BEGIN
	IF NEW.isChecked_in AND !OLD.isChecked_in THEN
    	UPDATE tbl_event SET checked_in = checked_in + 1 WHERE event_code = NEW.event_code;
    ELSEIF !NEW.isChecked_in AND OLD.isChecked_in THEN
    	UPDATE tbl_event SET checked_in = checked_in - 1, checked_out = checked_out + 1 WHERE event_code = NEW.event_code;
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
(38),
(39),
(40);

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
  `checked_out` int(11) NOT NULL DEFAULT 0,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_event`
--

INSERT INTO `tbl_event` (`id`, `name`, `event_code`, `description`, `date`, `total_attendees`, `checked_in`, `checked_out`, `created_at`, `updated_at`) VALUES
(2, 'Birthday ni Giezhia', 'GIE', 'Happy na birthday pa', '2003-08-19 19:00:00', 2, 0, 1, '2023-11-23 06:46:46', '2023-12-02 23:39:04'),
(4, 'DEVFEST', 'DEV', '...', '2023-12-01 07:30:00', 12, 0, 0, '2023-12-02 23:34:42', '2023-12-02 23:41:53'),
(5, 'Christmas Party', 'CMPT', 'Ambot madayon ni HAHAHA', '2023-12-25 08:00:00', 0, 0, 0, '2023-12-02 23:37:52', '2023-12-02 23:37:52');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `tbl_ctrln`
--
ALTER TABLE `tbl_ctrln`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `tbl_event`
--
ALTER TABLE `tbl_event`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
