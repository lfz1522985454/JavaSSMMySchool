package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.bdqn.tcmp.entity.Task;
import com.bdqn.tcmp.mapper.TaskMapper;
import com.bdqn.tcmp.service.TaskService;
import org.springframework.stereotype.Service;


@Service("taskService")
public class TaskServiceImpl implements TaskService {
	@Resource()
	private TaskMapper taskMapper;


	public List<Task> selectTaskByStudentId(Integer studentID) {
		// TODO Auto-generated method stub
		return taskMapper.selectTaskByStudentId(studentID);
	}

	public Integer insertStak(Task task) {
		return taskMapper.insertStak(task);
	}

}
