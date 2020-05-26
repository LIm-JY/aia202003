--phonebook DDL
--===== 전화번호 부( Contact )

-- 대리키 : 일련번호 -> pIdx

-- 이름, 전화번호, 주소, 이메일 <- 기본정보

-- 주소값과 이메일은 입력이 없을 때 기본값 입력

-- 친구의 타입 (카테고리) : univ, com, cafe 세가지 값만 저장 가능

------ 선택 정보
-- 전공, 학년
-- 회사이름, 부서이름, 직급
-- 모임이름, 닉네임
drop table phonebook;

create table phonebook(
    pbidx number(4),                --기본키
    pbname varchar2(10) not null,   --이름
    pbnumber varchar(13)not null,   --전화번호
    pbaddr varchar(50) default '입력없음' not null,     --주소
    pbmail varchar(50 )default '입력없음' not null,     --이메일
    pbtype varchar2(10) not null,    --친구타입
    pbmajor varchar2(20),           --전공
    pbgrade number(1),              --학년
    pbcomName VARCHAR2(50),         --회사이름
    pbcomDept VARCHAR2(50),         --부서이름
    pbcomJob VARCHAR2(20),          --직급
    pbcafeName VARCHAR2(50),        --동호회이름
    pbcafeNickName VARCHAR2(50),    --닉네임
    
    CONSTRAINT pb_pbidx PRIMARY KEY (pbidx),
    CONSTRAINT pb_pbtype check (pbtype in ('univ','com','cafe')),
    CONSTRAINT pb_grade_ck check (pbgrade between 1 and 4)
    
    

);
--테이블 레벨 제약 정의
--
------------------------------------------------
-- 사용자 정의 제약조건을 저장하는 딕셔너리 테이블
desc user constraints;
select* from user_constraints where table_name='PHONEBOOK';
------------------------------------------------

--------------------------------------------------------
--입력 SQL작성

desc phonebook;
select * from phonebook;
TRUNCATE TABLE phonebook;
--기본정보입력
insert into phonebook 
(pbidx, pbname, pbnumber, pbaddr, pbmail, pbtype)
values (1,'scoot','010-1234-5678', 'seoul', 'scott@gmail.com', 'univ')
;
--default 입력처리 pbaddr, pbmail
insert into phonebook 
(pbidx, pbname, pbnumber,pbtype)
values (2,'king','010-4444-1278', 'univ')
;


--학교친구정보입력
insert into phonebook 
(pbidx, pbname, pbnumber, pbaddr, pbmail, pbtype, pbmajor, pbgrade)
values (3,'dan','010-6687-7778', '런던', 'dan@gmail.com', 'univ','computer',3)
;
--회사친구정보입력
insert into phonebook 
(pbidx, pbname, pbnumber, pbaddr, pbmail, pbtype,pbcomname, pbcomdept, pbcomjob)
values (4,'laura','010-1344-8878', '로마', 'laura@gmail.com', 'com','NAVER', 'SEARCH','10')
;

--모임친구정보입력

insert into phonebook 
(pbidx, pbname, pbnumber, pbaddr, pbmail, pbtype, pbcafename, pbcafenickname)
values (5,'alice','010-8888-7222', '로마', 'alice@gmail.com', 'cafe', 'AIA', 'SEXY')
;

select * from phonebook;
------------------------------------------------------
    --정보 출력 질의
------------------------------------------------------
--1.기본 친구 정보 출력 질의
select pbidx, pbname, pbnumber from phonebook;
--2.학교 친구 정보 출력 질의
select pbidx, pbname, pbnumber,pbmajor,pbgrede from phonebook where pbtype='univ';

--3.회사 친구 정보 출력 질의
select pbidx, pbname, pbnumber,pbcomdept,pbcomjob,pbcomname from phonebook where pbtype='com';
--4.모임 친구 정보 출력 질의
select pbidx, pbname, pbnumber,pbcafename,pbcafenickname from phonebook where pbtype='cafe';





