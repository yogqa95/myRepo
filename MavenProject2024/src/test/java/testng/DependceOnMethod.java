package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependceOnMethod {
    @Test
    public void test1()
    {
        System.out.println("Test1");
    }

    @Test
    public void test2()
    {
        Assert.assertTrue(false);
        System.out.println("Test2");
    }

    @Test(dependsOnMethods = {"test1"}
    )
    public void test11()
    {
        System.out.println("Testes11");
    }
}
