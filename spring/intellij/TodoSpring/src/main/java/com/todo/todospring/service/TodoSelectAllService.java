package com.todo.todospring.service;

import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class TodoSelectAllService {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    public ArrayList<TodoDTO> getTodoList(){

        return todoMapper.selectAll();
    }

}
