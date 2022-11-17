package com.todo.todomvc.service;

import com.todo.todomvc.util.ConnectionUtil;
import com.todo.todomvc.dao.TodoDao;
import com.todo.todomvc.domain.TodoDTO;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;

@Log4j2
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
        
        log.info("register service 진입");

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
