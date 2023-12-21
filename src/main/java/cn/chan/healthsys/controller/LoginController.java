package cn.chan.healthsys.controller;

import cn.chan.healthsys.bean.User;
import cn.chan.healthsys.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        User us = userDao.getUserByMassage(user.getUsername(),user.getPassword());
        System.out.println("user:"+us);
        return "ok";
    }
}
