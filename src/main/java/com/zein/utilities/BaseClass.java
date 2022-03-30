package com.zein.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
    public static WebDriver webDriver;

    public BaseClass(WebDriver webDriver){
        BaseClass.webDriver = webDriver;
    }
    public void input(WebElement webElement, String text){
        webElement.sendKeys();
    }
    public void click(WebElement webElement){
        webElement.click();
    }
}
