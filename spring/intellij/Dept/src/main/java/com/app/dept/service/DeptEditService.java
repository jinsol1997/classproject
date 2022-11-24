package com.app.dept.service;

import com.app.dept.domain.DeptDTO;
import com.app.dept.mapper.DeptMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class DeptEditService {

    @Autowired(required = false)
    private DeptMapper deptMapper;

    public int editDept(DeptDTO deptDTO){
        return deptMapper.updateDept(deptDTO);
    }
}
