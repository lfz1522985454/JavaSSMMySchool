package com.bdqn.tcmp.weixin.controller;

import com.bdqn.tcmp.weixin.common.StaticValue;
import com.bdqn.tcmp.weixin.thread.TokenThread;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Controller;
@Controller
public class InitController implements  ApplicationListener<ContextRefreshedEvent> {
    private static Logger log = Logger.getLogger(TokenThread.class);


    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        // 未配置appid、appsecret时给出提示
        if ("".equals(StaticValue.APPID) || "".equals(StaticValue.APPSECRET)) {
            log.error("appid and appsecret configuration error, please check carefully.");
        } else {
            // 启动定时获取access_token的线程
            new Thread(new TokenThread()).start();
        }
    }
}
