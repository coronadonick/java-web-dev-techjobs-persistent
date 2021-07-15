## Part 1: Test it with SQL
select * from information_schema.columns

## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL
DROP TABLE job

## Part 4: Test it with SQL
select distinct name, description
from job_skills cross join skill
order by name