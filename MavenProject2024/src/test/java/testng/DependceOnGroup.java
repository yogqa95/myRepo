package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependceOnGroup {
    @Test(groups = "smoke")
    public void test1()
    {
        Assert.assertTrue(false);
        System.out.println("Test1");
    }

    @Test
    public void test2()
    {
        System.out.println("Test2");
    }

    @Test(dependsOnGroups = "smoke")
    public void test11()
    {
        System.out.println("Testes11");
    }
}
