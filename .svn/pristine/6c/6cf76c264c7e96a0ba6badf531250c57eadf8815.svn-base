package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.SpecialtrainDTO;
import com.bdqn.tcmp.dto.SpecialtrainSkillResultDTO;
import com.bdqn.tcmp.entity.Specialtrain;
import com.bdqn.tcmp.mapper.SpecialtrainMapper;
import com.bdqn.tcmp.service.SpecialtrainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("specialtrainService")
public class SpecialtrainServiceImpl implements SpecialtrainService {
    @Resource
    private SpecialtrainMapper specialtrainMapper;

    public int insertSpecialtrain(Specialtrain entity) {
        return this.specialtrainMapper.insertSpecialtrain(entity);
    }

    public Specialtrain selectSpecialtrainByID(int id) {
        return this.specialtrainMapper.selectSpecialtrainByID(id);
    }

    public int updateSpecialtrain(Specialtrain entity) {
        return this.specialtrainMapper.updateSpecialtrain(entity);
    }

    public int deleteSpecialtrain(int id) {
        return this.specialtrainMapper.deleteSpecialtrain(id);
    }

    public List<Specialtrain> selectSpecialtrainAll() {
        return this.specialtrainMapper.selectSpecialtrainAll();
    }

    public List<Specialtrain> selectSpecialtrainByWhere(SpecialtrainDTO dto) {
        return this.specialtrainMapper.selectSpecialtrainByWhere(dto);
    }

    public int selectSpecialtrainCountByWhere(SpecialtrainDTO dto) {
        return this.specialtrainMapper.selectSpecialtrainCountByWhere(dto);
    }

    public List<Specialtrain> selectSpecialtrainByPage(SpecialtrainDTO dto) {
        return this.specialtrainMapper.selectSpecialtrainByPage(dto);
    }

    public List<SpecialtrainSkillResultDTO> selectSpecialtrainAndSkillByStudentId(SpecialtrainDTO dto) {
        return this.specialtrainMapper.selectSpecialtrainAndSkillByStudentId(dto);
    }

    public String selectFatherNameByFatherId(Integer fatherId) {
        return this.specialtrainMapper.selectFatherNameByFatherId(fatherId);
    }




}
