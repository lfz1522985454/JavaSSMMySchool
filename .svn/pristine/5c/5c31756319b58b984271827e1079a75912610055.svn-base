package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.CustromjlDTO;
import com.bdqn.tcmp.entity.Custromjl;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustromjlService {
    /**
     * 依据考试编号，查询测试编号
     * @param classId  依据班级编号，查询班级中每个学生的成绩
     * @param questionId
     * @return   当前班级中每个学生的考试成绩
     */
    List<Custromjl> getCustromjlListByClassId(@Param("classId")Integer classId, @Param("questionId")Integer questionId);
    /**
     * @param dto 查询班级折线图
     * @return
     */
    List<Custromjl> selectCustromjldto(CustromjlDTO dto);

    /**
     * @param dto 查询班级table表
     * @return
     */
    List<Custromjl> selectCustromjlPage(CustromjlDTO dto);

    /**
     * @param dto 查询班级数量
     * @return
     */
    int selectCustromjlCount(CustromjlDTO dto);

    /**
     * @param dto 查询学生的及格折线图
     * @return
     */
    List<Custromjl> selectStudentCustromjldto(CustromjlDTO dto);


    /**
     * @param dto 查询教员所教的学生成绩table
     * @return
     */
    List<Custromjl> selectStudentCustromjlPage(CustromjlDTO dto);

    /**
     * @param dto 查询pageCount
     * @return
     */
    int selectStudentCustromjldtoCount(CustromjlDTO dto);

    /**
     * @return 班级导出到excel信息
     */
    List<Custromjl> selectClassExcel(CustromjlDTO dto);

    List<Custromjl> selectQuestById(CustromjlDTO dto);

    boolean insertCustromjl(Custromjl custromjl);
    /**
     * @param dto
     * @return 这是day表信息
     */
    List<Custromjl> selectDayList(CustromjlDTO dto);
}
