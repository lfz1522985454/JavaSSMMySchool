package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.EvaluationTeacherDTO;
import com.bdqn.tcmp.entity.EvaluationTeacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 业务逻辑层接口
 *
 * @author admin
 */
public interface EvaluationTeacherService {
    /**
     * 向插入数据
     *
     * @param entity 带有要插入数据的实体
     * @return 受影响行数
     */
    int insertEvaluationTeacher(EvaluationTeacher entity);

    /**
     * 根据主键查询一个数据
     *
     * @param id 表的主键
     * @return EvaluationTeacher对象
     */
    EvaluationTeacher selectEvaluationTeacherByID(int id);

    /**
     * 修改数据
     *
     * @param entity 带有要修改数据的实体
     * @return 受影响行数
     */
    int updateEvaluationTeacher(EvaluationTeacher entity);

    /**
     * 修改的启用状态
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    int updateEvaluationTeacherEnabledByID(int id, int value);

    /**
     * 删除指定主键的数据
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    int deleteEvaluationTeacher(int id);

    /**
     * 查询全部数据
     *
     * @return EvaluationTeacher对象集合
     */
    List<EvaluationTeacher> selectEvaluationTeacherAll();

    /**
     * 根据条件查询数据
     *
     * @param dto 实体类查询条件
     * @return EvaluationTeacher对象集合
     */
    List<EvaluationTeacher> selectEvaluationTeacherByWhere(EvaluationTeacherDTO dto);

    /**
     * 根据条件查询满足条件的记录数
     *
     * @param dto 实体类查询条件
     * @return 满足条件的记录数
     */
    int selectEvaluationTeacherCountByWhere(EvaluationTeacherDTO dto);

    /**
     * 得到数据表EvaluationTeacher满足查询条件的分页记录
     *
     * @param dto 实体类查询条件
     * @return EvaluationTeacher对象集合
     */
    List<EvaluationTeacher> selectEvaluationTeacherByPage(EvaluationTeacherDTO dto);

    /**
     * 查询正在评教的班级信息
     * @return 评教班级信息集合
     */
    List<EvaluationTeacher> selectEvaluationTeacher();

    /**
     * 查询班级提交人数，平均分，未参加测评的同学，建议
     *
     * @param evaluationID
     * @param classId
     * @return 评教班级信息集合
     */
    EvaluationTeacher selectEvaluationTeacherByConditions(@Param("evaluationID") Integer evaluationID, @Param("classId") Integer classId);
}



