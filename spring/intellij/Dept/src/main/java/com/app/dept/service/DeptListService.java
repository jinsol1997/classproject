package com.app.dept.service;

import com.app.dept.domain.DeptDTO;
import com.app.dept.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptListService {

    @Autowired(required = false)
    private DeptMapper deptMapper;

    public List<DeptDTO> getList(){
        return deptMapper.selectAll();
    }

}
