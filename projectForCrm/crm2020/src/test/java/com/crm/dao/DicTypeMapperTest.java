package com.crm.dao;

import com.bjpowernode.crm.settings.mapper.DicTypeMapper;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DicTypeMapperTest extends BaseTest {
    @Autowired
    private DicTypeMapper dicTypeMapper;
@Test
    public void test01(){
    String [] a={"q"};
    int i = dicTypeMapper.deleteDicTypeByCodes(a);
    System.out.println("i:"+i);
}

}
