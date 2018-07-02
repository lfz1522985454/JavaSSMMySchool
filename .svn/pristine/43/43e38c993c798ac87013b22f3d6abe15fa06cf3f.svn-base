package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.TeacherDTO;
import com.bdqn.tcmp.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {


    //动态查询所有教师
    List<Teacher> selectTeacherAll();

    /**
     * 教师登录
     */
    Teacher selectCountTeacher(TeacherDTO dto);

    /**
     * 教师带条件分页查询
     * 姚国旺 2018-05-27 19:15:00
     */
    List<Teacher> selectByPage(TeacherDTO dto);

    /**
     * 教师带条件分页查询返回总行数
     * 姚国旺 2018-05-27 19:15:00
     */
    Integer selectTeacherByPageCount(TeacherDTO dto);

    /**
     * 注册教师
     *
     * @return
     */
    int insertTeacher(Teacher teacher);

    int updateTeacher(Teacher teacher);


    /**
     * 课表教师的名称查询的教师id
     *
     * @param teacherName
     * @return
     */
    Teacher selectTeacherId(@Param("teacherName") String teacherName);


    /**
     * 人臉登錄
     *
     * @param TeacherUUID
     * @return
     */
    Teacher selectTeacherByTeacherUUID(String TeacherUUID);


    /**
     * 通过职位查询教师信息
     *
     * @return
     */
    List<Teacher> selectTeacherByAttrName(Integer dutyId);
}
