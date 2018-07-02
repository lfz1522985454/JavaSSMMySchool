package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.NoticeDTO;
import com.bdqn.tcmp.entity.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticeService {
    /**
     * 向插入数据
     *
     * @param notice 带有要插入数据的实体
     * @return 受影响行数
     */
    int insertNotice(Notice notice);

    /**
     * 根据主键查询一个数据
     *
     * @param id 表的主键
     * @return Lesson对象
     */
    Notice selectNoticeByID(int id);

    /**
     * 修改数据
     *
     * @param notice 带有要修改数据的实体
     * @return 受影响行数
     */
    int updateNotice(Notice notice);

    /**
     * 修改的启用状态
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    int updateNoticeEnabledByID(@Param("id") int id, @Param("value") int value);

    /**
     * 删除指定主键的数据
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    int deleteNotice(int id);


    /**
     * 查询全部数据
     *
     * @return Notice对象集合
     */
    List<Notice> selectNoticeAll();

    /**
     * 根据条件查询数据
     *
     * @param dto 实体类查询条件
     * @return Notice对象集合
     */
    List<Notice> selectNoticeByWhere(NoticeDTO dto);

    /**
     * 根据条件查询满足条件的记录数
     *
     * @param dto 实体类查询条件
     * @return 满足条件的记录数
     */
    int selectNoticeCountByWhere(NoticeDTO dto);

    /**
     * 得到数据表Notice满足查询条件的分页记录
     *
     * @param dto 实体类查询条件
     * @return Notice对象集合
     */
    List<Notice> selectNoticeByPage(NoticeDTO dto);
}
