package com.todo.todomvc.service;

import com.todo.todomvc.util.ConnectionUtil;
import com.todo.todomvc.dao.TodoDao;
import com.todo.todomvc.domain.TodoDTO;
import lombok.Cleanup;

import java.sql.Connection;
import java.util.ArrayList;

public class TodoSelectAllService {

    private static TodoSelectAllService instance;
    public static TodoSelectAllService getInstance(){
        if(instance==null){
            instance = new TodoSelectAllService();
        }

        return instance;
    }

    private TodoSelectAllService(){}

    public ArrayList<TodoDTO> getTodoList(){

        TodoDao dao = TodoDao.getInstance();
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
