package com.learning.solidanddesignpattern.designpatterns.singleton;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SingletonExample implements CommandLineRunner {

    private final SpringAppConfig springAppConfig;

    public SingletonExample(SpringAppConfig springAppConfig) {
        this.springAppConfig = springAppConfig;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Singleton Driver ---");

        // Classic Singleton
        AppConfig appConfig1 = AppConfig.getInstance();
        System.out.println("AppConfig1 data: " + appConfig1.getConfigData());
        appConfig1.setConfigData("New Config Data");

        AppConfig appConfig2 = AppConfig.getInstance();
        System.out.println("AppConfig2 data: " + appConfig2.getConfigData());
        System.out.println("appConfig1 and appConfig2 are the same instance: " + (appConfig1 == appConfig2));

        // Spring Singleton
        System.out.println("SpringAppConfig data: " + springAppConfig.getConfigData());
        springAppConfig.setConfigData("New Spring Config Data");
        System.out.println("SpringAppConfig data: " + springAppConfig.getConfigData());


        System.out.println("--- End Singleton Driver ---");
    }
}