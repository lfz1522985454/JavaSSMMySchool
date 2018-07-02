package com.bdqn.tcmp.service;

import java.util.List;

import com.bdqn.tcmp.dto.CustromjlDTO;
import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.entity.Custromjl;

public interface CustromjlService {
    Integer insertCustromjl(Custromjl obj);

    List<Custromjl> selectCustromjlById(@Param("studentId") Integer studentId);

    List<Custromjl> selectCustromjlByStuIdAndCustromId(@Param("studentId") Integer studentId,
                                                       @Param("custromId") Integer custromId);

    List<Custromjl> selectCustromjlByCustromId(@Param("custromId") Integer custromId);

    /**
     * @param dto 学生的月考成绩
     * @return
     */
    List<Custromjl> selectStudentListAll(CustromjlDTO dto);

    /**
     * @param dto 折线图
     * @return
     */
    List<Custromjl> selectStudentCustromjldto(CustromjlDTO dto);

    int selectStudentListCount(CustromjlDTO dto);

    /**
     * @param dto 学生饼状图
     * @return map集合
     */
    List<Custromjl> selectStudentBingZhuangTu(CustromjlDTO dto);

    /**
     * @param dto 学生的日考成绩
     * @return
     */
    List<Custromjl> selectStudentDayAll(CustromjlDTO dto);

    /**
     * selectStudentListCount
     *
     * @param dto 学生的日考算的总行数
     * @return
     */
    int selectStudentDayCount(CustromjlDTO dto);
}
