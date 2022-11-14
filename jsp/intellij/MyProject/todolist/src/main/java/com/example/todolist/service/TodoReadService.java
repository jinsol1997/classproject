package com.example.todolist.service;

import com.example.todolist.dao.TodoDao;
import com.example.todolist.domain.TodoDTO;
import com.example.todolist.util.ConnectionUtil;
import lombok.Cleanup;

import java.sql.Connection;
import java.util.ArrayList;

public class TodoReadService {

    private static TodoReadService instance;
    public static TodoReadService getInstance(){
        if(instance==null){
            instance = new TodoReadService();
        }

        return instance;
    }

    private TodoReadService(){}

    public TodoDTO doRead(int index){

        TodoDao dao = TodoDao.getInstance();
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
