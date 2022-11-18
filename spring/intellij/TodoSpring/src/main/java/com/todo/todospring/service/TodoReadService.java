package com.todo.todospring.service;

import com.todo.todospring.dao.TodoDao;
import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.util.ConnectionUtil;
import lombok.Cleanup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;

@Service
public class TodoReadService {

    @Autowired
    private TodoDao dao;

    public TodoDTO doRead(int index){

        TodoDTO dto = null;

        try {
            @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
            dto = dao.read(conn, index);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return dto;
    }
}
