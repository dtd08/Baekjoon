-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, TO_CHAR(HIRE_YMD, 'YYYY-MM-DD') AS HIRE_YMD
-- TO_CHAR : 숫자 혹은 날짜 데이터를 원하는 방식의 문자 데이터로 변환--
from doctor
where MCDP_CD in ('CS', 'GS')
order by hire_ymd desc, dr_name;