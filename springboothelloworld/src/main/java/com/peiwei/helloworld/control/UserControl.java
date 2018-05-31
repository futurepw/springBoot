package com.peiwei.helloworld.control;

import com.peiwei.helloworld.entity.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControl {
    @Autowired
    UserBean userBean;

    @RequestMapping(value = "/hello")
    public String hello(){
        return userBean.getName()+","+userBean.getWant();
    }
}
