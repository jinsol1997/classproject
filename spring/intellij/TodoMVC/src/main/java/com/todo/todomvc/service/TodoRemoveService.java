package com.todo.todomvc.service;

import com.todo.todomvc.util.ConnectionUtil;
import com.todo.todomvc.dao.TodoDao;
import lombok.Cleanup;

import java.sql.Connection;

public class TodoRemoveService {

    private static TodoRemoveService instance;
    public static TodoRemoveService getInstance(){
        if(instance==null){
            instance = new TodoRemoveService();
        }

        return instance;
    }

    private TodoRemoveService(){}

    public int doRemove(int index){

        TodoDao dao = TodoDao.getInstance();
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
