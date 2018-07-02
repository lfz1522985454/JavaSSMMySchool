package com.bdqn.tcmp.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.CustromjlDTO;
import com.bdqn.tcmp.entity.ClassScore;
import com.bdqn.tcmp.entity.Custromjl;
import com.bdqn.tcmp.service.CustromjlService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/custromjl")
public class CustromjlController {
    @Resource
    private CustromjlService custromjlService;
    /**
     *
     * @param classId
     * @param questionId
     * @return
     */
    @RequestMapping("/getCustormjlListByClassId.do")
    @ResponseBody
    public List<Custromjl> getCustormjlListByClassId(Integer classId,Integer questionId){
        System.out.println("截收到的参数为：-------------------"+classId);
        System.out.println("截收到的参数为：---------------------"+questionId);
        List<Custromjl> list= this.custromjlService.getCustromjlListByClassId(classId,questionId);
        for(Custromjl obj:list){
            System.out.println("*********"+obj.getScore());
        }
        return  list;
    }
    //    {
//        name: 'TCMP058',
//                data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]
//    }
    @RequestMapping("/selectCustromjldto.do")
    @ResponseBody
    public List<ClassScore> selectCustromjldto(CustromjlDTO dto) {
        Map<String, Object> maps = new HashMap<String, Object>();

        Map<String, List<Double>> map = new HashMap<String, List<Double>>();//自己拼的数据
        List<ClassScore> selectScore = new ArrayList<ClassScore>();
        List<Custromjl> data = this.custromjlService.selectCustromjldto(dto);//data
        List<Integer> classIdist = new ArrayList<Integer>();//存放所有的班级id
        for (int i = 0; i < data.size(); i++) {
            classIdist.add(data.get(i).getClassId());
        }
        List<Integer> tempClassIdList = new ArrayList<Integer>();//不重复的classid
        for (int i = 0; i < classIdist.size(); i++) {
            if (!tempClassIdList.contains(classIdist.get(i))) {
                tempClassIdList.add(classIdist.get(i));
            }
        }

        List<List<Custromjl>> lsData = new ArrayList<List<Custromjl>>();//临时存放的list

        for (int i = 0; i < tempClassIdList.size(); i++) {
            List<Custromjl> asdf = new ArrayList<Custromjl>();
            for (int j = 0; j < data.size(); j++) {
                if (tempClassIdList.get(i) == data.get(j).getClassId()) {
                    asdf.add(data.get(j));
                }
            }
            lsData.add(asdf);
        }
        ClassScore classScore = null;
//        List<Double> classAvgs = new ArrayList<Double>();
        for (int i = 0; i < lsData.size(); i++) {
            classScore = new ClassScore();
            List<Double> classAvgs = new ArrayList<Double>();
            String className = "";
            for (int k = 1; k <= 12; k++) {
                boolean iscunzai = false;
                for (int j = 0; j < lsData.get(i).size(); j++) {
                    if (k == lsData.get(i).get(j).getMonth()) {
                        classAvgs.add(lsData.get(i).get(j).getAvg());
                        className = lsData.get(i).get(j).getClassName();
                        iscunzai = true;
                    }
                }
                if (!iscunzai) {
                    classAvgs.add(0.0);
                }
            }
            map.put(className, classAvgs);
            classScore.setName(className);
            classScore.setData(classAvgs);
            selectScore.add(classScore);
        }
        System.out.println(JSON.toJSON(selectScore));
        return selectScore;
    }

    /**
     * @param dto 这是班级的考试成绩分页
     * @return
     */
    @RequestMapping("/selectCustromjlPage.do")
    @ResponseBody
    public Map<String, Object> selectCustromjlPage(CustromjlDTO dto) {
        System.out.println("这是行数" + dto.getRowCount());
        System.out.println("selectCustromjlPage");
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(2);
        dto.setRowCount(this.custromjlService.selectCustromjlCount(dto));
        map.put("page", dto);
        System.out.println("page");
        System.out.println(JSON.toJSON(this.custromjlService.selectCustromjlPage(dto)));
        map.put("custoromjlAndStudentList", this.custromjlService.selectCustromjlPage(dto));
        System.out.println(JSON.toJSON(map));
        return map;
    }

    /**
     * @param dto 这是学生的考试成绩分页
     * @return
     */
    @RequestMapping("/selectStudentCustromjlPage.do")
    @ResponseBody
    public Map<String, Object> selectStudentCustromjlPage(CustromjlDTO dto) {
        System.out.println("time" + dto.getEndTime());
        System.out.println("time" + dto.getBeginTime());
        System.out.println("这是行数" + dto.getRowCount());
        System.out.println("学生查询页面");
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(2);
        dto.setRowCount(this.custromjlService.selectStudentCustromjldtoCount(dto));
        map.put("page", dto);
        System.out.println(JSON.toJSON(this.custromjlService.selectStudentCustromjlPage(dto)));
        map.put("custoromjlAndStudentList", this.custromjlService.selectStudentCustromjlPage(dto));
        System.out.println(JSON.toJSON(map));
        return map;
    }

