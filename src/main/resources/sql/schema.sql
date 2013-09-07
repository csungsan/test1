SET NAMES 'utf8';

SET AUTOCOMMIT = TRUE;

DROP DATABASE IF EXISTS `test1`;

CREATE DATABASE `test1` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;

USE `test1`;

--
-- Definition for table "scaling_group"
--

CREATE TABLE `test_user`(
  `user_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(255) NOT NULL,
  `user_address` VARCHAR(255) NOT NULL,
  `user_age` INT(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY `pk_user`(`user_id`),
  INDEX `idx_user` (`user_name`)
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
COLLATE = utf8_general_ci
ROW_FORMAT = COMPACT;


INSERT INTO test_user(user_name, user_address, user_age) VALUES
	('ha hun jin','sungnam bundang',31),
	('lee young ho','seoul guro',29),
	('park kwan zoo','inchun namdonggu mansudong',26),
	('choi sol e','inchun namdonggu gansukdong',22)
	;	
	
	