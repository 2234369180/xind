package com.crm.dao;

import com.bjpowernode.crm.settings.domain.TblUser;
import com.bjpowernode.crm.settings.mapper.TblUserMapper;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest {
    @Autowired
    private TblUserMapper tblUserMapper;
    @Test
    public void test01(){
        TblUser tblUser = tblUserMapper.selectByPrimaryKey("06f5fc056eac41558a964f96daa7f27c");
        System.out.println(tblUser);
    }

}
