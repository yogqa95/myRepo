package testng;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class PriorityOfTestNG {

    @Test
    public void testA()
    {
        System.out.println("test A");
    }

    @Test(priority = -2)
    public void testB()
    {
        System.out.println("test B");
    }

    @Test(priority = -1)
    public void testE()
    {
        System.out.println("test E");
    }

    @Test
    public void testD()
    {
        System.out.println("test D");
    }

    @Test(priority ='A')
    public void testC()
    {
        System.out.println("test C");
    }
}
