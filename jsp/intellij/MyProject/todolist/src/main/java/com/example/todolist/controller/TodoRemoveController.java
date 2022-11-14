package com.example.todolist.controller;

import com.example.todolist.service.TodoRemoveService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoRemoveController", value = "/todo/remove")
public class TodoRemoveController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("todo remove");
        
        //삭제하고자 하는 todo의 index를 받는다
        int index = Integer.parseInt(request.getParameter("index"));

        int result = TodoRemoveService.getInstance().doRemove(index);

        if(result <= 0){
            System.out.println("삭제 실패");
        }
        
        response.sendRedirect("/todo/list");
    }
}
