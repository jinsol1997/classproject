package com.example.todolist.controller;

import com.example.todolist.domain.TodoDTO;
import com.example.todolist.service.TodoModifyService;
import com.example.todolist.service.TodoReadService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoModifyController", value = "/todo/modify")
public class TodoModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 사용자가 입력했던 데이터를 기본값으로 가지는 입력 폼 화면
        // 수정할 할 일의 번호 받아서 service에게 전달 -> TOdoDTO 받는다
        int index = Integer.parseInt(request.getParameter("index"));

        System.out.println("index : " + index);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/modify.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String index = request.getParameter("index");
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");
        boolean finished = request.getParameter("finished") == null ? false : true;


        TodoDTO dto = new TodoDTO(Long.parseLong(index), todo, dueDate, finished);
        System.out.println(dto);


        int result = TodoModifyService.getInstance().doModify(dto);
        if(result <= 0){
            System.out.println("수정 실패");
        }

        response.sendRedirect("/todo/list");
    }
}
