package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

    public WebDriver driver;

    @BeforeMethod
    public void site_1()
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
         driver=new ChromeDriver();
    }

    @Test
    public void site_2()
    {
        driver.manage().window().maximize();
        driver.get("https://www.amazone.com");
    }

    @Test
    public void site_3()
    {
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
    }

    @AfterMethod
    public void site_4()
    {
        driver.close();
    }
}
