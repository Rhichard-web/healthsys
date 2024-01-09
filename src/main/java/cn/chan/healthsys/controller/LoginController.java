package cn.chan.healthsys.controller;

import cn.chan.healthsys.bean.User;
import cn.chan.healthsys.dao.UserDao;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class LoginController {

    @Autowired
    UserDao userDao;

    @CrossOrigin
    @RequestMapping("/login")
    public String login(@RequestBody User user){
        String flag = "error";
        System.out.println("User : " + user);
        HashMap<String,Object> res = new HashMap<>();
        int count = userDao.getUserByMassage(user.getUsername(), user.getPassword());
        if (count > 0) {
            flag = "ok";
        }
        res.put("flag",flag);
        res.put("user",user);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }




}
