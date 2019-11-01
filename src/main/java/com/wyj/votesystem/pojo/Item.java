package com.wyj.votesystem.pojo;

public class Item {
    private int vid;
    private int uid;
    private int sid;
    private int oid;

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "Item{" +
                "vid=" + vid +
                ", uid=" + uid +
                ", sid=" + sid +
                ", oid=" + oid +
                '}';
    }
}
