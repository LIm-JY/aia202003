--숫자함수

select mod (sal,10)
from emp;

select mod(10,2)
from dual;

select abs(sal)
from emp;

select trunc(1282.238273,2)
from dual;

select trunc(sal,-1)
from emp;

select round(3.141592,3)
from dual;

select sysdate
from dual;

-- TO_CHAR
--date -> varchar2
select sysdate, to_char(sysdate,'yyyy-mm-dd')
from dual;

select ename, hiredate, to_char(hiredate,'yyyy.mm.dd')
from emp;

select sysdate, trunc(sysdate-to_date('19960830','yyyymmdd'))
from dual;


--TO_NUMBER
--TO_NUMBER(원본,'패턴')
--str -> number: 산술,관계 연산을 목적으로 변환

select to_number('20,000','999,999')-to_number('10,000','999,999')
from dual;


--DECODE함수: if switch 구문과 유사
select ename, deptno,
    DECODE(deptno, 
                10,'ACCOUNTING',
                20,'RESEARCH',
                30,'SALES',
                40,'OPERATING'
    )AS deptName
from emp;

--직급에 따라 급여를 인상하도록 하자.
--직급이 'ANAlYST'인 사원은 5%, 
--'SALESMAN'인 사원은 10%, 
--'MANAGER'인 사원은 15%, 
--'CLERK'인사원은 20%인 인상한다.

select ename, sal, 
decode(job,
        'ANAlYST',sal+sal*0.05,
        'SALESMAN',sal+sal*0.10,
        'MANAGER',sal+sal*0.15,
        'CLERK',sal+sal*0.20
)AS UpSal

from emp;

select ename, deptno,
case
    when deptno=10 then'ACCOUNTING'
    when deptno=20 then'RESEARCH'
    when deptno=30 then'SALES'
    when deptno=40 then'OPERATING'
    else 'no name'

end as deptname
from emp;

------------------------------------------
--그룹함수 ( 집합함수)
------------------------------------------
-- sum, avg, count, max, min

--sum(컬럼이름) : 해당컬럼의 데이터들의 합 반환
--매월 지급되는 급여의 총합
select to_char(sum(sal)*1000,'L999,999,999') as totalsal
from emp;

--avg (컬럼명): 해당컬럼의 데이터들의 평균값을 반환
select trunc(avg(sal))
from emp;

select 29025/14 from dual;

select sum(comm) from emp;

select avg(comm)
from emp;

select * from emp order by comm;

--MAX, MIN : 해당 컬럼의 데이터 중에서 최대값, 최소값을 반환
select max(sal),min(sal),max(comm),min(comm)
from emp;

--count(컬럼명 or *): 행(row)의 개수를 반환
select count(*)
from emp;

select count(comm)  --null을 포함하는 행은 개수로 포함시키지 않는다.
from emp;

select distinct job from emp order by job;

select count(distinct job) from emp order by job;




