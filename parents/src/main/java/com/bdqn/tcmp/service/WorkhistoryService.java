package com.bdqn.tcmp.service;
import java.util.*;
import com.bdqn.tcmp.entity.*;
import com.bdqn.tcmp.dto.*;
import org.apache.ibatis.annotations.Param;

/**
 * 业务逻辑层接口
 * @author admin
 */
public interface WorkhistoryService{
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体
     * @return 受影响行数
     */
    int insertWorkhistory(Workhistory entity);
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Workhistory对象
     */
    Workhistory selectWorkhistoryByID(int id);
    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体
     * @return 受影响行数
     */
    int updateWorkhistory(Workhistory entity);

    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int updateWorkhistoryEnabledByID(int id,int value);
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int deleteWorkhistory(int id);
    /**
     * 查询全部数据
     * @return Workhistory对象集合
     */
    List<Workhistory> selectWorkhistoryAll();
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Workhistory对象集合
     */
    List<Workhistory> selectWorkhistoryByWhere(WorkhistoryDTO dto);

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    int selectWorkhistoryCountByWhere(WorkhistoryDTO dto);
    /**
     * 得到数据表Workhistory满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Workhistory对象集合
     */
    List<Workhistory> selectWorkhistoryByPage(WorkhistoryDTO dto);
    /**
     * 根据家长的编号去找对应孩子的编号
     * @param parentId 家长id
     * @return 改孩子所有作业完成记录
     */
    List<Workhistory> selectWOrkhistoryByParentId( Integer parentId);
}



