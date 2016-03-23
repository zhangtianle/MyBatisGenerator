package com.cqupt.model.pojo;

public class User {
    private Integer userid;

    private Integer researchteamid;

    private Integer professionaltitleid;

    private String username;

    private String usercode;

    private String workunit;

    private String sex;

    private String phone;

    private String email;

    private String password;

    private Integer type;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getResearchteamid() {
        return researchteamid;
    }

    public void setResearchteamid(Integer researchteamid) {
        this.researchteamid = researchteamid;
    }

    public Integer getProfessionaltitleid() {
        return professionaltitleid;
    }

    public void setProfessionaltitleid(Integer professionaltitleid) {
        this.professionaltitleid = professionaltitleid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getWorkunit() {
        return workunit;
    }

    public void setWorkunit(String workunit) {
        this.workunit = workunit == null ? null : workunit.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}