package com.dmf.weixin.admin.pojo;

public class SysModuleRole {
    private Long id;

    private Long moduleId;

    private Long roleId;

    private Long buttonId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getButtonId() {
        return buttonId;
    }

    public void setButtonId(Long buttonId) {
        this.buttonId = buttonId;
    }
}