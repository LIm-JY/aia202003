--43. 사원 번호가 7788인 사원과 담당 업무가 같은 사원을 표시(사원 이름과 담당업무)하시오.
select * from emp where empno = 7788;

select e.ename, e.job 
from emp e
where e.job = (select a.job from emp a where a.empno = 7788)
;

--44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오. 사원이름과 감당 업무
select a.ename ,sal from emp a where a.empno = 7499;

select e.ename, e.job, e.sal
from emp e
where e.sal > (select a.sal from emp a where a.empno = 7499)
;


--45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)
select min(a.sal) from emp a;

select e.ename, e.job, e.sal 
from emp e 
where e.sal=(select min(a.sal) from emp a);



--46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균을 구하시오.
select *from emp;
select job, avg(sal) from emp;

select * 
from (select job, avg(sal) from emp 
group by job 
order by avg(sal)) where rownum=1
;


--47. 각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하시오.
select min(sal) from emp where deptno = deptno;

select e.ename,e.sal,e.deptno
from emp e
where e.sal = any(select min(a.sal) from emp a where a.deptno = e.deptno);


--48. 담당업무가 ANALYST 인 사원보다 급여가 적으면서 업무가 ANALYST가 아닌 사원들을 표시(사원번호, 이름, 담당 업무, 급여)하시오.
select * from emp where job = 'ANALYST';

select empno, ename, job, sal
from emp
where sal < any(select sal from emp where job = 'ANALYST')
;


--49. 부하직원이 없는 사원의 이름을 표시하시오.
select a.ename from emp a, emp b where a.mgr=b.empno;

select ename 
from emp 
where empno not in (select b.empno from emp a, emp b where a.mgr = b.empno);



--50. 부하직원이 있는 사원의 이름을 표시하시오.
select ename 
from emp 
where empno in (select b.empno from emp a, emp b where a.mgr = b.empno);



--51. BLAKE와 동일한 부서에 속한 사원의 이름과 입사일을 표시하는 질의를 작성하시오. ( 단 BLAKE는 제외 )
select * from emp a where a.ename = 'BLAKE';

select * 
from emp e
where e.deptno = (select a.deptno from emp a where a.ename = 'BLAKE')
and e.ename !='BLAKE';


--52. 급여가 평균 급여보다 많은 사원들의 사원 번호와 이름을 표시하되 결과를 급여에 대해서 오름차순으로 정렬하시오.
select avg(a.sal) from emp a;

select e.empno, e.ename , e.sal
from emp e
where e. sal>(select avg(a.sal) from emp a)
order by sal asc
;


--53. 이름에 K가 포함된 사원과 같은 부서에서 일하는 사원의 사원 번호와 이름을 표시하시오.
select * from emp k where k.ename like ('%K%');

select e.ename, e. empno
from emp e
where e.deptno = any(select k.deptno from emp k where k.ename like ('%K%'));


-- 54.부서위치가 DALLAS인 사원의 이름과 부서번호 및 담당업무를 표시하시오.

select * from dept d where LOC = 'DALLAS';

select e.ename, e.deptno, e.job , a.loc
from emp e, dept a
where a.loc = (select d.loc from dept d where LOC = 'DALLAS')
and e.deptno=(select d.deptno from dept d where LOC = 'DALLAS')
;


--55. KING에게 보고하는 사원의 이름과 급여를 표시하시오.
select k.empno from emp k where k.ename='KING';
select * 
from emp a 
where a.mgr=(select k.empno from emp k where k.ename='KING');





--56. RESEARCH 부서의 사원에 대한 부서번호, 사원이름 및 담당 업무를 표시하시오.
select d.deptno from dept d where d.dname= 'RESEARCH';

select  DISTINCT(e.empno), e.ename, e.job
from emp e, dept s
where e.deptno = (select d.deptno from dept d where d.dname= 'RESEARCH');


--57. 평균 월급보다 많은 급여를 받고 이름에 M이 포함된 사원과 같은 부서에서 근무하는 사원의 사원 번호, 이름, 급여를 표시하시오.

--평균급여
select avg(a.sal) from emp a;
--m을포함한 사원과 같은부서
select b.deptno
from emp b
where b.deptno = any(select k.deptno from emp k where k.ename like ('%M%'));

select e.empno, e.ename,e.sal
from emp e
where e.sal > (select avg(a.sal) from emp a)
and e. deptno = any (select b.deptno
from emp b
where b.deptno = any(select k.deptno from emp k where k.ename like ('%M%')))
;



--58. 평균급여가 가장 적은 업무를 찾으시오.
select job, avg(sal) from emp group by job order by avg(sal) asc;

select rownum, job
from (select job,avg(sal) from emp group by job order by avg(sal) asc)
where rownum=1;


--59. 담당업무가 MANAGER 인 사원이 소속된 부서와 동일한 부서의 사원을 표시하시오.
select *from emp where job ='MANAGER';

select *
from emp
where deptno = any(select deptno from emp where job ='MANAGER')
order by deptno asc;




-------------------------------------------------------------------------
--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--(5) 박지성이구매한도서의출판사수
select count(publisher) from book 
where bookid in (select bookid from orders o join customer c using(custid) where name='박지성');


--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
select bookname, abs(price-saleprice) Pricegap 
from orders o join book b 
using(bookid) 
where o.custid = (select custid from customer where name='박지성');

--(7) 박지성이구매하지않은도서의이름
select bookname 
from book 
where bookid not in (select bookid from orders o, 
customer c where o.custid=c.custid and c.name='박지성');



--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(8) 주문하지않은고객의이름(부속질의사용)
select name 
from customer 
where custid not in (select distinct custid from orders);


--(9) 주문금액의총액과주문의평균금액
select *from orders;
select sum(saleprice) total, avg(saleprice) avgsaleprice
from orders;


--(10) 고객의이름과고객별구매액
select name, sum(saleprice) 
from orders o join customer c 
using(custid) 
group by name;



--(11) 고객의이름과고객이구매한도서목록
select name, bookname 
from (select * from orders o, customer c, book b 
where o.custid=c.custid and o.bookid = b.bookid) 
order by name;



--(12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문
select * from orders o join book b on o.bookid=b.bookid 
where abs(price-saleprice)>= all(
    select abs(price-saleprice) 
    from (select * from orders o, customer c, book b where o.custid=c.custid and o.bookid = b.bookid));



--(13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름
select name 
from customer c join orders o 
on c.custid= o.custid 
group by name
having avg(saleprice) > (select avg(price) from book b, orders o where b.bookid=o.bookid);




--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
--(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select name from orders o, customer c, book b where o.custid=c.custid and o.bookid = b.bookid
and publisher in (
    select publisher 
    from orders o natural join book b 
    where custid = (select custid from customer where name='박지성'))
and name != '박지성';



--(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select name from orders o, customer c, book b where o.custid=c.custid and o.bookid = b.bookid
group by name
having count(distinct publisher)>=2;



select o.custid, sum(o.saleprice)
from customer c, orders o
where c.custid = o.custid
group by o.custid
order by o.custid
;

