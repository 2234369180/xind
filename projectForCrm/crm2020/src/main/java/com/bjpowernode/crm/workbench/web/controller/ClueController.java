package com.bjpowernode.crm.workbench.web.controller;

import com.bjpowernode.crm.commons.domain.ReturnObject;
import com.bjpowernode.crm.commons.utils.DateUtils;
import com.bjpowernode.crm.commons.utils.UUIDUtils;
import com.bjpowernode.crm.settings.domain.DicValue;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.DicValueService;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.workbench.domain.Activity;
import com.bjpowernode.crm.workbench.domain.ActivityRemark;
import com.bjpowernode.crm.workbench.domain.Clue;
import com.bjpowernode.crm.workbench.domain.ClueActivityRelation;
import com.bjpowernode.crm.workbench.mapper.ActivityMapper;
import com.bjpowernode.crm.workbench.service.ActivityMapperSerivce;
import com.bjpowernode.crm.workbench.service.ClueActivityRelationMapperSerivce;
import com.bjpowernode.crm.workbench.service.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class ClueController {

    @Autowired
    private UserService userService;

    @Autowired
    private DicValueService dicValueService;

    @Autowired
    private ClueService clueService;
    @Autowired
    private ActivityMapperSerivce activityMapperSerivce;
    @Autowired
    private ClueActivityRelationMapperSerivce clueActivityRelationMapperSerivce;

    @RequestMapping("/workbench/clue/index.do")
    public ModelAndView clueindex(){
        ModelAndView mv=new ModelAndView();
        List<User> userList=userService.queryAllUsers();
        List<DicValue> appellationList=dicValueService.queryDicValueByCode("appellation");
        List<DicValue> clueStateList=dicValueService.queryDicValueByCode("clueState");
        List<DicValue> sourceList=dicValueService.queryDicValueByCode("source");
        mv.addObject("userList",userList);
        mv.addObject("appellationList",appellationList);
        mv.addObject("clueStateList",clueStateList);
        mv.addObject("sourceList",sourceList);
        mv.setViewName("workbench/clue/index");
        return mv;


    }

    @RequestMapping("/workbench/clue/saveCreateClue.do")
    @ResponseBody
    public Object saveCreateClue(Clue clue, HttpServletRequest request){
        ReturnObject ro=new ReturnObject();
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("sessionUser");

        clue.setId(UUIDUtils.getUUID());
        clue.setCreateBy(user.getId());
        clue.setCreateTime(DateUtils.formatDateTime(new Date()));

        int i = clueService.saveCreateClue(clue);
        if(i>0){
            ro.setCode("1");

        }else {
            ro.setCode("0");
            ro.setMessage("很遗憾,添加失败了(ಥ﹏ಥ)");
        }
        return ro;


    }


/* @RequestMapping("/workbench/main/index.do")
    public String mainindex(){
        return "workbench/main/index";
    }*/

@RequestMapping("/workbench/clue/detailClue.do")
public ModelAndView detailClue(String id){
    ModelAndView mv=new ModelAndView();
    Clue clue = clueService.queryClueForDetailById(id);
    mv.addObject("clue",clue);
    List<Activity> activities = activityMapperSerivce.queryActivityForDetailByClueId(id);

    mv.addObject("activityList",activities);
    mv.setViewName("workbench/clue/detail");
        return mv;

    }

    @RequestMapping("workbench/clue/searchActivity.do")
    @ResponseBody
    public Object searchActivity(String activityName,String clueId){
        HashMap<String,Object> map=new HashMap<>();
        map.put("activityName", activityName);
        map.put("clueId",clueId);
        List<Activity> activities = activityMapperSerivce.queryActivityForDetailByNameClueId(map);
        return activities;

    }

    @RequestMapping("workbench/clue/saveBundActivity.do")
    @ResponseBody
    public Object saveBundActivity(String [] activityId,String clueId){
        ReturnObject ro=new ReturnObject();

        List<ClueActivityRelation> list=new ArrayList();
        ClueActivityRelation ca=new ClueActivityRelation();
        for (String s : activityId) {
           ca.setId(UUIDUtils.getUUID());
           ca.setActivityId(s);
           ca.setClueId(clueId);
           list.add(ca);
        }
        int i = clueActivityRelationMapperSerivce.insertClueActivityRelationByList(list);
        if (i>0){
            ro.setCode("1");
            ro.setMessage("成功了,开心,哈哈哈!");



            List list1 = activityMapperSerivce.queryActivityForDetailByIds(activityId);


            ro.setRetData(list1);

        }else {
            ro.setCode("0");
            ro.setMessage("啥玩意?失败了,怎么肥四,o((⊙﹏⊙))o");
        }
        return ro;


    }

    @RequestMapping("workbench/clue/saveUnbundActivity.do")
    @ResponseBody
    public Object saveUnbundActivity(String activityId,String clueId){
        ReturnObject ro=new ReturnObject();
        int i = clueActivityRelationMapperSerivce.deleteClueActivityRelationByClueIdandActivitybyId(clueId, activityId);
        if (i>0){
            ro.setCode("1");

        }else {
            ro.setCode("0");
            ro.setMessage("很遗憾,失败了呢");
        }
        return ro;

    }

    @RequestMapping("workbench/clue/convertClue.do")
    public ModelAndView convertClue(String id){
        ModelAndView mv=new ModelAndView();
        Clue clue = clueService.queryClueForDetailById(id);
        mv.addObject("clue",clue);

        mv.setViewName("workbench/clue/convert");
        return mv;

    }


}
