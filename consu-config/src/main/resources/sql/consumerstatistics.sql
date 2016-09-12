CREATE TABLE `consumer_statistic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `perday_cost` double(255,0) DEFAULT '0',
  `description` varchar(255) DEFAULT NULL,
  `date` varchar(64) DEFAULT '',
  `userid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8