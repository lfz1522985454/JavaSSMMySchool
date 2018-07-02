package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.mapper.SkillMapper;
import com.bdqn.tcmp.entity.Skill;
import com.bdqn.tcmp.service.SkillService;

@Service("skillService")
public class SkillServiceImpl implements SkillService{

	@Resource
	private SkillMapper skillMapper;

	public SkillMapper getSkillMapper() {
		return skillMapper;
	}

	public void setSkillMapper(SkillMapper skillMapper) {
		this.skillMapper = skillMapper;
	}


	public List<Skill> selectFather() {
		// TODO Auto-generated method stub
		return this.skillMapper.selectFather();
	}


	public List<Skill> selectSkillNameById() {
		// TODO Auto-generated method stub
		return this.skillMapper.selectSkillNameById();
	}

	/**
	 * 依据一级菜单的选择的，联动绑定二级，三级菜单
	 * @param fatherId
	 * @return
	 */
	public List<Skill> selectSkillByFatherId(Integer fatherId) {
		return this.skillMapper.selectSkillByFatherId(fatherId);
	}

}
