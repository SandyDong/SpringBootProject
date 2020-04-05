package com.dong.controller.User;

import com.dong.dao.IUserDao;
import com.dong.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserDao userDao;

    @RequestMapping("/getUserInfo")
    public String  getUserInfo(@RequestParam("employNo") String employNo){
         int  id = Integer.parseInt(employNo);
         User user = userDao.getUserById(id);
         return  "姓名:"+user.getName()+" 性别:"+user.getSex()+" 年龄:"+user.getAge();
    }
}
