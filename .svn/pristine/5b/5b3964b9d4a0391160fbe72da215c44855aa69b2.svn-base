package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.entity.Taskdetail;
import com.bdqn.tcmp.mapper.TaskdetailMapper;
import com.bdqn.tcmp.service.TaskdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("taskdetailService")
public class TaskdetailServiceImpl implements TaskdetailService {
    @Resource
    private TaskdetailMapper taskdetailMapper;

    public List<Taskdetail> selectTaskDetailByTaskId(Integer taskId) {
        return taskdetailMapper.selectTaskDetailByTaskId(taskId);
    }

    public List<Taskdetail> selectTaskDetailByStudentId(Integer studentId) {
        return taskdetailMapper.selectTaskDetailByStudentId(studentId);
    }

    public Integer insertDetailByStudentId(Taskdetail taskdetail) {
        return taskdetailMapper.insertDetailByStudentId(taskdetail);
    }
}
