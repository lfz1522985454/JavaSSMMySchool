package com.bdqn.tcmp.aipface;

import com.baidu.aip.face.AipFace;
import org.json.JSONObject;

import java.util.HashMap;

public class SetSimilarity {
	public static final String APP_ID = "11134237";
	public static final String API_KEY = "TwGVQK5TGGO4dbT5odWvg3eu";
	public static final String SECRET_KEY = "rZTmzlyshItME2OnNsSz2N2XT7P3MyN5";
	private String uid = "";
	private String userInfo = "";
	private String groupId = "";
	private String imagePath = "";

	public SetSimilarity(String uid, String userInfo, String groupId, String imagePath) {
		this.uid = uid;
		this.userInfo = userInfo;
		this.groupId = groupId;
		this.imagePath = imagePath;
	}

	public SetSimilarity() {
	}

	public JSONObject setSample() {
		// 传入可选参数调用接口
		AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);
		HashMap<String, String> options = new HashMap<String, String>();
		options.put("action_type", "replace");
		JSONObject res = client.addUser(this.uid, this.userInfo, this.groupId, this.imagePath, options);
		return res;
	}

}
