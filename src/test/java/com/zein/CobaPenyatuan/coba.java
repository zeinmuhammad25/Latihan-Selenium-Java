package com.zein.CobaPenyatuan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import sun.plugin.dom.core.Element;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class coba {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;


    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.get("http://jqueryui.com/resources/demos/slider/default.html");
        vars = new HashMap<String, Object>();
        driver.get("http://qa.cilsy.id:8080/en/");
        Thread.sleep(2000);
    }
    @Test
    public void negativeCase1() throws InterruptedException {
//        driver.findElement(By.xpath("//span[@class='hide_xs']")).click();
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("azhar@gmail.com");
//        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");
//        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span[contains(.,'Sign in')]")).click();
//        driver.findElement(By.xpath("//span[.='Add my first address']")).click();
//
//        driver.findElement(By.xpath("//span[contains(.,'Save')]")).click();
//        String coba = driver.findElement(By.xpath("//ol[1]")).getText();
//        System.out.print(coba);
//        String errorMassage = "address1 is required.city is required.You must register at least one phone number.This country requires you to chose a State.The Zip/Postal code you've entered is invalid. It must follow this format: 00000";
//        assertEquals(errorMassage,coba);
//        driver.findElement(By.xpath("//span[@class='hide_xs']")).click();
//        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("as@gmail.com");
//        driver.findElement(By.xpath("//span[contains(.,'Create an account')]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("customer_firstname")).sendKeys("andi");
//        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("ar");
//        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
//        String coba = driver.findElement(By.xpath("//div[@class='alert alert-danger']/p[1]")).getText();
////        System.out.print(coba);
//        driver.findElement(By.xpath("//div[@class='col-sm-12 col-xs-12']/div[2]/div[1]/div/div[3]/a")).click();
//        Thread.sleep(3000);
//        String coba = driver.findElement(By.xpath("//div[@class='col-sm-12 col-xs-12']/div[2]/div[1]/div/div[3]/a")).getText();


        driver.findElement(By.xpath("//input[@id='hotel_location']")).sendKeys("Indonesia");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='id_hotel_button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@class='search_result_li']")).click();
        driver.findElement(By.xpath("//input[@id='check_in_time']")).click();
        driver.findElement(By.xpath("//a[.='23']")).click();
        driver.findElement(By.xpath("//input[@id='check_out_time']")).click();
        driver.findElement(By.xpath("//a[.='24']")).click();
        driver.findElement(By.xpath("//span[.='Search Now']")).click();
        WebElement slider = driver.findElement(By.xpath("//div[@id='filter_price_silder']/a[1]"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, 10, 0).perform();

}


    }


