package com.todo.todospring.controller;

import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.service.TodoModifyService;
import com.todo.todospring.service.TodoReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/todo/modify")
public class TodoModifyController {

    @Autowired
    private TodoReadService todoReadService;
    @Autowired
    private TodoModifyService todoModifyService;

    @GetMapping
    public void getModifyForm(Model model, @RequestParam("index") int index){
        model.addAttribute("todo", todoReadService.doRead(index));

        log.info(todoReadService.doRead(index) + "todo getModify");
    }

    @PostMapping
    public String modify(TodoDTO todoDTO, @RequestParam("index") int index){

        todoDTO.setTodoindex(index);

        log.info(todoDTO + "modify controller");
        todoModifyService.doModify(todoDTO);

        return "redirect:/todo/list";
    }

}
