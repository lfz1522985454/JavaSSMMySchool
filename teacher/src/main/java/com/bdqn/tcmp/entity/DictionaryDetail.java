package com.bdqn.tcmp.entity;

import java.io.Serializable;

public class DictionaryDetail implements Serializable{
    private int detailID;
    private int dictionaryID;
    private String attrName;
    private int showOrder;
    private int isEnabled;

    public int getDetailID() {
        return detailID;
    }

    public void setDetailID(int detailID) {
        this.detailID = detailID;
    }

    public int getDictionaryID() {
        return dictionaryID;
    }

    public void setDictionaryID(int dictionaryID) {
        this.dictionaryID = dictionaryID;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public int getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(int showOrder) {
        this.showOrder = showOrder;
    }

    public int getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(int isEnabled) {
        this.isEnabled = isEnabled;
    }
}
