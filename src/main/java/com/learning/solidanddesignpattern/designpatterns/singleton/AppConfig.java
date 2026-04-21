package com.learning.solidanddesignpattern.designpatterns.singleton;

public class AppConfig {

    private static volatile AppConfig instance;
    private String configData;

    private AppConfig() {
        // Private constructor to prevent instantiation
        this.configData = "Default Configuration";
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    public String getConfigData() {
        return configData;
    }

    public void setConfigData(String configData) {
        this.configData = configData;
    }
}