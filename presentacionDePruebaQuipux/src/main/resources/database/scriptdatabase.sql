-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_equipos_de_futbol
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_equipos_de_futbol
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_equipos_de_futbol` ;
USE `db_equipos_de_futbol` ;

-- -----------------------------------------------------
-- Table `db_equipos_de_futbol`.`JUGADOR`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_equipos_de_futbol`.`JUGADOR` (
  `idJugador` INT NOT NULL AUTO_INCREMENT,
  `nombreDelJugador` VARCHAR(100) NOT NULL,
  `posicionEnElCampo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idJugador`),
  UNIQUE INDEX `idJugador_UNIQUE` (`idJugador` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_equipos_de_futbol`.`EQUIPOS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_equipos_de_futbol`.`EQUIPOS` (
  `idEquipo` INT NOT NULL AUTO_INCREMENT,
  `nombreDelEquipo` VARCHAR(100) NOT NULL,
  `nombreDelEstadio` VARCHAR(100) NOT NULL,
  `cantidadDeTitulos` INT NOT NULL,
  `JUGADOR_idJugador` INT NOT NULL,
  PRIMARY KEY (`idEquipo`),
  UNIQUE INDEX `idEquipo_UNIQUE` (`idEquipo` ASC) VISIBLE,
  INDEX `fk_EQUIPOS_JUGADOR_idx` (`JUGADOR_idJugador` ASC) VISIBLE,
  CONSTRAINT `fk_EQUIPOS_JUGADOR`
    FOREIGN KEY (`JUGADOR_idJugador`)
    REFERENCES `db_equipos_de_futbol`.`JUGADOR` (`idJugador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
