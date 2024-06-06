SELECT DISTINCT Job         -- Question1.
FROM rdbms1.emptabledata;

SELECT *                    -- Question2
FROM rdbms1.emptabledata
ORDER BY Job desc;

SELECT *
FROM rdbms1.emptabledata
ORDER BY Deptno asc;

SELECT DISTINCT Job    -- Question3
FROM rdbms1.emptabledata
ORDER BY Job desc;

SELECT *    -- Question4
FROM rdbms1.emptabledata
WHERE Hiredate < '1981-01-01';

SELECT Empno, Ename, Sal, Sal*12 As AnnSal, Sal/30 AS Daily
FROM rdbms1.emptabledata
ORDER BY AnnSal asc;    -- Question5 Didn't Understand The Question Itself
   

SELECT Empno, Ename, Sal, (year(current_date())-year(hiredate)) As Exp
FROM rdbms1.emptabledata
WHERE Mgr = 7369;


SELECT *                -- Question 7
FROM rdbms1.emptabledata
WHERE Comm> Sal; 

SELECT *                    -- Question 8
FROM rdbms1.emptabledata
WHERE Job = "Clerk" OR Job = "ANALYST" 
order by Job desc;      

SELECT  Empno, Ename,Sal, Sal*12 AS AnnSal  -- Question9
FROM rdbms1.emptabledata
WHERE Sal*12>= 22000 and Sal*12<=45000;

SELECT *     -- Question 10
From rdbms1.emptabledata
Where Ename like "S____";

SELECT*   -- Question 11
FROM rdbms1.emptabledata
WHERE Empno not like "78%";

SELECT *  -- Question 12
FROM rdbms1.emptabledata
WHERE Job = "CLERK" and Deptno = 20;

SELECT *
FROM rdbms1.emptabledata Employees JOIN rdbms1.emptabledata Manager -- Q13
on Employees.Empno = Manager.mgr 
WHERE Manager.Hiredate<Employees.Hiredate; 

SELECT *
FROM rdbms1.emptabledata Dept20 JOIN rdbms1.emptabledata Dept10
on Dept10.Deptno = Dept20.Deptno -- Q13
WHERE Dept10.job=Dept20.job; 

SELECT *
FROM rdbms1.emptabledata
WHERE Deptno = 20 and job IN(SELECT distinct Job FROM rdbms1.emptabledata WHERE Deptno = 10);


SELECT *
FROM rdbms1.emptabledata
WHERE Sal  IN (select Sal FROM rdbms1.emptabledata WHERE Ename = "FORD" or Ename = "SMITH" )
ORDER By Sal Desc;

SELECT *
FROM rdbms1.emptabledata
WHERE job in(select JOB FROM rdbms1.emptabledata WHERE Ename="Smith" or Ename = "Allen");

SELECT *
FROM rdbms1.emptabledata
WHERE Deptno = 10 and job Not in(select Job FROM rdbms1.emptabledata WHERE Deptno = 20);

SELECT MAX(sal) as Highest_Salary
FROM rdbms1.emptabledata;

SELECT *
FROM rdbms1.emptabledata
WHERE SAL = (SELECT max(SAL) FROM rdbms1.emptabledata);

SELECT sum(sal) as Total_salary 
FROM rdbms1.emptabledata
WHERE Empno in (SELECT distinct mgr FROM rdbms1.emptabledata);

SELECT *
FROM rdbms1.emptabledata
WHERE Ename LIKE '%a%';

SELECT  *
FROM rdbms1.emptabledata
WHERE min(SAL) = (select distinct JOB  FROM rdbms1.emptabledata); -- not getting it right

select *
FROM rdbms1.emptabledata
WHERE SAL >(select SAL FROM rdbms1.emptabledata WHERE Ename = "Blake");

CREATE VIEW V1
AS 
SELECT 



DELIMITER $$ -- q
create 
PROCEDURE fetche(IN deptno INT)
BEGIN
SELECT e.ename, d.dname FROM emptabledata e JOIN depttable d ON e.deptno = d.deptno WHERE e.deptno = deptno;
END$$
DELIMITER ;

CALL fetche(20);
