package com.cqupt.model.pojo;

public class Researchdirection {
    private Integer researchdirectionid;

    private Integer layer;

    private String name;

    private Integer pid;

    public Integer getResearchdirectionid() {
        return researchdirectionid;
    }

    public void setResearchdirectionid(Integer researchdirectionid) {
        this.researchdirectionid = researchdirectionid;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}