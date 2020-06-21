package com.entity;

public class Stuinfo {
    private Integer stuid;

    private Integer stuxh;

    private String stupwd;

    private String stuname;

    private String stusex;

    private Integer stutel;

    private Integer stuqq;

    private String stuclass;

    private String stugrade;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getStuxh() {
        return stuxh;
    }

    public void setStuxh(Integer stuxh) {
        this.stuxh = stuxh;
    }

    public String getStupwd() {
        return stupwd;
    }

    public void setStupwd(String stupwd) {
        this.stupwd = stupwd == null ? null : stupwd.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex == null ? null : stusex.trim();
    }

    public Integer getStutel() {
        return stutel;
    }

    public void setStutel(Integer stutel) {
        this.stutel = stutel;
    }

    public Integer getStuqq() {
        return stuqq;
    }

    public void setStuqq(Integer stuqq) {
        this.stuqq = stuqq;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass == null ? null : stuclass.trim();
    }

    public String getStugrade() {
        return stugrade;
    }

    public void setStugrade(String stugrade) {
        this.stugrade = stugrade == null ? null : stugrade.trim();
    }
}