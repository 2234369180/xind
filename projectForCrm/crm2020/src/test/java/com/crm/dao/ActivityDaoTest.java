package com.crm.dao;

import com.bjpowernode.crm.commons.utils.UUIDUtils;
import com.bjpowernode.crm.workbench.domain.Activity;
import com.bjpowernode.crm.workbench.mapper.ActivityMapper;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ActivityDaoTest extends BaseTest {
    @Autowired
    private ActivityMapper activityMapper;
    @Test
    public void Test01(){
        List<Activity> list=new ArrayList<>();
        Activity activity=new Activity();
        activity.setId(UUIDUtils.getUUID());
        list.add(activity);

        activityMapper.insertActivityByList(list);
    }
}
