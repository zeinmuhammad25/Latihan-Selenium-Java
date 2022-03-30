package com.zein.LatihanSelenium;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class latihanFungsi {

    @Test
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //cara untuk membuka url
        String URL = "https://www.cilsy.id/"; //driver.navigate().to("http://www.sekolahQA.com");
        driver.get(URL);

        System.out.println("ini adalah judulnya"+ " " + driver.getTitle());
        //System.out.println("ini adalah pagesourcenya"+ " " + driver.getPageSource());

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement elementDaftar = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/div/ul/li[3]/a")));
        elementDaftar.click();



        //fungsi tutup browser
        //driver.close(); //driver.quit();

        //fungsi forward
        //driver.navigate().forward();

        //fungsi back
        //driver.navigate().back();

        //fungsi refresh
        //driver.navigate().refresh();

        WebElement elementUN = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab-1-content\"]/form/div[1]/input")));
        elementUN.sendKeys("HanipahFatmawati");

        driver.findElement(By.xpath("//*[@id=\"tab-1-content\"]/form/div[1]/input")).clear();

        boolean username = driver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
        System.out.println("USERNAME : "+username);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("agiL@mailnesia.com");
        boolean email = driver.findElement(By.xpath("//input[@id='email']")).isEnabled();
        System.out.println("email : "+email);

        driver.findElement(By.xpath("//select[@name='dates']")).click();
        boolean tanggal  = driver.findElement(By.xpath("//select[@name='dates']/option[1]")).isSelected();
        System.out.println("DAY: "+tanggal);

        WebElement elementLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab-2\"]")));
        elementLogin.click();

        // biar ada yg bisa di submit aja
        WebElement elementusername = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab-2-content\"]/form/div[1]/input")));
        elementusername.sendKeys("hanipahfatmawati@gmail.com");
        WebElement elementPS = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password-field\"]")));
        elementPS.sendKeys("Testing123");


        // 5.3.6. Perintah Submit
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"tab-2-content\"]/form/button"));
        submit.submit();

        // 5.3.7. Perintah GetText (untuk mengambil teks pada field text dari form. This method gets the visible, inner text (which is not hidden by CSS) of the web-elemen)

        String expectedHeading = "Keranjang Belanja";

//Storing the text of the heading in a string
        String heading = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/h3")).getText();
        if(expectedHeading.equalsIgnoreCase(heading))
            System.out.println("The expected heading is same as actual heading : "+heading);
        else
            System.out.println("The expected heading doesn't match the actual heading : "+heading);

// 5.3.8. Perintah getTagName

        WebElement elementtagname = driver.findElement(By.xpath("//*[@id=\"inicheckout\"]"));
        String tagName = elementtagname.getTagName();

        System.out.println("Element Tag Name is :"+tagName);

// 5.3.9. Perintah getCssValue
        WebElement GetCSS = driver.findElement(By.xpath("/html/body/nav/div/div[1]/a[2]/img"));
        System.out.println("CSS Size :"+GetCSS.getCssValue("font-size"));
        System.out.println("CSS Color :"+GetCSS.getCssValue("color"));
        System.out.println("CSS Weight :"+GetCSS.getCssValue("font-weight"));

// 5.3.10. Perintah getAttribute
        WebElement getAttribute= driver.findElement(By.xpath("//*[@id=\"form\"]/div/input"));

        String typeValue=getAttribute.getAttribute("type");
        System.out.println("Value of type attribute: "+typeValue);


// 5.3.11. Perintah getSize
        WebElement elementgetsize = driver.findElement(By.xpath("/html/body/nav/div/div[1]/a[2]/img"));
        Dimension dimensions = elementgetsize.getSize();
        System.out.println("Height :" + dimensions.height + " And Width : "+ dimensions.width);

// 5.3.12. Perintah getLocation
        WebElement elementgetLocation = driver.findElement(By.xpath("/html/body/nav/div/div[1]/a[2]/img"));
        Point point = elementgetLocation.getLocation();
        System.out.println("X cordinate : " + point.x + " And Y cordinate: " + point.y);





    }

}
