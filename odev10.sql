--1)
SELECT city, country  FROM city
LEFT JOIN country ON country.country_id = city.country_id;
--2)
SELECT payment_id, first_name,last_name  FROM payment
RIGHT JOIN customer ON customer.customer_id = payment.customer_id;
--3)
SELECT rental_id, first_name,last_name  FROM rental
FULL JOIN customer ON customer.customer_id = rental.customer_id;