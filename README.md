============Script = BD==============




SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;


CREATE TABLE IF NOT EXISTS `mydb`.`fornecedor` (
  `cod_fornecedor` INT NOT NULL AUTO_INCREMENT,
  `cnpj_fornecedor` VARCHAR(45) NULL,
  `nome_fornecedor` VARCHAR(45) NULL,
  `end_fornecedor` VARCHAR(45) NULL,
  `num_fornecedor` VARCHAR(45) NULL,
  `compl_fornecedor` VARCHAR(45) NULL,
  `bairro_fornecedor` VARCHAR(45) NULL,
  `cep_fornecedor` VARCHAR(45) NULL,
  `fone_fornecedor` VARCHAR(45) NULL,
  PRIMARY KEY (`cod_fornecedor`))
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `mydb`.`produto` (
  `cod_produto` INT NOT NULL AUTO_INCREMENT,
  `nome_produto` VARCHAR(45) NULL,
  `quant_minima` VARCHAR(45) NULL,
  `estoque_atual` VARCHAR(45) NULL,
  `preco_unitario` VARCHAR(45) NULL,
  PRIMARY KEY (`cod_produto`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
"# ProjEstoque" 
"# ProjEstoque" 
