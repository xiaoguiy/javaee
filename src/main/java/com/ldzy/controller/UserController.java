package com.ldzy.controller;


import com.ldzy.pojo.User;
import com.ldzy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Slf4j
@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public MyResponse login(@RequestBody User user, HttpSession session){
        User userDB=userService.getUserByUserCode(user);
        if (userDB==null) return new MyResponse(ResultCode.ERROR_LOGIN,null);
        //如果执行到这里表示登录成功
        //写入登录成功的标识到session中
        session.setAttribute("user",userDB);
        return new MyResponse(ResultCode.SUCCESS_LOGIN,userDB);
    }


    @GetMapping("/logout")
    public MyResponse logout(HttpSession session){
        log.info("aaa");
        session.removeAttribute("user");
        return new MyResponse(ResultCode.SUCCESS_LOGOUT);
    }
}
