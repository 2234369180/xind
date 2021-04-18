package com.bjpowernode.crm.workbench.web.controller;

import com.bjpowernode.crm.commons.domain.ReturnObject;
import com.bjpowernode.crm.commons.utils.DateUtils;
import com.bjpowernode.crm.commons.utils.UUIDUtils;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.workbench.domain.Activity;
import com.bjpowernode.crm.workbench.service.ActivityMapperSerivce;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class ActivityController {
    @Autowired
    private UserService userService;
    @Autowired
    private ActivityMapperSerivce activityMapperSerivce;

    @RequestMapping("/workbench/activity/index.do")
    public ModelAndView activityindex(){
        ModelAndView mv=new ModelAndView();
        List<User> users = userService.queryAllUsers();
        mv.addObject("userList",users);
        mv.setViewName("workbench/activity/index");
        return mv;
    }

    @RequestMapping("/workbench/activity/saveCreateActivity.do")
    @ResponseBody
    public Object saveCreateActivity(Activity activity, HttpSession session){
        User user = (User) session.getAttribute("sessionUser");
        activity.setCreateBy(user.getId());
        activity.setCreateTime(DateUtils.formatDateTime(new Date()));
        activity.setId(UUIDUtils.getUUID());
        int i = activityMapperSerivce.saveCreateActivity(activity);
        ReturnObject ro=new ReturnObject();
        if (i>0){
            ro.setCode("1");
            ro.setMessage("偷着乐吧,成功了(*^▽^*)");
        }else {
            ro.setCode("0");
            ro.setMessage("很遗憾,创建失败(ಥ﹏ಥ)");
        }
        return ro;

    }


    @RequestMapping("workbench/activity/queryActivityForPageByCondition.do")
    @ResponseBody
    public Object queryActivityForPageByCondition(String pageNo,String pageSize,String  name,String  owner,String startDate,String endDate){
       int beginNo=(Integer.valueOf(pageNo)-1)*Integer.valueOf(pageSize);
        HashMap<String,Object> map=new HashMap<>();
        map.put("beginNo", beginNo);
        map.put("pageSize", Integer.valueOf(pageSize));
        map.put("name", name);
        map.put("owner", owner);
        map.put("startDate", startDate);
        map.put("endDate", endDate);

        List<Activity> activities = activityMapperSerivce.queryActivityForPageByCondition(map);

        long l1 = activityMapperSerivce.queryCountOfActivityByCondition(map);

        HashMap hm=new HashMap();
        hm.put("activityList", activities);
        hm.put("totalRows", l1);
        return hm;


    }


    @RequestMapping("/workbench/activity/exportAllActivity.do")
    public void exportAllActivity(HttpServletResponse response, HttpServletRequest request) throws IOException {
        List<Activity> activities = activityMapperSerivce.queryAllActivityForDetail();

        HSSFWorkbook wb=new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("市场");
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("ID");
        cell= row.createCell(1);
        cell.setCellValue("所有者");
        cell=row.createCell(2);
        cell.setCellValue("名称");
        cell=row.createCell(3);
        cell.setCellValue("开始日期");
        cell=row.createCell(4);
        cell.setCellValue("结束日期");
        cell=row.createCell(5);
        cell.setCellValue("成本");
        cell=row.createCell(6);
        cell.setCellValue("描述");
        cell=row.createCell(7);
        cell.setCellValue("创建者");
        cell=row.createCell(8);
        cell.setCellValue("创建时间");
        cell=row.createCell(9);
        cell.setCellValue("修改者");
        cell=row.createCell(10);
        cell.setCellValue("修改时间");

        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER);

        for (int i=0;i<activities.size();i++){
            Activity activity = activities.get(i);
            row = sheet.createRow(i + 1);
            cell=row.createCell(0);
            cell.setCellValue(activity.getId());
            cell=row.createCell(1);
            cell.setCellValue(activity.getOwner());
            cell=row.createCell(2);
            cell.setCellValue(activity.getName());
            cell=row.createCell(3);
            cell.setCellValue(activity.getStartDate());
            cell=row.createCell(4);
            cell.setCellValue(activity.getEndDate());
            cell=row.createCell(5);
            cell.setCellValue(activity.getCost());
            cell=row.createCell(6);
            cell.setCellValue(activity.getDescription());
            cell=row.createCell(7);
            cell.setCellValue(activity.getCreateBy());
            cell=row.createCell(8);
            cell.setCellValue(activity.getCreateTime());
            cell=row.createCell(9);
            cell.setCellValue(activity.getEditBy());
            cell=row.createCell(10);
            cell.setCellValue(activity.getEditTime());
        }
        response.setContentType("application/octet-stream;charset=UTF-8");


        /*String browser=request.getHeader("User-Agent");*/
        String filename = URLEncoder.encode("市场列表", "UTF-8");


       /* if(browser.contains("Firefox")){
            //火狐采用 ISO8859-1

            filename=new String("市场活动列表".getBytes("UTF-8"),"ISO8859-1");
        }*/
        ServletOutputStream os = response.getOutputStream();
        wb.write(os);
        os.flush();
        wb.close();


        response.addHeader("Content-Disposition","attachment;filename="+filename+".xls");


    }

    @RequestMapping("workbench/activity/importActivity.do")
    @ResponseBody
    public Object importActivity(MultipartFile activityFile,HttpSession session) throws IOException {

        HashMap<String,Object> hashMap=new HashMap<>();

        List<Activity> list=new ArrayList();

        User user = (User) session.getAttribute("sessionUser");
        InputStream is = activityFile.getInputStream();
        HSSFWorkbook wb=new HSSFWorkbook(is);

        HSSFSheet sheet = wb.getSheetAt(0);


        for (int i=1;i<=sheet.getLastRowNum();i++){
            Activity activity=new Activity();
            HSSFRow row = sheet.getRow(i);
            activity.setId(UUIDUtils.getUUID());
            activity.setCreateTime(DateUtils.formatDateTime(new Date()));
            activity.setOwner(user.getId());
            activity.setCreateBy(user.getId());

            for (int j=0;j<row.getLastCellNum();j++){
                HSSFCell cell = row.getCell(j);

                if (j==0){
                    activity.setName(getCellValue(cell));
                }else if(j==1){
                    activity.setStartDate(getCellValue(cell));
                }else if(j==2){
                    activity.setEndDate(getCellValue(cell));
                }else if(j==3){
                    activity.setCost(getCellValue(cell));
                }else if(j==4){
                    activity.setDescription(getCellValue(cell));
                }


            }
            list.add(activity);

        }
        int i = activityMapperSerivce.insertActivityByList(list);
        if (i>0){
            hashMap.put("code", 1);
            hashMap.put("count", i);
        }else {
            hashMap.put("code", 0);
            hashMap.put("message", "失败了,呜呜呜~~~");
        }
return hashMap;

    }
    public static String getCellValue(HSSFCell cell){
        String ret="";
        switch (cell.getCellType()){
            case HSSFCell.CELL_TYPE_STRING:
                ret=cell.getStringCellValue();
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN:
                ret=cell.getBooleanCellValue()+"";
                break;
            case HSSFCell.CELL_TYPE_NUMERIC:
                ret=cell.getNumericCellValue()+"";
                break;
            case HSSFCell.CELL_TYPE_FORMULA:
                ret=cell.getCellFormula();
                break;
            default:
                ret="";
        }

        return ret;
    }



}
