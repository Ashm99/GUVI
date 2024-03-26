use rough;

create table Empl(
empno int not null,
ename varchar(30),
job varchar(20),
mgr int,
hiredate date,
sal decimal(6,2),
comm decimal(6,2),
deptno int
);
describe Empl;
drop table Empl;

insert into Empl values
(8369, "SMITH", "CLERK", 8902, "1990-12-18", 800, NULL, 20);

select * from Empl;

insert into Empl values
(8499, "ANYA", "SALESMAN", 8698, "1991-02-20", 1600, 300, 30),
(8521, "SETH", "SALESMAN", 8698, "1991-02-22", 1250, 500, 30),
(8566, "MAHADEVAN", "MANAGER", 8839, "1991-04-02", 2985, NULL, 20),
(8654, "MOMIN", "SALESMAN", 8698, "1991-09-28", 1250, 1400, 30),
(8698, "BINA", "MANAGER", 8839, "1991-05-01", 2850, NULL, 30),
(8882, "SHIVANSH", "MANAGER", 8839, "1991-06-09", 2450, NULL, 10),
(8888, "SCOTT", "ANALYST", 8566, "1992-12-09", 3000, NULL, 20),
(8839, "AMIR", "PRESIDENT", NULL, "1991-11-18", 5000, NULL, 10),
(8844, "KULDEEP", "SALESMAN", 8698, "1991-09-08", 1500, 0, 30);

-- queA
select ename, sal from Empl where sal>=2000;

-- queB
select * from Empl where comm is null or comm=0;

-- queC
select ename, sal from Empl where sal<=2500 or sal>=4000;

-- queD
select ename, job, concat("Rs.",format(sal,0)) from Empl where mgr is null;

-- queE
select ename from Empl where ename like "__A%";

-- queF
select ename from Empl where ename like "%T";
