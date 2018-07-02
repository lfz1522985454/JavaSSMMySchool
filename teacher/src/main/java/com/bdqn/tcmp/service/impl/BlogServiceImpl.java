package com.bdqn.tcmp.service.impl;

import java.util.List;
import javax.annotation.Resource;

import com.bdqn.tcmp.entity.*;
import com.bdqn.tcmp.service.*;
import com.bdqn.tcmp.mapper.*;
import com.bdqn.tcmp.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 业务逻辑层接口实现类
 * @author admin
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService{

    @Resource
    private BlogMapper blogMapper;

    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    public int insertBlog(Blog entity){
        return blogMapper.insertBlog(entity);
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Blog对象
     */
    public Blog selectBlogByID(int id){
        return blogMapper.selectBlogByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
  /*  public int updateBlog(Blog entity){
        return blogMapper.updateBlog(entity);
    }*/
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
  /*  public int updateBlogEnabledByID(int id,int value){
        return blogMapper.updateBlogEnabledByID(id,value);
    }*/
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    /*public int deleteBlog(int id){
        return blogMapper.deleteBlog(id);
    }*/
    /**
     * 查询全部数据
     * @return Blog对象集合
     */
   public List<Blog> selectBlogAll(){
        return this.blogMapper.selectBlogAll();
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Blog对象集合
     */
    public List<Blog> selectBlogByWhere(BlogDTO dto){
        return this.blogMapper.selectBlogByWhere(dto);
    }
    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    public int selectBlogCountByWhere(BlogDTO dto){
        return this.blogMapper.selectBlogCountByWhere(dto);
    }
    /**
     * 得到数据表Blog满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Blog对象集合
     */
    public List<Blog> selectBlogByPage(BlogDTO dto){
        return this.blogMapper.selectBlogByPage(dto);
    }
}



