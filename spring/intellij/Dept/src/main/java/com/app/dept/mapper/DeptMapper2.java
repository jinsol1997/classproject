package com.app.dept.mapper;

import com.app.dept.domain.DeptDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper2 {

    @Select("select * from dept")
    List<DeptDTO> selectAll();

    @Select("select * from dept where deptno=#{deptno}")
    DeptDTO selectByDeptno(int deptno);

    @Update("update dept set dname=#{dname}, loc=#{loc} where deptno=#{deptno}")
    int updateDept(DeptDTO deptDTO);

    // 삭제
    @Delete("delete from dept where deptno=#{deptno}")
    int deleteByDeptno(int deptno);

    // 입력
    @Insert("insert into dept values (#{deptno}, #{dname}, #{loc})")
    int insertDept(DeptDTO deptDTO);
}
