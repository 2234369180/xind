package com.bjpowernode.crm.settings.service;

import com.bjpowernode.crm.settings.domain.TblUser;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.mapper.TblUserMapper;

import java.util.List;
import java.util.Map;

public interface UserService  {


    public TblUser selectById(String id);

    public User queryUserByLoginActAndPwd(Map<String,Object> map);

    List<User> queryAllUsers();
}
