package com.bdqn.tcmp.weixin.controller;

import com.bdqn.tcmp.weixin.pojo.ApproveParam;
import com.bdqn.tcmp.weixin.pojo.SNSUserInfo;
import com.bdqn.tcmp.weixin.pojo.WeixinOauth2Token;
import com.bdqn.tcmp.weixin.util.AdvancedUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("approve")
public class ApproveController {
    /*
    * 处理流程：
    * 1、点击认证加入，直接发送请求到微信服务器
    * 2、获取用户头像信息后显示选择用户的身份
    * 3、点击【同意并授权】后，连接服务器提交输入的请求到服务器
    * 4、服务器处理完成显示提交成功页面
    * */

    //连接地址：https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8d78f6a19ea11814&redirect_uri=http%3a%2f%2fwww.dstc188.cn%2fweixin%2fOAuthServlet&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect
    //
    @RequestMapping("rollback.do")
    public String rollBack(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        // 用户同意授权后，能获取到code
        String code = request.getParameter("code");
        String state = request.getParameter("state");

        // 用户同意授权
        if (!"authdeny".equals(code)) {
            // 获取网页授权access_token
            WeixinOauth2Token weixinOauth2Token = AdvancedUtil.getOauth2AccessToken("wx8d78f6a19ea11814", "643b40d1a32d600e46d6efc152bde28a", code);
            // 网页授权接口访问凭证
            String accessToken = weixinOauth2Token.getAccessToken();
            // 用户标识
            String openId = weixinOauth2Token.getOpenId();
            // 获取用户信息
            SNSUserInfo snsUserInfo = AdvancedUtil.getSNSUserInfo(accessToken, openId);

            // 设置要传递的参数
            request.setAttribute("user", snsUserInfo);
            //request.setAttribute("state", state);
        }
        // 跳转到提交审核成功页面
        return "weixin/check";
       // request.getRequestDispatcher("").forward(request, response);
    }

    @RequestMapping("edit.do")
    public String updateOpenID(ApproveParam param){

        return "";
    }

}
