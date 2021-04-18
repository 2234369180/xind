package com.bjpowernode.crm.settings.web.controller;


import com.bjpowernode.crm.commons.domain.ReturnObject;
import com.bjpowernode.crm.commons.utils.DateUtils;
import com.bjpowernode.crm.commons.utils.MD5Util;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(HttpServletRequest request){
       /* Cookie[] cookies = request.getCookies();
        User user=null;

        if(!(cookies==null)){
            HashMap hashMap=new HashMap();
            for (Cookie cookie : cookies) {
                String s1=cookie.getName();
                if(s1.equals("loginAct")){
                    if (!(cookie.getValue()==null)){
                        hashMap.put("loginAct", cookie.getValue());
                    }
                }
                if (s1.equals("loginPwd")){
                    if(!(cookie.getValue()==null)){
                        hashMap.put("loginPwd", MD5Util.getMD5(cookie.getValue()));
                    }
                }
            }
              user= userService.queryUserByLoginActAndPwd(hashMap);
        }

        if (user==null){
            return "index";
        }else {
            return "workbench/index.do";
        }
*/
        return "index";

    }

    @RequestMapping("/settings/qx/user/toLogin.do")
    public String toLogin(HttpServletRequest request,HttpSession session){
        Cookie[] cookies = request.getCookies();
        User user=null;

        if(!(cookies==null)){
            HashMap hashMap=new HashMap();
            for (Cookie cookie : cookies) {
                String s1=cookie.getName();
                if(s1.equals("loginAct")){
                    if (!(cookie.getValue()==null)){
                        hashMap.put("loginAct", cookie.getValue());
                    }
                }
                if (s1.equals("loginPwd")){
                    if(!(cookie.getValue()==null)){
                        hashMap.put("loginPwd", MD5Util.getMD5(cookie.getValue()));
                    }
                }
            }
            user= userService.queryUserByLoginActAndPwd(hashMap);
        }

        if (user==null){
            return "settings/qx/user/login";
        }else {
            session.setAttribute("sessionUser", user);
            return "workbench/index.do";
        }






    }

    @RequestMapping("/settings/qx/user/login.do")
    @ResponseBody
    public Object login(String loginAct, String loginPwd , String isRemPwd, HttpServletRequest request, HttpServletResponse response, HttpSession session){
        ReturnObject ro=new ReturnObject();
        HashMap hashMap=new HashMap();
        hashMap.put("loginAct", loginAct);
        hashMap.put("loginPwd", MD5Util.getMD5(loginPwd));

        User user = userService.queryUserByLoginActAndPwd(hashMap);
        if (user==null){
            ro.setCode("0");
            ro.setMessage("用户名或密码错误");
        }else {
            if(DateUtils.formatDateTime(new Date()).compareTo(user.getExpireTime())>0){
                ro.setCode("0");
                ro.setMessage("过期了,老铁");
            }else if (!(user.getAllowIps().contains(request.getRemoteAddr()))){
                ro.setCode("0");
                ro.setMessage("ip不允许,铁汁");
            }else if("0".equals(user.getLockState())){
                ro.setCode("0");
                ro.setMessage("被锁住了,不能进!!!!");
            }else {
                ro.setCode("1");
                session.setAttribute("sessionUser", user);
                if ("true".equals(isRemPwd)){
                    Cookie c1=new Cookie("loginAct", loginAct);
                    c1.setMaxAge(10*24*60*60);
                    c1.setPath("/");
                    response.addCookie(c1);
                    Cookie c2=new Cookie("loginPwd", loginPwd);
                    c2.setMaxAge(10*24*60*60);
                    c2.setPath("/");
                    response.addCookie(c2);
                }else {
                    Cookie c1=new Cookie("loginAct", null);
                    c1.setMaxAge(0);
                    c1.setPath("/");
                    response.addCookie(c1);
                    Cookie c2=new Cookie("loginPwd", null);
                    c2.setMaxAge(0);
                    c2.setPath("/");
                    response.addCookie(c2);
                }
                session.setAttribute("sessionUser", user);


            }
        }
        return ro;
    }
    @RequestMapping("/settings/qx/user/logout.do")
    public String logout(String loginAct, String loginPwd , String isRemPwd, HttpServletRequest request, HttpServletResponse response, HttpSession session){
        Cookie c1=new Cookie("loginAct", null);
        c1.setMaxAge(0);
        c1.setPath("/");
        response.addCookie(c1);
        Cookie c2=new Cookie("loginPwd", null);
        c2.setMaxAge(0);
        c2.setPath("/");
        response.addCookie(c2);
        session.invalidate();
        return "redirect:/";
    }

}
