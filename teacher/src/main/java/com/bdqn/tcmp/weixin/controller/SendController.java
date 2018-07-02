package com.bdqn.tcmp.weixin.controller;

import com.bdqn.tcmp.weixin.enums.EnumColor;
import com.bdqn.tcmp.weixin.pojo.TemplateMsg;
import com.bdqn.tcmp.weixin.pojo.ValueColor;
import com.bdqn.tcmp.weixin.util.SendUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SendController {
    //这是一个简单的测试方法
    @RequestMapping("send.do")
    public String testSend() {
        TemplateMsg msg = new TemplateMsg();
        msg.setTemplateId("x1yrkPreJJHLefUyv6totY_8HM_RZs9Uuuw8LV-GLW0");
        String[] array ={"oJDF71eUzke7vcBO_MvuXIxyyfDM","oJDF71emHQAsgnXAqj1ffBpZa3S8","oJDF71Q6FKBIwlD8MrcMAiEiW1uE","oJDF71e7tnbtfu6Ee48XPJEUI0jg","oJDF71eVC9ZJp0aVlkaF4z7dn9u0","oJDF71ZTQ6mG0fnhK9ip42cKpQ9Y"};
        List<String> users = new ArrayList<String>();
        for(int i=0;i<array.length;i++){
            users.add(array[i]);
        }
        msg.setToUsers(users);
        msg.setTitle(new ValueColor("尊敬的余海军家长，孩子考试成绩通知", EnumColor.BLACK));
        msg.setKeyword1(new ValueColor("余海军",EnumColor.RED));
        msg.setKeyword2(new ValueColor("java单元测试",EnumColor.BLACK));
        msg.setKeyword3(new ValueColor("2018-06-08",EnumColor.BLACK));
        msg.setKeyword4(new ValueColor("95分",EnumColor.RED));
        msg.setRemark(new ValueColor("好成绩离不开家长的督促和鼓励，您辛苦了！",EnumColor.BLACK));
        SendUtil.sendTemplateMsg(msg);
        return "ok";
    }

}
