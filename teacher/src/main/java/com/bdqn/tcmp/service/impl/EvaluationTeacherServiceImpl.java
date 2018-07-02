package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.EvaluationTeacherDTO;
import com.bdqn.tcmp.entity.EvaluationTeacher;
import com.bdqn.tcmp.mapper.EvaluationTeacherMapper;
import com.bdqn.tcmp.service.EvaluationTeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务逻辑层接口实现类
 *
 * @author admin
 */
@Service("evaluationTeacherService")
public class EvaluationTeacherServiceImpl implements EvaluationTeacherService {
    @Resource
    private EvaluationTeacherMapper evaluationteacherMapper;

    /**
     * 向插入数据
     *
     * @param entity 带有要插入数据的实体类
     * @return 受影响行数
     */
    public int insertEvaluationTeacher(EvaluationTeacher entity) {
        return evaluationteacherMapper.insertEvaluationTeacher(entity);
    }

    /**
     * 根据主键查询一个数据
     *
     * @param id 表的主键
     * @return EvaluationTeacher对象
     */
    public EvaluationTeacher selectEvaluationTeacherByID(int id) {
        return evaluationteacherMapper.selectEvaluationTeacherByID(id);
    }

    /**
     * 修改数据
     *
     * @param entity 带有要修改数据的实体类
     * @return 受影响行数
     */
    public int updateEvaluationTeacher(EvaluationTeacher entity) {
        return evaluationteacherMapper.updateEvaluationTeacher(entity);
    }

    /**
     * 修改的启用状态
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    public int updateEvaluationTeacherEnabledByID(int id, int value) {
        return evaluationteacherMapper.updateEvaluationTeacherEnabledByID(id, value);
    }

    /**
     * 删除指定主键的数据
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    public int deleteEvaluationTeacher(int id) {
        return evaluationteacherMapper.deleteEvaluationTeacher(id);
    }

    /**
     * 查询全部数据
     *
     * @return EvaluationTeacher对象集合
     */
    public List<EvaluationTeacher> selectEvaluationTeacherAll() {
        return evaluationteacherMapper.selectEvaluationTeacherAll();
    }

    /**
     * 根据条件查询数据
     *
     * @param dto 实体类查询条件
     * @return EvaluationTeacher对象集合
     */
    public List<EvaluationTeacher> selectEvaluationTeacherByWhere(EvaluationTeacherDTO dto) {
        return evaluationteacherMapper.selectEvaluationTeacherByWhere(dto);
    }

    /**
     * 根据条件查询满足条件的记录数
     *
     * @param dto 实体类查询条件
     * @return 满足条件的记录数
     */
    public int selectEvaluationTeacherCountByWhere(EvaluationTeacherDTO dto) {
        return evaluationteacherMapper.selectEvaluationTeacherCountByWhere(dto);
    }

    /**
     * 得到数据表EvaluationTeacher满足查询条件的分页记录
     *
     * @param dto 实体类查询条件
     * @return EvaluationTeacher对象集合
     */
    public List<EvaluationTeacher> selectEvaluationTeacherByPage(EvaluationTeacherDTO dto) {
        return evaluationteacherMapper.selectEvaluationTeacherByPage(dto);
    }

    /**
     * 查询正在评教的班级信息
     *
     * @return 评教班级信息集合
     */
    public List<EvaluationTeacher> selectEvaluationTeacher() {
        return evaluationteacherMapper.selectEvaluationTeacher();
    }

    /**
     * 查询班级提交人数，平均分，未参加测评的同学，建议
     *
     * @param evaluationID
     * @param classId
     * @return 评教班级信息集合
     */
    public EvaluationTeacher selectEvaluationTeacherByConditions(Integer evaluationID, Integer classId) {
        return evaluationteacherMapper.selectEvaluationTeacherByConditions(evaluationID, classId);
    }
}



