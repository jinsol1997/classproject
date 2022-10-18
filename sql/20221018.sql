-- 20221018

-- inline view - rownum
-- from 절 뒤에 오는 서브쿼리 -> inline view
-- select -> 결과도 테이블

select * from emp;

select rownum, emp.*
from emp
order by hiredate;
-- rownum : 사용자가 생성하는 컬럼이 아닌, 시스템에서 제공하는 컬럼

select rownum, t.*
from (select * from emp order by hiredate) t
;

-- top3
-- 입사일이 가장 오래된 3명을 구하자
select rownum, t.*
from (select * from emp order by hiredate) t
where rownum <= 3;




create table emp01 (
    empno number(4) CONSTRAINT emp01_empno_pk primary key, 
    ename varchar2(10) constraint emp01_ename_NN not null,
    job varchar2(9) constraint emp01_job_UK unique ,
    sal number(7,2) constraint emp01_sal_CK check (sal between 500 and 5000) , -- 500~5000
    gender char(1) constraint emp01_gender_CK check (gender in ('M','F')) , -- 남자 M 여자 F
    deptno number(2) constraint emp01_deptno_FK REFERENCES DEPT(deptno),
    hiredate date default sysdate
);

desc emp01;
insert into emp01 (empno, ename, job, sal, gender, deptno )
values (1111, 'KING', '대표', 1500, 'M', 10);
insert into emp01 values (1112, 'SON', '대리', 500, 'M', 40, '2022-10-17');
insert into emp01 (empno, ename) values (1113, 'SCOTT');
-- 지정 입력되지 않은 컬럼에는 null 값이 등록 : 암묵적인 입력 방법
insert into emp01 values (1114, 'HOT', null, null, null, null, null);
insert into emp01 values (1115, 'COOL', '', '', '', '', '');
select * from emp01;
drop table emp01;

-----------------------------------------
-- 데이터의 수정
-- update 테이블이름 set 컬럼이름 = 새로운값, 컬럼이름 = 새로운값 where 행 선택 조건

drop table emp03;
create table emp03 as select * from emp;

select * from emp03;

-- 모든 사원의 부서번호를 30으로 바꿔보자
update emp03 set deptno = 30;

-- 모든 사원의 급여를 10% 인상
update emp03 set sal = sal * 1.1;

-- 모든 사원의 입사일을 오늘 날짜로 변경
update emp03 set hiredate = sysdate;

-- 부서번호가 10번인 사원의 부서번호를 30번으로 변경
update emp03 set deptno = 30 where deptno = 10;

-- 급여가 3000 이상인 사원들의 급여를 10% 인상
update emp03 set sal = sal*1.1 where sal >= 3000;

-- 1987년 입사한 사원들의 입사일을 오늘로 수정
update emp03 set hiredate = sysdate where hiredate between '1987/01/01' and '1987/12/31';

-- SCOTT 사원을 20번 부서로 이동, 직급을 MANAGER로 변경
update emp03 set deptno = 40, job = 'MANAGER' where ename = 'SCOTT';

-- SMITH 사원을 SCOTT 사원의 부서로 이동
update emp03 set deptno = (select deptno from emp03 where ename= 'SCOTT') where ename = 'SMITH';

drop table dept01;
create table dept01 as select * from dept;
select * from dept01;

-- 부서 번호가 20번인 부서의 이름과 지역은 RESEARCH와 DALLAS입니다. 다음은 부서번호가 20인
-- 부서의 부서명과 지역명을 부서 번호가 40번인 부서와 동일하게 변경하기 위한 UPDATE 명령문입니다. 
update dept01 set (dname, loc) = (select dname, loc from dept where deptno=40)
where deptno = 20
;



---------------------------------------------------
-- 테이블의 행을 삭제
-- delete from 테이블 이름 where 행선택조건
delete from dept01;
select * from dept01;

select * from emp03;

-- 대표 사퇴
delete from emp03 where empno = 7839;

-- 40번 부서의 모든 사원의 삭제
delete from emp03 where deptno = 40;

select * from emp03;

-- SALES 부서의 사원이 모두 퇴사 -> 삭제
delete from emp03 where deptno = (select deptno from dept where dname = 'SALES');
select deptno from dept where dname = 'SALES';