    @RequestMapping("/selectStudentCustromjldto.do")
    @ResponseBody
    public List<ClassScore> selectStudentCustromjldto(CustromjlDTO dto) {
        Map<String, Object> maps = new HashMap<String, Object>();

        Map<String, List<Double>> map = new HashMap<String, List<Double>>();//自己拼的数据
        List<ClassScore> selectScore = new ArrayList<ClassScore>();
        List<Custromjl> data = this.custromjlService.selectStudentCustromjldto(dto);//data
        List<Integer> classIdist = new ArrayList<Integer>();//存放所有的班级id
        for (int i = 0; i < data.size(); i++) {
            classIdist.add(data.get(i).getStudentId());
        }
        List<Integer> tempClassIdList = new ArrayList<Integer>();//不重复的classid
        for (int i = 0; i < classIdist.size(); i++) {
            if (!tempClassIdList.contains(classIdist.get(i))) {
                tempClassIdList.add(classIdist.get(i));
            }
        }

        List<List<Custromjl>> lsData = new ArrayList<List<Custromjl>>();//临时存放的list

        for (int i = 0; i < tempClassIdList.size(); i++) {
            List<Custromjl> asdf = new ArrayList<Custromjl>();
            for (int j = 0; j < data.size(); j++) {
                if (tempClassIdList.get(i) == data.get(j).getStudentId()) {
                    asdf.add(data.get(j));
                }
            }
            lsData.add(asdf);
        }
        ClassScore classScore = null;
        for (int i = 0; i < lsData.size(); i++) {
            classScore = new ClassScore();
            List<Double> classAvgs = new ArrayList<Double>();
            String className = "";
            for (int k = 1; k <= 12; k++) {
                boolean iscunzai = false;
                for (int j = 0; j < lsData.get(i).size(); j++) {
                    if (k == lsData.get(i).get(j).getMonth()) {
                        classAvgs.add(lsData.get(i).get(j).getAvg());
                        className = lsData.get(i).get(j).getStudentName();
                        iscunzai = true;
                    }
                }
                if (!iscunzai) {
                    classAvgs.add(0.0);
                }
            }
            map.put(className, classAvgs);
            classScore.setName(className);
            classScore.setData(classAvgs);
            selectScore.add(classScore);
        }
        System.out.println(JSON.toJSON(selectScore));
        return selectScore;
    }

    /**
     * @param dto 这个是
     * @return
     */
    @RequestMapping("/selectClassExcel.do")
    @ResponseBody
    public List<Custromjl> selectClassExcel(CustromjlDTO dto) {
        return this.custromjlService.selectClassExcel(dto);
    }

    @ResponseBody
    @RequestMapping("selectQuestById.do")
    public List<Custromjl> selectQuestById(CustromjlDTO dto) {
        return this.custromjlService.selectQuestById(dto);
    }

    @ResponseBody
    @RequestMapping("/insertCustromjl.do")
    public boolean insertCustromjl(Custromjl custromjl) {
        boolean flag = false;
        Custromjl data = JSON.parseObject(custromjl.getJsonString(), Custromjl.class);
        System.out.println("--------------------------------");
        System.out.println(JSON.toJSON(data));
        List<Custromjl> list = new ArrayList<Custromjl>();
        List<String> StudentIdArr = data.getStudentIdArr();
        List<String> examScore = data.getExamScoreArr();
        int customId = data.getCustomId();
        Custromjl cust = null;
        for (int i = 0; i < StudentIdArr.size(); i++) {
            cust = new Custromjl();
            cust.setStudentId(Integer.parseInt(StudentIdArr.get(i)));
            cust.setCustomId(customId);
            cust.setScore(Integer.parseInt(examScore.get(i)));
            list.add(cust);
        }
        for (Custromjl cu : list) {
            System.out.println("--------------这是获取的cu-----------------");
            System.out.println("getStudentId" + cu.getStudentId());
            System.out.println("getScore" + cu.getScore());
            System.out.println("getCustomId" + cu.getCustomId());
            flag = this.custromjlService.insertCustromjl(cu);
            System.out.println(flag);
        }
        System.out.println("-------------------------------");
        return flag;
    }
    @ResponseBody
    @RequestMapping("/selectDayList.do")
    public Map<String,Object>selectDayList(CustromjlDTO dto) {
        List<Custromjl> data = this.custromjlService.selectDayList(dto);
        //data

        /*拿到所有得ID*/
        List<Integer> studentIdList = new ArrayList<Integer>();
        for (int i = 0; i < data.size(); i++) {
            studentIdList.add(data.get(i).getStudentId());
        }
        /*去除重复的ID*/
        List<Integer> tempStudentList = new ArrayList<Integer>();
        for (int i = 0; i < studentIdList.size(); i++) {
            if (!tempStudentList.contains(studentIdList.get(i))) {
                tempStudentList.add(studentIdList.get(i));
            }
        }
        List<List<Custromjl>> lsData = new ArrayList<List<Custromjl>>();
        for (int i = 0; i < tempStudentList.size(); i++) {
            List<Custromjl> asdf = new ArrayList<Custromjl>();
            for (int j = 0; j < data.size(); j++) {
                if (tempStudentList.get(i) == data.get(j).getStudentId()) {
                    asdf.add(data.get(j));
                }
            }
            lsData.add(asdf);

        }


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("studentListWeek", lsData);
        System.out.println("-------------------------------------" + map);
        return map;
    }
}

