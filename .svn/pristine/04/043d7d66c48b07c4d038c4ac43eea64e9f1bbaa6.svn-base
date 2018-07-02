package com.bdqn.tcmp.service;
import com.bdqn.tcmp.dto.LessonDTO;
import com.bdqn.tcmp.entity.Lesson;

import java.util.List;

/**
 * 业务逻辑层接口
 * @author admin
 */
public interface LessonService{
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体
     * @return 受影响行数
     */
    int insertLesson(Lesson entity);
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Lesson对象
     */
    Lesson selectLessonByID(int id);
    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体
     * @return 受影响行数
     */
    int updateLesson(Lesson entity);

    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int updateLessonEnabledByID(int id,int value);
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int deleteLesson(int id);
    /**
     * 查询全部数据
     * @return Lesson对象集合
     */
    List<Lesson> selectLessonAll();
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Lesson对象集合
     */
    List<Lesson> selectLessonByWhere(LessonDTO dto);

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    int selectLessonCountByWhere(LessonDTO dto);
    /**
     * 得到数据表Lesson满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Lesson对象集合
     */
    List<Lesson> selectLessonByPage(LessonDTO dto);

    /**
     * 查询本周每天的课程
     * @param id
     * @return
     */
    List<Lesson> selectLessonAllById(Integer id);
    /**
     * 查询本周周日的课程
     * @return
     */
    List<Lesson> selectLessonAllByRi();

}



