package com.bdqn.tcmp.mapper;
import java.util.*;
import com.bdqn.tcmp.entity.*;
import org.apache.ibatis.annotations.Param;

/**
 * 数据访问层接口
 * @author admin
 */
public interface AuthorityMapper{
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体
     * @return 受影响行数
     */
    int insertAuthority(Authority entity);
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Authority对象
     */
    Authority selectAuthorityByID(int id);
    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体
     * @return 受影响行数
     */
    int updateAuthority(Authority entity);

    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int updateAuthorityEnabledByID(@Param("id")int id,@Param("value")int value);
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int deleteAuthority(int id);
    /**
     * 查询全部数据
     * @return Authority对象集合
     */
    List<Authority> selectAuthorityAll(@Param("parentId")Integer parentId);
    //查询目录
    List<Authority> selectAuthorityCatalog();
//    /**
//     * 根据条件查询数据
//     * @param dto
//     *            实体类查询条件
//     * @return Authority对象集合
//     */
//    List<Authority> selectAuthorityByWhere(AuthorityDTO dto);
//
//    /**
//     * 根据条件查询满足条件的记录数
//     * @param dto
//     *            实体类查询条件
//     * @return 满足条件的记录数
//     */
//    int selectAuthorityCountByWhere(AuthorityDTO dto);
//    /**
//     * 得到数据表Authority满足查询条件的分页记录
//     * @param dto
//     *            实体类查询条件
//     * @return Authority对象集合
//     */
//    List<Authority> selectAuthorityByPage(AuthorityDTO dto);
}



