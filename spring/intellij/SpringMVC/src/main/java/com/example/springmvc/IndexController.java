package com.example.springmvc;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class IndexController {

    @RequestMapping(value = "/test")
    public void getIndex(){
        log.info("Index page ...");
    }

}
