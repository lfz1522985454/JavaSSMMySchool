package com.bdqn.tcmp.entity;

public class QuestionDetail {
	private int detailId;
	private int questionId;
	private int skillId;
	private int topicId;
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public QuestionDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionDetail(int detailId, int questionId, int skillId, int topicId) {
		super();
		this.detailId = detailId;
		this.questionId = questionId;
		this.skillId = skillId;
		this.topicId = topicId;
	}

	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}


	public String toString() {
		return "QuestionDetail [detailId=" + detailId + ", questionId=" + questionId + ", skillId=" + skillId
				+ ", topicId=" + topicId + "]";
	}

}
