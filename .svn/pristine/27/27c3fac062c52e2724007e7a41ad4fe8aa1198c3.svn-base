package com.bdqn.tcmp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RunTimeInterceptor extends HandlerInterceptorAdapter {
	private NamedThreadLocal<Long> threadLocal = new NamedThreadLocal<Long>(
			"StopWatch-StartTime");


	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Long beginTime = System.currentTimeMillis();// �?始时�?
		System.out.println("===========【开始时间】=========================" + beginTime);
		threadLocal.set(beginTime);
		return true;
	}


	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		Long endTime = System.currentTimeMillis();// 结束时间
		Long beginTime = threadLocal.get();// �?始时�?
		Long consumeTime = endTime - beginTime;// 时间�?
		System.out
				.println("===========【消耗时间】=========================" + consumeTime);
	}

}
