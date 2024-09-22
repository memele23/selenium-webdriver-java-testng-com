package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_00_Template {
    WebDriver driver;


    @Test
    public void TC_01_() {
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");

    }

    @Test
    public void TC_02_() {

    }

    @Test
    public void TC_03_() {

    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }



}
