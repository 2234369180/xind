package com.bjpowernode.crm.workbench.service;


import com.bjpowernode.crm.workbench.domain.Activity;

import java.util.List;
import java.util.Map;

public interface ActivityMapperSerivce {
    int saveCreateActivity(Activity activity);

    List<Activity> queryActivityForPageByCondition(Map<String,Object> map);

    long queryCountOfActivityByCondition(Map<String,Object> map);

    Activity queryActivityById(String id);


    int saveEditActivity(Activity activity);

    int deleteActivityByIds(String[] ids);

    List<Activity> queryAllActivityForDetail();

    List<Activity> queryActivityForDetailByIds(String[] ids);

    int saveCreateActivityByList(List<Activity> activityList);

    Activity queryActivityForDetailById(String id);

    List<Activity> queryActivityForDetailByClueId(String clueId);

    List<Activity> queryActivityForDetailByNameClueId(Map<String,Object> map);

    List<Activity> queryActivityForDetailByName(String name);

    int insertActivityByList(List<Activity> activityList);


}
