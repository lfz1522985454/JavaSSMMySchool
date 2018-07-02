
package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.EvaluationTeacherDTO;
import com.bdqn.tcmp.dto.StudentDTO;
import com.bdqn.tcmp.entity.EvaluationTeacher;
import com.bdqn.tcmp.service.EvaluationTeacherService;
import com.bdqn.tcmp.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/evaluationTeacher")
public class EvaluationTeacherController {
    @Resource
    private EvaluationTeacherService evaluationTeacherService;
    @Resource
    private StudentService studentService;

    /**
     * 向插入数据
     *
     * @param evaluationTeacher 带有要插入数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/add.do", method = RequestMethod.POST)
    public int insertEvaluationTeacher(EvaluationTeacher evaluationTeacher) {
        System.out.println(evaluationTeacher.toString());
        return evaluationTeacherService.insertEvaluationTeacher(evaluationTeacher);
    }

    /**
     * 根据主键查询一个数据
     *
     * @param id 表的主键
     * @return Evaluationteacher对象
     */
    @ResponseBody
    @RequestMapping(value = "/byid.do", method = RequestMethod.POST)
    public Map<String, Object> selectEvaluationTeacherByID(int id) {
        Map<String, Object> map = new HashMap<String, Object>();
        EvaluationTeacher evaluationTeacher = evaluationTeacherService.selectEvaluationTeacherByID(id);
        map.put("evaluationTeacher", evaluationTeacher);
        StudentDTO dto = new StudentDTO();
        dto.setClassId(evaluationTeacher.getClassId());
        map.put("studentNum", studentService.selectCount(dto));
        return map;
    }

    /**
     * 修改数据
     *
     * @param entity 带有要修改数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/edit.do", method = RequestMethod.POST)
    public int updateEvaluationTeacher(EvaluationTeacher entity) {
        return evaluationTeacherService.updateEvaluationTeacher(entity);
    }

    /**
     * 修改的启用状态
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/isen.do", method = RequestMethod.POST)
    public int updateEvaluationTeacherEnabledByID(int id, int value) {
        return evaluationTeacherService.updateEvaluationTeacherEnabledByID(id, value);
    }

    /**
     * 删除指定主键的数据
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/del.do", method = RequestMethod.POST)
    public int deleteEvaluationTeacher(int id) {
        return evaluationTeacherService.deleteEvaluationTeacher(id);
    }

    /**
     * 查询全部数据
     *
     * @return EvaluationTeacher对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/all.do", method = RequestMethod.POST)
    public List<EvaluationTeacher> selectEvaluationTeacherAll() {
        return evaluationTeacherService.selectEvaluationTeacherAll();
    }

    /**
     * 根据条件查询数据
     *
     * @param dto 实体类查询条件
     * @return EvaluationTeacher对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/where.do", method = RequestMethod.POST)
    public List<EvaluationTeacher> selectEvaluationTeacherByWhere(EvaluationTeacherDTO dto) {
        return evaluationTeacherService.selectEvaluationTeacherByWhere(dto);
    }

    /**
     * 得到数据表EvaluationTeacher满足查询条件的分页记录
     *
     * @param dto 实体类查询条件
     * @return EvaluationTeacher对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/page.do", method = RequestMethod.POST)
    public Map<String, Object> selectEvaluationTeacherByPage(EvaluationTeacherDTO dto) {
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
        dto.setRowCount(this.evaluationTeacherService.selectEvaluationTeacherCountByWhere(dto));
        map.put("page", dto);
        map.put("evaluationTeacherList", this.evaluationTeacherService.selectEvaluationTeacherByPage(dto));
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/selByState.do", method = RequestMethod.POST)
    public List<EvaluationTeacher> selectEvaluationTeacher() {
        return evaluationTeacherService.selectEvaluationTeacher();
    }

    @ResponseBody
    @RequestMapping(value = "/selByClassIdAndEvaluationID.do", method = RequestMethod.POST)
    public int selByClassIdAndEvaluationID(Integer evaluationID, Integer classId) {
        EvaluationTeacher evaluationTeacher = evaluationTeacherService.selectEvaluationTeacherByConditions(evaluationID, classId);
        evaluationTeacher.setState("已结束");
        return evaluationTeacherService.updateEvaluationTeacher(evaluationTeacher);
    }
}
