package com.firstcoding.firstapp.login.controller;

import com.firstcoding.firstapp.login.domain.UserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;
import java.time.LocalDate;

@Controller
@RequestMapping("/date")
public class DateConverterController {

    @RequestMapping(method = RequestMethod.GET)
    public String getDateForm() {
        return "dateform";
    }

    @PostMapping
    public String date(UserRequest userRequest, Model model){
        model.addAttribute("date", userRequest);
        return "date";
    }

}
