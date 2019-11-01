package com.wyj.votesystem.pojo;

public class Options {
    private int oid;
    private int osid;
    private String ocontent;
    private double voteNum;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getOsid() {
        return osid;
    }

    public void setOsid(int osid) {
        this.osid = osid;
    }

    public String getOcontent() {
        return ocontent;
    }

    public void setOcontent(String ocontent) {
        this.ocontent = ocontent;
    }

    public double getVoteNum() {
        return voteNum;
    }

    public void setVoteNum(double voteNum) {
        this.voteNum = voteNum;
    }

    @Override
    public String toString() {
        return "Options{" +
                "oid=" + oid +
                ", osid=" + osid +
                ", ocontent='" + ocontent + '\'' +
                ", voteNum=" + voteNum +
                '}';
    }
}
