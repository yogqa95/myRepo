package testng;

import org.testng.annotations.*;

public class AnotationsTestNG {
    @BeforeTest
    public void method_0()
    {
        System.out.println("Before Test");
    }

    @AfterTest
    public void method_01()
    {
        System.out.println("After Test");
    }

    @BeforeClass
    public void method_5()
    {
        System.out.println("Before Class");
    }

    @AfterClass
    public void method_6()
    {
        System.out.println("After Class");
    }

    @BeforeSuite
    public void method_7()
    {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void method_8()
    {
        System.out.println("After Suite");
    }

    @BeforeMethod
    public void method_1()
    {
        System.out.println("Before Method");
    }

    @Test
    public void method_11()
    {
        System.out.println("Test 1");
    }

    @Test
    public void method_12()
    {
        System.out.println("Test 2");
    }

    @AfterMethod
    public void method_2()
    {
        System.out.println("After Method");
    }
}
