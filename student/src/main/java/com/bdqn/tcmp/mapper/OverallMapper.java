package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.OverallDTO;

import java.util.List;

public interface OverallMapper {
    /**
     * 根据学生id查询学生名字
     *
     * @param studentId
     * @return 学生编号
     */
    List<OverallDTO> getStudentName(Integer studentId);

    /**
     * 分页以后根据学生的id查询作业百分比
     *
     * @param studentId
     * @return
     */
    Double getOveralWork(Integer studentId);

    /**
     * 分页以后根据学生的id查询考试及格百分比
     *
     * @param studentId
     * @return
     */
    Double getOveralScore(Integer studentId);

    /**
     * 分页以后根据学生的id查询考勤百分比
     *
     * @param studentId
     * @return
     */
    Double getOveralCheck(Integer studentId);

    /**
     * 分页以后根据学生的id查询自学进度
     *
     * @param studentId
     * @return
     */
    Double getOveralStudy(Integer studentId);

    /**
     * 分页以后根据学生的id查询博客
     *
     * @param studentId
     * @return
     */
    Double getOveralBlogs(Integer studentId);





}
