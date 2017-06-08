package com.cmcc.online.data;

/**
 * Created by GoGoStop on 2017/6/7.
 */
public class CardItemInfo {
    private String desc;
    private String value;
    private String type;

    public CardItemInfo(String desc, String value, String type) {
        this.desc = desc;
        this.value = value;
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
