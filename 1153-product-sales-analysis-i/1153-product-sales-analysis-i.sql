# Write your MySQL query statement below
SELECT Sales.year, Product.product_name, Sales.price
FROM Sales
LEFT JOIN Product ON Sales.product_id =
Product.product_id;