package com.crm.service;

import com.bjpowernode.crm.settings.domain.TblUser;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.DicTypeService;
import com.bjpowernode.crm.settings.service.UserService;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

public class DicTypeTest extends BaseTest {
       @Autowired
    private DicTypeService dicTypeService;

    @Test
    public void test01() {
        String [] a={"aa"};
        int i = dicTypeService.deleteDicTypeByCodes(a);
        System.out.println("i:"+i);
    }
}
