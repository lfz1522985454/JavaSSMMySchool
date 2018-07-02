package com.bdqn.tcmp.aipface;

import org.json.JSONObject;

import com.bdqn.tcmp.base64.Base64Image;

public class GetSimilarity_Base64 {

	private String base64;
	private String groupName;
	private int returnCount = 1;
	private String path;

	public GetSimilarity_Base64(String base64, String groupName, int returnCount, String path) {
		this.base64 = base64;
		this.groupName = groupName;
		this.returnCount = returnCount;
		this.path = path;

	}

	public JSONObject getSimlarity() {
		JSONObject jsonDate = null;
		if (Base64Image.GenerateImage(this.base64, this.path)) {
			GetSimilarity sim = new GetSimilarity(this.path, this.groupName, this.returnCount + "");

			jsonDate = sim.getSimilarity();
		} else {
			jsonDate = null;
		}
		return jsonDate;
	}
	

}
