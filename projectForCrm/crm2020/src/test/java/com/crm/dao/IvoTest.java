package com.crm.dao;

import com.bjpowernode.crm.workbench.domain.FunnelVO;
import com.bjpowernode.crm.workbench.mapper.TranMapper;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IvoTest extends BaseTest {
    @Autowired
    private TranMapper tranMapper;
    @Test
    public void Test01(){
        List<FunnelVO> funnelVOS = tranMapper.selectCountOfTranGroupByStage();

        for (FunnelVO fun : funnelVOS) {
            System.out.println(fun);
        }

    }
}
