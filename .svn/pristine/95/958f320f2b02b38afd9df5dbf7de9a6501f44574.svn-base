
package com.bdqn.tcmp.controller;

import java.util.*;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bdqn.tcmp.service.*;
import com.bdqn.tcmp.entity.*;
import com.bdqn.tcmp.dto.*;

@Controller
@RequestMapping("notice")
public class NoticeController {
    @Resource
    private NoticeService noticeService;

    /**
     * 根据主键查询一个数据
     *
     * @param id 表的主键
     * @return Notice对象
     */
    @ResponseBody
    @RequestMapping(value = "/byid.do", method = RequestMethod.POST)
    public Notice selectNoticeByID(int id) {
        return noticeService.selectNoticeByID(id);
    }

    /**
     * 查询全部数据
     *
     * @return Notice对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/all.do", method = RequestMethod.POST)
    public List<Notice> selectNoticeAll() {
        return noticeService.selectNoticeAll();
    }

    /**
     * 根据条件查询数据
     *
     * @param dto 实体类查询条件
     * @return Notice对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/where.do", method = RequestMethod.POST)
    public List<Notice> selectNoticeByWhere(NoticeDTO dto) {
        return noticeService.selectNoticeByWhere(dto);
    }

    /**
     * 得到数据表Notice满足查询条件的分页记录
     *
     * @param dto 实体类查询条件
     * @return Notice对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/page.do", method = RequestMethod.POST)
    public Map<String, Object> selectNoticeByPage(NoticeDTO dto) {
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
        dto.setRowCount(noticeService.selectNoticeCountByWhere(dto));
        map.put("page", dto);
        map.put("noticeList", noticeService.selectNoticeByPage(dto));
        return map;
    }
}
