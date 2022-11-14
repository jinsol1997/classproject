package com.example.todolist.controller;

import com.example.todolist.domain.TodoDTO;
import com.example.todolist.service.TodoReadService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoReadController", value = "/todo/read")
public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 사용자 요청 index 찾기
        int index = Integer.parseInt(request.getParameter("index"));

        // Service 요청한 index로 할 일 목록을 검색해서 결과 -> TodoDTO로 반환
        TodoDTO dto = TodoReadService.getInstance().doRead(index);
        request.setAttribute("todo", dto);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/read.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
