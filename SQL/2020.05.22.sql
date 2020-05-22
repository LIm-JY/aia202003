--sub query
-- 평균 급여를 구하는 쿼리문을 서브 쿼리로 사용하여
--평균 급여보다 더 많은 급여를 받는 사원을 검색하는 문장은 다음과 같습니다.

select avg(sal) from emp;

select *
from emp
where sal >(select avg(sal) from emp);

select deptno from emp where ename = 'SCOTT';

select *
from emp
where deptno = 20 ;-- (select deptno from emp where ename = 'SCOTT');


-- 3000 이상받는 사원이 소속된 부서(10번,20번)과
--동일한 부서에서 근무하는 사원이기에
-- 서브쿼리의 결과중에서 하나라도 일치하면 참인 결과를 구하는
-- IN 연산자와 함꼐 사용돼야 한다.

select *
from emp
where deptno in (20,10)
;

select DISTINCT deptno from emp where sal>=3000;

select *
from emp
where deptno in (select DISTINCT deptno from emp where sal>=3000)
;

SELECT ENAME, SAL 
FROM EMP 
WHERE SAL > ALL(SELECT SAL FROM EMP WHERE DEPTNO =30);

--부서번호가 30 번인 사원들의 급여중 가장 작은 값 (950) 보다
--많은 급여를 받는 사원의 이름, 급여를 출력하는

select min(sal) from emp where deptno=30;

select ename, sal from emp where sal>950;

select ename, sal from emp where sal >(select min(sal) from emp where deptno=30);

select ename, sal from emp where sal > any(select sal from emp where deptno=30);


-- rownum: 입력순서의 번호
select rownum, ename
from emp
;


-- 스칼라 부속질의 : 컬럼을 표현
-- 마당서점의 고객별 판매액을 보이시오(결과는 고객이름과 고객별 판매액을 출력)

select o.custid, name, sum(saleprice)
from orders o, customer c
where o.custid=c.custid
group by o.custid ,name
;

select custid,
(select name from customer c where o.custid=c.custid)
as custom_name, sum(saleprice)
from orders o
group by custid
;

--질의 고객변호가 2 이하인 고객의 판매액을 보이시오
-- (결과는 고객이름과 고객별 판매액 출력)

select *
from customer where custid<=2;

select cs. sum(saleprice)
from customer cs, orders od
where cs.custid=od.custid
group by cs.name
;

select rownum, ename from emp;

select rownum, ename, empno
from (select ename,empno,job,deptno, sal from emp order by sal desc)
where rownum<=3
;

--평균 주문금액 이하의 주문에 대해서
--주문번호와 금액을 보이시오

select avg(saleprice) from orders;

select orderid, saleprice
from orders
where saleprice<=(select avg(saleprice)from orders)
;

--각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해서
--주문번호, 고객번호, 금액을 보이시오
select avg(saleprice) from orders where custid=2;

select orderid, custid, o.saleprice
from orders o
where saleprice >(select avg(saleprice) from orders a where a.custid=o.custid)
;

select * from customer where address like "%대한민국%";

select sum(saleprice)
from orders
where custid in(2,3,5)
;
