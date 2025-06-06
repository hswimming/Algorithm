-- 코드를 입력하세요
SELECT FLAVOR
FROM (
      SELECT FLAVOR,
             SUM(TOTAL_ORDER) AS TOTAL
        FROM (
            SELECT FLAVOR, TOTAL_ORDER
              FROM FIRST_HALF
         UNION ALL
            SELECT FLAVOR, TOTAL_ORDER
              FROM JULY
        )
    GROUP BY FLAVOR
    ORDER BY TOTAL DESC
)
WHERE ROWNUM <= 3;