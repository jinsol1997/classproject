package com.firstcoding.firstapp.cookie;

import jdk.jpackage.internal.Log;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@Log4j2
@WebServlet(name = "CookieView", value = "/cookie/view")
public class CookieView extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Cookie 확인
        Cookie[] cookies = request.getCookies();

        for(Cookie c : cookies) {
            log.info(c.getName() + " = " + c.getValue());
        }


        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/cookie/view.jsp");
        dispatcher.forward(request, response);
    }


}
