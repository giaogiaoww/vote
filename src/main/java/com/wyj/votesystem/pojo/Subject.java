package com.wyj.votesystem.pojo;

import java.util.List;

public class Subject {
    private int sid;
    private String title;
    private String type;
    private List<Options> optionsList;
    private List<Item> itemList;
    private int itemNum;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Options> getOptionsList() {
        return optionsList;
    }

    public void setOptionsList(List<Options> optionsList) {
        this.optionsList = optionsList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "sid=" + sid +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", optionsList=" + optionsList +
                ", itemList=" + itemList +
                ", itemNum=" + itemNum +
                '}';
    }
}
