package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.CustromjlDTO;
import com.bdqn.tcmp.entity.Custromjl;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustromjlMapper {
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
     * @param dto 学生的月考算的总行数
     * @return
     */
    int selectStudentListCount(CustromjlDTO dto);
    /**
     * @param dto 学生的日考成绩
     * @return
     */
    List<Custromjl> selectStudentDayAll(CustromjlDTO dto);

    /**selectStudentListCount
     * @param dto 学生的日考算的总行数
     * @return
     */
    int selectStudentDayCount(CustromjlDTO dto);

    /**
     * @param dto
     * @return 学生折线图
     */
    List<Custromjl> selectStudentCustromjldto(CustromjlDTO dto);

    /**
     * @param dto 饼状图
     * @return
     */
    List<Custromjl> selectStudentBingZhuangTu(CustromjlDTO dto);

}

