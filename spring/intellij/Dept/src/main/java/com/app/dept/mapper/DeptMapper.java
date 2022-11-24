package com.app.dept.mapper;

import com.app.dept.domain.DeptDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    // 전체 부서 리스트
    List<DeptDTO> selectAll();
    
    // 수정 / 상세 페이지
    DeptDTO selectByDeptno(int deptno);

    int updateDept(DeptDTO deptDTO);

    // 삭제
    int deleteByDeptno(int deptno);

    // 입력
    int insertDept(DeptDTO deptDTO);
}
