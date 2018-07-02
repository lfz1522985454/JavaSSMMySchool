package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.entity.Task;
import com.bdqn.tcmp.entity.Taskdetail;
import com.bdqn.tcmp.service.TaskdetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("Taskdetail")
public class TaskdetailController {

    @Resource
    private TaskdetailService taskdetailService;


    @RequestMapping("selectTaskDetailByTaskId")
    @ResponseBody
    public List<Taskdetail> selectTaskDetailByTaskId(Integer taskId) {
        return taskdetailService.selectTaskDetailByTaskId(taskId);
    }


    @RequestMapping("selectTaskDetailByStudentId")
    @ResponseBody
    public List<Taskdetail> selectTaskDetailByStudentId(Integer studentId) {
        return taskdetailService.selectTaskDetailByStudentId(studentId);
    }

    @RequestMapping("insertDetailByStudent")
    @ResponseBody
    public boolean insertDetailByStudent(Taskdetail taskdetail) {
        if (taskdetailService.insertDetailByStudentId(taskdetail) > 0) {
            return true;
        }
        return false;
    }

}
