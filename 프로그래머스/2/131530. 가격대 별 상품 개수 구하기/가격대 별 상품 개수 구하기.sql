-- 코드를 입력하세요
SELECT TRUNC(price/10000) * 10000  AS price_group
     , COUNT(product_code) AS products
  FROM product
GROUP BY TRUNC(price/10000) * 10000
ORDER BY price_group


      