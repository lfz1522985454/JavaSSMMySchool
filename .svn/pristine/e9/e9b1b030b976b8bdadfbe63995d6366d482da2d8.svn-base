package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.ClassDTO;
import com.bdqn.tcmp.entity.ClassInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassInfoService {
	/**
	 * 查询班级名称和编号，动态生成复选框用
	 */
	List<ClassInfo> selectClassAll(ClassDTO dto);

	Integer selectClassCount(ClassDTO dto);

	List<ClassInfo> selectHeadTeacherAll();

	/**
	 * 条件查询班级表
	 * @return
	 */
	List<ClassInfo> selectClassById(@Param("classId") Integer classId);
	/**
	 * 修改班级
	 * @return
	 */
	boolean updateClass(ClassInfo classInfo);

	/**
	 * 停用班级
	 * @return
	 */
	boolean deleteClass(@Param("classId") Integer classId);

	/**
	 * 添加班级
	 * @return
	 */
	boolean addClass(ClassInfo classInfo);

	/**
	 * 查询所有班级，动态绑定下拉框
	 */
	List<ClassInfo> selectClassList();
	/**
	 * 根据教师的登录Id查询他自己所带的班级
	 * @return
	 */

	List<ClassInfo> selectClassByTeacherId(@Param("teacherId") Integer teacherId);
	ClassInfo selectClassId( @Param("className") String className);

	/**
	 * 查询老师所带的班级
	 *
	 * @param teacherId
	 * @return
	 */
	List<ClassInfo> selectClassInfo(Integer teacherId);
}
