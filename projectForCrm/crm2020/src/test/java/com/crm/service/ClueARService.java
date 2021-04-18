package com.crm.service;

import com.bjpowernode.crm.commons.utils.UUIDUtils;
import com.bjpowernode.crm.workbench.domain.ClueActivityRelation;
import com.bjpowernode.crm.workbench.service.ClueActivityRelationMapperSerivce;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ClueARService extends BaseTest {
    @Autowired
    private ClueActivityRelationMapperSerivce clueActivityRelationMapperSerivce;

    @Test
    public void Test01(){
        List<ClueActivityRelation> list=new ArrayList<>();
        ClueActivityRelation ca=new ClueActivityRelation();
        ca.setId(UUIDUtils.getUUID());
        ca.setClueId("33219dd");
        ca.setActivityId("63aad7c7071e42ab86f0ba310895915b");
        list.add(ca);

        int i = clueActivityRelationMapperSerivce.insertClueActivityRelationByList(list);
        System.out.println("i="+i);
    }
}
