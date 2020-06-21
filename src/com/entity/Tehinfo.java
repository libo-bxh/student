package com.entity;

public class Tehinfo {
    private Integer tehid;

    private Integer tehgh;

    private String tehpwd;

    private String tehname;

    private String tehsex;

    private Integer tahtel;

    private Integer tehqq;

    private String tehcourse;

    public Integer getTehid() {
        return tehid;
    }

    public void setTehid(Integer tehid) {
        this.tehid = tehid;
    }

    public Integer getTehgh() {
        return tehgh;
    }

    public void setTehgh(Integer tehgh) {
        this.tehgh = tehgh;
    }

    public String getTehpwd() {
        return tehpwd;
    }

    public void setTehpwd(String tehpwd) {
        this.tehpwd = tehpwd;
    }

    public String getTehname() {
        return tehname;
    }

    public void setTehname(String tehname) {
        this.tehname = tehname == null ? null : tehname.trim();
    }

    public String getTehsex() {
        return tehsex;
    }

    public void setTehsex(String tehsex) {
        this.tehsex = tehsex == null ? null : tehsex.trim();
    }

    public Integer getTahtel() {
        return tahtel;
    }

    public void setTahtel(Integer tahtel) {
        this.tahtel = tahtel;
    }

    public Integer getTehqq() {
        return tehqq;
    }

    public void setTehqq(Integer tehqq) {
        this.tehqq = tehqq;
    }

    public String getTehcourse() {
        return tehcourse;
    }

    public void setTehcourse(String tehcourse) {
        this.tehcourse = tehcourse == null ? null : tehcourse.trim();
    }
}