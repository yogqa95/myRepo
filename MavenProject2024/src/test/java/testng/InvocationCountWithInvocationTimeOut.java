package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class InvocationCountWithInvocationTimeOut {

    @Test(invocationCount = 500, invocationTimeOut = 1)
    public void testCase_1()
    {
        System.out.println("Test Case 1");
    }
}
