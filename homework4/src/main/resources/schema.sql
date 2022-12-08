DROP TABLE IF EXISTS `BOOKCLASS`;
CREATE TABLE `BOOKCLASS`(
    id int AUTO_INCREMENT,
    name varchar(255) DEFAULT NULL,
    date int,
    author varchar(255) DEFAULT NULL,
    publisher varchar(255) DEFAULT NULL,
    photo varchar(255) DEFAULT NULL,
    number int,
    PRIMARY KEY (id)
)


