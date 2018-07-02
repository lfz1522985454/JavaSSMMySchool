package com.bdqn.tcmp.service;

import java.util.List;

import com.bdqn.tcmp.entity.Skill;

public interface SkillService {
	/**
	 * 查询最外层
	 */
	List<Skill> selectFather();

	/**
	 * 1:linux 2:Java skillName fatherId Java基础 2 Java框架 2 JavaScript 2 AJAX 2
	 * Linux其他 1 Linux命令 1 Shell命令 1 Linux服务器搭建 1 数据库 2 Java其他 2
	 * 
	 * @param fatherId
	 * @return
	 */
	List<Skill> selectSkillNameById();
	/**
	 * 依据一级菜单的选择的，联动绑定二级，三级菜单
	 * @param fatherId
	 * @return
	 */
	List<Skill> selectSkillByFatherId(Integer fatherId);
}
