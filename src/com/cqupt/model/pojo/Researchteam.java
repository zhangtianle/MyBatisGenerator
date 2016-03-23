package com.cqupt.model.pojo;

public class Researchteam {
    private Integer researchteamid;

    private String teamname;

    public Integer getResearchteamid() {
        return researchteamid;
    }

    public void setResearchteamid(Integer researchteamid) {
        this.researchteamid = researchteamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }
}