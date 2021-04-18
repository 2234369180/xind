package com.bjpowernode.crm.settings.web.controller;

import com.bjpowernode.crm.commons.domain.ReturnObject;
import com.bjpowernode.crm.commons.utils.UUIDUtils;
import com.bjpowernode.crm.settings.domain.DicType;
import com.bjpowernode.crm.settings.domain.DicValue;
import com.bjpowernode.crm.settings.service.DicTypeService;
import com.bjpowernode.crm.settings.service.DicValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DicValueController {
    @Autowired
    private DicValueService dicValueService;
    @Autowired
    private DicTypeService dicTypeService;

    @RequestMapping("settings/dictionary/value/index.do")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView();
        List<DicValue> dicValues = dicValueService.queryAllDicValues();
        mv.addObject("dicValueList",dicValues);
        mv.setViewName("settings/dictionary/value/index");

        return mv;
    }

    @RequestMapping("settings/dictionary/value/toSave.do")

    public ModelAndView toSave(){
        List<DicType> dicTypes = dicTypeService.queryAllDicTypes();
        ModelAndView mv=new ModelAndView();
        mv.addObject("dicTypeList",dicTypes);
        mv.setViewName("settings/dictionary/value/save");
        return mv;
    }

    @RequestMapping("settings/dictionary/value/saveCreateDicValue.do")
    @ResponseBody
    public Object saveCreateDicValue(DicValue dv){
        ReturnObject ro=new ReturnObject();
        dv.setId(UUIDUtils.getUUID());
        System.out.println(dv.getText());
        int i = dicValueService.saveCreateDicValue(dv);
        if(i>0){
            ro.setCode("1");
            ro.setMessage("恭喜,创建成功(^o^)");
        }else {
            ro.setCode("0");
            ro.setMessage("很遗憾,创建失败(╥﹏╥)");
        }
        return ro;
    }

    @RequestMapping("settings/dictionary/value/deleteDicValueByIds.do")
    @ResponseBody
    public Object deleteDicValueByIds(String [] id){
        ReturnObject ro=new ReturnObject();
        int i = dicValueService.deleteDicValueByIds(id);
        if(i>0){
            ro.setCode("1");
            ro.setMessage("恭喜,删除成功了(*^▽^*)");
        }else {
            ro.setCode("0");
            ro.setMessage("很遗憾,删除失败┭┮﹏┭┮");
        }
        return ro;
    }


    @RequestMapping("settings/dictionary/value/editDicValue.do")
    public ModelAndView editDicValue(String id){
        ModelAndView mv=new ModelAndView();
        DicValue dicValue = dicValueService.selectDicValueById(id);
        mv.addObject("dicValue",dicValue);
        mv.setViewName("settings/dictionary/value/edit");
        return mv;
    }

   @RequestMapping("settings/dictionary/value/saveEditDicValue.do")
    @ResponseBody
    public Object saveEditDicValue(DicValue dicValue){
        ReturnObject ro=new ReturnObject();
       int i = dicValueService.saveEditDicValue(dicValue);
       if (i>0){
           ro.setCode("1");
           ro.setMessage("恭喜,修改成功(^o^)");
       }else {
           ro.setCode("0");
           ro.setMessage("失败了,这是个悲伤的故事(╥╯^╰╥)");
       }
       return ro;


   }

}
