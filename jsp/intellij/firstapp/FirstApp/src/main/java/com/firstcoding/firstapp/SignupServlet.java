package com.firstcoding.firstapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignupServlet", value = "/signup")
public class SignupServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 사용자 입력 값 한글처리
        request.setCharacterEncoding("utf-8");

        String userid = request.getParameter("userid");
        String userPw = request.getParameter("userPw");
        String userName = request.getParameter("userName");
        String memo = request.getParameter("memo");
        String gender = request.getParameter("gender");
        String[] langs = request.getParameterValues("lang");
        String year = request.getParameter("year");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.write("<html>");
        out.write("<head>");
        out.write("<title>회원가입 데이터</title>");
        out.write("</head>");
        out.write("<body>");
        out.write("<h1> id : " + userid + "</h1>");
        out.write("<h1> pw : " + userPw + "</h1>");
        out.write("<h1> name : " + userName + "</h1>");
        out.write("<h1> memo : " + memo + "</h1>");
        out.write("<h1> 성별 : " + gender + "</h1>");

        for(String lang : langs){
            out.write("<h1> 선택 언어 : " + lang + "</h1>");
        }

        out.write("<h1> 선택 년도 : " + year + "</h1>");

        out.write("</body>");
        out.write("</html>");
    }
}
