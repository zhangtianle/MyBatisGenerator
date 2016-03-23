package com.cqupt.model.pojo;

public class Setting {
    private Integer settingid;

    private String settingname;

    private String settingvalue;

    public Integer getSettingid() {
        return settingid;
    }

    public void setSettingid(Integer settingid) {
        this.settingid = settingid;
    }

    public String getSettingname() {
        return settingname;
    }

    public void setSettingname(String settingname) {
        this.settingname = settingname == null ? null : settingname.trim();
    }

    public String getSettingvalue() {
        return settingvalue;
    }

    public void setSettingvalue(String settingvalue) {
        this.settingvalue = settingvalue == null ? null : settingvalue.trim();
    }
}