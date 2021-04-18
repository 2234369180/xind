package com.crm.service;

import com.bjpowernode.crm.commons.utils.UUIDUtils;
import com.bjpowernode.crm.workbench.domain.Activity;
import com.bjpowernode.crm.workbench.service.ActivityMapperSerivce;
import com.crm.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ActivityService extends BaseTest {

        @Autowired
        private ActivityMapperSerivce activityMapperSerivce;
        @Test
        public void Test01(){
            Activity activity=new Activity();

            activity.setId("5a93e28a47fb4da89f427a3cec7ec656");
            activity.setOwner("06f5fc056eac41558a964f96daa7f27c");
            activity.setName("家具销售大会2");
            activity.setStartDate("2020-12-03");
            activity.setEndDate("2020-12-04");
            activity.setCost("1112.0");
            activity.setDescription("111");
            activity.setCreateTime("2021-01-12 09:39:39");
            activity.setCreateBy("06f5fc056eac41558a964f96daa7f27c");



            List<Activity> list=new ArrayList<>();

            list.add(activity);










            int i = activityMapperSerivce.insertActivityByList(list);

            System.out.println("iiiiiiiiiiiiiiiiiiiiiii="+i);

        }
}
