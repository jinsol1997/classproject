package com.app.dept.service;

import com.app.dept.domain.DeptDTO;
import com.app.dept.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptRegService {

    @Autowired(required = false)
    private DeptMapper deptMapper;

    public int insertDept(DeptDTO deptDTO){
        return deptMapper.insertDept(deptDTO);
    }
}
