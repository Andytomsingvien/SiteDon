-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Mar 15, 2023 at 05:39 PM
-- Server version: 5.7.24
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `club-sportif`
--

-- --------------------------------------------------------

--
-- Table structure for table `cotisation`
--

CREATE TABLE `cotisation` (
  `id` int(11) NOT NULL,
  `id_licence` int(11) NOT NULL,
  `id_sportif` int(11) NOT NULL,
  `montant_reglement` int(11) NOT NULL,
  `date_reglement` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cotisation`
--

INSERT INTO `cotisation` (`id`, `id_licence`, `id_sportif`, `montant_reglement`, `date_reglement`) VALUES
(1, 1, 1, 90, '2023-03-01'),
(2, 2, 2, 170, '2022-10-19'),
(3, 1, 1, 10, '2023-03-05');

-- --------------------------------------------------------

--
-- Table structure for table `licence`
--

CREATE TABLE `licence` (
  `id` int(11) NOT NULL,
  `sport` varchar(64) NOT NULL,
  `annee` int(11) NOT NULL,
  `prix` int(11) NOT NULL,
  `date_debut` date NOT NULL,
  `date_fin` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `licence`
--

INSERT INTO `licence` (`id`, `sport`, `annee`, `prix`, `date_debut`, `date_fin`) VALUES
(1, 'kayak', 2023, 200, '2023-01-01', '2023-12-31'),
(2, 'escalade', 2023, 170, '2022-10-01', '2023-06-30');

-- --------------------------------------------------------

--
-- Table structure for table `sportif`
--

CREATE TABLE `sportif` (
  `id` int(11) NOT NULL,
  `prenom` varchar(64) DEFAULT NULL,
  `nom` varchar(64) NOT NULL,
  `adresse_email` varchar(256) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sportif`
--

INSERT INTO `sportif` (`id`, `prenom`, `nom`, `adresse_email`) VALUES
(1, 'jane', 'doe', 'janedoe@startmail.com'),
(2, 'johnny', 'utah', 'johnnyboy@protonmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cotisation`
--
ALTER TABLE `cotisation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_sportif` (`id_sportif`),
  ADD KEY `id_licence` (`id_licence`);

--
-- Indexes for table `licence`
--
ALTER TABLE `licence`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sportif`
--
ALTER TABLE `sportif`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cotisation`
--
ALTER TABLE `cotisation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `licence`
--
ALTER TABLE `licence`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `sportif`
--
ALTER TABLE `sportif`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cotisation`
--
ALTER TABLE `cotisation`
  ADD CONSTRAINT `cotisation_ibfk_1` FOREIGN KEY (`id_licence`) REFERENCES `licence` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `cotisation_ibfk_2` FOREIGN KEY (`id_sportif`) REFERENCES `sportif` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
