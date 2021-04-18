package com.crm.service;

import com.bjpowernode.crm.settings.domain.TblUser;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.mapper.TblUserMapper;
import com.bjpowernode.crm.settings.mapper.UserMapper;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.settings.service.impl.UserServiceImpl;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;

public class UserServiceTest extends BaseTest {
    @Autowired
    private  UserService userService;
    @Test
    public  void test01(){

       /* ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = (UserService)cp.getBean("userServiceImpl");
        TblUser tblUser = userServiceImpl.selectById("06f5fc056eac41558a964f96daa7f27c");*/

        TblUser tblUser = userService.selectById("06f5fc056eac41558a964f96daa7f27c");
        System.out.println(tblUser.getName());
    }
    @Test
    public void test02(){
        List<User> users = userService.queryAllUsers();
        users.forEach(user -> System.out.println(user.getName()));
    }
    @Test
    public void test03(){
        HashMap hm=new HashMap();
        hm.put("loginAct","zs");
        hm.put("loginPwd", "202cb962ac59075b964b07152d234b70");

        User user = userService.queryUserByLoginActAndPwd(hm);
        System.out.println(user.getName());
    }


}
