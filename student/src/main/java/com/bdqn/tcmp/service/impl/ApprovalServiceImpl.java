package com.bdqn.tcmp.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.bdqn.tcmp.entity.*;
import com.bdqn.tcmp.service.*;
import com.bdqn.tcmp.mapper.*;
import com.bdqn.tcmp.dto.*;

/**
 * 业务逻辑层接口实现类
 * @author admin
 */
@Service("approvalService")
public class ApprovalServiceImpl implements ApprovalService{
    @Resource
    private ApprovalMapper approvalMapper;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    public int insertApproval(Approval entity){
        return approvalMapper.insertApproval(entity);
    }

    public StudentApprovalDTO selectTeacherIdByStudentId(Integer studentId) {
        return approvalMapper.selectTeacherIdByStudentId(studentId);
    }

    public List<DictionaryDetail> selectQingJiaType() {
        return approvalMapper.selectQingJiaType();
    }

    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Approval对象
     */
    public Approval selectApprovalByID(int id){
        return approvalMapper.selectApprovalByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
    public int updateApproval(Approval entity){
        return approvalMapper.updateApproval(entity);
    }
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int updateApprovalEnabledByID(int id,int value){
        return approvalMapper.updateApprovalEnabledByID(id,value);
    }
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int deleteApproval(int id){
        return approvalMapper.deleteApproval(id);
    }
    /**
     * 查询全部数据
     * @return Approval对象集合
     */
    public List<Approval> selectApprovalAll(){
        return approvalMapper.selectApprovalAll();
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Approval对象集合
     */
    public List<Approval> selectApprovalByWhere(ApprovalDTO dto){
        return approvalMapper.selectApprovalByWhere(dto);
    }

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    public int selectApprovalCountByWhere(ApprovalDTO dto){
        return approvalMapper.selectApprovalCountByWhere(dto);
    }
    /**
     * 得到数据表Approval满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Approval对象集合
     */
    public List<Approval> selectApprovalByPage(ApprovalDTO dto){
        return approvalMapper.selectApprovalByPage(dto);
    }
    //根据老师ID 查询老师的职务
    public Integer selectTeacherDutyByTeacherId(Integer teacherId) {
        return approvalMapper.selectTeacherDutyByTeacherId(teacherId);
    }
    //教员审批
    public int updateApprovalByJY(ApprovalDTO dto) {
        return approvalMapper.updateApprovalByJY(dto);
    }
    //班主任审批
    public int updateApprovalByBZR(ApprovalDTO dto) {
        return approvalMapper.updateApprovalByBZR(dto);
    }

    public List<Approval> selectApprovalByStudentId(Integer studentId) {
        return approvalMapper.selectApprovalByStudentId(studentId);
    }
}



