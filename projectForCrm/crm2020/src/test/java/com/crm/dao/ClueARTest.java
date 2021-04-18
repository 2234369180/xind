package com.crm.dao;

import com.bjpowernode.crm.commons.utils.UUIDUtils;
import com.bjpowernode.crm.workbench.domain.ClueActivityRelation;
import com.bjpowernode.crm.workbench.mapper.ClueActivityRelationMapper;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ClueARTest extends BaseTest {
    @Autowired
    private ClueActivityRelationMapper clueActivityRelationMapper;
@Test
    public void Test01(){
        List<ClueActivityRelation> list=new ArrayList<>();
        ClueActivityRelation ca=new ClueActivityRelation();
        ca.setId(UUIDUtils.getUUID());
        ca.setClueId("21563469");
        ca.setActivityId("63aad7c7071e42ab86f0ba310895915b");
        list.add(ca);

        int i = clueActivityRelationMapper.insertClueActivityRelationByList(list);
        System.out.println("i="+i);
    }
}
