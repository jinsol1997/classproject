package com.app.dept.controller;

import com.app.dept.domain.DeptDTO;
import com.app.dept.service.DeptRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept/register")
public class DeptRegController {

    @Autowired
    private DeptRegService deptRegService;

    @GetMapping
    public void getRegForm(){

    }

    @PostMapping
    public String reg(DeptDTO deptDTO){

        deptRegService.insertDept(deptDTO);
        return "redirect:/dept/list";
    }
}
