package com.zein;

// Generated by Selenium IDE

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class Penjumlahan{

    public class DefaultSuiteTest {
        private WebDriver driver;
        private Map<String, Object> vars;
        JavascriptExecutor js;

        public void setUp() {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            js = (JavascriptExecutor) driver;
            vars = new HashMap<String, Object>();
        }

        public void tearDown() {
            driver.quit();
        }

        public void case1() {
            driver.get("https://greyli.github.io/calculator/");
            driver.manage().window().setSize(new Dimension(651, 616));
            driver.findElement(By.xpath("//button[@value=\'9\']")).click();
            driver.findElement(By.xpath("//button[@value=\'9\']")).click();
            driver.findElement(By.xpath("//button[@value=\'-\']")).click();
            driver.findElement(By.xpath("//button[@value=\'9\']")).click();
            driver.findElement(By.xpath("//button[@value=\'8\']")).click();
            driver.findElement(By.xpath("//button[@id=\'resultButton\']")).click();

            driver.close();
        }
    }

}
