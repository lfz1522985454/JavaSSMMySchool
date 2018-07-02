
package com.bdqn.tcmp.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.service.*;
import com.bdqn.tcmp.service.impl.*;
import com.bdqn.tcmp.entity.*;
import com.bdqn.tcmp.dto.*;
import com.bdqn.tcmp.util.*;

@Controller
@RequestMapping("blog")
public class BlogController{
    @Resource
    private BlogService blogService;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping("/add.do")
    public int insertBlog(Blog entity){
        System.out.println("返回函数："+entity);
        return blogService.insertBlog(entity);
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Blog对象
     */
    @ResponseBody
    @RequestMapping("/byid.do")
    public Blog selectBlogByID(int id){
        return blogService.selectBlogByID(id);
    }
    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
/*    @ResponseBody
    @RequestMapping(value = "/edit.do",method = RequestMethod.POST)
    public int updateBlog(Blog entity){
        return blogService.updateBlog(entity);
    }*/
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
/*    @ResponseBody
    @RequestMapping(value = "/isen.do",method = RequestMethod.POST)
    public int updateBlogEnabledByID(int id,int value){
        return blogService.updateBlogEnabledByID(id,value);
    }*/
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
/*    @ResponseBody
    @RequestMapping(value = "/del.do",method = RequestMethod.POST)
    public int deleteBlog(int id){
        return blogService.deleteBlog(id);
    }*/
    /**
     * 查询全部数据
     * @return Blog对象集合
     */
    @RequestMapping("/all.do")
    @ResponseBody
    public Map<String, Object> selectBlogAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("blogList", blogService.selectBlogAll());
        System.out.println("文章全部内容" + JSON.toJSONString(map));
        return map;
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Blog对象集合
     */
    @ResponseBody
    @RequestMapping("/where.do")
    public List<Blog> selectBlogByWhere(BlogDTO dto){
        return blogService.selectBlogByWhere(dto);
    }
    /**
     * 得到数据表Blog满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Blog对象集合
     */
    @ResponseBody
    @RequestMapping("/page.do")
    public Map<String, Object> selectBlogByPage(BlogDTO dto){
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
        dto.setPageIndex(1);
        dto.setRowCount(blogService.selectBlogCountByWhere(dto));
        map.put("page", dto);
        map.put("blogList", blogService.selectBlogByPage(dto));
        System.out.println("文章信息:"+JSON.toJSONString(map));
        return map;
    }
}
