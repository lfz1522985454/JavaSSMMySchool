package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.entity.Topic;
import com.bdqn.tcmp.service.TopicService;
import com.bdqn.tcmp.util.FileUploadUtil;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/topic")
public class TopicController {

	@Resource
	private TopicService topicService = null;

	@RequestMapping("selectAll")
	@ResponseBody
	public List<Topic> selectAll() {
		return topicService.selectTopicAll();
	}

	/**
	 * 单文件上传为实体类中的topicImg赋值，返回到前台再对数据库进行增加
	 *
	 * @return
	 */
	@RequestMapping("setTopicImg.do")
	@ResponseBody
	public String setTopicImg(HttpSession session, HttpServletRequest request,
							  @RequestParam(value = "topicImg", required = false) MultipartFile attach) {
		System.out.println(attach);
		String uid = null;
		if (!attach.isEmpty()) {

			String path = request.getSession().getServletContext().getRealPath(File.separator + "upload");
			System.out.println("上传路径为：" + path);
			String oldFileName = attach.getOriginalFilename();
			String prefix = FilenameUtils.getExtension(oldFileName);
			List<String> list = Arrays.asList("jpg", "png", "gif", "bmp");
			if (list.contains(prefix.toLowerCase())) {
				// UUID.randomUUID().toString()
				// 是javaJDK提供的一个自动生成主键的方法。UUID(Universally Unique Identifier)
				// 全局唯一标识符,是指在一台机器上生成的数字，它保证对在同一时空中的所有机器都是唯一的，是由一个十六位的数字组成,
				// 表现出来的形式。由以下几部分的组合：当前日期和时间(UUID的第一个部分与时间有关，如果你在生成一个UUID之后，过几秒又生成一个UUID，
				// 则第一个部分不同，其余相同)，时钟序列，全局唯一的IEEE机器识别号（如果有网卡，从网卡获得，没有网卡以其他方式获得），
				// UUID的唯一缺陷在于生成的结果串会比较长。
				uid = UUID.randomUUID() + "." + prefix;
				System.out.println("要获取的文件名:" + uid);
				File targetFile = new File(path, uid);
				System.out.println("targetFile:" + targetFile);
				if (!targetFile.exists()) {
					targetFile.mkdir();
				}

				try {
					attach.transferTo(targetFile);
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("保存成功");
			}
		}
		System.out.println("保存的图片名:" + uid);
		return uid;
	}

	@RequestMapping("insertTopic.do")
	@ResponseBody
	public String insertTopic(Topic topic,HttpSession session,MultipartFile topicImgFile) {
//		System.out.println("进入添加题目");
//		System.out.println("图片名称:" + topic.getTopicImg());
//		boolean flag = false;
//		try {
//			flag = this.topicService.insertTopic(topic);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String result = "false";
		if(topicImgFile != null){
			String fileName = FileUploadUtil.fileUpload(topicImgFile, session);
			System.out.println(fileName);
			if(fileName == null || fileName.equals("图片上传失败")){
				return "false";
			}
			topic.setTopicImg(fileName);
		}
		Boolean isOk = topicService.insertTopic(topic);
		if(isOk == true){
			result = "true";
		}
		return result;

	}


	@ResponseBody
	@RequestMapping("/insertTopicBoarding.do")
	public String insertTopicBoarding(Topic topic, HttpSession session,
							MultipartFile modelAnswerFile, MultipartFile topicImgFile) {
		String result = "false";
		if(topicImgFile != null){
			String fileName = FileUploadUtil.fileUpload(topicImgFile, session);
			String modelAnswerName=FileUploadUtil.fileUpload(modelAnswerFile,session);
			if(fileName == null || fileName.equals("图片上传失败")||modelAnswerFile== null || modelAnswerFile.equals("图片上传失败")){
				return "false";
			}
			topic.setTopicImg(fileName);
		}
		Boolean isOk = topicService.insertTopic(topic);
		if(isOk == true){
			result = "true";
		}
		return result;
	}

	@RequestMapping("selectByskillId")
	@ResponseBody
	public List<Topic> selectTopicWhereSkilId(Integer skillId,Integer opicTypeId) {
		return topicService.selectTopicWhereSkillId(skillId,opicTypeId);
	}

}
