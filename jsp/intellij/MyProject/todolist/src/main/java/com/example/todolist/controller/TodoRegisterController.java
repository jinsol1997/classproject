package com.example.todolist.controller;

import com.example.todolist.dao.TodoDao;
import com.example.todolist.domain.TodoDTO;
import com.example.todolist.service.TodoRegisterService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "TodoRegisterController", value = "/todo/register")
public class TodoRegisterController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 한글 처리 : post
        request.setCharacterEncoding("utf-8");

        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");

        System.out.println(todo);
        System.out.println(dueDate);

        TodoDTO dto = new TodoDTO(todo, dueDate, false);
        int result = TodoRegisterService.getInstance().doRegister(dto);
        if(result <= 0){
            System.out.println("등록 실패");
        }

        response.sendRedirect("/todo/list");
    }
}
