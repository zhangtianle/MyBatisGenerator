package com.cqupt.model.pojo;

public class Professionaltitle {
    private Integer professionaltitleid;

    private String professionaltitle;

    public Integer getProfessionaltitleid() {
        return professionaltitleid;
    }

    public void setProfessionaltitleid(Integer professionaltitleid) {
        this.professionaltitleid = professionaltitleid;
    }

    public String getProfessionaltitle() {
        return professionaltitle;
    }

    public void setProfessionaltitle(String professionaltitle) {
        this.professionaltitle = professionaltitle == null ? null : professionaltitle.trim();
    }
}