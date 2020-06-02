create table Contact(
    pidx number(4),                --기본키
    pname varchar2(10) not null,   --이름
    pnumber varchar(13)not null,   --전화번호
    paddr varchar(50) default '입력없음' not null,     --주소
    pmail varchar(50 )default '입력없음' not null,     --이메일
    ptype varchar2(10) not null,    --친구타입
    pmajor varchar2(20),           --전공
    pgrade number(1),              --학년
    pcomName VARCHAR2(50),         --회사이름
    pcomDept VARCHAR2(50),         --부서이름
    pcomJob VARCHAR2(20),          --직급
    pcafeName VARCHAR2(50),        --동호회이름
    pcafeNickName VARCHAR2(50),    --닉네임
    
    CONSTRAINT p_pidx PRIMARY KEY (pidx),
    CONSTRAINT p_ptype check (ptype in ('univ','com','cafe')),
    CONSTRAINT p_grade_ck check (pgrade between 1 and 4)
    );
    
    --테이블 레벨 제약 정의
--
------------------------------------------------
-- 사용자 정의 제약조건을 저장하는 딕셔너리 테이블
select* from user_constraints where table_name='Contact';
------------------------------------------------

--------------------------------------------------------
--입력 SQL작성

desc contact;
select * from Contact;
TRUNCATE TABLE Contact;
--기본정보입력
insert into Contact 
(pidx, pname, pnumber, paddr, pmail, ptype)
values (1,'scoot','010-1234-5678', 'seoul', 'scott@gmail.com', 'univ')
;
--default 입력처리 pbaddr, pbmail
insert into Contact 
(pidx, pname, pnumber,ptype)
values (2,'king','010-4444-1278', 'univ');
    
    
--학교친구정보입력
insert into Contact 
(pidx, pname, pnumber, paddr, pmail, ptype, pmajor, pgrade)
values (3,'dan','010-6687-7778', '런던', 'dan@gmail.com', 'univ','computer',3)
;
--회사친구정보입력
insert into Contact 
(pidx, pname, pnumber, paddr, pmail, ptype,pcomname, pcomdept, pcomjob)
values (4,'laura','010-1344-8878', '로마', 'laura@gmail.com', 'com','NAVER', 'SEARCH','10')
;

--모임친구정보입력

insert into Contact 
(pidx, pname, pnumber, paddr, pmail, ptype, pcafename, pcafenickname)
values (5,'alice','010-8888-7222', '로마', 'alice@gmail.com', 'cafe', 'AIA', 'SEXY')
;

select * from Contact;
------------------------------------------------------
    --정보 출력 질의
------------------------------------------------------
--1.기본 친구 정보 출력 질의
select pidx, pname, pnumber from Contact;
--2.학교 친구 정보 출력 질의
select pidx, pname, pnumber, pmajor, pgrade from Contact where ptype='univ';

--3.회사 친구 정보 출력 질의
select pidx, pname, pnumber,pcomdept,pcomjob,pcomname from Contact where ptype='com';
--4.모임 친구 정보 출력 질의
select pidx, pname, pnumber,pcafename,pcafenickname from Contact where ptype='cafe';





select * from dept01;
insert into DEpt01(deptno, dname, loc)VALUES (10, 'Hi', 'seoul'); 

rollback;

UPDATE DEPT01 
SET DNAME = 'ohho', LOC = 'busan'
WHERE DEPTNO=10 and DNAME = 'Hi';

DELETE FROM DEPT
WHERE DEPTNO = 10 and DNAME = 'HI';

select * from user_constraints;

