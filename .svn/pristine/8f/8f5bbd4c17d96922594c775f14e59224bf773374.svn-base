package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.EvaluationDTO;
import com.bdqn.tcmp.dto.TeacherReviewDTO;
import com.bdqn.tcmp.entity.Evaluation;
import com.bdqn.tcmp.entity.EvaluationDetail;
import com.bdqn.tcmp.service.EvaluationDetailService;
import com.bdqn.tcmp.service.EvaluationService;
import com.bdqn.tcmp.service.StuParentService;
import com.bdqn.tcmp.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * 评价详情的的控制器
 */
@Controller
@RequestMapping("/evaluation")
public class EvaluationController {

    /**
     * 评价主表的引用对象
     */
    @Resource
    private EvaluationService evaluationService;
    /**
     * 记录从表的引用对象
     */
    @Resource
    private EvaluationDetailService evaluationDetailService;

    /**
     * 学生家长表的引用
     */
    @Resource
    private StuParentService stuParentService;
    /**
     * 学生对象的引用
     */
    @Resource
    private StudentService studentService;

    @RequestMapping("/saveEvauation.do")
    @ResponseBody
    public String saveEvauation(EvaluationDTO evaluationDTO) {
        //存储班级编号
        Integer classId = evaluationDTO.getClassId();
        //存储年纪编号
        Integer questionId = evaluationDTO.getQuestionId();
        /*添加评价记录表，主表*/
        Evaluation evaluation = null;
        try {
            evaluation = new Evaluation();
            evaluation.setSendType(evaluationDTO.getSendType());
            evaluation.setComments(evaluationDTO.getEvaluationText());
            evaluation.setQuestionId(evaluationDTO.getQuestionId());
            evaluation.setEvaluationType(evaluationDTO.getEvaluationType());
        } catch (Exception e) {
            System.out.println("添加老师点评信息异常：错误信息可能为：参数传递数据不正确");
            e.printStackTrace();
            return "false";
        }
        /*添加主表的数据*/
        this.evaluationService.saveEvaluationReturnID(evaluation);
        /*添加从表数据*/
        EvaluationDetail evaluationDetail = new EvaluationDetail();
        //主键回填
        evaluationDetail.setEvaluationId(evaluation.getEvaluationId());
        //获取学生列表和信息
        Map<String, Object> map = new HashMap<String, Object>();
        map = this.studentService.getStudentForResultMess(classId, questionId);

        //一个学生评价的集合，用来存储，班级前10 或 成绩进步 或 退步 或低于平均分的学生列表
        List<TeacherReviewDTO> list =null;
        //判断页面提交的学生列表是那一栏的学生评价记录
        try {
            if ("top".equals(evaluationDTO.getSaveType())) {
                list= (List<TeacherReviewDTO>) map.get("top");
            } else if ("driver".equals(evaluationDTO.getSaveType())) {
                list= (List<TeacherReviewDTO>)map.get("driverStudent");
            }else if ("under".equals(evaluationDTO.getSaveType())) {
                list= (List<TeacherReviewDTO>)map.get("underAverageList");
            }else {
                list= (List<TeacherReviewDTO>)map.get("backStudent");
            }
        } catch (Exception e) {
            System.out.println("批量添加老师点评记录时:获取学生编号异常，错误信息可能为：学生记录列表为空，或出现非法数据");
            e.printStackTrace();
            return "false";
        }

        //无论哪一类的学生评价，都要获取学生学号之后，添加到数据库中
        try {
            for (TeacherReviewDTO obj : list) {
                Integer studentId = obj.getStudentId();
                evaluationDetail.setParentId(this.stuParentService.getParentIdByStudentId(studentId));
                evaluationDetail.setStudentId(studentId);
                this.evaluationDetailService.saveEvaluationDetail(evaluationDetail);
            }
        } catch (Exception e) {
            System.out.println("循环添加评价记录时出现异常：错误信息可能是：出现非法数据");
            e.printStackTrace();
            return "false";
        }
        return "true";
    }
}
