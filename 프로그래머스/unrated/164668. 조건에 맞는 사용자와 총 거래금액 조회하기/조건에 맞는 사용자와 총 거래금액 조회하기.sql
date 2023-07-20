SELECT
    U.USER_ID AS USER_ID,
    U.NICKNAME AS NICKNAME,
    SUM(B.PRICE) AS TOTAL_SALES
FROM
    USED_GOODS_BOARD B
        JOIN
    USED_GOODS_USER U
    ON
            B.WRITER_ID = U.USER_ID
WHERE
        STATUS = 'DONE'
GROUP BY
    USER_ID,
    NICKNAME
HAVING
        SUM(PRICE) >= 700000
ORDER BY
    TOTAL_SALES