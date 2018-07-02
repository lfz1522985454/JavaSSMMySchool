package com.bdqn.tcmp.service;

import com.bdqn.tcmp.dto.QPaperDTO;
import com.bdqn.tcmp.entity.QuestionPaper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface QPaperService {


	/**
	 * 返回总行
	 * @return
	 */
	int selectQPaperCount(QPaperDTO dto);

	/**
	 * 根据主键查询试卷信息
	 * @param questionId
	 * @return
	 */
	QuestionPaper selectQuestionPaperById(@Param("questionId") Integer questionId);
	/**
	 * 分页查询
	 * @return
	 */
	List<QuestionPaper> selectQPaperByPage(QPaperDTO dto);

	/**
	 * 根据主键删除测试
	 * @return
	 */
	boolean deleteQPaper(@Param("paperId") Integer paperId);


	/**
	 * 添加试卷
	 * @return
	 */
	Integer insertQpaper(QuestionPaper questionPaper);

	/**
	 * 动态绑定添加试题的下拉框
	 */
	List<QuestionPaper> selectQPaperDropdown();

	/**
	 * 依据班级编号查询试卷名称
	 * @param classId  要查询的班级编号
	 *                 		依据班级编号，去测试表中查询出试卷编号
	 *                 		然后依据试卷编号去试卷表中查询出试卷名称
	 *                  用来给下拉菜单绑定数据源
	 *
	 * @return
	 */
	List<QuestionPaper> selectQuestionListByClassId(@Param("classId") Integer classId);

	/**
	 * 修改试卷信息
	 * @param questionPaper
	 * @return
	 */
	boolean updateQuestion(QuestionPaper questionPaper);
}
