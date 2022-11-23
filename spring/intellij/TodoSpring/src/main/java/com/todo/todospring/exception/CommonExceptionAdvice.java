package com.todo.todospring.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String customException(Exception exception){

        log.info(exception.getMessage());

        StringBuffer buffer = new StringBuffer("<h1>" + exception.getMessage() + "</h1><hr>");

        for(StackTraceElement element : exception.getStackTrace()){
            buffer.append("<div>" + element + "</div>");
        }

        return buffer.toString();
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound(){
        
        log.info("notFound Handler 진입");
        return "custom404";
    }

}
