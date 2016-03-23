package com.cqupt.model.pojo;

public class Keyword {
    private Integer keywordid;

    private Integer researchdirectionid;

    private String keywordname;

    public Integer getKeywordid() {
        return keywordid;
    }

    public void setKeywordid(Integer keywordid) {
        this.keywordid = keywordid;
    }

    public Integer getResearchdirectionid() {
        return researchdirectionid;
    }

    public void setResearchdirectionid(Integer researchdirectionid) {
        this.researchdirectionid = researchdirectionid;
    }

    public String getKeywordname() {
        return keywordname;
    }

    public void setKeywordname(String keywordname) {
        this.keywordname = keywordname == null ? null : keywordname.trim();
    }
}