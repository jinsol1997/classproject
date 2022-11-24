package com.todo.todospring.service;

import com.todo.todospring.domain.LoginRequest;
import com.todo.todospring.domain.Member;
import com.todo.todospring.mapper.MemberMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired(required = false)
    private MemberMapper memberMapper;

    public Member login(LoginRequest loginRequest) throws Exception {
        return memberMapper.selectByIdPw(loginRequest);
    }

}
