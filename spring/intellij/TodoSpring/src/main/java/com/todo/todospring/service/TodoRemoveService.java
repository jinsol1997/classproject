package com.todo.todospring.service;

import com.todo.todospring.dao.TodoDao;
import com.todo.todospring.util.ConnectionUtil;
import lombok.Cleanup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;

@Service
public class TodoRemoveService {

    @Autowired
    private TodoDao dao;

    public int doRemove(int index){

        int result = 0;

        try {
            @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
            result = dao.remove(conn, index);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }

}
