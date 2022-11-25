package com.app.dept.controller;

import com.app.dept.domain.DeptDTO;
import com.app.dept.service.DeptRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
@Log4j2
@Controller
@RequestMapping("/dept/register")
public class DeptRegController {

    @Autowired
    private DeptRegService deptRegService;

    @GetMapping
    public void getRegForm(){

    }

    @PostMapping
    public String reg(@Valid DeptDTO deptDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            log.info(bindingResult.getAllErrors());
            for(ObjectError objectError : bindingResult.getAllErrors()){
                log.info(objectError.getCodes()[1] + objectError.getDefaultMessage());
            }
        }

        deptRegService.insertDept(deptDTO);
        //deptRegService.insertDepts(deptDTO);
        return "redirect:/dept/list";
    }
}
