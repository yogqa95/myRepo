package testng.parametrization;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnotation {
    @Parameters({"state","city"})
    @Test
    public void testGoogle(String state, String city)
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        WebElement textBoxVerify = driver.findElement(By.name("q"));
        textBoxVerify.sendKeys(state +" "+ city);
        textBoxVerify.sendKeys(Keys.ENTER);
    }
}