-----------------------------------------------------------------------------------
create table phoneinfo_basic(
    idx number(4)CONSTRAINT phoneinfo_basic_idx_pk PRIMARY key,  --기본키
    fr_name varchar2(20)not null ,   --이름
    fr_phonenumber varchar2(20) not null,   --전화번호
    fr_addr varchar2(20)default '입력없음' not null,     --주소
    fr_email varchar2(20)default '입력없음' not null,     --이메일
    fr_regdate date default sysdate,
    fr_type varchar2(10)
    constraint phoneinfo_basic_fr_type_ck check (fr_type in ('univ', 'com', 'cafe'))
   
);
create table phoneinfo_univ(
    idx number(6) CONSTRAINT phoneinfo_univ_idx_pk PRIMARY key ,
    fr_u_major varchar2(20) default 'N' not null ,
    fr_u_year number(1) default '1' not null,
    fr_ref number(6),
    FOREIGN KEY(fr_ref) REFERENCES phoneinfo_basic(idx) ,
    constraint phoneinfo_univ_fr_u_year_ck check (0<fr_u_year and fr_u_year<5)
);

CREATE TABLE phoneinfo_com(
    idx number(6) CONSTRAINT phoneinfo_com_idx_pk PRIMARY key,
    fr_c_company varchar2(20) default 'N' not null,
    fr_ref number(7),
    FOREIGN KEY(fr_ref) REFERENCES phoneinfo_basic(idx)

);

drop table phoneinfo_basic;
drop table phoneinfo_univ;
drop table phoneinfo_com;
TRUNCATE TABLE phoneinfo_basic;
TRUNCATE TABLE phoneinfo_univ;
TRUNCATE TABLE phoneinfo_com;
--입력 DML
 
 select*from phoneinfo_basic;
 --기본친구정보입력
 insert into phoneinfo_basic
(idx, fr_name,fr_phonenumber,fr_addr,fr_email,fr_regdate)
values (1,'scoot','010-1234-5678', 'seoul', 'scott@gmail.com',sysdate)
;

--학교친구정보입력
--1.기본
insert into phoneinfo_basic
(idx, fr_name,fr_phonenumber,fr_addr,fr_email,fr_regdate,fr_type)
values (2,'dan','010-6687-7778', '런던', 'dan@gmail.com',sysdate, 'univ')
;
--2. 상세
insert into phoneinfo_univ(
idx, fr_u_major, fr_u_year, fr_ref)
values (2,'comp',1,2)
;
select * from phoneinfo_basic;
select * from phoneinfo_basic where idx in(select fr_ref from phoneinfo_univ);


--회사친구정보입력

--1.기본 
insert into phoneinfo_basic
(idx, fr_name,fr_phonenumber,fr_addr,fr_email,fr_regdate,fr_type)
values (3,'laura','010-1344-8878', '로마', 'laura@gmail.com',sysdate ,'com')
;

--2. 상세
insert into phoneinfo_com(
idx, fr_c_company, fr_ref)
values (3,'kkij',3)
;
--3. join
insert into phoneinfo_basic
(idx, fr_name,fr_phonenumber,fr_addr,fr_email,fr_regdate,fr_type)
values (3,'laura','010-1344-8878', '로마', 'laura@gmail.com',sysdate ,'com')

;

select * from phoneinfo_basic;
select * from phoneinfo_basic where idx in(select fr_ref from phoneinfo_com);

--모임친구정보입력

--목록출력
--전체
select * from phoneinfo_basic pb, phoneinfo_univ pu, phoneinfo_com pc 
where pb.idx=pu.fr_ref(+) and pb.idx=pc.fr_ref(+);
--학교
select * from phoneinfo_basic pb, phoneinfo_univ pu 
where pb.idx=pu.fr_ref;
--회사
select * from phoneinfo_basic pb, phoneinfo_com pc 
where pb.idx=pc.fr_ref;





