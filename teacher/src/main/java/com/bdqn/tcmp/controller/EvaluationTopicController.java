package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.entity.EvaluationTopic;
import com.bdqn.tcmp.service.EvaluationTopicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/evaluationTopic")
public class EvaluationTopicController {
    @Resource
    private EvaluationTopicService evaluationTopicService;

    /**
     * @param evaluationID
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping(value = "/selectByID.do", method = RequestMethod.POST)
    public Map<String, Object> selectEvaluationTopicByValuationID(int evaluationID) {
        List<EvaluationTopic> data = this.evaluationTopicService.selectEvaluationTopicByEvaluationID(evaluationID);

        /*拿到所有得ID*/
        List<Integer> studentIdList = new ArrayList<Integer>();
        for (int i = 0; i < data.size(); i++) {
            studentIdList.add(data.get(i).getEtID());
        }
        /*去除重复的ID*/
        List<Integer> tempStudentList = new ArrayList<Integer>();
        for (int i = 0; i < studentIdList.size(); i++) {
            if (!tempStudentList.contains(studentIdList.get(i))) {
                tempStudentList.add(studentIdList.get(i));
            }
        }
        List<List<EvaluationTopic>> lsData = new ArrayList<List<EvaluationTopic>>();

        for (int i = 0; i < tempStudentList.size(); i++) {
            List<EvaluationTopic> evaluationTopicInfo = new ArrayList<EvaluationTopic>();
            for (int j = 0; j < data.size(); j++) {
                if (tempStudentList.get(i) == data.get(j).getEtID()) {
                    evaluationTopicInfo.add(data.get(j));
                }
            }
            lsData.add(evaluationTopicInfo);
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("studentListYear", lsData);
        System.out.println("-------------------------------------" + map);
        return map;
    }
}
