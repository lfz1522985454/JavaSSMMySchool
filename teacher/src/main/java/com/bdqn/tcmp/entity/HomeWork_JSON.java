package com.bdqn.tcmp.entity;

import java.util.List;

public class HomeWork_JSON {
    private List<String> students;
    private List<String> sendTypes;
    private Integer classid;
    private String workname;
    private String workdetail;

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public List<String> getSendTypes() {
        return sendTypes;
    }

    public void setSendTypes(List<String> sendTypes) {
        this.sendTypes = sendTypes;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public String getWorkdetail() {
        return workdetail;
    }

    public void setWorkdetail(String workdetail) {
        this.workdetail = workdetail;
    }
}
