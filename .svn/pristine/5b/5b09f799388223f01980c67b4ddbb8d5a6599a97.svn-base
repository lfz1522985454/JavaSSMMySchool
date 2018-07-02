
package com.bdqn.tcmp.controller;


import com.bdqn.tcmp.entity.Lesson;
import com.bdqn.tcmp.service.LessonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("lesson")
public class LessonController {
    @Resource
    private LessonService lessonService;

    /**
     * 查询周一到周五的课表
     * @param id 周几
     * @return 周一到周五的课表的数据  Lesson对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/allByTea.do",method = RequestMethod.GET)
    public List<Lesson> selectLessonAllByTeacher(Integer id){
        return lessonService.selectLessonAllByTeacher(id);
    }

}
