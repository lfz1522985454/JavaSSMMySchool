package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.CustromjlDTO;
import com.bdqn.tcmp.entity.Custromjl;
import com.bdqn.tcmp.mapper.CustromjlMapper;
import com.bdqn.tcmp.service.CustromjlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("custromjlService")
public class CustromjlServiceImpl implements CustromjlService {
    @Resource
    private CustromjlMapper custromjlMapper;
    /**
     * 依据考试编号，查询测试编号
     * @param classId  依据班级编号，查询班级中每个学生的成绩
     * @param questionId
     * @return   当前班级中每个学生的考试成绩
     */
    public List<Custromjl> getCustromjlListByClassId(Integer classId, Integer questionId) {
        return this.custromjlMapper.getCustromjlListByClassId(classId,questionId);
    }
    public List<Custromjl> selectCustromjldto(CustromjlDTO dto) {
        return this.custromjlMapper.selectCustromjldto(dto);
    }

    public List<Custromjl> selectCustromjlPage(CustromjlDTO dto) {
        return this.custromjlMapper.selectCustromjlPage(dto);
    }

    public int selectCustromjlCount(CustromjlDTO dto) {
        return this.custromjlMapper.selectCustromjlCount(dto);
    }

    public List<Custromjl> selectStudentCustromjldto(CustromjlDTO dto) {
        return this.custromjlMapper.selectStudentCustromjldto(dto);
    }

    public List<Custromjl> selectStudentCustromjlPage(CustromjlDTO dto) {
        return this.custromjlMapper.selectStudentCustromjlPage(dto);
    }

    public int selectStudentCustromjldtoCount(CustromjlDTO dto) {
        return this.custromjlMapper.selectStudentCustromjldtoCount(dto);
    }

    public List<Custromjl> selectClassExcel(CustromjlDTO dto) {
        return this.custromjlMapper.selectClassExcel(dto);
    }

    @Override
    public List<Custromjl> selectQuestById(CustromjlDTO dto) {
        return this.custromjlMapper.selectQuestById(dto);
    }

    @Override
    public boolean insertCustromjl(Custromjl custromjl) {
        return this.custromjlMapper.insertCustromjl(custromjl) > 0 ? true : false;
    }

    @Override
    public List<Custromjl> selectDayList(CustromjlDTO dto) {
        return this.custromjlMapper.selectDayList(dto);
    }

}
