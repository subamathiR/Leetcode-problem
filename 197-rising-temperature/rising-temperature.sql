# Write your MySQL query statement below
SELECT id
FROM (
    SELECT id,
           recordDate,
           temperature,
           LAG(recordDate) OVER (ORDER BY recordDate) AS previous_date,
           LAG(temperature) OVER (ORDER BY recordDate) AS previous_temperature
    FROM Weather
) t
WHERE DATEDIFF(recordDate, previous_date) = 1
AND temperature > previous_temperature;