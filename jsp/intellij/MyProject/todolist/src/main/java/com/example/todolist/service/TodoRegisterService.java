package com.example.todolist.service;

import com.example.todolist.dao.TodoDao;
import com.example.todolist.domain.TodoDTO;
import com.example.todolist.util.ConnectionUtil;
import lombok.Cleanup;

import java.sql.Connection;

public class TodoRegisterService {

    private static TodoRegisterService instance;

    public static TodoRegisterService getInstance(){
        if(instance==null){
            instance = new TodoRegisterService();
        }

        return instance;
    }
    private TodoRegisterService(){}

    public int doRegister(TodoDTO dto){

        int result = 0;
        TodoDao dao = TodoDao.getInstance();

        try {
            @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
            result = dao.register(conn, dto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
