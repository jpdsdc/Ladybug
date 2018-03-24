CREATE DATABASE IF NOT EXISTS ladybug;

CREATE TABLE user(
  id INTEGER AUTO_INCREMENT,
  username VARCHAR(16) NOT NULL UNIQUE,
  password VARCHAR(50) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO user(username, password) VALUES ("tommy", "123");
INSERT INTO user(username, password) VALUES ("jcosta", "123");
INSERT INTO user(username, password) VALUES ("ccanto", "123");
INSERT INTO user(username, password) VALUES ("ricardo", "123");