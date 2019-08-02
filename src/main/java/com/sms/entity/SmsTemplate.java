package com.sms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sms_template")
public class SmsTemplate {

    @Id
    private Long id;

    private String templateCode;

    private String platform;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SmsTemplate{" +
                "id=" + id +
                ", templateCode='" + templateCode + '\'' +
                ", platform='" + platform + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
