CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
       #SELECT DISTINCT W1.SALARY FROM EMPLOYEE W1 WHERE N >=(SELECT COUNT(DINTINCT SALARY)FROM EMPLOYEE W1.ID <= W2.ID) ORDER BY W1.ID DESC
       select distinct(e1.salary) from employee e1 where N-1=(select count(distinct salary) from employee e2 where e2.salary>e1.salary) 
  );
END