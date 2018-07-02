package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.NoticeDTO;
import com.bdqn.tcmp.entity.Notice;
import com.bdqn.tcmp.mapper.NoticeMapper;
import com.bdqn.tcmp.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
    @Resource
    private NoticeMapper noticeMapper;

    public int insertNotice(Notice notice) {
        return this.noticeMapper.insertNotice(notice);
    }

    public Notice selectNoticeByID(int noticeID) {
        return this.noticeMapper.selectNoticeByID(noticeID);
    }

    public int updateNotice(Notice notice) {
        return this.noticeMapper.updateNotice(notice);
    }

    public int updateNoticeEnabledByID(int id, int value) {
        return this.noticeMapper.updateNoticeEnabledByID(id, value);
    }

    public int deleteNotice(int id) {
        return this.noticeMapper.deleteNotice(id);
    }

    public List<Notice> selectNoticeAll() {
        return this.noticeMapper.selectNoticeAll();
    }

    public List<Notice> selectNoticeByWhere(NoticeDTO dto) {
        return this.noticeMapper.selectNoticeByWhere(dto);
    }

    public int selectNoticeCountByWhere(NoticeDTO dto) {
        return this.noticeMapper.selectNoticeCountByWhere(dto);
    }

    public List<Notice> selectNoticeByPage(NoticeDTO dto) {
        List<Notice> list = this.noticeMapper.selectNoticeByPage(dto);
        //替换可见级别和通知方式中的，为空格
        for (Notice notice : list) {
            notice.setVisibleLevel(notice.getVisibleLevel().replace(",", "  "));
            notice.setInformWay(notice.getInformWay().replace(",", "  "));
        }
        return list;
    }
}

