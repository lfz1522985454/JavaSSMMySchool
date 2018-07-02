package com.bdqn.tcmp.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.entity.Dictionary;
import com.bdqn.tcmp.service.DictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("dictionary")
public class DictionaryController {

    @Resource
    private DictionaryService dictionaryService;

    @ResponseBody
    @RequestMapping("/selDictionaryByType.do")
    public List<Dictionary> selDictionaryById(String  dictionaryCode){
        System.out.println("进入字典表信息");
        List<Dictionary> list=dictionaryService.selDictionaryByType(dictionaryCode);
        System.out.println("字典表信息:"+ JSON.toJSONString(list));
        return list;
    }


}
