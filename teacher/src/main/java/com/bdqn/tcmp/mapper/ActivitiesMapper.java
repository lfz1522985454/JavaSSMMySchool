package com.bdqn.tcmp.mapper;

import java.util.*;

import com.bdqn.tcmp.dto.ActivitiesDTO;
import com.bdqn.tcmp.entity.*;
import org.apache.ibatis.annotations.Param;

/**
 * 数据访问层接口
 *
 * @author admin
 */
public interface ActivitiesMapper {
    /**
     * 向插入数据
     *
     * @param entity 带有要插入数据的实体
     * @return 受影响行数
     */
    int insertActivities(Activities entity);

    /**
     * 根据主键查询一个数据
     *
     * @param id 表的主键
     * @return Activities对象
     */
    Activities selectActivitiesByID(int id);

    /**
     * 修改数据
     *
     * @param entity 带有要修改数据的实体
     * @return 受影响行数
     */
    int updateActivities(Activities entity);

    /**
     * 修改的启用状态
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    int updateActivitiesEnabledByID(@Param("id") int id, @Param("value") int value);

    /**
     * 删除指定主键的数据
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    int deleteActivities(int id);

    /**
     * 查询全部数据
     *
     * @return Activities对象集合
     */
    List<Activities> selectActivitiesAll();

    /**
     * 根据条件查询数据
     *
     * @param dto 实体类查询条件
     * @return Activities对象集合
     */
    List<Activities> selectActivitiesByWhere(ActivitiesDTO dto);

    /**
     * 根据条件查询满足条件的记录数
     *
     * @param dto 实体类查询条件
     * @return 满足条件的记录数
     */
    int selectActivitiesCountByWhere(ActivitiesDTO dto);

    /**
     * 得到数据表Activities满足查询条件的分页记录
     *
     * @param dto 实体类查询条件
     * @return Activities对象集合
     */
    List<Activities> selectActivitiesByPage(ActivitiesDTO dto);
}



