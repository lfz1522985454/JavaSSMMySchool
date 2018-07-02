package test;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.junit.Test;

import com.bdqn.tcmp.entity.Customtest;
import com.bdqn.tcmp.entity.Topic;
import com.bdqn.tcmp.service.CustomtestService;
import com.bdqn.tcmp.service.StudentService;
import com.bdqn.tcmp.service.TopicService;
import com.bdqn.tcmp.service.impl.CustomtestServiceImpl;
import com.bdqn.tcmp.service.impl.StudentServiceImpl;
import com.bdqn.tcmp.service.impl.TopicServiceImpl;

public class testZD {
	/**
	 * 打开当前项目目录下的winfrom程序
	 */
	@Test
	public void openC() {
		List<String> commands = new ArrayList<String>();
		String aaa = System.getProperty("user.dir");
		System.out.println(aaa);
		String bbb = aaa.replace("\\", "/");
		commands.add("" + bbb + "/static/app/bin/Debug/app.exe");

		try {
			new ProcessBuilder(commands).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 关闭当前项目目录下的winfrom程序
	 */
	@Test
	public void closeC() {
		Runtime rt = Runtime.getRuntime();
		String[] command1 = new String[] { "cmd", "cd", "C://Program Files//Thunder" };
		String command = "taskkill /F /IM app.exe";
		try {
			rt.exec(command1);// 返回一个进程
			rt.exec(command);
			System.out.println("success closed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testAAA() {
		String aaa = System.getProperty("user.dir");
		System.out.println(aaa);
	}
	@Test
	public void AAA() {
		TopicService se = new TopicServiceImpl();
		List<Topic> list = se.selectTopicAll();
		for (Topic customtest : list) {
			System.out.println(customtest.toString());
		}

	}

	

}
