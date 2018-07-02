package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.ResultMessDTO;
import com.bdqn.tcmp.dto.CheckHomeWorkDTO;
import com.bdqn.tcmp.dto.StudentDTO;
import com.bdqn.tcmp.dto.TeacherReviewDTO;
import com.bdqn.tcmp.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    // 查询所有学生
    List<Student> selectStudentAll();

    List<Student> selectStudent(StudentDTO dto);

    /**
     * 添加学生
     *
     * @param student 学生对象
     * @return
     */
    int insertStudent(Student student);




    int selectCount(StudentDTO dto);

    /**
     * 姚国旺
     * 按照编号查学生
     *
     * @param studentId 学生编号
     * @return
     */
    Student selectById(@Param("studentId") Integer studentId);

    /**
     * 修改学生信息
     *
     * @param stu
     * @return
     */
    Integer updateStudentInfo(Student stu);

    /**
     * 朱晓宇创建
     * 用来查询该班级下的学生
     *
     * @param classId 班级编号
     * @return 所有学生信息
     */
    List<Student> selectStudentByClassId(@Param("classId") Integer classId);

    /**
     * 朱晓宇创建
     * 查询学生作业完成情况
     *
     * @param dto   参数对象
     * @return 所有学生信息
     */
    List<Student> selectStudentByWorkLog(CheckHomeWorkDTO dto);

    /**
     * 依据班级编号和班级参加的考试编号
     *          查询出本次考试班级前10名
     * @param classId
     * @param questionId
     * @return   要表扬的前10名学生列表
     */
    List<TeacherReviewDTO> selectStudentByClassAndQuestionTOP10(@Param("classId") Integer classId, @Param("questionId") Integer questionId);

    /**
     * 获取班级本次参加考试的平均分
     * @param classId  班级编号
     * @param questionId  参加的测试编号
     * @return  本次考试的平均分
     */
    Double getAverage(@Param("classId") Integer classId,@Param("questionId") Integer questionId);

    /**
     * 查找本次考试中低于班级平均分的学生列表
     * @param classId 班级编号
     * @param questionId 考试编号
     * @return 低于班级考试的学生列表
     */
    List<TeacherReviewDTO> underAverageStudentList(@Param("classId") Integer classId,@Param("questionId") Integer questionId);

    /**
     * 依据班级编号和考试编号，查询本次考试成绩和排名
     * @param classId 班级编号
     * @param questionId 考试编号
     * @return   本次考试的成绩和排名
     */
    List<ResultMessDTO> getCurrentQuestionScore(@Param("classId") Integer classId,@Param("questionId") Integer questionId);


    /**
     * 依据班级编号和考试编号，查询上一次考试成绩和排名
     * @param classId 班级编号
     * @param questionId 考试编号
     * @return   本上一次绩和排名
     */
    List<ResultMessDTO> getLastQuestionScore(@Param("classId") Integer classId,@Param("questionId") Integer questionId);

    /**
     * 依据学生编号，查询学生对象
     * @param studentId
     * @return
     */
    TeacherReviewDTO getStudentObjByStudentId(Integer studentId);
	/**
	 * 根据班级查询本班所有学生考勤今日（不加分页）
	 * @param classId 班级的id
	 * @return
	 */
	List<Student> selectStudentByClassIdDay(@Param("classId") Integer classId);
	/**
	 * 根据班级查询本班所有学生考勤--周（不加分页）
	 * @param classId 班级的id
	 * @return
	 */
	List<Student> selectStudentByClassIdWeek(@Param("classId") Integer classId);
	/**
	 * 根据班级查询本班所有学生考勤--月（不加分页）
	 * @param classId 班级的id
	 * @return
	 */
	List<Student> selectStudentByClassIdMonth(@Param("classId") Integer classId);
	/**
	 * 根据班级查询本班所有学生考勤（不加分页）
	 * @param classId 班级的id
	 * @return
	 */
	List<Student> selectStudentByClassIdYear(@Param("classId") Integer classId);


}
