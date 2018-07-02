package com.bdqn.tcmp.service;
import java.util.*;

import com.bdqn.tcmp.dto.BlogDTO;
import com.bdqn.tcmp.entity.*;


/**
 * 业务逻辑层接口
 * @author admin
 */
public interface BlogService{
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体
     * @return 受影响行数
     */
    int insertBlog(Blog entity);
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Blog对象
     */
    Blog selectBlogByID(int id);
    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体
     * @return 受影响行数
     */
   /* int updateBlog(Blog entity);*/

    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
 /*   int updateBlogEnabledByID(int id,int value);*/
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
   /* int deleteBlog(int id);*/
    /**
     * 查询全部数据
     * @return Blog对象集合
     */
    List<Blog> selectBlogAll();
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Blog对象集合
     */
    List<Blog> selectBlogByWhere(BlogDTO dto);

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    int selectBlogCountByWhere(BlogDTO dto);
    /**
     * 得到数据表Blog满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Blog对象集合
     */
    List<Blog> selectBlogByPage(BlogDTO dto);
}



