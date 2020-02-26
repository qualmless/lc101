#1
SELECT title FROM movies;

#2
SELECT title,year_released FROM movies
ORDER BY year_released DESC;

#3
SELECT * FROM directors
ORDER BY country;

#4
SELECT * FROM directors
ORDER BY country,last_name;

#5
INSERT INTO directors (first_name, last_name, country)
VALUES ("Rob", "Reiner", "USA");

#6
SELECT director_id, last_name, country 
FROM directors
WHERE first_name="Rob";

#7
INSERT INTO movies (title, year_released, director_id)
VALUES ("The Princess Bride", 1987, 11);

SELECT * FROM movies;
SELECT * FROM directors;

#8
SELECT title, year_released, last_name
FROM movies
INNER JOIN directors ON movies.director_id = directors.director_id;

#9
SELECT title, first_name, last_name
FROM movies
INNER JOIN directors ON movies.director_id = directors.director_id
ORDER BY last_name;

#10
SELECT first_name, last_name
FROM directors, movies
WHERE directors.director_id= movies.director_id AND title="The Incredibles";

#11
Select last_name, country
From movies
INNER JOIN directors ON movies.director_id = directors.director_id
WHERE title="Roma";

#12
DELETE FROM movies WHERE movie_id=3;

#13
DELETE FROM directors WHERE last_name="Foster";


Select title
From movies
INNER JOIN directors ON movies.director_id = directors.director_id
WHERE last_name="Foster";

SELECT * FROM movies,directors

