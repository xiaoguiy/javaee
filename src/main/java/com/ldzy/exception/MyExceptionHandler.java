package com.ldzy.exception;

import com.ldzy.controller.MyResponse;
import com.ldzy.controller.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class MyExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public MyResponse zeroHandler(Exception e){
        //在异常处理中,要干如下几件事:1.根据异常紧急程度,发邮件/或短信到维护人员的邮箱/手机,2.写日志,3.返回信息给前端
        log.error("出错信息:"+e.getMessage());
        return new MyResponse(ResultCode.ERROR,e.getMessage());
    }
//所有的参数校验异常都在这里处理
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public MyResponse handlerMyMethodArgumentNotValidException(MethodArgumentNotValidException e){
        log.error("出错信息:"+e.getMessage());
        return new MyResponse(ResultCode.ERROR,e.getBindingResult().getFieldError().getDefaultMessage());
    }
}
