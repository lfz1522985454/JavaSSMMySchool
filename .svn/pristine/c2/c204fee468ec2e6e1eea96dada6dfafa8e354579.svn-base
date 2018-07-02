package com.bdqn.tcmp.service;

import com.bdqn.tcmp.entity.Taskdetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskdetailService {


    /**
     * 查询当前任务的参与人与参与人的完成状态
     * @return
     */
    List<Taskdetail> selectTaskDetailByTaskId(@Param("taskId") Integer taskId);

    /**
     * 查询该学生的参与任务以及状态
     * @param studentId
     * @return
     */
    List<Taskdetail> selectTaskDetailByStudentId(@Param("studentId") Integer studentId);

    /**
     * 增加参与人信息 以及完成状态
     * @param taskdetail
     * @return
     */
    Integer insertDetailByStudentId(Taskdetail taskdetail);
}
