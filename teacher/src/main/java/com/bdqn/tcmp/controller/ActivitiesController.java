package com.bdqn.tcmp.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.annotation.Resource;

import com.bdqn.tcmp.util.DetermineTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bdqn.tcmp.service.*;
import com.bdqn.tcmp.entity.*;
import com.bdqn.tcmp.dto.*;

@Controller
@RequestMapping("activities")
public class ActivitiesController {
    @Resource
    private ActivitiesService activitiesService;

    /**
     * 向插入数据
     *
     * @param entity 带有要插入数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/add.do", method = RequestMethod.POST)
    public int insertActivities(Activities entity) {
        return activitiesService.insertActivities(entity);
    }

    /**
     * 根据主键查询一个数据
     *
     * @param id 表的主键
     * @return Activities对象
     */
    @ResponseBody
    @RequestMapping(value = "/byid.do", method = RequestMethod.POST)
    public Activities selectActivitiesByID(int id) {
        return activitiesService.selectActivitiesByID(id);
    }

    /**
     * 修改数据
     *
     * @param entity 带有要修改数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/edit.do", method = RequestMethod.POST)
    public int updateActivities(Activities entity) {
        return activitiesService.updateActivities(entity);
    }

    /**
     * 修改的启用状态
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/isen.do", method = RequestMethod.POST)
    public int updateActivitiesEnabledByID(int id, int value) {
        return activitiesService.updateActivitiesEnabledByID(id, value);
    }

    /**
     * 删除指定主键的数据
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/del.do", method = RequestMethod.POST)
    public int deleteActivities(int id) {
        return activitiesService.deleteActivities(id);
    }

    /**
     * 查询全部数据
     *
     * @return Activities对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/all.do", method = RequestMethod.POST)
    public List<Activities> selectActivitiesAll() {
        return activitiesService.selectActivitiesAll();
    }

    /**
     * 根据条件查询数据
     *
     * @param dto 实体类查询条件
     * @return Activities对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/where.do", method = RequestMethod.POST)
    public List<Activities> selectActivitiesByWhere(ActivitiesDTO dto) {
        return activitiesService.selectActivitiesByWhere(dto);
    }

    /**
     * 得到数据表Activities满足查询条件的分页记录
     *
     * @param dto 实体类查询条件
     * @return Activities对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/page.do", method = RequestMethod.POST)
    public Map<String, Object> selectActivitiesByPage(ActivitiesDTO dto) {
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
        dto.setRowCount(this.activitiesService.selectActivitiesCountByWhere(dto));
        map.put("page", dto);
        map.put("activitiesList", this.activitiesService.selectActivitiesByPage(dto));
        return map;
    }
}
