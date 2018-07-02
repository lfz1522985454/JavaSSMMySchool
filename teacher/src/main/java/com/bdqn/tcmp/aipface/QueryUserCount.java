package com.bdqn.tcmp.aipface;

import com.baidu.aip.face.AipFace;
import org.json.JSONObject;

import java.util.HashMap;

public class QueryUserCount {
	public static final String APP_ID = "11134237";
	public static final String API_KEY = "TwGVQK5TGGO4dbT5odWvg3eu";
	public static final String SECRET_KEY = "rZTmzlyshItME2OnNsSz2N2XT7P3MyN5";
	private String uid;
	private String groupId;

	public QueryUserCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QueryUserCount(String uid, String groupId) {
		super();
		this.uid = uid;
		this.groupId = groupId;
	}

	public JSONObject sample() {
		// �����ѡ�������ýӿ�
		AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);
		HashMap<String, String> options = new HashMap<String, String>();
		options.put("group_id", this.groupId);
		String uid = this.uid;
		// �û���Ϣ��ѯ
		JSONObject res = client.getUser(uid, options);
		return res;
	}

}
