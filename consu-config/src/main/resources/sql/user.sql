CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `userid` int(11) NOT NULL,
  `cost_morning` double(255,0) DEFAULT '0',
  `cost_noon` double(255,0) DEFAULT '0',
  `cost_afternoon` double(255,0) DEFAULT '0',
  `nickname` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `date` varchar(64) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8