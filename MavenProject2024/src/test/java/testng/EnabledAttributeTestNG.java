package testng;

import org.testng.annotations.Test;

public class EnabledAttributeTestNG {
    @Test
    public void testCase1()
    {
        System.out.println("Test Case 1");
    }

    @Test(enabled = false)
    public void testCase2()
    {
        System.out.println("Test Case 2");
    }

    @Test
    public void testCase3()
    {
        System.out.println("Test Case 3");
    }

}
