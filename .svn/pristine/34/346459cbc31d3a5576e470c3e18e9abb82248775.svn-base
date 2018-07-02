package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.ApprovalDTO;
import com.bdqn.tcmp.dto.StudentApprovalDTO;
import com.bdqn.tcmp.entity.Approval;
import com.bdqn.tcmp.entity.DictionaryDetail;
import com.bdqn.tcmp.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据访问层接口
 * @author admin
 */
public interface ApprovalMapper{
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体
     * @return 受影响行数
     */
    int insertApproval(Approval entity);
    //通过学生Id查询学生的教员，班主任Id
    StudentApprovalDTO selectTeacherIdByStudentId(Integer studentId);
    //通过学生Id查询学生姓名
    Student selectStudentById(Integer studentId);
    //查询请假类型
    List<DictionaryDetail> selectQingJiaType();
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Approval对象
     */
    Approval selectApprovalByID(int id);
    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体
     * @return 受影响行数
     */
    int updateApproval(Approval entity);

    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int updateApprovalEnabledByID(@Param("id") int id, @Param("value") int value);
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int deleteApproval(int id);
    /**
     * 查询全部数据
     * @return Approval对象集合
     */
    List<Approval> selectApprovalAll();
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Approval对象集合
     */
    List<Approval> selectApprovalByWhere(ApprovalDTO dto);

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    int selectApprovalCountByWhere(ApprovalDTO dto);
    /**
     * 得到数据表Approval满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Approval对象集合
     */
    List<Approval> selectApprovalByPage(ApprovalDTO dto);
    //根据老师ID 查询老师的职务
    Integer selectTeacherDutyByTeacherId(Integer teacherId);
    //教员审批
    int updateApprovalByJY(ApprovalDTO dto);
    //班主任审批
    int updateApprovalByBZR(ApprovalDTO dto);
    //查询学生请假信息
    List<Approval> selectApprovalByStudentId(Integer studentId);
}



