package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.OverallDTO;
import com.bdqn.tcmp.mapper.OverallMapper;
import com.bdqn.tcmp.service.OverallService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("overallService")
public class OverallServiceImpl implements OverallService {
    @Resource
    private OverallMapper overallMapper;


    /**
     * 根据家长id来查询孩子的综合记录
     *
     * @param
     * @return
     */
    public List<OverallDTO> getOverallResult(Integer parentID) {
            OverallDTO oTemp = null;
            List<OverallDTO> list = new ArrayList<OverallDTO>();
            List<OverallDTO> stus = this.overallMapper.stuParent(parentID);
            Double zy = null;
            Double fs = null;
            Double zx = null;
            Double kq = null;
            System.out.println(stus.size());
            for (int i = 0; i < stus.size(); i++) {

                oTemp = new OverallDTO();
                oTemp.setStudentId(stus.get(i).getStudentId());
                if (oTemp.getStudentId() == stus.get(i).getStudentId()) {


                    zy = this.overallMapper.getOveralWork(stus.get(i).getStudentId());
                    fs = this.overallMapper.getOveralScore(stus.get(i).getStudentId());
                    zx = this.overallMapper.getOveralStudy(stus.get(i).getStudentId());
                    kq = this.overallMapper.getOveralCheck(stus.get(i).getStudentId());
                }


                oTemp.setSelfStudy(zx);
                oTemp.setOveralScore(fs);
                oTemp.setOveralCheck(kq);
                oTemp.setOveralWork(zy);
                oTemp.setStudentName(stus.get(i).getStudentName());
                list.add(oTemp);

            }

            return list;
        }
    }

