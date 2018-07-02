package com.bdqn.tcmp.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.bdqn.tcmp.entity.*;
import com.bdqn.tcmp.service.*;
import com.bdqn.tcmp.mapper.*;
import com.bdqn.tcmp.dto.*;

/**
 * 业务逻辑层接口实现类
 * @author admin
 */
@Service("attendancelService")
public class AttendancelServiceImpl implements AttendancelService{
    @Resource
    private AttendancelMapper attendancelMapper;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    public int insertAttendancel(Attendancel entity){
        return attendancelMapper.insertAttendancel(entity);
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Attendancel对象
     */
    public Attendancel selectAttendancelByID(int id){
        return attendancelMapper.selectAttendancelByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
    public int updateAttendancel(Attendancel entity){
        return attendancelMapper.updateAttendancel(entity);
    }
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int updateAttendancelEnabledByID(int id,int value){
        return attendancelMapper.updateAttendancelEnabledByID(id,value);
    }
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int deleteAttendancel(int id){
        return attendancelMapper.deleteAttendancel(id);
    }
    /**
     * 查询全部数据
     * @return Attendancel对象集合
     */
    public List<Attendancel> selectAttendancelAll(){
        return attendancelMapper.selectAttendancelAll();
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Attendancel对象集合
     */
    public List<Attendancel> selectAttendancelByWhere(AttendancelDTO dto){
        return attendancelMapper.selectAttendancelByWhere(dto);
    }

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    public int selectAttendancelCountByWhere(AttendancelDTO dto){
        return attendancelMapper.selectAttendancelCountByWhere(dto);
    }
    /**
     * 得到数据表Attendancel满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Attendancel对象集合
     */
    public List<Attendancel> selectAttendancelByPage(AttendancelDTO dto){
        return attendancelMapper.selectAttendancelByPage(dto);
    }

    public List<AttendancelResultDTO> selectAttendanceForAppByTeachetId(Integer teacherId) {
        return attendancelMapper.selectAttendanceForAppByTeachetId(teacherId);
    }
}



