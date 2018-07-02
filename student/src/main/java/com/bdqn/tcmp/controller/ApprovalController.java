package com.bdqn.tcmp.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.entity.Approval;
import com.bdqn.tcmp.service.ApprovalService;
import com.bdqn.tcmp.util.FileUploadUtil;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("stuApproval")
public class ApprovalController {
    @Resource
    private ApprovalService approvalService;
    @RequestMapping("/selectApprovalByStudentId.do")
    @ResponseBody
    public Map<String,Object> selectApprovalByStudentId(Integer studentId){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("approvalInfoByStudent",approvalService.selectApprovalByStudentId(studentId));
        System.out.println("学生请假信息:"+ JSON.toJSONString(map));
        return map;
    }


    //学生请假
    @RequestMapping("/insertApproval.do")
    @ResponseBody
    public Integer insertApproval(Approval approval, HttpSession session, MultipartFile drawingImgFile){
        if(drawingImgFile != null){
            String fileName = FileUploadUtil.fileUpload(drawingImgFile,session);
            if(fileName == null || fileName.equals("图片上传失败")){
                return 0;
            }
            approval.setImage(fileName);
        }
        Integer result = 0;
        if(approvalService.insertApproval(approval) > 0){
            result = 1;
        }else{
            result = 0;
        }
       return result;
    }

    //通过学生Id查询学生的教员，班主任Id,学生姓名
    @RequestMapping("/selectTeacherIdByStudentId.do")
    @ResponseBody
    public Map<String,Object> selectTeacherIdByStudentId(Integer studentId){
        Map<String,Object> map =  new HashMap<String, Object>();
        map.put("teacherIdInfo",approvalService.selectTeacherIdByStudentId(studentId));
        return map;
    }
    //查询请假类型
    @RequestMapping("/selectQingJiaType.do")
    @ResponseBody
    public Map<String,Object> selectQingJiaType(){
        Map<String,Object> map =  new HashMap<String, Object>();
        map.put("qingJiaType",approvalService.selectQingJiaType());
        return map;
    }


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, true));
    }
}
