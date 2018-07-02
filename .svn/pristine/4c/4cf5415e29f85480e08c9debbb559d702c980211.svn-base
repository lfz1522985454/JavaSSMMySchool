package com.bdqn.tcmp.aipface;

import org.json.JSONObject;

import com.bdqn.tcmp.base64.Base64Image;

public class SetSimilarity_Base64 {
	// 需要一个Base64位图片地址
	// 需要一个分组
	// 需要一个返回个数 默认是：1
	private String base64;

	private String uid = "";
	private String userInfo = "";
	private String groupId = "";
	private String imagePath = "";

	public SetSimilarity_Base64() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SetSimilarity_Base64(String base64, String uid, String userInfo, String groupId, String imagePath) {
		super();
		this.base64 = base64;
		this.uid = uid;
		this.userInfo = userInfo;
		this.groupId = groupId;
		this.imagePath = imagePath;
	}

	public JSONObject setSimlarity() {
		JSONObject jsonDate = null;
		// GenerateImage(strImg1, "D:\\exam.jpg");
		if (Base64Image.GenerateImage(this.base64, this.imagePath)) {
			SetSimilarity sim = new SetSimilarity(uid, userInfo, groupId, imagePath);
			jsonDate = sim.setSample();
		} else {
			jsonDate = null;
		}
		return jsonDate;
	}

}
