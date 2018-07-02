package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.OverallDTO;

import java.util.List;

public interface OverallService {



    /**
     * 根据家长id来查询孩子的综合记录
     *
     * @param
     * @return
     */
    List<OverallDTO> getOverallResult(Integer parentID);

}
