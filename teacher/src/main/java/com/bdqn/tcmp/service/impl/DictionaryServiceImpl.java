package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.entity.Dictionary;
import com.bdqn.tcmp.mapper.DictionaryMapper;
import com.bdqn.tcmp.service.DictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService {

    @Resource
    private DictionaryMapper dictionaryMapper;


    public List<Dictionary> selDictionaryByType(String dictionaryCode) {
        return this.dictionaryMapper.selDictionaryByType(dictionaryCode);
    }
}
