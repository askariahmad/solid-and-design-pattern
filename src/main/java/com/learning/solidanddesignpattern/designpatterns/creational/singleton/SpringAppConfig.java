package com.learning.solidanddesignpattern.designpatterns.creational.singleton;

import org.springframework.stereotype.Component;

@Component
public class SpringAppConfig {

    private String configData;

    public SpringAppConfig() {
        this.configData = "Default Spring Configuration";
    }

    public String getConfigData() {
        return configData;
    }

    public void setConfigData(String configData) {
        this.configData = configData;
    }
}