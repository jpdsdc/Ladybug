CREATE DATABASE IF NOT EXISTS ladybug;

CREATE TABLE IF NOT EXISTS users(
  id INTEGER AUTO_INCREMENT,
  username VARCHAR(16) NOT NULL UNIQUE,
  password VARCHAR(50) NOT NULL,
  created_at DATE DEFAULT curdate(),
  PRIMARY KEY(id)
);

-- Populate with data
INSERT INTO users(username, password) VALUES ("tommy", "123");
INSERT INTO users(username, password) VALUES ("jcosta", "123");
INSERT INTO users(username, password) VALUES ("ccanto", "123");
INSERT INTO users(username, password) VALUES ("ricardo", "123");