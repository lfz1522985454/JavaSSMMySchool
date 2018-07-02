package com.bdqn.tcmp.service;

import com.bdqn.tcmp.entity.Dictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictionaryService {

    /**
     * 姚国旺
     * 根据字典的类型连接查询返回题目类型，教师职务类型等
     * @param dictionaryCode
     * @return
     */
    List<Dictionary> selDictionaryByType(@Param("dictionaryCode") String dictionaryCode);
}
