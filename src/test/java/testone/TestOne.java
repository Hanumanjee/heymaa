package testone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne {

    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://reelcodemedia.com/#/");
        /////
    }

    @Test
    public void testOne(){
        driver.findElement(By.xpath("//*[@id='menu-new-menu']/li[5]/a/span")).click();
    }
    @AfterMethod

    public void tearDown(){
        driver.quit();
    }


}
