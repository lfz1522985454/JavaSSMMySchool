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

    public Integer insertCustromjl(Custromjl obj) {
        return this.custromjlMapper.insertCustromjl(obj);
    }

    public List<Custromjl> selectCustromjlById(Integer studentId) {
        return this.custromjlMapper.selectCustromjlById(studentId);
    }

    public List<Custromjl> selectCustromjlByStuIdAndCustromId(Integer studentId, Integer custromId) {
        return this.custromjlMapper.selectCustromjlByStuIdAndCustromId(studentId, custromId);
    }

    public List<Custromjl> selectCustromjlByCustromId(Integer custromId) {
        return this.selectCustromjlById(custromId);
    }

    public List<Custromjl> selectStudentListAll(CustromjlDTO dto) {
        return this.custromjlMapper.selectStudentListAll(dto);
    }

    public List<Custromjl> selectStudentCustromjldto(CustromjlDTO dto) {
        return this.custromjlMapper.selectStudentCustromjldto(dto);
    }

    public int selectStudentListCount(CustromjlDTO dto) {
        return this.custromjlMapper.selectStudentListCount(dto);
    }

    public List<Custromjl> selectStudentBingZhuangTu(CustromjlDTO dto) {
        return this.custromjlMapper.selectStudentBingZhuangTu(dto);
    }

    public List<Custromjl> selectStudentDayAll(CustromjlDTO dto) {
        return this.custromjlMapper.selectStudentDayAll(dto);
    }

    public int selectStudentDayCount(CustromjlDTO dto) {
        return this.custromjlMapper.selectStudentDayCount(dto);
    }
}
