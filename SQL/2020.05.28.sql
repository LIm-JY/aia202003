-----------------------------------
--index
-----------------------------------

-- 검색을 빠르게 하기위해 사용한다.
--dml작업에는 성능 저하가 올수 있다.

desc user_ind_columns;

select index_name, table_name, column_name
from user_ind_columns
where table  'emp01';

--테스트 테이블 생성
drop table emp01;

create table emp01
as
select *from emp;

insert into emp01 select*from emp01;

insert into emp01 (empno, ename) values(1111,'SON');

select*from emp01 where ename='SON';


--INDEX생성
--create index 인덱스이름 on 테이블이름(컬럼이름)

create index emp01_ename_index on emp01(ename);