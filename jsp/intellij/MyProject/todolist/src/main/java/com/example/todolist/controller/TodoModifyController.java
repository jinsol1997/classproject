package com.example.todolist.controller;

import com.example.todolist.domain.TodoDTO;

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
        String index = request.getParameter("index");

        System.out.println("index : " + index);

        TodoDTO todo = new TodoDTO(1, "숙제", "2022-10-30", false);
        request.setAttribute("todo", todo);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/modify.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        // 사용자가 입력한 데이터 모두 받기
        request.setCharacterEncoding("utf-8");
        String index = request.getParameter("index");
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");
        String finished = request.getParameter("finished");

        System.out.println("index : " + index);
        System.out.println("todo : " + todo);
        System.out.println("dueDate : " + dueDate);
        System.out.println("finished : " + finished);

        // service로 보낼 dto 생성
        TodoDTO dto = new TodoDTO(Long.parseLong(index), todo, dueDate, finished == null ? false : true);
        System.out.println(dto);

        // service로 전송 -> 응답 int

        response.sendRedirect("/todo/list");
    }
}
