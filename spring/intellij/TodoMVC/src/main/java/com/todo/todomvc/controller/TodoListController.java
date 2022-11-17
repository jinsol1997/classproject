package com.todo.todomvc.controller;

import com.todo.todomvc.service.TodoSelectAllService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@RequestMapping("/list")
@Controller
public class TodoListController {

    @GetMapping
    public String getList(Model model){
        model.addAttribute("title", "TodoList");
        model.addAttribute("todoList", TodoSelectAllService.getInstance().getTodoList());
        return "todo/list";
    }
}
