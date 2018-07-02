package com.bdqn.tcmp.service;

import java.util.List;

import com.bdqn.tcmp.entity.Task;
import org.apache.ibatis.annotations.Param;



public interface TaskService {
	/**
	 * 查詢我發起的任務
	 * 
	 * @return
	 */
	List<Task> selectTaskByStudentId(@Param("studentId") Integer studentID);
	/**
	 * 增加任务
	 * @param task
	 * @return
	 */
	Integer insertStak(Task task);
}
