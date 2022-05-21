-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Portfolio
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Portfolio
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Portfolio` DEFAULT CHARACTER SET utf8 ;
USE `Portfolio` ;

-- -----------------------------------------------------
-- Table `Portfolio`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Portfolio`.`Persona` (
  `ID` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Correo` VARCHAR(70) NULL,
  `fechaNacimiento` DATE NULL,
  `Sobre_mi` VARCHAR(200) NOT NULL,
  `Foto_de_perfil` VARCHAR(100) NOT NULL,
  `Titulo_profesional` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Portfolio`.`Redes_sociales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Portfolio`.`Redes_sociales` (
  `ID` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Link` VARCHAR(45) NOT NULL,
  `Icono` VARCHAR(45) NOT NULL,
  `Persona_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Persona_ID`),
  INDEX `fk_Redes_sociales_Persona_idx` (`Persona_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Redes_sociales_Persona`
    FOREIGN KEY (`Persona_ID`)
    REFERENCES `Portfolio`.`Persona` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Portfolio`.`Experiencia_laboral`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Portfolio`.`Experiencia_laboral` (
  `ID` INT NOT NULL,
  `Empresa` VARCHAR(45) NOT NULL,
  `Puesto` VARCHAR(45) NOT NULL,
  `Periodo` VARCHAR(60) NOT NULL,
  `logoEmpresa` VARCHAR(100) NULL,
  `Descripción` VARCHAR(200) NOT NULL,
  `Persona_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Persona_ID`),
  INDEX `fk_Experiencia_laboral_Persona1_idx` (`Persona_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Experiencia_laboral_Persona1`
    FOREIGN KEY (`Persona_ID`)
    REFERENCES `Portfolio`.`Persona` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Portfolio`.`Instituto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Portfolio`.`Instituto` (
  `ID` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Logo` VARCHAR(60) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Portfolio`.`Educación`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Portfolio`.`Educación` (
  `ID` INT NOT NULL,
  `Nombre` VARCHAR(60) NOT NULL,
  `Periodo` VARCHAR(60) NOT NULL,
  `Persona_ID` INT NOT NULL,
  `Instituto_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Persona_ID`, `Instituto_ID`),
  INDEX `fk_Educación_Persona1_idx` (`Persona_ID` ASC) VISIBLE,
  INDEX `fk_Educación_Instituto1_idx` (`Instituto_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Educación_Persona1`
    FOREIGN KEY (`Persona_ID`)
    REFERENCES `Portfolio`.`Persona` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Educación_Instituto1`
    FOREIGN KEY (`Instituto_ID`)
    REFERENCES `Portfolio`.`Instituto` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Portfolio`.`Habilidades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Portfolio`.`Habilidades` (
  `ID` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Nivel` VARCHAR(15) NOT NULL,
  `Descripción` VARCHAR(200) NOT NULL,
  `Persona_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Persona_ID`),
  INDEX `fk_Habilidades_Persona1_idx` (`Persona_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Habilidades_Persona1`
    FOREIGN KEY (`Persona_ID`)
    REFERENCES `Portfolio`.`Persona` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Portfolio`.`Proyectos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Portfolio`.`Proyectos` (
  `ID` INT NOT NULL,
  `Nombre` VARCHAR(60) NOT NULL,
  `Descripción` VARCHAR(200) NOT NULL,
  `Año` INT NOT NULL,
  `LinkWeb` VARCHAR(100) NULL,
  `Repositorio` VARCHAR(100) NULL,
  `Persona_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Persona_ID`),
  INDEX `fk_Proyectos_Persona1_idx` (`Persona_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Proyectos_Persona1`
    FOREIGN KEY (`Persona_ID`)
    REFERENCES `Portfolio`.`Persona` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Portfolio`.`Imagenes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Portfolio`.`Imagenes` (
  `ID` INT NOT NULL,
  `Nombre` VARCHAR(100) NOT NULL,
  `Proyectos_ID` INT NOT NULL,
  `Proyectos_Persona_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Proyectos_ID`, `Proyectos_Persona_ID`),
  INDEX `fk_Imagenes_Proyectos1_idx` (`Proyectos_ID` ASC, `Proyectos_Persona_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Imagenes_Proyectos1`
    FOREIGN KEY (`Proyectos_ID` , `Proyectos_Persona_ID`)
    REFERENCES `Portfolio`.`Proyectos` (`ID` , `Persona_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
