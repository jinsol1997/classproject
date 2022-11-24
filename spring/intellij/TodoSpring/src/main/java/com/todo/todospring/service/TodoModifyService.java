package com.todo.todospring.service;

import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.mapper.TodoMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class TodoModifyService {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    public int doModify(TodoDTO todoDTO) {
        log.info("modify service 진입.. dto = " + todoDTO);
        return todoMapper.modify(todoDTO);
    }
}
