package com.bdqn.tcmp.mapper;

import java.util.List;

import com.bdqn.tcmp.entity.Task;
import org.apache.ibatis.annotations.Param;



public interface TaskMapper {

	/**
	 * 查詢我發起的任務 未完成的
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
