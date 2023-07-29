CREATE DATABASE `guild`;

CREATE TABLE `guild`.`persons` (
  `idperson` INT NOT NULL,
  `firstname` VARCHAR(45) NULL,
  `lastname` VARCHAR(45) NULL,
  `level` INT NULL,
  `archetype` INT NULL,
  `race` INT NULL,
  PRIMARY KEY (`idperson`));
