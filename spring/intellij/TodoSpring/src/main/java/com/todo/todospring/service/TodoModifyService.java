package com.todo.todospring.service;

import com.todo.todospring.dao.TodoDao;
import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.util.ConnectionUtil;
import lombok.Cleanup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;

@Service
public class TodoModifyService {

    @Autowired
    private TodoDao dao;


    public int doModify(TodoDTO dto){

        int result = 0;

        try {
            @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
            result = dao.modify(conn, dto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
