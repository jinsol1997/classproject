package com.todo.todomvc.controller;

import com.todo.todomvc.domain.TodoDTO;
import com.todo.todomvc.service.TodoModifyService;
import com.todo.todomvc.service.TodoReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Log4j2
@RequestMapping("/modify")
@Controller
public class TodoModifyController {

    @GetMapping
    public String getModify(HttpServletRequest request){
        
        log.info("modify get 진입");

        int index = Integer.parseInt(request.getParameter("index"));

        TodoDTO dto = TodoReadService.getInstance().doRead(index);
        request.setAttribute("todo", dto);
        
        return "todo/modify";
    }

    @PostMapping
    public String doModify(TodoDTO dto){

        log.info("modify post 진입");

//        String index = request.getParameter("index");
//        String todo = request.getParameter("todo");
//        String dueDate = request.getParameter("dueDate");
//        boolean finished = request.getParameter("finished") == null ? false : true;
//
//
//        TodoDTO dto = new TodoDTO(Long.parseLong(index), todo, dueDate, finished);
        System.out.println(dto);


        int result = TodoModifyService.getInstance().doModify(dto);
        if(result <= 0){
            log.info("수정 실패");
        }
        
        return "redirect:/list";
    }
}
