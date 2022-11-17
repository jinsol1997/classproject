package com.todo.todomvc.controller;

import com.todo.todomvc.domain.TodoDTO;
import com.todo.todomvc.service.TodoReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@RequestMapping("/read")
@Controller
public class TodoReadController {

    @GetMapping
    public String getRead(HttpServletRequest request){

        log.info("read get 진입");

        int index = Integer.parseInt(request.getParameter("index"));

        TodoDTO dto = TodoReadService.getInstance().doRead(index);
        request.setAttribute("todo", dto);

        return "todo/read";
    }

}
