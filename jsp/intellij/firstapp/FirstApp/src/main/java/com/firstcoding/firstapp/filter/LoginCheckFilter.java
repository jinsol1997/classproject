package com.firstcoding.firstapp.filter;

import com.firstcoding.firstapp.login.domain.Member;
import com.firstcoding.firstapp.login.service.MemberService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@Log4j2
@WebFilter(filterName = "LoginCheckFilter", urlPatterns = {"/mypage/*"})
public class LoginCheckFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        log.info("로그인 체크 필터 진입 ...");
        
        // Session 객체에 loginInfo 속성이 존재하는지 체크 -> 로그인 체크
        // 없으면 -> 로그인 페이지로 이동

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        // 현재 세션 구하기
        HttpSession session = req.getSession();

        if(session.getAttribute("loginInfo") == null){

            // 쿠키 체크 : uuid
            Cookie cookie = findCookie(req.getCookies(), "uuid");

            if(cookie != null){
                String uuid = cookie.getValue();

                log.info("uuid Cookie 존재 ...");

                // DB 에서 해당 uuid 값을 가지는 회원 데이터를 찾는다
                try {
                    Member member = MemberService.getInstance().selectByUUID(uuid);

                    if(member != null){
                        log.info("uuid 값을 가진 회원의 정보로 로그인 처리");
                        session.setAttribute("loginInfo", member.getUid());
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

                chain.doFilter(request, response);

            }


            log.info("비 로그인 상태 -> 로그인 페이지로 이동");
            res.sendRedirect("/logins");
            return;
        }

        chain.doFilter(request, response);
    }

    // Cookie[], 찾고자하는 Cookie 이름 전달하면 값을 반환
    private Cookie findCookie(Cookie[] cookies, String name){

        if(cookies == null || cookies.length==0){
            return null;
        }

        Cookie cookie = null;

        for(Cookie c : cookies){
            if(name.equals(c.getName())){
                cookie = c;
                break;
            }
        }

        return cookie;
    }


}
