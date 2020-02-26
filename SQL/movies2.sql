CREATE TABLE movies (
   movie_id INTEGER PRIMARY KEY AUTO_INCREMENT,
   title VARCHAR(50),
   director VARCHAR(80),
   year_released INTEGER
);

CREATE TABLE directors (
   director_id INTEGER PRIMARY KEY AUTO_INCREMENT,
   first_name VARCHAR(50),
   last_name VARCHAR(80),
   country VARCHAR(80)
);

DROP TABLE directors

SELECT * FROM movies