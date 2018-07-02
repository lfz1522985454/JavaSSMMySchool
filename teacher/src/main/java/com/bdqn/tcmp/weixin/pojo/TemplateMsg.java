package com.bdqn.tcmp.weixin.pojo;

import java.util.List;

public class TemplateMsg {
    private String templateId;
    private ValueColor title;
    private ValueColor keyword1;
    private ValueColor keyword2;
    private ValueColor keyword3;
    private ValueColor keyword4;
    private ValueColor keyword5;
    private ValueColor keyword6;
    private ValueColor keyword7;
    private ValueColor keyword8;
    private ValueColor keyword9;
    private ValueColor remark;
    private List<String> toUsers;
    private String toUrl;

    /**
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * 设置模板消息的模板ID 格式类似：bEezG9ylSZ4iftliA02T7xYMH-MH7aAR_kVWSN5Ug0E
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     *
     * @return
     */
    public ValueColor getTitle() {
        return title;
    }

    /**
     * 设置模板消息的标题（注意是副标题，主标题不让修改）
     * @param title
     */
    public void setTitle(ValueColor title) {
        this.title = title;
    }

    /**
     * @return
     */
    public ValueColor getKeyword1() {
        return keyword1;
    }

    /**
     * 设置标题下第1行的内容和字体颜色
     * @param keyword1
     */
    public void setKeyword1(ValueColor keyword1) {
        this.keyword1 = keyword1;
    }

    /**
     * @return
     */
    public ValueColor getKeyword2() {
        return keyword2;
    }

    /**
     * 设置标题下第2行的内容和字体颜色
     * @param keyword2
     */
    public void setKeyword2(ValueColor keyword2) {
        this.keyword2 = keyword2;
    }

    /**
     * @return
     */
    public ValueColor getKeyword3() {
        return keyword3;
    }

    /**
     * 设置标题下第3行的内容和字体颜色
     * @param keyword3
     */
    public void setKeyword3(ValueColor keyword3) {
        this.keyword3 = keyword3;
    }

    /**
     * @return
     */
    public ValueColor getKeyword4() {
        return keyword4;
    }

    public void setKeyword4(ValueColor keyword4) {
        this.keyword4 = keyword4;
    }

    public ValueColor getKeyword5() {
        return keyword5;
    }

    public void setKeyword5(ValueColor keyword5) {
        this.keyword5 = keyword5;
    }

    public ValueColor getKeyword6() {
        return keyword6;
    }

    public void setKeyword6(ValueColor keyword6) {
        this.keyword6 = keyword6;
    }

    public ValueColor getKeyword7() {
        return keyword7;
    }

    public void setKeyword7(ValueColor keyword7) {
        this.keyword7 = keyword7;
    }

    public ValueColor getKeyword8() {
        return keyword8;
    }

    public void setKeyword8(ValueColor keyword8) {
        this.keyword8 = keyword8;
    }

    public ValueColor getKeyword9() {
        return keyword9;
    }

    public void setKeyword9(ValueColor keyword9) {
        this.keyword9 = keyword9;
    }

    /**
     *
     * @return
     */
    public ValueColor getRemark() {
        return remark;
    }

    /**
     *  设置备注信息
     * @param remark
     */
    public void setRemark(ValueColor remark) {
        this.remark = remark;
    }

    /**
     * @return
     */
    public List<String> getToUsers() {
        return toUsers;
    }

    /**
     * 设置要发送给哪些用户（对应微信的openid）
     * @param toUsers
     */
    public void setToUsers(List<String> toUsers) {
        this.toUsers = toUsers;
    }

    /**
     *
     * @return
     */
    public String getToUrl() {
        return toUrl;
    }

    /**
     * 设置点击详情的超链接地址
     * @param toUrl
     */
    public void setToUrl(String toUrl) {
        this.toUrl = toUrl;
    }
}
