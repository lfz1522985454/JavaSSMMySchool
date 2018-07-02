package com.bdqn.tcmp.entity;

import java.io.Serializable;
import java.util.Date;

public class Questiondetail implements Serializable {
	private Integer detailId;
	private Integer questionId;

	private Integer topicId;
	private Integer skillId;
	private Integer opicTypeId;
	private String topicName;
	private String topicImg;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String optionE;
	private String optionF;
	private String modelAnswer;
	private String topicAnalysis;
	private Integer topicErroCount;
	private Date createtionDate;
	private Integer createdBy;
	private Integer isEnabled;
	private Integer isStamp;
	private Integer stampBy;
	private Integer answerDate;

	public Integer getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(Integer answerDate) {
		this.answerDate = answerDate;
	}

	public Questiondetail(Integer detailId, Integer questionId, Integer topicId, Integer skillId, Integer opicTypeId,
			String topicName, String topicImg, String optionA, String optionB, String optionC, String optionD,
			String optionE, String optionF, String modelAnswer, String topicAnalysis, Integer topicErroCount,
			Date createtionDate, Integer createdBy, Integer isEnabled, Integer isStamp, Integer stampBy) {
		super();
		this.detailId = detailId;
		this.questionId = questionId;
		this.topicId = topicId;
		this.skillId = skillId;
		this.opicTypeId = opicTypeId;
		this.topicName = topicName;
		this.topicImg = topicImg;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.optionE = optionE;
		this.optionF = optionF;
		this.modelAnswer = modelAnswer;
		this.topicAnalysis = topicAnalysis;
		this.topicErroCount = topicErroCount;
		this.createtionDate = createtionDate;
		this.createdBy = createdBy;
		this.isEnabled = isEnabled;
		this.isStamp = isStamp;
		this.stampBy = stampBy;
	}

	public Questiondetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDetailId() {
		return detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public Integer getOpicTypeId() {
		return opicTypeId;
	}

	public void setOpicTypeId(Integer opicTypeId) {
		this.opicTypeId = opicTypeId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicImg() {
		return topicImg;
	}

	public void setTopicImg(String topicImg) {
		this.topicImg = topicImg;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getOptionE() {
		return optionE;
	}

	public void setOptionE(String optionE) {
		this.optionE = optionE;
	}

	public String getOptionF() {
		return optionF;
	}

	public void setOptionF(String optionF) {
		this.optionF = optionF;
	}

	public String getModelAnswer() {
		return modelAnswer;
	}

	public void setModelAnswer(String modelAnswer) {
		this.modelAnswer = modelAnswer;
	}

	public String getTopicAnalysis() {
		return topicAnalysis;
	}

	public void setTopicAnalysis(String topicAnalysis) {
		this.topicAnalysis = topicAnalysis;
	}

	public Integer getTopicErroCount() {
		return topicErroCount;
	}

	public void setTopicErroCount(Integer topicErroCount) {
		this.topicErroCount = topicErroCount;
	}

	public Date getCreatetionDate() {
		return createtionDate;
	}

	public void setCreatetionDate(Date createtionDate) {
		this.createtionDate = createtionDate;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Integer isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Integer getIsStamp() {
		return isStamp;
	}

	public void setIsStamp(Integer isStamp) {
		this.isStamp = isStamp;
	}

	public Integer getStampBy() {
		return stampBy;
	}

	public void setStampBy(Integer stampBy) {
		this.stampBy = stampBy;
	}

}
