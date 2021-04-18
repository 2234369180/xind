package com.crm.dao;

import com.bjpowernode.crm.workbench.mapper.ClueActivityRelationMapper;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CluedeleteTest extends BaseTest {
   @Autowired
    private ClueActivityRelationMapper clueActivityRelationMapper;

   @Test
   public void Test01(){
       int i = clueActivityRelationMapper.deleteClueActivityRelationByClueIdandActivitybyId("33219dd", "63aad7c7071e42ab86f0ba310895915b");
       System.out.println("i:"+i);
   }

}
