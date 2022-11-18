package com.todo.todospring.service;

import com.todo.todospring.dao.TodoDao;
import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.util.ConnectionUtil;
import lombok.Cleanup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoSelectAllService {

    @Autowired
    private TodoDao dao;

    public ArrayList<TodoDTO> getTodoList(){

        ArrayList<TodoDTO> list = null;

        try {
            @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
            list = dao.selectAll(conn);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return list;
    }

}
