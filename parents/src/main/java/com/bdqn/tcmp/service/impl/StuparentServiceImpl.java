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
@Service("stuparentService")
public class StuparentServiceImpl implements StuparentService{
    @Resource
    private StuparentMapper stuparentMapper;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    public int insertStuparent(Stuparent entity){
        return stuparentMapper.insertStuparent(entity);
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Stuparent对象
     */
    public Stuparent selectStuparentByID(int id){
        return stuparentMapper.selectStuparentByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
    public int updateStuparent(Stuparent entity){
        return stuparentMapper.updateStuparent(entity);
    }
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int updateStuparentEnabledByID(int id,int value){
        return stuparentMapper.updateStuparentEnabledByID(id,value);
    }
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int deleteStuparent(int id){
        return stuparentMapper.deleteStuparent(id);
    }
    /**
     * 查询全部数据
     * @return Stuparent对象集合
     */
    public List<Stuparent> selectStuparentAll(){
        return stuparentMapper.selectStuparentAll();
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Stuparent对象集合
     */
    public List<Stuparent> selectStuparentByWhere(StuparentDTO dto){
        return stuparentMapper.selectStuparentByWhere(dto);
    }

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    public int selectStuparentCountByWhere(StuparentDTO dto){
        return stuparentMapper.selectStuparentCountByWhere(dto);
    }
    /**
     * 得到数据表Stuparent满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Stuparent对象集合
     */
    public List<Stuparent> selectStuparentByPage(StuparentDTO dto){
        return stuparentMapper.selectStuparentByPage(dto);
    }

    public List<Stuparent> selectStuparentByStuId(int id) {
        return stuparentMapper.selectStuparentByStuId(id);
    }
}



