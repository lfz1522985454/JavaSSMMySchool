package com.bdqn.tcmp.dto;

import java.io.Serializable;
import java.util.Date;

public class EvaluationDTO implements Serializable{
    private Integer parentId;
    private String startDate;
    private String endDate;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
