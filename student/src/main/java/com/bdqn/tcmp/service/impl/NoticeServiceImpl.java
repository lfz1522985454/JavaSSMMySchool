package com.bdqn.tcmp.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bdqn.tcmp.entity.*;
import com.bdqn.tcmp.service.*;
import com.bdqn.tcmp.mapper.*;
import com.bdqn.tcmp.dto.*;

/**
 * 业务逻辑层接口实现类
 * @author admin
 */
@Service("noticeService")
public class NoticeServiceImpl implements NoticeService{
    @Autowired
    private NoticeMapper noticeMapper;

    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Notice对象
     */
    public Notice selectNoticeByID(int id){
        return noticeMapper.selectNoticeByID(id);
    }

    /**
     * 查询全部数据
     * @return Notice对象集合
     */
    public List<Notice> selectNoticeAll(){
        return noticeMapper.selectNoticeAll();
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Notice对象集合
     */
    public List<Notice> selectNoticeByWhere(NoticeDTO dto){
        return noticeMapper.selectNoticeByWhere(dto);
    }

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    public int selectNoticeCountByWhere(NoticeDTO dto){
        return noticeMapper.selectNoticeCountByWhere(dto);
    }
    /**
     * 得到数据表Notice满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Notice对象集合
     */
    public List<Notice> selectNoticeByPage(NoticeDTO dto){
        return noticeMapper.selectNoticeByPage(dto);
    }
}



