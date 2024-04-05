package testng.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTestNG {
    @Test
    public void checkGooglePage()
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        WebElement textBoxVerify = driver.findElement(By.name("q"));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title,"google","User should be able to open google home page");
        softAssert.assertFalse(textBoxVerify.isEnabled(),"User Should be able to visible Search text box");
        softAssert.assertAll();
        driver.close();
    }
}
