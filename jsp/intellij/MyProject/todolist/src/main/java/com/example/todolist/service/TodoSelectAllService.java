package com.example.todolist.service;

import com.example.todolist.dao.TodoDao;
import com.example.todolist.domain.TodoDTO;
import com.example.todolist.util.ConnectionUtil;
import lombok.Cleanup;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

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
