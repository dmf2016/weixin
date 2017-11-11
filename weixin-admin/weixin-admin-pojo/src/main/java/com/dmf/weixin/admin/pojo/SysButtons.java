package com.dmf.weixin.admin.pojo;

public class SysButtons {
    private Long id;

    private Integer moduleId;

    private String buttonName;

    private String imagePath;

    private String remark;

    private String onclick;

    private String buttonKey;

    private String buttonUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName == null ? null : buttonName.trim();
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOnclick() {
        return onclick;
    }

    public void setOnclick(String onclick) {
        this.onclick = onclick == null ? null : onclick.trim();
    }

    public String getButtonKey() {
        return buttonKey;
    }

    public void setButtonKey(String buttonKey) {
        this.buttonKey = buttonKey == null ? null : buttonKey.trim();
    }

    public String getButtonUrl() {
        return buttonUrl;
    }

    public void setButtonUrl(String buttonUrl) {
        this.buttonUrl = buttonUrl == null ? null : buttonUrl.trim();
    }
}