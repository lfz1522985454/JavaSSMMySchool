package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.QPaperDTO;
import com.bdqn.tcmp.entity.QuestionPaper;
import com.bdqn.tcmp.mapper.QPaperMapper;
import com.bdqn.tcmp.service.QPaperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("QPaperService")
public class QPaperServiceImpl implements QPaperService{
	@Resource
	private QPaperMapper qpMapper;

	public int selectQPaperCount(QPaperDTO dto) {
		
		return this.qpMapper.selectQPaperCount(dto);
	}

	public QuestionPaper selectQuestionPaperById(Integer questionId) {
		return this.qpMapper.selectQuestionPaperById(questionId);
	}


	public List<QuestionPaper> selectQPaperByPage(QPaperDTO dto) {
		
		return this.qpMapper.selectQPaperByPage(dto);
	}


	public boolean deleteQPaper(Integer paperId) {
		
		return this.qpMapper.deleteQPaper(paperId)>0?true:false;
	}


	public Integer insertQpaper(QuestionPaper questionPaper) {
		return this.qpMapper.insertQpaper(questionPaper);
	}


	public List<QuestionPaper> selectQPaperDropdown() {
		// TODO Auto-generated method stub
		return this.qpMapper.selectQPaperDropdown();
	}

	/**
	 *
	 * @param classId  要查询的班级编号
	 *                 		依据班级编号，去测试表中查询出试卷编号
	 *                 		然后依据试卷编号去试卷表中查询出试卷名称
	 *                  用来给下拉菜单绑定数据源
	 * @return
	 */
	public List<QuestionPaper> selectQuestionListByClassId(Integer classId) {
		return this.qpMapper.selectQuestionListByClassId(classId);
	}

	public boolean updateQuestion(QuestionPaper questionPaper) {
		return this.qpMapper.updateQuestion(questionPaper)>0?true:false;
	}


}
