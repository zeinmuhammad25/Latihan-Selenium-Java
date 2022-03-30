package com.zein.LatihanSelenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ATest {
    @Test
    public void byIdSelected() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        String URL = "https://demo.guru99.com/test/radio.html"; //driver.navigate().to("http://www.sekolahQA.com");
        driver.get(URL);

        //5.5.1. By ID dan 5.5.2. By IsSelected

        driver.get("http://demo.guru99.com/test/radio.html");
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));

        //Radio Button1 is selected
        radio1.click();
        System.out.println("Radio Button Option 1 Selected");

        //Radio Button1 is de-selected and Radio Button2 is selected
        radio2.click();
        System.out.println("Radio Button Option 2 Selected");

        // Selecting CheckBox
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));

        // This will Toggle the Check box
        option1.click();

        // Check whether the Check box is toggled on
        if (option1.isSelected()) {
            System.out.println("Checkbox is Toggled On");

        } else {
            System.out.println("Checkbox is Toggled Off");
        }

        //Selecting Checkbox and using isSelected Method
        driver.get("http://demo.guru99.com/test/facebook.html");
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
        for (int i = 0; i < 2; i++) {
            chkFBPersist.click();
            System.out.println("Facebook Persists Checkbox Status is -  " + chkFBPersist.isSelected());

        }


    }

    @Test
    public void CSSdanValue() {
        // Web driver
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        String URL = "https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm";
        driver.get(URL);


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // identify element with value
        WebElement CSSValue = driver.findElement(By.cssSelector("input[value='3']"));
        //select radio button with click()
        CSSValue.click();
        // driver.quit();

    }

    @Test
    public void SelectClass() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        String URL = "http://demo.guru99.com/test/newtours/register.php";
        driver.get(URL);

        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");

        //Selecting Items in a Multiple SELECT elements
        driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);

        // untuk mengdeselect yg sudah di select
        fruits.deselectAll();
    }
    //5.7. Different Select Commands


    @Test
    public void selectFromDropDownByText() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        String URL = "http://demo.guru99.com/test/newtours/register.php";
        driver.get(URL);

        // 5.7.1. Perintah SelectByVisibleText

        Select cobaSelectByVisibleText = new Select(driver.findElement(By.name("country")));
        cobaSelectByVisibleText.selectByVisibleText("AUSTRALIA");

        // 5.7.2. Perintah selectByIndex
        Select cobaselectByIndex = new Select(driver.findElement(By.name("country")));
        cobaselectByIndex.selectByIndex(10);

        // 5.7.3. Perintah selectByValue
        Select cobaselectByValue = new Select(driver.findElement(By.name("country")));
        cobaselectByValue.selectByValue("QATAR");

        //5.7.4. Perintah getOptions
        Select cobagetOptions = new Select(driver.findElement(By.name("country")));
        List<WebElement> elementCount = cobagetOptions.getOptions();
        System.out.println("Count :  " + elementCount.size());

//        //5.7.5. Print allthe Options (mengambil element yang ada di select option)
//        Select cobaprintallgetOptions = new Select(driver.findElement(By.name("country")));
//        elementCount = cobaprintallgetOptions.getOptions();
//        int iSize = elementCount.size();
//        for (int i = 0; i < iSize; i++) {
//            String sValue = elementCount.get(i).getText();
//            System.out.println(sValue);
//        }

    }

//5.10. get table


    //Handle Dynamic WebTables
    @Test
    public void HandleDynamicWebTables() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        String URL = "file:///C:\\Users\\TELKOM\\Desktop/bar.html";
        driver.get(URL);


        String coba = driver.findElement(By.xpath("//td[.='Selenium']")).getText();

        System.out.println(coba);


        }
    }











