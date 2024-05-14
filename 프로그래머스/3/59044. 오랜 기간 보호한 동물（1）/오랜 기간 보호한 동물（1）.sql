-- 코드를 입력하세요

SELECT *
  FROM (
        SELECT i.name AS NAME
             , i.datetime AS DATETIME
          FROM ANIMAL_INS i, ANIMAL_OUTS o
         WHERE i.ANIMAL_ID = o.ANIMAL_ID(+)
           AND o.ANIMAL_ID IS NULL
         ORDER BY TO_CHAR(i.DATETIME, 'YYYYMMDDHH24MISS') 
      )
 WHERE ROWNUM <=3
 ;
         
