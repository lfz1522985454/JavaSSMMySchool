package com.bdqn.tcmp.service;

import java.util.List;

import com.bdqn.tcmp.entity.Class;;

public interface ClassService {
	/**
	 * 查询所有班级
	 * 
	 * @return
	 */
	List<Class> selectClassAll();
}
