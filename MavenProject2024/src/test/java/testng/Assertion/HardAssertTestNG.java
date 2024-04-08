package testng.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTestNG {
    @Test
    public void checkGooglePage()
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String title = driver.getTitle();
       // System.out.println(title);
	    System.out.println("--");
        WebElement textBoxVerify = driver.findElement(By.name("q"));

        Assert.assertEquals(title,"google","User should be able to open google home page");
        Assert.assertTrue(textBoxVerify.isEnabled(),"User Should be able to visible textbox");
        driver.close();
    }
}
