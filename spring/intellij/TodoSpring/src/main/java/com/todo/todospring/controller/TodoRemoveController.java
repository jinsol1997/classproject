package com.todo.todospring.controller;

import com.todo.todospring.service.TodoRemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoRemoveController {

    @Autowired
    private TodoRemoveService todoRemoveService;

    @PostMapping("/todo/remove")
    public String removeTodo(@RequestParam("index") int index){

        todoRemoveService.doRemove(index);

        return  "redirect:/todo/list";
    }
}
