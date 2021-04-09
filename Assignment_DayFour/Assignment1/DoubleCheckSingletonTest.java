package Assignment1;

import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckSingletonTest {

    /**
     * Testing to see if the same instance was created for the singleton
     */
    @Test
    public void getInstanceTest(){
        DoubleCheckSingleton x=DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton y=DoubleCheckSingleton.getInstance();
        assertNotNull(x);
        assertEquals(x,y);
    }
}
