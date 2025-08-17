-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2025 at 11:58 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gym`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `admin_id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `full_name` varchar(100) DEFAULT NULL,
  `role` varchar(20) DEFAULT 'Staff',
  `created_at` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`admin_id`, `username`, `password`, `full_name`, `role`, `created_at`) VALUES
(1, 'admin', 'admin123', 'System Admin', 'Admin', '2025-04-23 20:23:33');

-- --------------------------------------------------------

--
-- Table structure for table `attendance_log`
--

CREATE TABLE `attendance_log` (
  `log_id` int(11) NOT NULL,
  `id` int(11) DEFAULT NULL,
  `check_in_time` timestamp NULL DEFAULT NULL,
  `check_out_time` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attendance_log`
--

INSERT INTO `attendance_log` (`log_id`, `id`, `check_in_time`, `check_out_time`) VALUES
(1, 1, '2025-04-24 03:59:52', '2025-04-24 03:59:52'),
(2, 2, '2025-04-24 03:59:52', '2025-04-24 03:59:52'),
(3, 3, '2025-04-24 03:59:52', '2025-04-28 02:09:57'),
(4, 4, '2025-04-27 08:55:53', '2025-04-28 02:10:00'),
(5, 1, '2025-04-27 08:57:39', '2025-04-28 02:04:20'),
(6, 5, '2025-04-27 09:57:42', '2025-04-28 02:10:02'),
(7, 7, '2025-04-27 09:58:57', '2025-04-28 02:10:07'),
(8, 2, '2025-04-27 10:00:55', '2025-04-28 02:09:53'),
(9, 6, '2025-04-27 10:08:04', '2025-04-28 02:10:04'),
(10, 1, '2025-04-28 02:06:03', '2025-04-28 02:08:16'),
(11, 8, '2025-04-28 02:10:08', NULL),
(12, 2, '2025-04-28 02:15:27', '2025-04-28 02:15:44'),
(13, 1, '2025-04-28 02:20:06', '2025-04-28 02:21:13'),
(14, 1, '2025-04-28 02:21:14', '2025-04-28 03:33:52'),
(15, 1, '2025-04-28 03:33:54', '2025-04-28 03:41:07'),
(16, 1, '2025-04-28 03:41:08', '2025-04-28 03:44:11'),
(17, 1, '2025-04-28 03:44:12', '2025-04-28 03:44:53'),
(18, 1, '2025-04-28 03:44:54', '2025-04-28 03:58:36'),
(19, 1, '2025-04-28 03:58:37', '2025-04-28 03:59:05'),
(20, 1, '2025-04-28 03:59:07', '2025-04-29 07:33:13'),
(21, 1, '2025-04-29 07:33:16', '2025-04-29 07:40:36'),
(22, 1, '2025-04-29 07:40:37', '2025-04-29 07:43:30'),
(23, 1, '2025-04-29 07:43:32', '2025-04-29 07:44:01'),
(24, 1, '2025-04-29 07:44:02', '2025-04-29 08:03:20'),
(25, 2, '2025-04-29 07:50:26', '2025-04-29 07:53:03'),
(26, 2, '2025-04-29 07:53:05', '2025-04-29 07:54:40'),
(27, 2, '2025-04-29 07:54:42', '2025-04-29 08:07:50'),
(28, 1, '2025-04-29 08:03:22', NULL),
(29, 2, '2025-04-29 08:07:52', '2025-04-29 08:08:16'),
(30, 2, '2025-04-29 08:08:17', '2025-04-29 08:25:51'),
(31, 2, '2025-04-29 08:26:00', '2025-04-29 08:26:02'),
(32, 3, '2025-05-01 03:15:03', '2025-05-01 03:15:23'),
(33, 3, '2025-05-01 16:50:49', NULL),
(34, 2, '2025-05-01 17:07:34', '2025-05-01 17:07:42'),
(35, 4, '2025-05-01 17:07:45', '2025-05-01 17:07:49'),
(36, 6, '2025-05-01 17:08:52', '2025-05-01 17:08:57');

-- --------------------------------------------------------

--
-- Table structure for table `equipments`
--

CREATE TABLE `equipments` (
  `equipment_id` varchar(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `category` varchar(30) DEFAULT NULL,
  `quantity` int(11) DEFAULT 1,
  `status` varchar(20) DEFAULT 'Working',
  `purchase_date` date DEFAULT NULL,
  `last_maintenance` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `equipments`
--

INSERT INTO `equipments` (`equipment_id`, `name`, `category`, `quantity`, `status`, `purchase_date`, `last_maintenance`) VALUES
('EQ001', 'Treadmill', 'Cardio', 4, 'Working', '2023-01-15', '2024-12-01'),
('EQ002', 'Elliptical Trainer', 'Cardio', 2, 'Working', '2023-02-10', '2024-11-15'),
('EQ003', 'Stationary Bike', 'Cardio', 3, 'Working', '2023-03-05', '2024-12-10'),
('EQ004', 'Rowing Machine', 'Cardio', 2, 'Under Maintenance', '2023-04-12', '2024-12-05'),
('EQ005', 'Bench Press', 'Strength', 2, 'Working', '2023-05-01', '2024-11-30'),
('EQ006', 'Squat Rack', 'Strength', 2, 'Working', '2023-06-08', '2024-12-03'),
('EQ007', 'Leg Press Machine', 'Strength', 1, 'Working', '2023-07-14', '2024-12-06'),
('EQ008', 'Dumbbells Set', 'Strength', 1, 'Working', '2023-08-01', '2024-12-01'),
('EQ009', 'Kettlebells Set', 'Strength', 1, 'Working', '2023-09-20', '2024-12-04'),
('EQ010', 'Pull-up Bar', 'Strength', 2, 'Working', '2023-10-11', '2024-11-28'),
('EQ011', 'Lat Pulldown Machine', 'Strength', 1, 'Working', '2023-11-05', '2024-12-08'),
('EQ012', 'Cable Crossover Machine', 'Strength', 1, 'Working', '2023-12-15', '2024-12-02'),
('EQ013', 'Medicine Balls', 'Flexibility', 1, 'Working', '2024-01-10', '2024-12-09'),
('EQ014', 'Resistance Bands', 'Flexibility', 1, 'Working', '2024-02-01', '2024-12-07'),
('EQ015', 'Yoga Mats', 'Flexibility', 10, 'Working', '2024-03-01', '2024-12-01');

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `id` int(11) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `contact_number` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `pin_code` varchar(10) DEFAULT NULL,
  `plan_id` int(11) DEFAULT NULL,
  `membership_expiry` date DEFAULT NULL,
  `status` varchar(20) DEFAULT 'Active',
  `created_at` datetime DEFAULT current_timestamp(),
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`id`, `full_name`, `contact_number`, `email`, `pin_code`, `plan_id`, `membership_expiry`, `status`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Mark Turners', '09123456789', 'mark@example.com', NULL, 2, '2025-05-02', 'Active', '2025-04-23 20:50:01', '2025-04-27 20:45:07', NULL),
(2, 'Sarah Lee', '09234567890', 'sarah@example.com', NULL, 1, '2025-05-02', 'Active', '2025-04-23 20:50:01', '2025-05-02 00:58:30', NULL),
(3, 'Mike Johnson', '09345678901', 'mike@example.com', NULL, 3, '2025-05-02', 'Active', '2025-04-23 20:50:01', NULL, NULL),
(4, 'Glenn', '09123456789', 'gglennmykhel@gmail.com', NULL, 1, '2025-08-02', 'Active', '2025-04-23 22:07:49', NULL, '2025-05-01 03:20:49'),
(5, 'Rane Esgana', '01234567891', 'raneesgana@gmail.com', NULL, 1, NULL, 'Inactive', '2025-04-24 01:25:15', '2025-04-24 01:36:36', NULL),
(6, 'Jay-r Baldevieso', '12312312312', 'qqqq@example.com', NULL, 2, '2025-08-02', 'Active', '2025-04-24 01:30:05', '2025-04-24 01:37:08', NULL),
(7, 'Josh Undang', '12345678909', 'josh@gmail.com', NULL, 1, NULL, 'Active', '2025-04-27 01:42:33', NULL, NULL),
(8, 'Yes No', '0929260102145', 'gglennyes@gmail.com', '1234', 1, NULL, 'Active', '2025-04-27 01:48:50', NULL, NULL),
(9, 'Josh Padayon', '12345678967', 'joshundang@email.com', NULL, 2, NULL, 'Active', '2025-05-02 00:30:58', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `membership_plans`
--

CREATE TABLE `membership_plans` (
  `plan_id` int(11) NOT NULL,
  `plan_name` varchar(50) NOT NULL,
  `price` decimal(8,2) NOT NULL,
  `duration_months` int(11) NOT NULL,
  `description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `membership_plans`
--

INSERT INTO `membership_plans` (`plan_id`, `plan_name`, `price`, `duration_months`, `description`) VALUES
(1, 'Monthly', 500.00, 1, 'This plan provides access to the gym for one month.'),
(2, 'Quarterly', 1400.00, 3, 'This plan provides access to the gym for three months at a discounted rate.'),
(3, 'Yearly', 5000.00, 12, 'This plan provides access to the gym for one year at the best value.');

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

CREATE TABLE `payments` (
  `payment_id` int(11) NOT NULL,
  `id` int(11) DEFAULT NULL,
  `amount_paid` decimal(8,2) NOT NULL,
  `payment_date` date DEFAULT curdate(),
  `month_paid_for` varchar(20) DEFAULT NULL,
  `status` enum('Completed','Pending','Failed','Refunded') DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  `expiry_date` date DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payments`
--

INSERT INTO `payments` (`payment_id`, `id`, `amount_paid`, `payment_date`, `month_paid_for`, `status`, `admin_id`, `expiry_date`, `start_date`, `updated_at`, `deleted_at`) VALUES
(1, 1, 500.00, '2025-04-23', '4', 'Completed', 1, NULL, NULL, NULL, NULL),
(2, 2, 1400.00, '2025-04-23', '5', 'Pending', 1, NULL, NULL, '2025-04-24 01:59:24', NULL),
(3, 3, 5000.00, '2025-04-26', '6', 'Failed', 1, NULL, NULL, '2025-04-26 22:40:33', '2025-04-30 20:23:11'),
(4, 1, 500.00, '2025-04-24', '1', 'Completed', 1, NULL, NULL, NULL, NULL),
(5, 1, 500.00, '2025-05-02', '1', 'Completed', 1, '2025-06-02', '2025-05-02', NULL, NULL),
(6, 3, 1400.00, '2025-05-02', '3', 'Completed', 1, '2025-08-02', '2025-05-02', NULL, NULL),
(7, 2, 500.00, '2025-05-02', '1', 'Completed', 1, '2025-06-02', '2025-05-02', NULL, NULL),
(8, 4, 1400.00, '2025-05-02', '3', 'Completed', 1, '2025-08-02', '2025-05-02', NULL, NULL),
(9, 6, 1400.00, '2025-05-02', '3', 'Completed', 1, '2025-08-02', '2025-05-02', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`admin_id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `attendance_log`
--
ALTER TABLE `attendance_log`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `member_id` (`id`);

--
-- Indexes for table `equipments`
--
ALTER TABLE `equipments`
  ADD PRIMARY KEY (`equipment_id`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`id`),
  ADD KEY `plan_id` (`plan_id`);

--
-- Indexes for table `membership_plans`
--
ALTER TABLE `membership_plans`
  ADD PRIMARY KEY (`plan_id`);

--
-- Indexes for table `payments`
--
ALTER TABLE `payments`
  ADD PRIMARY KEY (`payment_id`),
  ADD KEY `member_id` (`id`),
  ADD KEY `fk_payments_admin` (`admin_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admins`
--
ALTER TABLE `admins`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `attendance_log`
--
ALTER TABLE `attendance_log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `members`
--
ALTER TABLE `members`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `membership_plans`
--
ALTER TABLE `membership_plans`
  MODIFY `plan_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `payments`
--
ALTER TABLE `payments`
  MODIFY `payment_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `attendance_log`
--
ALTER TABLE `attendance_log`
  ADD CONSTRAINT `attendance_log_ibfk_1` FOREIGN KEY (`id`) REFERENCES `members` (`id`);

--
-- Constraints for table `members`
--
ALTER TABLE `members`
  ADD CONSTRAINT `members_ibfk_1` FOREIGN KEY (`plan_id`) REFERENCES `membership_plans` (`plan_id`);

--
-- Constraints for table `payments`
--
ALTER TABLE `payments`
  ADD CONSTRAINT `fk_payments_admin` FOREIGN KEY (`admin_id`) REFERENCES `admins` (`admin_id`),
  ADD CONSTRAINT `payments_ibfk_1` FOREIGN KEY (`id`) REFERENCES `members` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
