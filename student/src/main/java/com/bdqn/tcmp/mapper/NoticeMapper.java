package com.bdqn.tcmp.mapper;
import java.util.*;

import com.bdqn.tcmp.dto.NoticeDTO;
import com.bdqn.tcmp.entity.*;
import org.apache.ibatis.annotations.Param;

/**
 * 数据访问层接口
 * @author admin
 */
public interface NoticeMapper{

    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Notice对象
     */
    Notice selectNoticeByID(int id);

    /**
     * 查询全部数据
     * @return Notice对象集合
     */
    List<Notice> selectNoticeAll();
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Notice对象集合
     */
    List<Notice> selectNoticeByWhere(NoticeDTO dto);

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    int selectNoticeCountByWhere(NoticeDTO dto);
    /**
     * 得到数据表Notice满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Notice对象集合
     */
    List<Notice> selectNoticeByPage(NoticeDTO dto);
}



