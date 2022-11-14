package com.example.todolist.service;

import com.example.todolist.dao.TodoDao;
import com.example.todolist.domain.TodoDTO;
import com.example.todolist.util.ConnectionUtil;
import lombok.Cleanup;

import java.sql.Connection;

public class TodoModifyService {

    private static TodoModifyService instance;

    public static TodoModifyService getInstance(){
        if(instance==null){
            instance = new TodoModifyService();
        }

        return instance;
    }
    private TodoModifyService(){}

    public int doModify(TodoDTO dto){

        int result = 0;
        TodoDao dao = TodoDao.getInstance();

        try {
            @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
            result = dao.modify(conn, dto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
