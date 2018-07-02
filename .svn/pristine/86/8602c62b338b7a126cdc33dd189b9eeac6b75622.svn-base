package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.entity.Skill;
import com.bdqn.tcmp.entity.Topic;
import com.bdqn.tcmp.mapper.SkillMapper;
import com.bdqn.tcmp.service.SkillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("skillService")
public class SkillServiceImpl implements SkillService{

	@Resource
	private SkillMapper skillMapper;




	public List<Skill> selectSkillAll() {
		System.out.println("知识点service");
		return this.skillMapper.selectSkillAll();
	}

	public List<Skill> selectSillAllCount(Integer skillId, Integer opicTypeId) {
		return this.skillMapper.selectSillAllCount(skillId,opicTypeId);
	}


	public List<Skill> selectSkillById(Integer fatherId) {
		System.out.println("fatherId为?时所有知识点");
		return this.skillMapper.selectSkillById(fatherId);
	}

}
