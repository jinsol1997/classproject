package com.todo.todomvc.service;

import com.todo.todomvc.util.ConnectionUtil;
import com.todo.todomvc.dao.TodoDao;
import com.todo.todomvc.domain.TodoDTO;
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
