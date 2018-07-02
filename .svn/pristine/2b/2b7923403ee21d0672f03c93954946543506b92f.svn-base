package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.NoticeDTO;
import com.bdqn.tcmp.entity.Notice;
import com.bdqn.tcmp.service.NoticeService;
import com.bdqn.tcmp.util.FileUploadUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("notice")
public class NoticeController {
    @Resource
    private NoticeService noticeService;

    /**
     * 向插入数据
     *
     * @param noticePicFile  带有要插入数据的实体类
     * @param attachmentFile 带有要插入数据的实体类
     * @param notice         带有要插入数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/add.do", method = RequestMethod.POST)
    public int insertLesson(Notice notice, HttpSession session,
                            MultipartFile noticePicFile, MultipartFile attachmentFile) {

        notice.setNoticePic(FileUploadUtil.fileUpload(noticePicFile, session));
        notice.setAttachment(FileUploadUtil.fileUpload(attachmentFile, session));
        System.out.println(notice.toString());

        int row = noticeService.insertNotice(notice);
        return row;
    }

    /**
     * 根据主键查询一个数据
     *
     * @param id 表的主键
     * @return Lesson对象
     */
    @ResponseBody
    @RequestMapping(value = "/byid.do", method = RequestMethod.POST)
    public Notice selectNoticeByID(Integer id) {
        System.out.println("id-------------------------------------------------------------------" + id);
        return this.noticeService.selectNoticeByID(id);
    }

    /**
     * 修改数据
     *
     * @param notice 带有要修改数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/edit.do", method = RequestMethod.POST)
    public int updateNotice(Notice notice) {
        return this.noticeService.updateNotice(notice);
    }

    /**
     * 修改的启用状态
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/isen.do", method = RequestMethod.POST)
    public int updateNoticeEnabledByID(int id, int value) {
        return this.noticeService.updateNoticeEnabledByID(id, value);
    }

    /**
     * 删除指定主键的数据
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/del.do", method = RequestMethod.POST)
    public int deleteNotice(int id) {
        return this.noticeService.deleteNotice(id);
    }

    /**
     * 查询全部数据
     *
     * @return Lesson对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/all.do", method = RequestMethod.GET)
    public List<Notice> selectNoticeAll() {
        return this.noticeService.selectNoticeAll();
    }

    /**
     * 根据条件查询数据
     *
     * @param dto 实体类查询条件
     * @return Lesson对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/where.do", method = RequestMethod.POST)
    public List<Notice> selectNoticeByWhere(NoticeDTO dto) {
        return this.noticeService.selectNoticeByWhere(dto);
    }

    /**
     * 得到数据表Lesson满足查询条件的分页记录
     *
     * @param dto 实体类查询条件
     * @return Lesson对象集合
     */
    @ResponseBody
    @RequestMapping(value = "/page.do", method = RequestMethod.POST)
    public Map<String, Object> selectNoticeByPage(NoticeDTO dto) {
        System.out.println(dto.toString());
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
        dto.setRowCount(this.noticeService.selectNoticeCountByWhere(dto));
        map.put("page", dto);
        map.put("noticeList", this.noticeService.selectNoticeByPage(dto));
        return map;
    }
}
