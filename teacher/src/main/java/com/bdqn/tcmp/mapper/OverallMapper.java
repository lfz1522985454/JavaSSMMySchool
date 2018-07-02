package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.OveralPageDTO;
import com.bdqn.tcmp.dto.OverallDTO;

import java.util.List;

public interface OverallMapper {
    /**
     * 根据学生编号先分页
     * @param overalPageDTO
     * @return 分页对象
     */
    List<OverallDTO> stuIdByPage(OveralPageDTO overalPageDTO);

    /**
     * 分页以后根据学生的id查询作业百分比
     * @param studentId
     * @return
     */
    Double getOveralWork(Integer studentId);
    /**
     * 分页以后根据学生的id查询考试及格百分比
     * @param studentId
     * @return
     */
    Double getOveralScore(Integer studentId);
    /**
     * 分页以后根据学生的id查询考勤百分比
     * @param studentId
     * @return
     */
    Double getOveralCheck(Integer studentId);
    /**
     * 分页以后根据学生的id查询自学进度
     * @param studentId
     * @return
     */
    Double getOveralStudy(Integer studentId);
    /**
     * 分页以后根据学生的id查询博客
     * @param studentId
     * @return
     */
    Double getOveralBlogs(Integer studentId);


    /**
     * 页面数据分页查询总记录数
     *
     * @param overalPageDTO
     * @return
     */
    Integer getOveralCount(OveralPageDTO overalPageDTO);

    /**
     * 页面数据分页查询具体查询
     *
     * @param overalPageDTO
     * @return
     */



}
