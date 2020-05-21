select* from emp;
select*from dept;

select*
from emp, dept;



select ename, dname
from emp e, dept d
where e.deptno = d.deptno;

select ename, dname
from emp e inner join dept d
on e.deptno=d.deptno;

select ename, dname
from emp natural join dept;

select *
from emp e left outer join emp m
on e.mgr=m.empno;