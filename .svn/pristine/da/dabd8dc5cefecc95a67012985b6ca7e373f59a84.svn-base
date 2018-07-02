package com.bdqn.tcmp.program;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ControllerExternalProgram {

	/**
	 * 打开当前项目目录下的winfrom程序
	 */
	public void openC() {
		List<String> commands = new ArrayList<String>();
		String aaa = System.getProperty("user.dir");
		System.out.println(aaa);
		String bbb = aaa.replace("\\", "/");
		commands.add("" + bbb + "/static/app/bin/Debug/app.exe");

		try {
			new ProcessBuilder(commands).start();// 打开
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 关闭当前项目目录下的winfrom程序
	 */
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
}
