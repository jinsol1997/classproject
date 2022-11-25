package com.app.dept.service;

import com.app.dept.domain.DeptDTO;
import com.app.dept.domain.DeptSearchOption;
import com.app.dept.mapper.DeptMapper;
import com.app.dept.mapper.DeptMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptListService {

    @Autowired(required = false)
    private DeptMapper deptMapper;

    @Autowired(required = false)
    private DeptMapper2 deptMapper2;

    public List<DeptDTO> getList(){
        return deptMapper2.selectAll();
    }

    public List<DeptDTO> getSearchList(DeptSearchOption searchOption){
        return deptMapper.selectByOption(searchOption);
    }

}
