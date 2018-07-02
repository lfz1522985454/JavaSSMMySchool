package com.bdqn.tcmp.mapper;

import com.bdqn.tcmp.dto.AttendancelDTO;
import com.bdqn.tcmp.entity.Attendancel;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 数据访问层接口
 *
 * @author admin
 */
public interface AttendancelMapper {
    /**
     * 向插入数据
     *
     * @param entity 带有要插入数据的实体
     * @return 受影响行数
     */
    int insertAttendancel(Attendancel entity);

    /**
     * 根据主键查询一个数据
     *
     * @param id 表的主键
     * @return Attendancel对象
     */
    Attendancel selectAttendancelByID(int id);

    /**
     * 修改数据
     *
     * @param entity 带有要修改数据的实体
     * @return 受影响行数
     */
    int updateAttendancel(Attendancel entity);

    /**
     * 修改的启用状态
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    int updateAttendancelEnabledByID(@Param("id") int id, @Param("value") int value);

    /**
     * 删除指定主键的数据
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    int deleteAttendancel(int id);

    /**
     * 查询全部数据
     *
     * @return Attendancel对象集合
     */
    List<Attendancel> selectAttendancelAll();

    /**
     * 根据条件查询数据
     *
     * @param dto 实体类查询条件
     * @return Attendancel对象集合
     */
    List<Attendancel> selectAttendancelByWhere(AttendancelDTO dto);

    /**
     * 根据条件查询满足条件的记录数
     *
     * @param dto 实体类查询条件
     * @return 满足条件的记录数
     */
    int selectAttendancelCountByWhere(AttendancelDTO dto);

    /**
     * 得到数据表Attendancel满足查询条件的分页记录
     *
     * @param dto 实体类查询条件
     * @return Attendancel对象集合
     */
    List<Attendancel> selectAttendancelByPage(AttendancelDTO dto);

    List<Attendancel> selectAttendancelByTeacher();
    List<Attendancel> selectAttendancelByStu( @Param("name") String name);

}



