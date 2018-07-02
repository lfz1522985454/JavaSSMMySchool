package com.bdqn.tcmp.controller;



import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.QPaperDTO;
import com.bdqn.tcmp.entity.QuestionPaper;
import com.bdqn.tcmp.service.QPaperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/questionPaper")
public class QPaperController {

	@Resource
	private QPaperService questionPaperService = null;
	@RequestMapping("/questionPaperPage.do")
	@ResponseBody
	public Map<String, Object> selectQuestionPaperByPageTest(QPaperDTO dto) {
		System.out.println("===============进入查询全部============");
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
//		dto.setPageIndex(1);
		dto.setRowCount(questionPaperService.selectQPaperCount(dto));
		System.out.println(dto.getRowCount());
		map.put("page", dto);
		map.put("questionList", questionPaperService.selectQPaperByPage(dto));
		System.out.println(map);
		System.out.println("试卷信息:"+JSON.toJSONString(map));
		return map;
	}

	@RequestMapping("/questionPaperDEL.do")
	@ResponseBody
	public boolean selectQuestionPaperDEL(int paperId){
		System.out.println("===============进入删除测试============");
		System.out.println("删除Id:"+paperId);
		boolean flag=false;
		try {
			flag=questionPaperService.deleteQPaper(paperId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/selectQPaperDropdown.do")
	@ResponseBody
	public Map<String, Object> selectQuestionPaperIdAndName(){
		System.out.println("===============进入查询试卷编号和名称============");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("QPaperDropdownList", questionPaperService.selectQPaperDropdown());
		System.out.println("试卷信息:"+JSON.toJSONString(map));
		return map;
	}

	@RequestMapping("/insertQuestionPaper.do")
	@ResponseBody
	public Integer insertQuestionPaperTest(QuestionPaper questionPaper) {
		System.out.println("进入添加试卷");
		System.out.println(questionPaper.toString());
		questionPaperService.insertQpaper(questionPaper);
		return questionPaper.getQuestionId();
	}

	/**
	 * 依据班级编号查询试卷名称
	 * @param classId  要查询的班级编号
	 *                 		依据班级编号，去测试表中查询出试卷编号
	 *                 		然后依据试卷编号去试卷表中查询出试卷名称
	 *                  用来给下拉菜单绑定数据源
	 *           控制器的具体实现
	 * @return
	 */
	@RequestMapping("/getQuestionPaperNameByClassId.do")
	@ResponseBody
	public List<QuestionPaper> getQuestionPaperNameByClassId(Integer classId){
		return this.questionPaperService.selectQuestionListByClassId(classId);
	}


	@RequestMapping("/selQuestionById.do")
	@ResponseBody
	public QuestionPaper selQuestionById(Integer questionId){
		System.out.println(questionId);
		return this.questionPaperService.selectQuestionPaperById(questionId);
	}

	@RequestMapping("/updateQuestionById.do")
	@ResponseBody
	public boolean updateQuestionById(QuestionPaper questionPaper){

		return this.questionPaperService.updateQuestion(questionPaper);
	}
}
