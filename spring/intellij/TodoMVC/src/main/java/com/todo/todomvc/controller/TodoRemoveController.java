package com.todo.todomvc.controller;

import com.todo.todomvc.service.TodoRemoveService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@RequestMapping("/remove")
@Controller
public class TodoRemoveController {

    @PostMapping
    public String doRemove(HttpServletRequest request){

        log.info("remove 진입");

        //삭제하고자 하는 todo의 index를 받는다
        int index = Integer.parseInt(request.getParameter("index"));

        int result = TodoRemoveService.getInstance().doRemove(index);

        if(result <= 0){
            log.info("삭제 실패");
        }

        return "redirect:/list";
    }
}
