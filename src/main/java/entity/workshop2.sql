SHOW DATABASES;
USE workshop2;

CREATE TABLE users
(
    id       INT(11)      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    email    VARCHAR(255) NOT NULL UNIQUE,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(60)  NOT NULL
);
