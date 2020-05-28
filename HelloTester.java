import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



public class HelloTester
{
   @Test(timeout = 5)
   public void testDoubleIt(){
       Hello h = new Hello();
       assertEquals(h.doubleIt(4),8);
       assertEquals(h.doubleIt(0),0);
       assertEquals(h.doubleIt(100),200);
    }
}
