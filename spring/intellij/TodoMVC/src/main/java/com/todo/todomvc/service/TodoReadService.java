package com.todo.todomvc.service;

import com.todo.todomvc.util.ConnectionUtil;
import com.todo.todomvc.dao.TodoDao;
import com.todo.todomvc.domain.TodoDTO;
import lombok.Cleanup;

import java.sql.Connection;

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
