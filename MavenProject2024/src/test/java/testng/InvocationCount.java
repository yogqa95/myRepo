package testng;
import org.testng.annotations.Test;

public class InvocationCount {
    @Test(invocationCount = 1)
    public void testCase_1()
    {
        System.out.println("Test Case 1");
    }

    @Test(invocationCount = 2)
    public void testCase_2()
    {
        System.out.println("Test Case 2");
    }

    @Test(invocationCount = 3)
    public void testCase_3()
    {
        System.out.println("Test Case 3");
    }
}
