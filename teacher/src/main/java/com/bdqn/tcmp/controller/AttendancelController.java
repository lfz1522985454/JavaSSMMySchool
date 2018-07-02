
package com.bdqn.tcmp.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.service.*;
import com.bdqn.tcmp.service.impl.*;
import com.bdqn.tcmp.entity.*;
import com.bdqn.tcmp.dto.*;
import com.bdqn.tcmp.util.*;

@Controller
@RequestMapping("attendancel")
public class AttendancelController{
    @Resource
    private AttendancelService attendancelService;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public int insertAttendancel(Attendancel entity){
        return attendancelService.insertAttendancel(entity);
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Attendancel对象
     */
    @ResponseBody
    @RequestMapping(value = "/byid.do",method = RequestMethod.POST)
    public Attendancel selectAttendancelByID(int id){
        return attendancelService.selectAttendancelByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/edit.do",method = RequestMethod.POST)
    public int updateAttendancel(Attendancel entity){
        return attendancelService.updateAttendancel(entity);
    }
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/isen.do",method = RequestMethod.POST)
    public int updateAttendancelEnabledByID(int id,int value){
        return attendancelService.updateAttendancelEnabledByID(id,value);
    }
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/del.do",method = RequestMethod.POST)
    public int deleteAttendancel(int id){
        return attendancelService.deleteAttendancel(id);
    }
    /**
     * 查询全部数据
     * @return Attendancel对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/all.do",method = RequestMethod.POST)
    public List<Attendancel> selectAttendancelAll(){
        return attendancelService.selectAttendancelAll();
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Attendancel对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/where.do",method = RequestMethod.POST)
    public List<Attendancel> selectAttendancelByWhere(AttendancelDTO dto){
        return attendancelService.selectAttendancelByWhere(dto);
    }

    /**
     * 得到数据表Attendancel满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Attendancel对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/page.do",method = RequestMethod.POST)
    public Map<String, Object> selectAttendancelByPage(AttendancelDTO dto){
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
        dto.setRowCount(attendancelService.selectAttendancelCountByWhere(dto));
        map.put("page", dto);
        map.put("attendancelList", attendancelService.selectAttendancelByPage(dto));
        return map;
    }
    //根据教师的Id 统计班级的出勤状况
    @ResponseBody
    @RequestMapping(value = "/appAttendanceCount.do")
    public Map<String, Object> selectAttendanceForAppByTeachetId(Integer teacherId){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("attendanceCount", attendancelService.selectAttendanceForAppByTeachetId(teacherId));
        return map;
    }
}
