package com.bdqn.tcmp.service.impl;
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
public class LessonServiceImpl implements LessonService {
    @Resource
    private LessonMapper lessonMapper;

    public List<Lesson> selectLessonAllByTeacher(Integer id) {
        return lessonMapper.selectLessonAllByTeacher(id);
    }
}



