-- 코드를 작성해주세요
# 비트 값 1: 해당 형질 보유, 0: 해당 형질 미보유

SELECT COUNT(*) AS COUNT
  FROM ECOLI_DATA
 WHERE GENOTYPE & 2 = 0 -- &: 비트 단위로 AND 연산
   AND GENOTYPE & (1 | 4) > 0;