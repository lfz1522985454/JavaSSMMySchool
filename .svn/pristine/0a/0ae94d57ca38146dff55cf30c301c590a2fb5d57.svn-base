package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.LessonDTO;
import com.bdqn.tcmp.entity.Lesson;
import com.bdqn.tcmp.mapper.LessonMapper;
import com.bdqn.tcmp.service.LessonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务逻辑层接口实现类
 * @author admin
 */
@Service("lessonService")
public class LessonServiceImpl implements LessonService{
    @Resource
    private LessonMapper lessonMapper;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    public int insertLesson(Lesson entity){
        return lessonMapper.insertLesson(entity);
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Lesson对象
     */
    public Lesson selectLessonByID(int id){
        return lessonMapper.selectLessonByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
    public int updateLesson(Lesson entity){
        return lessonMapper.updateLesson(entity);
    }
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int updateLessonEnabledByID(int id,int value){
        return lessonMapper.updateLessonEnabledByID(id,value);
    }
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int deleteLesson(int id){
        return lessonMapper.deleteLesson(id);
    }
    /**
     * 查询全部数据
     * @return Lesson对象集合
     */
    public List<Lesson> selectLessonAll(){
        return lessonMapper.selectLessonAll();
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Lesson对象集合
     */
    public List<Lesson> selectLessonByWhere(LessonDTO dto){
        return lessonMapper.selectLessonByWhere(dto);
    }

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    public int selectLessonCountByWhere(LessonDTO dto){
        return lessonMapper.selectLessonCountByWhere(dto);
    }
    /**
     * 得到数据表Lesson满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Lesson对象集合
     */
    public List<Lesson> selectLessonByPage(LessonDTO dto){
        return lessonMapper.selectLessonByPage(dto);
    }

    public List<Lesson> selectLessonAllById(Integer id) {
        return lessonMapper.selectLessonAllById(id);
    }

    public List<Lesson> selectLessonAllByRi() {
        return lessonMapper.selectLessonAllByRi();
    }
}



