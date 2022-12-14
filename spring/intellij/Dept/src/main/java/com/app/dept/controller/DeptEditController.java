package com.app.dept.controller;

import com.app.dept.domain.DeptDTO;
import com.app.dept.service.DeptEditService;
import com.app.dept.service.DeptReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dept/edit")
@Log4j2
public class DeptEditController {

    @Autowired
    private DeptReadService deptReadService;

    @Autowired
    private DeptEditService deptEditService;

    @GetMapping
    public void getEditForm(@RequestParam("no") int deptno, Model model){
        model.addAttribute("dept", deptReadService.getDept(deptno));

    }

    @PostMapping
    public String edit(DeptDTO deptDTO){
        deptEditService.editDept(deptDTO);
        return "redirect:/dept/list";
    }
}
