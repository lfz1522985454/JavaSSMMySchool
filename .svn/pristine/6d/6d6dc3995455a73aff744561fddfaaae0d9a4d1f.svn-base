package com.bdqn.tcmp.service.impl;


import com.bdqn.tcmp.dto.WorkhistoryDTO;
import com.bdqn.tcmp.entity.Workhistory;
import com.bdqn.tcmp.mapper.WorkhistoryMapper;
import com.bdqn.tcmp.service.WorkhistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务逻辑层接口实现类
 * @author admin
 */
@Service("workhistoryService")
public class WorkhistoryServiceImpl implements WorkhistoryService {
    @Resource
    private WorkhistoryMapper workhistoryMapper;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    public int insertWorkhistory(Workhistory entity){
        return workhistoryMapper.insertWorkhistory(entity);
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Workhistory对象
     */
    public Workhistory selectWorkhistoryByID(int id){
        return workhistoryMapper.selectWorkhistoryByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
    public int updateWorkhistory(Workhistory entity){
        return workhistoryMapper.updateWorkhistory(entity);
    }
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int updateWorkhistoryEnabledByID(int id,int value){
        return workhistoryMapper.updateWorkhistoryEnabledByID(id,value);
    }
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int deleteWorkhistory(int id){
        return workhistoryMapper.deleteWorkhistory(id);
    }
    /**
     * 查询全部数据
     * @return Workhistory对象集合
     */
    public List<Workhistory> selectWorkhistoryAll(){
        return workhistoryMapper.selectWorkhistoryAll();
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Workhistory对象集合
     */
    public List<Workhistory> selectWorkhistoryByWhere(WorkhistoryDTO dto){
        return workhistoryMapper.selectWorkhistoryByWhere(dto);
    }

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    public int selectWorkhistoryCountByWhere(WorkhistoryDTO dto){
        return workhistoryMapper.selectWorkhistoryCountByWhere(dto);
    }
    /**
     * 得到数据表Workhistory满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Workhistory对象集合
     */
    public List<Workhistory> selectWorkhistoryByPage(WorkhistoryDTO dto){
        return workhistoryMapper.selectWorkhistoryByPage(dto);
    }

    public List<Workhistory> selectWOrkhistoryByParentId(Integer parentId) {
        return this.workhistoryMapper.selectWOrkhistoryByParentId(parentId);
    }
}



