CREATE TABLE cats (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  age SMALLINT NOT NULL,
);

CREATE TABLE dogs (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  age SMALLINT NOT NULL,
);