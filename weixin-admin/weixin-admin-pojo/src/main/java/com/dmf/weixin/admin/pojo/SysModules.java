package com.dmf.weixin.admin.pojo;

import java.util.Date;

public class SysModules {
    private Long id;

    private Long moduleFid;

    private String moduleName;

    private String moduleKey;

    private String moduleUrl;

    private Integer mdOrder;

    private Date createTime;

    private String icon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModuleFid() {
        return moduleFid;
    }

    public void setModuleFid(Long moduleFid) {
        this.moduleFid = moduleFid;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getModuleKey() {
        return moduleKey;
    }

    public void setModuleKey(String moduleKey) {
        this.moduleKey = moduleKey == null ? null : moduleKey.trim();
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl == null ? null : moduleUrl.trim();
    }

    public Integer getMdOrder() {
        return mdOrder;
    }

    public void setMdOrder(Integer mdOrder) {
        this.mdOrder = mdOrder;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}