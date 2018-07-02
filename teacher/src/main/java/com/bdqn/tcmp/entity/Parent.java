package com.bdqn.tcmp.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Parent implements Serializable {
    /**
     * 家长编号
     */
    private Integer parentId;
    /**
     * 家长姓名
     */
    private String parentName;
    /**
     * 家长密码
     */
    private String password;
    /**
     * 现居地址
     */
    private String address;
    /**
     * 最后一次登录的Ip
     */
    private String loginIp;
    /**
     * 最后一次登录时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;
    /**
     * 家长手机号
     */
    private String phone;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否启用
     */
    private  Integer isEnabled;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户名
     */
    private String parentCode;

    public int getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentId=" + parentId +
                ", parentName='" + parentName + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", phone='" + phone + '\'' +
                ", remark='" + remark + '\'' +
                ", isEnabled=" + isEnabled +
                ", email='" + email + '\'' +
                ", parentCode='" + parentCode + '\'' +
                '}';
    }
}
