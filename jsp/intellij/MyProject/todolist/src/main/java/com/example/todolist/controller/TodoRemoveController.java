package com.example.todolist.controller;

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
        String index = request.getParameter("index");
        System.out.println("삭제할 todo 번호 : " + index);

        response.sendRedirect("/todo/list");
    }
}
