package com.bdqn.tcmp.mapper;
import com.bdqn.tcmp.dto.SpecialtrainDTO;
import com.bdqn.tcmp.dto.SpecialtrainSkillResultDTO;
import com.bdqn.tcmp.entity.Specialtrain;

import java.util.List;

/**
 * 数据访问层接口
 * @author admin
 */
public interface SpecialtrainMapper {
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体
     * @return 受影响行数
     */
    int insertSpecialtrain(Specialtrain entity);
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Specialtrain对象
     */
    Specialtrain selectSpecialtrainByID(int id);
    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体
     * @return 受影响行数
     */
    int updateSpecialtrain(Specialtrain entity);

    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    //int updateSpecialtrainEnabledByID(@Param("id")int id,@Param("value")int value);
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int deleteSpecialtrain(int id);
    /**
     * 查询全部数据
     * @return Specialtrain对象集合
     */
    List<Specialtrain> selectSpecialtrainAll();
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Specialtrain对象集合
     */
    List<Specialtrain> selectSpecialtrainByWhere(SpecialtrainDTO dto);

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    int selectSpecialtrainCountByWhere(SpecialtrainDTO dto);
    /**
     * 得到数据表Specialtrain满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Specialtrain对象集合
     */
    List<Specialtrain> selectSpecialtrainByPage(SpecialtrainDTO dto);
    //根据学生id 查看二级知识点的自测统计
    List<SpecialtrainSkillResultDTO> selectSpecialtrainAndSkillByStudentId(SpecialtrainDTO dto);
    //根据父级id查看父级的名称
    String selectFatherNameByFatherId(Integer fatherId);


}



