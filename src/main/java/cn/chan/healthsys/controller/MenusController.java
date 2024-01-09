package cn.chan.healthsys.controller;


import cn.chan.healthsys.bean.MainMenu;
import cn.chan.healthsys.dao.MenuDao;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class MenusController {

    @Autowired
    MenuDao menuDao;

    @CrossOrigin
    @RequestMapping("/menus")
    public String getAllMenus(){
        HashMap<String, Object> data = new HashMap<>();
        List<MainMenu> menus = menuDao.getMainMenus();
        data.put("data",menus);
        data.put("status",200);
        String s = JSON.toJSONString(data);
        return s;
    }

}
