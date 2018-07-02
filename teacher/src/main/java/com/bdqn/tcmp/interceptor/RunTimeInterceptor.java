package com.bdqn.tcmp.interceptor;

import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RunTimeInterceptor extends HandlerInterceptorAdapter {
	private NamedThreadLocal<Long> threadLocal = new NamedThreadLocal<Long>(
			"StopWatch-StartTime");


	public boolean preHandle(HttpServletRequest request,
							 HttpServletResponse response, Object handler) throws Exception {
		Long beginTime = System.currentTimeMillis();// 开始时间
		System.out.println("开始时间==================" + beginTime);
		threadLocal.set(beginTime);
		return true;
	}


	public void afterCompletion(HttpServletRequest request,
								HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		Long endTime = System.currentTimeMillis();// 结束时间
		Long beginTime = threadLocal.get();//  结束时间
		Long consumeTime = endTime - beginTime;// 耗时时间
		System.out
				.println("==============================耗时时间" + consumeTime);
	}

}



