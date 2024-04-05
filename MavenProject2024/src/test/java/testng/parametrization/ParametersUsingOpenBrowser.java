package testng.parametrization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersUsingOpenBrowser {
    @Parameters({"chromedriver","path"})
    @Test
    public void browsersOpen(String chromedriver, String path)
    {
        System.setProperty(chromedriver,path);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
}
