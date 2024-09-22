package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_02_Selenium_Locator {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver =new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void TC_01_ID() {
        driver.get("http://live.techpanda.org/index.php/customer/account/create/");
        driver.findElement(By.id("search")).sendKeys("Samsung");
        driver.findElement(By.id("firstname")).sendKeys("John Kennedy");
    }

    @Test
    public void TC_02_Class() {
        driver.get("http://live.techpanda.org/index.php/customer/account/create/");
        driver.findElement(By.className("header-language-background"));
        driver.findElement(By.className("page-header-container"));
    }

    @Test
    public void TC_03_Name() {
        driver.get("http://live.techpanda.org/index.php/customer/account/create/");
        driver.findElement(By.name("q"));
        driver.findElement(By.name("firstname"));
        driver.findElement(By.name("lastname"));
        driver.findElement(By.name("email"));
    }

    @Test
    public void TC_04_Link() {
        //only link have Text
        //transmit all chain text
        driver.get("http://live.techpanda.org/index.php/customer/account/create/");
        driver.findElement(By.linkText("ABOUT US"));
        driver.findElement(By.linkText("CUSTOMER SERVICE"));
        driver.findElement(By.linkText("ORDERS AND RETURNS"));

    }

    @Test
    public void TC_05_Partial_Link() {
        //transmit a part is also oke
        driver.get("http://live.techpanda.org/index.php/customer/account/create/");
        driver.findElement(By.partialLinkText("ABOUT US"));
        driver.findElement(By.partialLinkText("ABOUT"));
        driver.findElement(By.partialLinkText("CUSTOMER"));
        driver.findElement(By.partialLinkText("ORDERS"));
        driver.findElement(By.partialLinkText("RETURNS"));
    }

    @Test
    public void TC_06_Tagname() {
        driver.get("http://live.techpanda.org/index.php/customer/account/create/");

        //Find many element is the same
        int linkNumber = driver.findElements(By.tagName("a")).size();
        System.out.println("Total link = "+linkNumber);
    }
    @Test
    public void TC_07_Css() {
        driver.get("http://live.techpanda.org/index.php/customer/account/create/");
        // Css vs ID
        driver.findElement(By.cssSelector("input[id='search']"));
        driver.findElement(By.cssSelector("#search"));
        driver.findElement(By.cssSelector("input#search"));
        driver.findElement(By.cssSelector("input#email_address"));
        driver.findElement(By.cssSelector("#email_address"));

        //Css vs Class
        driver.findElement(By.cssSelector("div[class='header-language-background']"));
        driver.findElement(By.cssSelector("div.header-language-background"));
        driver.findElement(By.cssSelector(".header-language-background"));

        //Exception
        driver.findElement(By.cssSelector("input[class='input-text validate-email required-entry']"));
        driver.findElement(By.cssSelector("input.input-text.validate-email.required-entry"));

        //Css vs Name
        driver.findElement(By.cssSelector("input[name='password']"));
        driver.findElement(By.cssSelector("input[name='confirmation']"));
        driver.findElement(By.cssSelector("input[name='q']"));
        //Css vs Link
        driver.findElement(By.cssSelector("a[href='http://live.techpanda.org/index.php/about-magento-demo-store/']"));
        driver.findElement(By.cssSelector("a[href*='about-magento-demo-store/']"));

        //Css vs Partial Link
        driver.findElement(By.cssSelector("a[href*='about-magento-demo-store/']"));

        //Css vs Tagname
        //Find many element is the same
        int linkNumber = driver.findElements(By.cssSelector("a")).size();
        System.out.println("Total link = "+linkNumber);

    }
    @Test
    public void TC_08_XPath() {
        driver.get("http://live.techpanda.org/index.php/customer/account/create/");


        //Xpath vs Id
         driver.findElement(By.xpath("//input[@id='search']"));
         //Xpath vs Class
        driver.findElement(By.cssSelector("//div[@class='header-language-background']"));

        //Xpath vs Name
        driver.findElement(By.cssSelector("//input[@name='lastname']"));

        //Xpath vs Link
        //driver.findElement(By.cssSelector("//a[@href*='about-magento-demo-store/']"));
        //Xpath vs Tagname
        //Find many element is the same
        int linkNumber = driver.findElements(By.xpath("a")).size();
        System.out.println("Total link = "+linkNumber);
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }



}
