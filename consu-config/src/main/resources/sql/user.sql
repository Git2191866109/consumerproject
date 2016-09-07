/*Date: 2016-09-02 15:24:03*/
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `userid` int(11) NOT NULL,
  `cost_morning` double(255,0) DEFAULT '0',
  `cost_noon` double(255,0) DEFAULT '0',
  `cost_afternoon` double(255,0) DEFAULT '0',
  `nickname` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;