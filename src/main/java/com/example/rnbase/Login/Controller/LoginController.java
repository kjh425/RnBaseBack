package com.example.rnbase.Login.Controller;

import com.example.rnbase.Login.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/zz")
    public String login(){
        Map<String,Object> result = new HashMap<>();
        System.out.println("컨트롤러 찍고~");

        result = loginService.login();

        return null;
    }
}
