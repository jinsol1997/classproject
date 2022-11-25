package com.app.dept.service;

import com.app.dept.domain.DeptDTO;
import com.app.dept.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptRegService {

    @Autowired(required = false)
    private DeptMapper deptMapper;

    public int insertDept(DeptDTO deptDTO) {
        return deptMapper.insertDept(deptDTO);
    }

    @Transactional
    public int insertDepts(DeptDTO deptDTO) {
        deptMapper.insertDept(deptDTO);
        deptMapper.insertDept(new DeptDTO(10, "test", "test"));
        return 0;
    }
}
