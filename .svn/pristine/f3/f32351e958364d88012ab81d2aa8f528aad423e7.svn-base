package com.bdqn.tcmp.controller;

import java.util.List;

import javax.annotation.Resource;

import com.bdqn.tcmp.entity.Task;
import com.bdqn.tcmp.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("Task")
public class TaskController {
    @Resource
    private TaskService taskService;

    @RequestMapping("selectTaskbyStudent")
    @ResponseBody
    public List<Task> selectTaskbyStudentTest(Integer studentId) {
        return taskService.selectTaskByStudentId(studentId);
    }

    @RequestMapping("insertStak")
    @ResponseBody
    public boolean insertStak(Task task) {
        System.out.println("---------===========================");
        System.out.println("getTaskName：" + task.getTaskName());
        System.out.println("getStudentId：" + task.getStudentId());
        System.out.println("getBeginDate：" + task.getBeginDate());
        System.out.println("getEndDate：" + task.getEndDate());
        System.out.println("getRemark：" + task.getRemark());
        return taskService.insertStak(task) > 0 ? true : false;
    }

}
