package com.entity;

public class Examinfo {
    private Integer emid;

    private String emname;

    private String emtime;

    private String emtype;

    private String emgrade;

    private String emclass;

    private String emsubject;

    private String emremark;

    public Integer getEmid() {
        return emid;
    }

    public void setEmid(Integer emid) {
        this.emid = emid;
    }

    public String getEmname() {
        return emname;
    }

    public void setEmname(String emname) {
        this.emname = emname == null ? null : emname.trim();
    }

    public String getEmtime() {
        return emtime;
    }

    public void setEmtime(String emtime) {
        this.emtime = emtime == null ? null : emtime.trim();
    }

    public String getEmtype() {
        return emtype;
    }

    public void setEmtype(String emtype) {
        this.emtype = emtype == null ? null : emtype.trim();
    }

    public String getEmgrade() {
        return emgrade;
    }

    public void setEmgrade(String emgrade) {
        this.emgrade = emgrade == null ? null : emgrade.trim();
    }

    public String getEmclass() {
        return emclass;
    }

    public void setEmclass(String emclass) {
        this.emclass = emclass == null ? null : emclass.trim();
    }

    public String getEmsubject() {
        return emsubject;
    }

    public void setEmsubject(String emsubject) {
        this.emsubject = emsubject == null ? null : emsubject.trim();
    }

    public String getEmremark() {
        return emremark;
    }

    public void setEmremark(String emremark) {
        this.emremark = emremark == null ? null : emremark.trim();
    }
}