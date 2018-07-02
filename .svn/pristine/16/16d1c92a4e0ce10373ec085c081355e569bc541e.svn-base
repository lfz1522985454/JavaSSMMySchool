package com.bdqn.tcmp.weixin.util;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.weixin.pojo.TemplateMsg;
import com.bdqn.tcmp.weixin.pojo.TemplateMsgResult;
import com.bdqn.tcmp.weixin.pojo.WechatTemplateMsg;
import com.bdqn.tcmp.weixin.thread.TokenThread;

import java.util.TreeMap;

public class SendUtil {
    public static int sendTemplateMsg(TemplateMsg msg) {
        int count=0;
        // String[] array ={"oJDF71eUzke7vcBO_MvuXIxyyfDM","oJDF71emHQAsgnXAqj1ffBpZa3S8","oJDF71Q6FKBIwlD8MrcMAiEiW1uE","oJDF71e7tnbtfu6Ee48XPJEUI0jg","oJDF71eVC9ZJp0aVlkaF4z7dn9u0","oJDF71ZTQ6mG0fnhK9ip42cKpQ9Y"};
        TemplateMsgResult templateMsgResult = null;
        try {
            if (msg.getToUsers() != null && msg.getToUsers().size() > 0) {
                for (int i = 0; i < msg.getToUsers().size(); i++) {
                    TreeMap<String, TreeMap<String, String>> params = new TreeMap<String, TreeMap<String, String>>();
                    // 根据具体模板参数组装
                    params.put("first", WechatTemplateMsg.item(msg.getTitle()));
                    if(msg.getKeyword1()!=null&&msg.getKeyword1().getValue().length()>0){
                        params.put("keyword1", WechatTemplateMsg.item(msg.getKeyword1()));
                    }
                    if(msg.getKeyword2()!=null&&msg.getKeyword2().getValue().length()>0){
                        params.put("keyword2", WechatTemplateMsg.item(msg.getKeyword2()));
                    }
                    if(msg.getKeyword3()!=null&&msg.getKeyword3().getValue().length()>0){
                        params.put("keyword3", WechatTemplateMsg.item(msg.getKeyword3()));
                    }
                    if(msg.getKeyword4()!=null&&msg.getKeyword4().getValue().length()>0){
                        params.put("keyword4", WechatTemplateMsg.item(msg.getKeyword4()));
                    }
                    if(msg.getKeyword5()!=null&&msg.getKeyword5().getValue().length()>0){
                        params.put("keyword5", WechatTemplateMsg.item(msg.getKeyword5()));
                    }
                    if(msg.getKeyword6()!=null&&msg.getKeyword6().getValue().length()>0){
                        params.put("keyword6", WechatTemplateMsg.item(msg.getKeyword6()));
                    }
                    if(msg.getKeyword7()!=null&&msg.getKeyword7().getValue().length()>0){
                        params.put("keyword7", WechatTemplateMsg.item(msg.getKeyword7()));
                    }
                    if(msg.getKeyword8()!=null&&msg.getKeyword8().getValue().length()>0){
                        params.put("keyword8", WechatTemplateMsg.item(msg.getKeyword8()));
                    }
                    if(msg.getKeyword9()!=null&&msg.getKeyword9().getValue().length()>0){
                        params.put("keyword9", WechatTemplateMsg.item(msg.getKeyword9()));
                    }
                    if(msg.getRemark()!=null&&msg.getRemark().getValue().length()>0) {
                        params.put("remark", WechatTemplateMsg.item(msg.getRemark()));
                    }
                    WechatTemplateMsg wechatTemplateMsg = new WechatTemplateMsg();
                    wechatTemplateMsg.setTemplate_id(msg.getTemplateId());
                    wechatTemplateMsg.setTouser(msg.getToUsers().get(i));
                    wechatTemplateMsg.setUrl(msg.getToUrl());
                    wechatTemplateMsg.setData(params);
                    TreeMap<String, String> paramsAdmin = new TreeMap<String, String>();
                    paramsAdmin.put("access_token", TokenThread.accessToken.getAccessToken());
                    String result = HttpReqUtil.HttpsDefaultExecute("POST", "https://api.weixin.qq.com/cgi-bin/message/template/send",
                            paramsAdmin, JSON.toJSONString(wechatTemplateMsg), null);
                    templateMsgResult = JSON.parseObject(result, TemplateMsgResult.class);

                    if (templateMsgResult.getErrcode() == 0) {
                        count++;
                    }
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return count;
    }
}
