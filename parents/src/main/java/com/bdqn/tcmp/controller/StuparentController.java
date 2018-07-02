
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
@RequestMapping("stuparent")
public class StuparentController{
    @Resource
    private StuparentService stuparentService;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public int insertStuparent(Stuparent entity){
        return stuparentService.insertStuparent(entity);
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Stuparent对象
     */
    @ResponseBody
    @RequestMapping(value = "/byid.do",method = RequestMethod.POST)
    public Stuparent selectStuparentByID(int id){
        return stuparentService.selectStuparentByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/edit.do",method = RequestMethod.POST)
    public int updateStuparent(Stuparent entity){
        return stuparentService.updateStuparent(entity);
    }
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/isen.do",method = RequestMethod.POST)
    public int updateStuparentEnabledByID(int id,int value){
        return stuparentService.updateStuparentEnabledByID(id,value);
    }
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/del.do",method = RequestMethod.POST)
    public int deleteStuparent(int id){
        return stuparentService.deleteStuparent(id);
    }
    /**
     * 查询全部数据
     * @return Stuparent对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/all.do",method = RequestMethod.POST)
    public List<Stuparent> selectStuparentAll(){
        return stuparentService.selectStuparentAll();
    }

    @ResponseBody
    @RequestMapping(value = "/ByStuId.do")
    public List<Stuparent> selectStuparentByStuId(int id){
        return stuparentService.selectStuparentByStuId(id);
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Stuparent对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/where.do",method = RequestMethod.POST)
    public List<Stuparent> selectStuparentByWhere(StuparentDTO dto){
        return stuparentService.selectStuparentByWhere(dto);
    }

    /**
     * 得到数据表Stuparent满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Stuparent对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/page.do",method = RequestMethod.POST)
    public Map<String, Object> selectStuparentByPage(StuparentDTO dto){
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
        dto.setRowCount(stuparentService.selectStuparentCountByWhere(dto));
        map.put("page", dto);
        map.put("stuparentList", stuparentService.selectStuparentByPage(dto));
        return map;
    }
}
