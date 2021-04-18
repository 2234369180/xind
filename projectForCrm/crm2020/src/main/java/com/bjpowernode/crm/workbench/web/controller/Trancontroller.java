package com.bjpowernode.crm.workbench.web.controller;

import com.bjpowernode.crm.settings.domain.DicValue;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.DicValueService;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.workbench.domain.Customer;
import com.bjpowernode.crm.workbench.service.CustomerMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.ResourceBundle;

@Controller
public class Trancontroller {

    @Autowired
    private CustomerMapperService customerMapperService;

    @Autowired
    private DicValueService dicValueService;

    @Autowired
    private UserService userService;

    @RequestMapping("/workbench/transaction/index.do")
    public String tranindex(){

        return  "workbench/transaction/index";
    }

    @RequestMapping("workbench/transaction/createTran.do")
    public ModelAndView createTran(){
        ModelAndView mv=new ModelAndView();

        List<DicValue> stage = dicValueService.queryDicValueByCode("stage");
        List<DicValue> transactionType = dicValueService.queryDicValueByCode("transactionType");
        List<DicValue> source = dicValueService.queryDicValueByCode("source");
        mv.addObject("stageList",stage);
        mv.addObject("transactionTypeList",transactionType);
        mv.addObject("sourceList",source);

        List<User> users = userService.queryAllUsers();

        mv.addObject("userList",users);



        mv.setViewName("workbench/transaction/save");
        return mv;


    }

    @RequestMapping("workbench/transaction/queryCustomerByName.do")
    @ResponseBody
    public Object queryCustomerByName(String customerName){
        List<Customer> customers = customerMapperService.selectCustomerByName(customerName);

        return customers;

    }

    @RequestMapping("workbench/transaction/getPossibilityByStageValue.do")
    @ResponseBody
    public Object getPossibilityByStageValue(String stageValue){
        ResourceBundle poss = ResourceBundle.getBundle("possibility");
        String string = poss.getString(stageValue);

        return string;

    }


}
