package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunAttributeTestNG {
    @Test
    public void testCase1()
    {
        Assert.assertTrue(false);
        System.out.println("Login Application");
    }

    @Test(dependsOnMethods = "testCase1", alwaysRun = true)
    public void testCase2()
    {
        System.out.println("Balance Check");
    }

    @Test
    public void testCase3()
    {
        System.out.println("Register");
    }
}
