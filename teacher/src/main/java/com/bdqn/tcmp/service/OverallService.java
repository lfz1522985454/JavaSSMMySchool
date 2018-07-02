package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.OveralPageDTO;
import com.bdqn.tcmp.dto.OverallDTO;

import java.util.List;

public interface OverallService {


    /**
     * 页面数据分页查询总记录数
     *
     * @param overalPageDTO
     * @return
     */
    Integer getOveralCount(OveralPageDTO overalPageDTO);


    /**
     * 页面数据分页查询具体查询
     *
     * @param overalPageDTO
     * @return
     */
    List<OverallDTO> getOverallResult(OveralPageDTO overalPageDTO);

}
