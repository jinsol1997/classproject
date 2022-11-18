package com.todo.todospring.controller;

import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.service.TodoSelectAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoListController {

    @Autowired
    private TodoSelectAllService todoSelectAllService;

    @RequestMapping("/todo/list")
    public String getTodoList(Model model){

        ArrayList<TodoDTO> list = todoSelectAllService.getTodoList();
        model.addAttribute("todoList", list);

        return "todo/list";
    }
}
