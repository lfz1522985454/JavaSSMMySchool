package com.bdqn.tcmp.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import com.bdqn.tcmp.util.DetermineTime;
import org.springframework.stereotype.Service;
import com.bdqn.tcmp.entity.*;
import com.bdqn.tcmp.service.*;
import com.bdqn.tcmp.mapper.*;
import com.bdqn.tcmp.dto.*;

/**
 * 业务逻辑层接口实现类
 *
 * @author admin
 */
@Service("activitiesService")
public class ActivitiesServiceImpl implements ActivitiesService {
    @Resource
    private ActivitiesMapper activitiesMapper;

    /**
     * 向插入数据
     *
     * @param entity 带有要插入数据的实体类
     * @return 受影响行数
     */
    public int insertActivities(Activities entity) {
        return activitiesMapper.insertActivities(entity);
    }

    /**
     * 根据主键查询一个数据
     *
     * @param id 表的主键
     * @return Activities对象
     */
    public Activities selectActivitiesByID(int id) {
        return activitiesMapper.selectActivitiesByID(id);
    }

    /**
     * 修改数据
     *
     * @param entity 带有要修改数据的实体类
     * @return 受影响行数
     */
    public int updateActivities(Activities entity) {
        return activitiesMapper.updateActivities(entity);
    }

    /**
     * 修改的启用状态
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    public int updateActivitiesEnabledByID(int id, int value) {
        return activitiesMapper.updateActivitiesEnabledByID(id, value);
    }

    /**
     * 删除指定主键的数据
     *
     * @param id 表的主键
     * @return 受影响行数
     */
    public int deleteActivities(int id) {
        return activitiesMapper.deleteActivities(id);
    }

    /**
     * 查询全部数据
     *
     * @return Activities对象集合
     */
    public List<Activities> selectActivitiesAll() {
        return activitiesMapper.selectActivitiesAll();
    }

    /**
     * 根据条件查询数据
     *
     * @param dto 实体类查询条件
     * @return Activities对象集合
     */
    public List<Activities> selectActivitiesByWhere(ActivitiesDTO dto) {
        return activitiesMapper.selectActivitiesByWhere(dto);
    }

    /**
     * 根据条件查询满足条件的记录数
     *
     * @param dto 实体类查询条件
     * @return 满足条件的记录数
     */
    public int selectActivitiesCountByWhere(ActivitiesDTO dto) {
        return activitiesMapper.selectActivitiesCountByWhere(dto);
    }

    /**
     * 得到数据表Activities满足查询条件的分页记录
     *
     * @param dto 实体类查询条件
     * @return Activities对象集合
     */
    public List<Activities> selectActivitiesByPage(ActivitiesDTO dto) {
        List<Activities> list = activitiesMapper.selectActivitiesByPage(dto);
        Date day = new Date();
        for (Activities activities : list) {
            //替换可见级别和通知方式中的，为空格
            activities.setVisibleLevel(activities.getVisibleLevel().replace(",", "  "));

            //如果返回值为2在活动期间内，如果返回值为3活动以结束，返回值1为活动未开始
            if (DetermineTime.isEffectiveDate(day, activities.getBeginDate(), activities.getEndDate()) == 2) {
                //如果返回值为2在报名期间内，如果返回值为3报名已结束，返回值1为报名未开始
                if (DetermineTime.isEffectiveDate(day, activities.getApplyBeginDate(), activities.getApplyEndDate()) == 2) {
                    //如果在报名人数不够进入判断否则状态为招募完成
                    if (activities.getSignUpCount() > activities.getPeopleCount()) {
                        activities.setState("招募中");
                    } else {
                        activities.setState("招募完成");
                    }
                } else if (DetermineTime.isEffectiveDate(day, activities.getApplyBeginDate(), activities.getApplyEndDate()) == 3) {
                    activities.setState("报名已结束");
                } else {
                    activities.setState("报名未开始");
                }
            } else if (DetermineTime.isEffectiveDate(day, activities.getBeginDate(), activities.getEndDate()) == 3) {
                activities.setState("活动已结束");
            } else {
                activities.setState("活动未开始");
            }
        }


        return list;
    }
}



