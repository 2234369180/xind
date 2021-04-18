package com.crm.dao;

import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.mapper.UserMapper;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest extends BaseTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test01(){
        HashMap<String,Object> hm=new HashMap<>();
        hm.put("loginAct","ls");
        hm.put("loginPwd", "44ba5ca65651b4f36f1927576dd35436");
        User user = userMapper.selectUserByLoginActAndPwd(hm);
        System.out.println(user.getName());
    }
    @Test
    public void test02(){

        List<User> users = userMapper.selectAllUsers();
        for (User user : users) {
            System.out.println(user.getName());

        }

    }
}
