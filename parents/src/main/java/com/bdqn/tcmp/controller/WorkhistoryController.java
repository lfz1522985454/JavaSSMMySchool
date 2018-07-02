
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
@RequestMapping("workhistory")
public class WorkhistoryController{
    @Resource
    private WorkhistoryService workhistoryService;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public int insertWorkhistory(Workhistory entity){
        return workhistoryService.insertWorkhistory(entity);
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Workhistory对象
     */
    @ResponseBody
    @RequestMapping(value = "/byid.do",method = RequestMethod.POST)
    public Workhistory selectWorkhistoryByID(int id){
        return workhistoryService.selectWorkhistoryByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/edit.do",method = RequestMethod.POST)
    public int updateWorkhistory(Workhistory entity){
        return workhistoryService.updateWorkhistory(entity);
    }
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/isen.do",method = RequestMethod.POST)
    public int updateWorkhistoryEnabledByID(int id,int value){
        return workhistoryService.updateWorkhistoryEnabledByID(id,value);
    }
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/del.do",method = RequestMethod.POST)
    public int deleteWorkhistory(int id){
        return workhistoryService.deleteWorkhistory(id);
    }
    /**
     * 查询全部数据
     * @return Workhistory对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/all.do")
    public List<Workhistory> selectWorkhistoryAll(){
        return workhistoryService.selectWorkhistoryAll();
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Workhistory对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/where.do",method = RequestMethod.POST)
    public List<Workhistory> selectWorkhistoryByWhere(WorkhistoryDTO dto){
        return workhistoryService.selectWorkhistoryByWhere(dto);
    }

    /**
     * 得到数据表Workhistory满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Workhistory对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/page.do",method = RequestMethod.POST)
    public Map<String, Object> selectWorkhistoryByPage(WorkhistoryDTO dto){
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
        dto.setRowCount(workhistoryService.selectWorkhistoryCountByWhere(dto));
        map.put("page", dto);
        map.put("workhistoryList", workhistoryService.selectWorkhistoryByPage(dto));
        return map;
    }

    /**
     * 查询全部数据
     * @return Workhistory对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/ByParentId.do")
    public List<Workhistory> selectWOrkhistoryByParentId(Integer parentId){
        return workhistoryService.selectWOrkhistoryByParentId(parentId);
    }
}
