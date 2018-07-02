
package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.LessonDTO;
import com.bdqn.tcmp.entity.ClassLesson;
import com.bdqn.tcmp.entity.Lesson;
import com.bdqn.tcmp.service.LessonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("lesson")
public class LessonController{
    @Resource
    private LessonService lessonService;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public String insertLesson(ClassLesson entity){
//        return lessonService.insertLesson(entity);
        String result = "false";
        System.err.println(entity.toString());
        //这个才是真正的数据
        Lesson lesson =  new Lesson();
//        lesson.setRoomIDA(entity.get__EMPTY_1());
//        lesson.setRoomIDB(entity.get__EMPTY_1());
//        lesson.setRoomIDC(entity.get__EMPTY_1());
//        lesson.setRoomIDD(entity.get__EMPTY_1());
//        lesson.setClassIDA(entity.get__EMPTY_3());
//        lesson.setClassIDB(entity.get__EMPTY_6());
//        lesson.setClassIDC(entity.get__EMPTY_9());
//        lesson.setClassIDD(entity.get__EMPTY_12());
//        lesson.setSubjectNameA(entity.get__EMPTY_2());
//        lesson.setSubjectNameB(entity.get__EMPTY_5());
//        lesson.setSubjectNameC(entity.get__EMPTY_8());
//        lesson.setSubjectNameD(entity.get__EMPTY_11());
//        lesson.setTeacherIDA(entity.get__EMPTY_4());
//        lesson.setTeacherIDB(entity.get__EMPTY_7());
//        lesson.setTeacherIDC(entity.get__EMPTY_10());
//        lesson.setTeacherIDD(entity.get__EMPTY_13());
        System.err.println(lesson.toString());
        int i = lessonService.insertLesson(lesson);
        if(i > 0 ){
            result = "true";
        }
        return result;
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Lesson对象
     */
    @ResponseBody
    @RequestMapping(value = "/byid.do",method = RequestMethod.POST)
    public Lesson selectLessonByID(int id){
        return lessonService.selectLessonByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/edit.do",method = RequestMethod.POST)
    public int updateLesson(Lesson entity){
        return lessonService.updateLesson(entity);
    }
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/isen.do",method = RequestMethod.POST)
    public int updateLessonEnabledByID(int id,int value){
        return lessonService.updateLessonEnabledByID(id,value);
    }
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/del.do",method = RequestMethod.POST)
    public int deleteLesson(int id){
        return lessonService.deleteLesson(id);
    }
    /**
     * 查询全部数据
     * @return Lesson对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/all.do",method = RequestMethod.GET)
    public List<Lesson> selectLessonAll(){
        return lessonService.selectLessonAll();
    }
    @ResponseBody
    @RequestMapping(value = "/allById.do",method = RequestMethod.POST)
    public List<Lesson> selectLessonAllId(Integer id){
        return lessonService.selectLessonAllById(id);
    }
    @ResponseBody
    @RequestMapping(value = "/selectLessonAllByRi.do",method = RequestMethod.POST)
    public List<Lesson> selectLessonAllByRi(){
        return lessonService.selectLessonAllByRi();
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Lesson对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/where.do",method = RequestMethod.POST)
    public List<Lesson> selectLessonByWhere(LessonDTO dto){
        return lessonService.selectLessonByWhere(dto);
    }

    /**
     * 得到数据表Lesson满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Lesson对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/page.do",method = RequestMethod.POST)
    public Map<String, Object> selectLessonByPage(LessonDTO dto){
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(13);
        dto.setRowCount(lessonService.selectLessonCountByWhere(dto));
        map.put("page", dto);
        map.put("lessonList", lessonService.selectLessonByPage(dto));
        return map;
    }
}
