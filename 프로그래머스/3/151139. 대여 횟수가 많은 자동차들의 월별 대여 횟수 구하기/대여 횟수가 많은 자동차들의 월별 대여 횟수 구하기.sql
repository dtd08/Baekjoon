-- 코드를 입력하세요
SELECT TO_NUMBER(TO_CHAR(START_DATE, 'MM')) AS MONTH, CAR_ID, COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE TO_NUMBER(TO_CHAR(START_DATE, 'YYYYMM')) BETWEEN 202208 AND 202210
AND CAR_ID 
IN (SELECT CAR_ID FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE TO_CHAR(START_DATE, 'YYYYMM') BETWEEN '202208' AND '202210'
GROUP BY CAR_ID
HAVING COUNT(CAR_ID) >= 5)
GROUP BY TO_NUMBER(TO_CHAR(START_DATE, 'MM')), CAR_ID
ORDER BY MONTH, CAR_ID DESC;

