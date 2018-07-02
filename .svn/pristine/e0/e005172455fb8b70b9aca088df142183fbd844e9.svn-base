package com.bdqn.tcmp.service.impl;


import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.HomeworkDTO;
import com.bdqn.tcmp.entity.HomeWork_JSON;
import com.bdqn.tcmp.entity.Homework;
import com.bdqn.tcmp.entity.Homework_WorkHistory;
import com.bdqn.tcmp.mapper.HomeworkMapper;
import com.bdqn.tcmp.mapper.WorkhistoryMapper;
import com.bdqn.tcmp.service.HomeworkService;
import com.bdqn.tcmp.weixin.enums.EnumColor;
import com.bdqn.tcmp.weixin.mapper.ApproveMapper;
import com.bdqn.tcmp.weixin.pojo.TemplateMsg;
import com.bdqn.tcmp.weixin.pojo.ValueColor;
import com.bdqn.tcmp.weixin.util.SendUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 业务逻辑层接口实现类
 *
 * @author admin
 */
@Service("homeworkService")
@Transactional
public class HomeworkServiceImpl implements HomeworkService {
    @Resource
    private HomeworkMapper homeworkMapper;
    @Resource
    private WorkhistoryMapper workhistoryMapper;
    @Resource
    private ApproveMapper approveMapper;

    /**
     * 向插入数据
     *
     * @param entity 带有要插入数据的实体类
     * @return 受影响行数
     */
    @Transactional
    public int insertHomework(Homework entity) {

        return homeworkMapper.insertHomework(entity);
    }

    public int insertHomeworkReturnId(Homework_WorkHistory entity) {
        System.out.println("进入增加作业信息");


        HomeWork_JSON hj = JSON.parseObject(entity.getJsonString(), HomeWork_JSON.class);
        List<String> students = hj.getStudents();
        List<String> sentTypes = hj.getSendTypes();
        String types = "";
        for (int i = 0; i < sentTypes.size(); i++) {
            if ((i + 1) == hj.getSendTypes().size()) {
                types += hj.getSendTypes().get(i);
            } else {
                types += hj.getSendTypes().get(i) + ",";
            }
        }
        entity.setSendType(types);
        entity.setWorkdetail(hj.getWorkdetail());
        entity.setWorkname(hj.getWorkname());
        entity.setClassid(hj.getClassid());
        int row = 0;
        System.out.println(entity.getWorkid() + "-------------------");
        System.out.println(entity.getJsonString());
        homeworkMapper.insertHomeworkReturnId(entity);
        row += entity.getWorkid();
        List<String> users = new ArrayList<String>();
        //发送微信消息
        //
        TemplateMsg msg = new TemplateMsg();
        msg.setTemplateId("ZcOWtU8voeFy15m3ZuMCixxh2PGJihWp1n8HjYWnvH4");

        for (String student : students) {
            entity.setStudentid(Integer.parseInt(student));
            entity.setIsComplete(0);
            row += workhistoryMapper.insertWorkhistory(entity);
            //查询openid
            String id=approveMapper.selectStudentByID(entity.getStudentid());
            System.out.println("++++++++++++++++++++++++++++++"+id);
            users.add(id);
        }
        msg.setToUsers(users);
        msg.setTitle(new ValueColor("作业提醒", EnumColor.BLACK));
        msg.setKeyword1(new ValueColor("2018-06-19",EnumColor.RED));
        msg.setKeyword2(new ValueColor("java作业",EnumColor.BLACK));
        msg.setKeyword3(new ValueColor(hj.getWorkname(),EnumColor.BLACK));
        msg.setKeyword4(new ValueColor(hj.getWorkdetail(),EnumColor.RED));
        msg.setRemark(new ValueColor("记得录像哦！",EnumColor.BLACK));
        SendUtil.sendTemplateMsg(msg);
        return row;
    }

    public int insertHomework(Homework_WorkHistory entity) {
        return 0;
    }

    /**
     * 根据主键查询一个数据
     *
     * @param id 表的主键
     * @return Homework对象
     */
    public Homework selectHomeworkByID(int id) {
        return homeworkMapper.selectHomeworkByID(id);
    }

    /**
     * 修改数据
     *
     * @param entity 带有要修改数据的实体类
     * @return 受影响行数
     */
    public int updateHomework(Homework entity) {
        return homeworkMapper.updateHomework(entity);
    }

    /**
     * 修改的启用状态
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    public int updateHomeworkEnabledByID(int id, int value) {
        return homeworkMapper.updateHomeworkEnabledByID(id, value);
    }

    /**
     * 删除指定主键的数据
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    public int deleteHomework(int id) {
        return homeworkMapper.deleteHomework(id);
    }

    /**
     * 查询全部数据
     *
     * @return Homework对象集合
     */
    public List<Homework> selectHomeworkAll() {
        return homeworkMapper.selectHomeworkAll();
    }

    /**
     * 根据条件查询满足条件的记录数
     *
     * @param dto 实体类查询条件
     * @return 满足条件的记录数
     */
    public List<Homework> selectHomeworkByWhere(HomeworkDTO dto) {
        return null;
    }

    public int selectHomeworkCountByWhere(HomeworkDTO dto) {
        return homeworkMapper.selectHomeworkCountByWhere(dto);
    }


    /**
     * 得到数据表Homework满足查询条件的分页记录
     *
     * @param dto 实体类查询条件
     * @return Homework对象集合
     */
    public List<Homework> selectHomeworkByPage(HomeworkDTO dto) {
        return homeworkMapper.selectHomeworkByPage(dto);
    }

    public List<Homework> selectHomeworkByClassID(Integer classId) {
        return this.homeworkMapper.selectHomeworkByClassID(classId);
    }

    public List<Homework> selectHomeworkByClassIdAndStage(Integer classId, Integer stage) {
        return this.homeworkMapper.selectHomeworkByClassIdAndStage(classId,stage);
    }
}
    


