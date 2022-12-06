# DROP TABLE booking;
# DROP TABLE users;
# DROP TABLE courts;
# DROP TABLE complexes;

CREATE TABLE `arroz`.`complexes` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `name` VARCHAR(100) NOT NULL,
 `address` VARCHAR(100) NOT NULL,
 `phone-number` VARCHAR(100) NOT NULL,
 `price` FLOAT(20) NOT NULL,
 `open-at` TIME NOT NULL,
 `close-at` TIME NOT NULL,
 PRIMARY KEY (`id`));

CREATE TABLE `arroz`.`courts` (
 `courtID` INT NOT NULL AUTO_INCREMENT,
 `price` FLOAT(20) NOT NULL,
 `surface` BIT NOT NULL,
 `type` BIT NOT NULL,
 `phone-number` VARCHAR(20) NOT NULL,
 `complexID` INT NOT NULL,
 FOREIGN KEY (complexID) REFERENCES complexes (id) ON DELETE NO ACTION,
 PRIMARY KEY (`courtID`));

CREATE TABLE `arroz`.`users` (
 `userID` INT NOT NULL AUTO_INCREMENT,
 `username` VARCHAR(45) NOT NULL,
 `password` VARCHAR(45) NOT NULL,
 `admin` BIT DEFAULT false,
 PRIMARY KEY (`userID`));

CREATE TABLE `arroz`.`booking` (
 `bookingID` INT NOT NULL AUTO_INCREMENT ,
 `usernameID` INT NOT NULL ,
  FOREIGN KEY (usernameID) REFERENCES users (userID) ON DELETE NO ACTION,
 `complexID` INT NOT NULL,
  FOREIGN KEY (complexID) REFERENCES complexes (id) ON DELETE NO ACTION,
 `courtID` INT NOT NULL,
  FOREIGN KEY (courtID) REFERENCES courts (courtID) ON DELETE NO ACTION,
 `date` DATE NOT NULL,
 `time` TIME NOT NULL,

 PRIMARY KEY (`bookingID`));
