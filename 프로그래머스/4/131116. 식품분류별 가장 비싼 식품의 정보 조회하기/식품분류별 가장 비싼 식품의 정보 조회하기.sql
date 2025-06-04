-- 코드를 입력하세요
  SELECT P.CATEGORY,
         P.PRICE AS MAX_PRICE,
         P.PRODUCT_NAME
    FROM FOOD_PRODUCT P
    JOIN (
          SELECT CATEGORY, MAX(PRICE) AS MAX_PRICE
            FROM FOOD_PRODUCT
           WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
        GROUP BY CATEGORY
    ) F 
      ON (P.CATEGORY = F.CATEGORY)
     AND (P.PRICE = F.MAX_PRICE)
   WHERE P.CATEGORY IN ('과자', '국', '김치', '식용유')
ORDER BY P.PRICE DESC;