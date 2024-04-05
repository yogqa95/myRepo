package testng.parametrization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @Test(dataProvider = "testDataProvider")
    public void testRediffMail(String id, String pass) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys(id);
        driver.findElement(By.id("password")).sendKeys(pass);
        Thread.sleep(2000);
        driver.close();
    }

    @DataProvider(name="testDataProvider")
    public Object[][] testData()
    {
        Object x[][] = {{"yog@gmail.com","Yog1111"},{"Rahul@gmail.com","Rahul1111"},{"Mohan@rediffmail.com","Mohan1111"}};
        return x;
    }
}
