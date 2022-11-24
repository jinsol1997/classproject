package com.todo.todospring.service;

import com.todo.todospring.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoRemoveService {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    public int doRemove(int todoindex){
        return todoMapper.remove(todoindex);
    }

}
