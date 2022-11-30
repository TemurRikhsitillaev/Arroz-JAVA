DROP TABLE complexes;
DROP TABLE users;
DROP TABLE booking;

CREATE TABLE `arroz`.`users` (
 `userID` INT NOT NULL AUTO_INCREMENT,
 `username` VARCHAR(45) NOT NULL,
 `password` VARCHAR(45) NOT NULL,
 `admin` BIT DEFAULT false,
 PRIMARY KEY (`userID`));

CREATE TABLE `arroz`.`booking` (
 `bookingID` INT NOT NULL AUTO_INCREMENT,
 `username` VARCHAR(45) NOT NULL,
 `complexID` INT NOT NULL,
 `courtID` INT NOT NULL,
 `data` DATE NOT NULL,
 `time` TIME NOT NULL,
 PRIMARY KEY (`bookingID`));


CREATE TABLE `arroz`.`complexes` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `name` VARCHAR(100) NOT NULL,
 `address` VARCHAR(100) NOT NULL,
 `phone-number` DECIMAL(20) NOT NULL,
 `price` DECIMAL(20) NOT NULL,
 `open-at` TIME NOT NULL,
 `close-at` TIME NOT NULL,
 PRIMARY KEY (`id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8
    COLLATE = utf8_bin;

