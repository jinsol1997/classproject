package com.app.dept.controller.rest;

import com.app.dept.domain.DeptDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DeptJsonMessageController {

    @ResponseBody
    @GetMapping("/dept/json")
    public List<DeptDTO> listJson(){
        List<DeptDTO> list = new ArrayList<>();
        list.add(new DeptDTO(10, "test10", "LOC10"));
        list.add(new DeptDTO(20, "test20", "LOC20"));
        list.add(new DeptDTO(30, "test30", "LOC30"));

        return list;
    }

}
