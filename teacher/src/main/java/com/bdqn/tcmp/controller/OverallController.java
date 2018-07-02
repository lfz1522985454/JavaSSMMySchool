package com.bdqn.tcmp.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.OveralPageDTO;
import com.bdqn.tcmp.service.OverallService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/overall")
public class OverallController {
    @Resource
    private OverallService overallService;

    /**
     * 根据年级编号分页查询学生的综合记录
     * @param dto
     * @return
     */
    @RequestMapping("/getOverallResult.do")
    @ResponseBody
    public Map<String, Object> getOverallResult(OveralPageDTO dto){
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
        dto.setRowCount(overallService.getOveralCount(dto));
        map.put("page", dto);
        map.put("list", overallService.getOverallResult(dto));
        System.out.println("量化评价:" + JSON.toJSONString(map));
        return map;

    }





}
