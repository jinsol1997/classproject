package com.todo.todospring.controller;

import com.todo.todospring.service.TodoReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoReadController {

    @Autowired
    private TodoReadService todoReadService;

    @GetMapping("/todo/read")
    public void readTodo(Model model, @RequestParam("index") int index){
        model.addAttribute("todo", todoReadService.doRead(index));
    }

}
