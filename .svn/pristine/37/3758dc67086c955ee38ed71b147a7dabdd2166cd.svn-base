package com.bdqn.tcmp.aipface;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.stream.FileImageInputStream;

import org.json.JSONObject;
import com.baidu.aip.face.AipFace;

public class GetSimilarity {

	public static final String APP_ID = "11134237";
	public static final String API_KEY = "TwGVQK5TGGO4dbT5odWvg3eu";
	public static final String SECRET_KEY = "rZTmzlyshItME2OnNsSz2N2XT7P3MyN5";
	private String imagePath = "";
	private String groupId = "";
	private String contrastNum = "";

	/**
	 * @param imagePath
	 *            图片地址
	 * @param groupId
	 *            对比分组ID
	 * @param contrastNum
	 *            对比分组个数
	 */
	public GetSimilarity(String imagePath, String groupId, String contrastNum) {
		super();
		this.imagePath = imagePath;
		this.groupId = groupId;
		this.contrastNum = contrastNum;
	}

	/**
	 * 人脸识别 返回匹配相似度
	 * 
	 * @return
	 */
	public JSONObject getSimilarity() {
		AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);
		// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		options.put("ext_fields", "faceliveness");
		options.put("user_top_num", this.contrastNum);
		String groupId = this.groupId;
		// 参数为本地图片路径
		String image = imagePath;
		JSONObject res = client.identifyUser(groupId, image, options);
		// 参数为本地图片二进制数组
		byte[] file = readImageFile(image);
		res = client.identifyUser(groupId, file, options);

		return res;
	}

	

	/**
	 * 读取图片并返回byte[]数组
	 * 
	 * @param image
	 * @return
	 */
	private byte[] readImageFile(String image) {
		byte[] data = null;
		FileImageInputStream input = null;
		try {
			input = new FileImageInputStream(new File(image));
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			int numBytesRead = 0;
			while ((numBytesRead = input.read(buf)) != -1) {
				output.write(buf, 0, numBytesRead);
			}
			data = output.toByteArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}
