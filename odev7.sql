--1)
SELECT rating
FROM film
GROUP BY rating
--2)
SELECT COUNT(*)
FROM film
GROUP BY replacement_cost
HAVING COUNT(*)>50;
--3)
SELECT store_id, COUNT(*)
FROM customer
GROUP BY store_id;
--4)
SELECT country_id, COUNT(*) AS count
FROM city
GROUP BY country_id
ORDER BY count DESC
LIMIT 1;
 
 