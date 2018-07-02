package com.bdqn.tcmp.entity;

public class Skill {
	private Integer skillId;
	private String skillName;
	private Integer fatherId;
	private Integer isEnabled;

	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Integer getFatherId() {
		return fatherId;
	}

	public void setFatherId(Integer fatherId) {
		this.fatherId = fatherId;
	}

	public Integer getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Integer isEnabled) {
		this.isEnabled = isEnabled;
	}


	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName
				+ ", fatherId=" + fatherId + ", isEnabled=" + isEnabled + "]";
	}

	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skill(Integer skillId, String skillName, Integer fatherId,
			Integer isEnabled) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.fatherId = fatherId;
		this.isEnabled = isEnabled;
	}

}
