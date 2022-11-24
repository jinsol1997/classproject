package com.todo.todospring.controller;

import com.todo.todospring.domain.LoginRequest;
import com.todo.todospring.domain.Member;
import com.todo.todospring.service.LoginService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/login")
@Log4j2
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public String loginForm(){
        return "member/loginForm";
    }

    @PostMapping
    public String login(LoginRequest loginRequest, HttpServletRequest request) throws Exception {

        Member member = loginService.login(loginRequest);

        if(member != null){
            // 로그인 처리
            HttpSession session = request.getSession();
            session.setAttribute("loginInfo", member.toLoginInfo());
        }

        return "redirect:/index.jsp";
    }

}
