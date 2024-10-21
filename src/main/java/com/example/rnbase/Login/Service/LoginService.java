package com.example.rnbase.Login.Service;

import com.example.rnbase.Login.Dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {

    @Autowired
    LoginDao loginDao;

    public Map<String, Object> login() {
        Map<String,Object> result = new HashMap<>();

        System.out.println("서비스 찍고~");

        result = loginDao.login();
        return null;
    }
}
