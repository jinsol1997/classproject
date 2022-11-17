package com.todo.todomvc.controller;

import com.todo.todomvc.domain.TodoDTO;
import com.todo.todomvc.service.TodoRegisterService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@RequestMapping("/register")
@Controller
public class TodoRegisterController {

    @GetMapping
    public String getRegister(){
        
        log.info("register get 진입");
        
        return "todo/register";
    }

    @PostMapping
    public String doRegister(HttpServletRequest request){

        log.info("register post 진입");

        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");

        TodoDTO dto = new TodoDTO();
        dto.setTodo(todo);
        dto.setDueDate(dueDate);

        int result = TodoRegisterService.getInstance().doRegister(dto);
        if(result <= 0){
            log.info("register 실패");
        }

        return "redirect:/list";
    }
}
