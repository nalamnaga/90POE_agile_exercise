package com.exercise;

public class HomePage extends BasePage {

    public static void homePage() {
        driver.get(LoadProp.getproperty("url"));
    }

    public static void navigate(String url){
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


    }
}
