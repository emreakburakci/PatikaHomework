--1)
SELECT COUNT(*) FROM film WHERE length > (SELECT AVG(length) AS avg FROM film);

--2)
SELECT COUNT(*) FROM film WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);

--3)
SELECT COUNT(*) FROM film 
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film) 
AND replacement_cost = (SELECT MIN(replacement_cost) FROM film);

--4)
SELECT *,payment.count FROM customer, (SELECT customer_id, Count(*) AS count
						 FROM payment
					   	 GROUP BY customer_id) payment
WHERE customer.customer_id = payment.customer_id
ORDER BY payment.count DESC;


