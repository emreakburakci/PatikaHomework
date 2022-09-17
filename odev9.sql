--1)
SELECT city, country FROM city
INNER JOIN country ON country.country_id = city.country_id;
--2)

SELECT payment_id, first_name, last_name FROM customer
INNER JOIN payment ON payment.customer_id = customer.customer_id;
--3)
SELECT rental_id, first_name, last_name FROM customer
INNER JOIN RENTAL ON RENTAL.customer_id = customer.customer_id;