package com.bjpowernode.crm.settings.web.controller;

import com.bjpowernode.crm.commons.domain.ReturnObject;
import com.bjpowernode.crm.settings.domain.DicType;
import com.bjpowernode.crm.settings.mapper.DicTypeMapper;
import com.bjpowernode.crm.settings.service.DicTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DicTypeController {
@Autowired
    private DicTypeService dicTypeService;

    @RequestMapping("/settings/index.do")
    public String index01(){
        return "/settings/index";
    }

    @RequestMapping("settings/dictionary/index.do")
    public String index02(){

      
        return "settings/dictionary/index";
    }
    @RequestMapping("settings/dictionary/type/index.do")
    public ModelAndView index03(){
        List<DicType> dt = dicTypeService.queryAllDicTypes();

        ModelAndView mv =new ModelAndView();
        mv.addObject("dicTypeList",dt);
        mv.setViewName("settings/dictionary/type/index");
        return mv;
    }



    @RequestMapping("settings/dictionary/type/toSave.do")
    public String tosave(){
        return "settings/dictionary/type/save";
    }



    @RequestMapping("settings/dictionary/type/saveCreateDicType.do")
    @ResponseBody
    public Object CreateDicType(String code,String name,String description){
        ReturnObject ro=new ReturnObject();
        DicType dicType=new DicType();
        dicType.setCode(code);
        dicType.setDescription(description);
        dicType.setName(name);
        int i = dicTypeService.saveCreateDicType(dicType);
        if (i>0){
            ro.setCode("1");
        }else {
            ro.setCode("0");
            ro.setMessage("添加居然失败了o(╥﹏╥)o");
        }
        return  ro;
    }
    @RequestMapping("settings/dictionary/type/checkCode.do")
    @ResponseBody
    public Object checkCode(String code){
        ReturnObject ro=new ReturnObject();

        DicType dicType = dicTypeService.queryDicTypeByCode(code);
        if (dicType==null){
            ro.setCode("1");
        }else {
            ro.setCode("0");
            ro.setMessage("之前已经添加过了哈(✪ω✪)");
        }
        return ro;
    }
    @RequestMapping("settings/dictionary/type/deleteDicTypeByCodes.do")
    @ResponseBody
    public Object deleteDicTypeByCodes(String []code){
        ReturnObject ro=new ReturnObject();

        int i = dicTypeService.deleteDicTypeByCodes(code);
        if (i>0){
            ro.setCode("1");
            ro.setMessage("恭喜,删除成功了(^o^)");
        }else {
            ro.setCode("0");
            ro.setMessage("删除居然失败了,非常抱歉(。・＿・。)ﾉI’m sorry~");
        }
        return ro;
    }

    @RequestMapping("settings/dictionary/type/editDicType.do")
    public ModelAndView editDicType(String code){
        DicType dicType = dicTypeService.queryDicTypeByCode(code);
        ModelAndView mv=new ModelAndView();
        mv.addObject("dicType",dicType);
        mv.setViewName("settings/dictionary/type/edit");
        return mv;
    }
    @RequestMapping("settings/dictionary/type/saveEditDicType.do")
    @ResponseBody
    public Object saveEditDicType(String code,String name,String description){
        ReturnObject ro=new ReturnObject();
        DicType dicType=new DicType();
        dicType.setName(name);
        dicType.setDescription(description);
        dicType.setCode(code);
        int i = dicTypeService.saveEditDicType(dicType);
        if(i>0){
            ro.setCode("1");
        }else {
            ro.setCode("0");
            ro.setMessage("很遗憾,失败了(ಥ﹏ಥ)");
        }
        return ro;
    }



}
