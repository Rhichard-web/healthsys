package cn.chan.healthsys.dao;


import cn.chan.healthsys.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    public List<MainMenu> getMainMenus();
}
